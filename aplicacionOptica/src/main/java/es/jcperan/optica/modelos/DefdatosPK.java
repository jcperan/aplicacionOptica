/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.jcperan.optica.modelos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jcperan
 */
@Embeddable
public class DefdatosPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CODIGO_PROGRAMA")
    private String codigoPrograma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "CODIGO_FICHA")
    private String codigoFicha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODIGO_DATO")
    private String codigoDato;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_LINEA")
    private double codigoLinea;

    public DefdatosPK() {
    }

    public DefdatosPK(String codigoPrograma, String codigoFicha, String codigoDato, double codigoLinea) {
        this.codigoPrograma = codigoPrograma;
        this.codigoFicha = codigoFicha;
        this.codigoDato = codigoDato;
        this.codigoLinea = codigoLinea;
    }

    public String getCodigoPrograma() {
        return codigoPrograma;
    }

    public void setCodigoPrograma(String codigoPrograma) {
        this.codigoPrograma = codigoPrograma;
    }

    public String getCodigoFicha() {
        return codigoFicha;
    }

    public void setCodigoFicha(String codigoFicha) {
        this.codigoFicha = codigoFicha;
    }

    public String getCodigoDato() {
        return codigoDato;
    }

    public void setCodigoDato(String codigoDato) {
        this.codigoDato = codigoDato;
    }

    public double getCodigoLinea() {
        return codigoLinea;
    }

    public void setCodigoLinea(double codigoLinea) {
        this.codigoLinea = codigoLinea;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoPrograma != null ? codigoPrograma.hashCode() : 0);
        hash += (codigoFicha != null ? codigoFicha.hashCode() : 0);
        hash += (codigoDato != null ? codigoDato.hashCode() : 0);
        hash += (int) codigoLinea;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DefdatosPK)) {
            return false;
        }
        DefdatosPK other = (DefdatosPK) object;
        if ((this.codigoPrograma == null && other.codigoPrograma != null) || (this.codigoPrograma != null && !this.codigoPrograma.equals(other.codigoPrograma))) {
            return false;
        }
        if ((this.codigoFicha == null && other.codigoFicha != null) || (this.codigoFicha != null && !this.codigoFicha.equals(other.codigoFicha))) {
            return false;
        }
        if ((this.codigoDato == null && other.codigoDato != null) || (this.codigoDato != null && !this.codigoDato.equals(other.codigoDato))) {
            return false;
        }
        if (this.codigoLinea != other.codigoLinea) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.acisa.aplicacionoptica.modelos.DefdatosPK[ codigoPrograma=" + codigoPrograma + ", codigoFicha=" + codigoFicha + ", codigoDato=" + codigoDato + ", codigoLinea=" + codigoLinea + " ]";
    }
    
}
