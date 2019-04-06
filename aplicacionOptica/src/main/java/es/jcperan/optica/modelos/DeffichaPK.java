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
public class DeffichaPK implements Serializable {

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

    public DeffichaPK() {
    }

    public DeffichaPK(String codigoPrograma, String codigoFicha) {
        this.codigoPrograma = codigoPrograma;
        this.codigoFicha = codigoFicha;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoPrograma != null ? codigoPrograma.hashCode() : 0);
        hash += (codigoFicha != null ? codigoFicha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DeffichaPK)) {
            return false;
        }
        DeffichaPK other = (DeffichaPK) object;
        if ((this.codigoPrograma == null && other.codigoPrograma != null) || (this.codigoPrograma != null && !this.codigoPrograma.equals(other.codigoPrograma))) {
            return false;
        }
        if ((this.codigoFicha == null && other.codigoFicha != null) || (this.codigoFicha != null && !this.codigoFicha.equals(other.codigoFicha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.acisa.aplicacionoptica.modelos.DeffichaPK[ codigoPrograma=" + codigoPrograma + ", codigoFicha=" + codigoFicha + " ]";
    }
    
}
