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
public class DefcampoPK implements Serializable {

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
    @Column(name = "NRO_CAMPO")
    private double nroCampo;

    public DefcampoPK() {
    }

    public DefcampoPK(String codigoPrograma, String codigoFicha, double nroCampo) {
        this.codigoPrograma = codigoPrograma;
        this.codigoFicha = codigoFicha;
        this.nroCampo = nroCampo;
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

    public double getNroCampo() {
        return nroCampo;
    }

    public void setNroCampo(double nroCampo) {
        this.nroCampo = nroCampo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoPrograma != null ? codigoPrograma.hashCode() : 0);
        hash += (codigoFicha != null ? codigoFicha.hashCode() : 0);
        hash += (int) nroCampo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DefcampoPK)) {
            return false;
        }
        DefcampoPK other = (DefcampoPK) object;
        if ((this.codigoPrograma == null && other.codigoPrograma != null) || (this.codigoPrograma != null && !this.codigoPrograma.equals(other.codigoPrograma))) {
            return false;
        }
        if ((this.codigoFicha == null && other.codigoFicha != null) || (this.codigoFicha != null && !this.codigoFicha.equals(other.codigoFicha))) {
            return false;
        }
        if (this.nroCampo != other.nroCampo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.acisa.aplicacionoptica.modelos.DefcampoPK[ codigoPrograma=" + codigoPrograma + ", codigoFicha=" + codigoFicha + ", nroCampo=" + nroCampo + " ]";
    }
    
}
