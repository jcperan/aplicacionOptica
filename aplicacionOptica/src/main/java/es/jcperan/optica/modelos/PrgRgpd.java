/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.jcperan.optica.modelos;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

/**
 *
 * @author jcperan
 */
@Entity
@Table(name = "PRG_RGPD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PrgRgpd.findAll", query = "SELECT p FROM PrgRgpd p")
    , @NamedQuery(name = "PrgRgpd.findByCodigo", query = "SELECT p FROM PrgRgpd p WHERE p.codigo = :codigo")
    , @NamedQuery(name = "PrgRgpd.findByFecha", query = "SELECT p FROM PrgRgpd p WHERE p.fecha = :fecha")
    , @NamedQuery(name = "PrgRgpd.findByFecha1", query = "SELECT p FROM PrgRgpd p WHERE p.fecha1 = :fecha1")
    , @NamedQuery(name = "PrgRgpd.findByFecha2", query = "SELECT p FROM PrgRgpd p WHERE p.fecha2 = :fecha2")})
public class PrgRgpd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CODIGO")
    private String codigo;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "FOTO")
    private byte[] foto;

    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "FIRMA1")
    private String firma1;
    @Size(max = 10)
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA1")
    private Date fecha1;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "FIRMA2")
    private String firma2;
    @Size(max = 10)
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA2")
    private Date fecha2;
    
    @Transient
    private StreamedContent imagen;    

    public PrgRgpd() {
    }

    public PrgRgpd(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getFirma1() {
        return firma1;
    }

    public void setFirma1(String firma1) {
        this.firma1 = firma1;
    }

    public Date getFecha1() {
        return fecha1;
    }

    public void setFecha1(Date fecha1) {
        this.fecha1 = fecha1;
    }

    public String getFirma2() {
        return firma2;
    }

    public void setFirma2(String firma2) {
        this.firma2 = firma2;
    }

    public Date getFecha2() {
        return fecha2;
    }

    public void setFecha2(Date fecha2) {
        this.fecha2 = fecha2;
    }
    
    public StreamedContent getImagen() {
        if (foto == null) {
            imagen = null;
        } else {
            imagen = new DefaultStreamedContent(new ByteArrayInputStream(foto));
        }
        return imagen;
    }

    public void setImagen(StreamedContent imagen) {
        this.imagen = imagen;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrgRgpd)) {
            return false;
        }
        PrgRgpd other = (PrgRgpd) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.acisa.optica.modelos.PrgRgpd[ codigo=" + codigo + " ]";
    }
    
}
