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
@Table(name = "DEFCAMPO")
@NamedQueries({
    @NamedQuery(name = "Defcampo.findAll", query = "SELECT d FROM Defcampo d")})
public class Defcampo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DefcampoPK defcampoPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "DENOMINACION")
    private String denominacion;
    @Size(max = 1)
    @Column(name = "TIPO")
    private String tipo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LONGITUD")
    private Double longitud;
    @Size(max = 50)
    @Column(name = "VALOR")
    private String valor;
    @Size(max = 1)
    @Column(name = "IMPRIMIR")
    private String imprimir;

    public Defcampo() {
    }

    public Defcampo(DefcampoPK defcampoPK) {
        this.defcampoPK = defcampoPK;
    }

    public Defcampo(DefcampoPK defcampoPK, String denominacion) {
        this.defcampoPK = defcampoPK;
        this.denominacion = denominacion;
    }

    public Defcampo(String codigoPrograma, String codigoFicha, double nroCampo) {
        this.defcampoPK = new DefcampoPK(codigoPrograma, codigoFicha, nroCampo);
    }

    public DefcampoPK getDefcampoPK() {
        return defcampoPK;
    }

    public void setDefcampoPK(DefcampoPK defcampoPK) {
        this.defcampoPK = defcampoPK;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getImprimir() {
        return imprimir;
    }

    public void setImprimir(String imprimir) {
        this.imprimir = imprimir;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (defcampoPK != null ? defcampoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Defcampo)) {
            return false;
        }
        Defcampo other = (Defcampo) object;
        if ((this.defcampoPK == null && other.defcampoPK != null) || (this.defcampoPK != null && !this.defcampoPK.equals(other.defcampoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.acisa.aplicacionoptica.modelos.Defcampo[ defcampoPK=" + defcampoPK + " ]";
    }
    
}
