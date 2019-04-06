/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.jcperan.optica.modelos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jcperan
 */
@Entity
@Table(name = "DEFFICHA")
@NamedQueries({
    @NamedQuery(name = "Defficha.findAll", query = "SELECT d FROM Defficha d")})
public class Defficha implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DeffichaPK deffichaPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Size(max = 1)
    @Column(name = "AVISAR")
    private String avisar;

    public Defficha() {
    }

    public Defficha(DeffichaPK deffichaPK) {
        this.deffichaPK = deffichaPK;
    }

    public Defficha(DeffichaPK deffichaPK, String descripcion) {
        this.deffichaPK = deffichaPK;
        this.descripcion = descripcion;
    }

    public Defficha(String codigoPrograma, String codigoFicha) {
        this.deffichaPK = new DeffichaPK(codigoPrograma, codigoFicha);
    }

    public DeffichaPK getDeffichaPK() {
        return deffichaPK;
    }

    public void setDeffichaPK(DeffichaPK deffichaPK) {
        this.deffichaPK = deffichaPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAvisar() {
        return avisar;
    }

    public void setAvisar(String avisar) {
        this.avisar = avisar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (deffichaPK != null ? deffichaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Defficha)) {
            return false;
        }
        Defficha other = (Defficha) object;
        if ((this.deffichaPK == null && other.deffichaPK != null) || (this.deffichaPK != null && !this.deffichaPK.equals(other.deffichaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.acisa.aplicacionoptica.modelos.Defficha[ deffichaPK=" + deffichaPK + " ]";
    }
    
}
