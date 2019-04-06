/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.jcperan.optica.objetos;

import es.jcperan.optica.modelos.Clientes;
import es.jcperan.optica.modelos.Defdatos;
import es.jcperan.optica.modelos.PrgRgpd;
import es.jcperan.optica.utilidades.Persistencia;
import es.jcperan.optica.utilidades.Rutinas;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;

/**
 * Objeto para el acceso a datos de clientes
 * @author jcperan
 */
public class ClientesDAO extends Persistencia implements Serializable {
    
    private Clientes cliente = new Clientes();
    public Clientes getCliente() { return cliente; }
    public void setCliente(Clientes cliente) { this.cliente = cliente; }
    
    private PrgRgpd clienteRGPD = new PrgRgpd();
    public PrgRgpd getClienteRGPD() { return clienteRGPD; }
    public void setClienteRGPD(PrgRgpd clienteRGPD) { this.clienteRGPD = clienteRGPD; }
    
    private List<Clientes> listaClientes = new ArrayList<Clientes>();
    public List<Clientes> getListaClientes() { 
        if (listaClientes == null) listarClientes("");
        return listaClientes; 
    }
    public void setListaClientes(List<Clientes> listaClientes) { 
        this.listaClientes = listaClientes; 
    }
    
    public void listarClientes(String busqueda) {
        
        em = entityManager();   
        try {
            listaClientes.clear();
            Query consulta = em.createQuery("select c from Clientes c where c.apellidos like :buscar order by c.apellidos ");
            consulta.setParameter("buscar", "%" + busqueda + "%");
            listaClientes = consulta.getResultList();
        } catch (Exception e) {
            Rutinas.Log("Consulta Clientes",e);
        } finally {
            if (em.isOpen()) em.close();
        }
        
        
    }

    private List<Defdatos>listaGraduaciones = new ArrayList<Defdatos>();
    public List<Defdatos> getListaGraduaciones() { 

        em = entityManager();   
        try {
            listaClientes.clear();
            Query consulta = em.createQuery("select g from Defdatos g where g.defdatosPK.codigoPrograma = :programa and g.defdatosPK.codigoFicha = :ficha and g.defdatosPK.codigoDato = :cliente order by g.defdatosPK.codigoLinea desc");
            consulta.setParameter("programa", "PRGCLI");
            consulta.setParameter("ficha", "GRADUACION");
            consulta.setParameter("cliente", cliente.getCodigoCliente());
            listaGraduaciones = consulta.getResultList();
        } catch (Exception e) {
            Rutinas.Log("Lista Graduaciones",e);
        } finally {
            if (em.isOpen()) em.close();
        }
        
        return listaGraduaciones; 
    }
    
    public boolean GrabarFoto(String codigoCliente, byte[] foto) {
        
        boolean resultado = false;
        int exis = 0;
        
        PrgRgpd leido = (PrgRgpd) super.Leer(PrgRgpd.class, codigoCliente);
        if (leido==null) {
            leido = new PrgRgpd();
            exis=0;
        } else {
            exis=1;
        }
        leido.setCodigo(codigoCliente);
        leido.setFecha(new Date());
        leido.setFoto(foto);
        
        if (exis==0) {
            super.Agregar(leido);
        } else {
            super.Actualizar(leido);
        }
        
        super.Leer(PrgRgpd.class, codigoCliente);
        return resultado;
        
    }

    public boolean GrabarFirma1(String codigoCliente, String firma) {
        
        boolean resultado = false;
        int exis = 0;
        
        PrgRgpd leido = (PrgRgpd) super.Leer(PrgRgpd.class, codigoCliente);
        if (leido==null) {
            leido = new PrgRgpd();
            exis=0;
        } else {
            exis=1;
        }
        leido.setCodigo(codigoCliente);
        leido.setFecha1(new Date());
        leido.setFirma1(firma);
        
        if (exis==0) {
            super.Agregar(leido);
        } else {
            super.Actualizar(leido);
        }
        
        super.Leer(PrgRgpd.class, codigoCliente);
        return resultado;
        
    }
    
    public boolean GrabarFirma2(String codigoCliente, String firma) {
        
        boolean resultado = false;
        int exis = 0;
        
        PrgRgpd leido = (PrgRgpd) super.Leer(PrgRgpd.class, codigoCliente);
        if (leido==null) {
            leido = new PrgRgpd();
            exis=0;
        } else {
            exis=1;
        }
        leido.setCodigo(codigoCliente);
        leido.setFecha2(new Date());
        leido.setFirma2(firma);
        
        if (exis==0) {
            super.Agregar(leido);
        } else {
            super.Actualizar(leido);
        }
        
        super.Leer(PrgRgpd.class, codigoCliente);
        return resultado;
        
    }

}
