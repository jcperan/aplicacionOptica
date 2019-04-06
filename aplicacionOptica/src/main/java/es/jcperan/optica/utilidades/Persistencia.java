package es.jcperan.optica.utilidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import es.jcperan.optica.utilidades.Rutinas;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

public class Persistencia {

    @PersistenceUnit
    protected EntityManagerFactory emf;

    @PersistenceContext
    protected EntityManager em;

    /**
     * Agragar valores a una entidad
     * @param pRegistro
     * @return 
     */
    public boolean Agregar(Object pRegistro) {
        boolean resultado = false;

        resultado = this.Grabar(pRegistro, false);
        return resultado;
    }

    /**
     * Obtener datos de la entidad
     * @param pClase
     * @param pClave
     * @return 
     */
    public Object Leer(Class<?> pClase, Object pClave) {

        Object resultado = null;
        em = entityManager();

        try {
            em.getTransaction().begin();
            resultado = em.find(pClase, pClave);
            em.getTransaction().commit();

        } catch (Exception e) {
            Rutinas.Log("Persistencia.Leer", e);

        } finally {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            if (em.isOpen()) {
                em.close();
            }
        }

        return resultado;
    }

    /**
     * Actualizar datos de la entidad
     * @param pRegistro
     * @return 
     */
    protected boolean Actualizar(Object pRegistro) {
        return this.Grabar(pRegistro, true);
    }

    /**
     * Grabar datos en entidad
     * @param pRegistro
     * @param pActualizar
     * @return 
     */
    private boolean Grabar(Object pRegistro, boolean pActualizar) {
        
        boolean resultado = false;
        em = entityManager();

        try {
            em.getTransaction().begin();

            if (pActualizar) {
                em.merge(pRegistro);
            } else {
                em.persist(pRegistro);
            }

            em.getTransaction().commit();

            resultado = true;

        } catch (Exception e) {
            Rutinas.Log("Persistencia.Grabar", e);

        } finally {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            if (em.isOpen()) {
                em.close();
            }
        }

        return resultado;
    }

    /**
     * Borrar datos de la entidad
     * @param pRegistro
     * @return 
     */
    protected boolean Borrar(Object pRegistro) {

        boolean resultado = false;

        em = entityManager();

        try {
            em.getTransaction().begin();
            pRegistro = em.merge(pRegistro);
            em.remove(pRegistro);
            em.getTransaction().commit();
            resultado = true;

        } catch (Exception e) {
            Rutinas.Log("Persistencia.Borrar", e);

        } finally {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            if (em.isOpen()) {
                em.close();
            }
        }

        return resultado;
    }

    //// Funciones
    protected EntityManager entityManager() {
        
        EntityManager resultado;
        emf = Persistence.createEntityManagerFactory("optica");
        resultado = emf.createEntityManager();
        return resultado;
    }

    protected void EntityManagerTerminar() {
        if (emf.isOpen()) {
            emf.close();
            emf = null;
        }
    }

    @SuppressWarnings("rawtypes")
    public List EjecutarSql(String pSql, boolean pSqlNativa) {
        return this.EjecutarSql(pSql, pSqlNativa, null);
    }

    @SuppressWarnings("rawtypes")
    public List EjecutarSql(String pSql, boolean pSqlNativa, Class pClase) {
        List resultado = null;
        Query q;

        em = entityManager();

        try {
            if (pSqlNativa) {
                if (pClase != null) {
                    q = em.createNativeQuery(pSql, pClase);
                } else {
                    q = em.createNativeQuery(pSql);
                }
            } else {
                q = em.createQuery(pSql);
            }

            resultado = EjecutarSql(q);

        } catch (Exception e) {
            Rutinas.Log("Persistencia.EjecutarSql", e);

        } finally {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            if (em.isOpen()) {
                em.close();
            }
        }

        return resultado;
    }

    @SuppressWarnings("rawtypes")
    protected List EjecutarSql(Query pQuery) throws Exception {
        List resultado = null;
        Long instante = 0L;

        try {
            em.getTransaction().begin();
            resultado = pQuery.getResultList();
            em.getTransaction().commit();

        } catch (Exception e) {
            if (!(e instanceof NoResultException)) {
                Rutinas.Log("Persistencia.EjecutarSql", e);
            }

            throw e;

        } finally {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        }

        return resultado;
    }

    protected Object EjecutarSqlScalar(Query pQuery) throws Exception {
        Object resultado = null;
        Long instante = 0L;

        try {
            em.getTransaction().begin();
            resultado = pQuery.getSingleResult();
            em.getTransaction().commit();

        } catch (Exception e) {
            if (!(e instanceof NoResultException)) {
                Rutinas.Log("Persistencia.EjecutarSqlScalar", e);
            }

            throw e;

        } finally {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        }

        return resultado;
    }

    protected int EjecutarSqlUpdate(Query pQuery) throws Exception {
        int resultado = 0;
        Long instante = 0L;

        try {
            em.getTransaction().begin();
            resultado = pQuery.executeUpdate();
            em.getTransaction().commit();
        } catch (Exception e) {
            if (!(e instanceof NoResultException)) {
                Rutinas.Log("Persistencia.EjecutarSqlUpdate", e);
            }

            throw e;

        } finally {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        }

        return resultado;
    }

    protected List<?> Listar(String pTabla, String pOrden) {
        
        List<?> resultado = new ArrayList<Object>();
        Query q;
        String sql;

        em = entityManager();

        try {
            sql = "SELECT t ";
            sql += "FROM " + pTabla + " t ";
            sql += "ORDER BY t." + pOrden + " ";

            q = em.createQuery(sql);

            resultado = EjecutarSql(q);

        } catch (Exception e) {
            Rutinas.Log("Persistencia.Listar", e);

        } finally {
            if (em.isOpen()) {
                em.close();
            }
        }

        return resultado;
    }

}
