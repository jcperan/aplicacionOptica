/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.jcperan.optica.modelos;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "PRGCLI")
@NamedQueries({
    @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c")})
public class Clientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CODIGO_CLIENTE")
    private String codigoCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "INICIALES")
    private String iniciales;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Size(max = 40)
    @Column(name = "RAZON_SOCIAL")
    private String razonSocial;
    @Size(max = 20)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 40)
    @Column(name = "DIRECCION")
    private String direccion;
    @Size(max = 10)
    @Column(name = "APTDO_CORREOS")
    private String aptdoCorreos;
    @Size(max = 5)
    @Column(name = "CODIGO_POSTAL")
    private String codigoPostal;
    @Size(max = 30)
    @Column(name = "POBLACION")
    private String poblacion;
    @Size(max = 20)
    @Column(name = "PROVINCIA")
    private String provincia;
    @Size(max = 40)
    @Column(name = "PERSONA_CONTACTO")
    private String personaContacto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "DNI_CIF")
    private String dniCif;
    @Size(max = 14)
    @Column(name = "TELEFONO_1")
    private String telefono1;
    @Size(max = 14)
    @Column(name = "TELEFONO_2")
    private String telefono2;
    @Size(max = 14)
    @Column(name = "NRO_FAX")
    private String nroFax;
    @Size(max = 15)
    @Column(name = "NOMBRE_ALMACEN")
    private String nombreAlmacen;
    @Size(max = 17)
    @Column(name = "NRO_DE_ALMACEN")
    private String nroDeAlmacen;
    @Size(max = 30)
    @Column(name = "BANCO_CAJA")
    private String bancoCaja;
    @Size(max = 30)
    @Column(name = "SUCURSAL")
    private String sucursal;
    @Size(max = 20)
    @Column(name = "NRO_CTA_CTE")
    private String nroCtaCte;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "REPRESENTANTE")
    private String representante;
    @Size(max = 1)
    @Column(name = "ASEGURADO")
    private String asegurado;
    @Size(max = 12)
    @Column(name = "NRO_ASEGURADO")
    private String nroAsegurado;
    @Size(max = 1)
    @Column(name = "RECARGO")
    private String recargo;
    @Size(max = 14)
    @Column(name = "CIF_COMUNITARIO")
    private String cifComunitario;
    @Size(max = 14)
    @Column(name = "COD_PROVEEDOR")
    private String codProveedor;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RIESGO")
    private BigDecimal riesgo;
    @Column(name = "ALBARANES_FACTUR")
    private Double albaranesFactur;
    @Column(name = "COPIAS_FACTURA")
    private Double copiasFactura;
    @Size(max = 2048)
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Size(max = 2)
    @Column(name = "DELEGACION")
    private String delegacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "ZONA")
    private String zona;
    @Column(name = "SALDO_ENVASES")
    private Double saldoEnvases;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NRO_ORDEN")
    private double nroOrden;
    @Size(max = 10)
    @Column(name = "CTA_COBRO")
    private String ctaCobro;
    @Column(name = "DTO_FRA")
    private Double dtoFra;
    @Size(max = 10)
    @Column(name = "F_ALTA")
    private String fAlta;
    @Size(max = 1)
    @Column(name = "PEDIDO")
    private String pedido;
    @Size(max = 1)
    @Column(name = "CLAVE")
    private String clave;
    @Size(max = 1)
    @Column(name = "BAJA")
    private String baja;
    @Size(max = 1)
    @Column(name = "DTOS_MENSUALES")
    private String dtosMensuales;
    @Size(max = 1)
    @Column(name = "ENVASES")
    private String envases;
    @Size(max = 1)
    @Column(name = "FRAEUROS")
    private String fraeuros;
    @Size(max = 5)
    @Column(name = "VTO_FIJO1")
    private String vtoFijo1;
    @Size(max = 5)
    @Column(name = "VTO_FIJO2")
    private String vtoFijo2;
    @Size(max = 1)
    @Column(name = "SERIE")
    private String serie;
    @Column(name = "PRODUCCION")
    private Double produccion;
    @Size(max = 10)
    @Column(name = "CTA_REPR")
    private String ctaRepr;
    @Size(max = 45)
    @Column(name = "OBS_COBRO")
    private String obsCobro;
    @Column(name = "DIAS_GRACIA")
    private Double diasGracia;
    @Size(max = 10)
    @Column(name = "F_BAJA")
    private String fBaja;
    @Size(max = 30)
    @Column(name = "INTEGRADO_EN")
    private String integradoEn;
    @Size(max = 30)
    @Column(name = "CAMPO_DATOS")
    private String campoDatos;
    @Size(max = 1)
    @Column(name = "TIPO")
    private String tipo;
    @Size(max = 10)
    @Column(name = "CLTE_FACTURA")
    private String clteFactura;
    @Size(max = 10)
    @Column(name = "CLTE_CADENA")
    private String clteCadena;
    @Column(name = "NRO_ASOC")
    private Double nroAsoc;
    @Size(max = 1)
    @Column(name = "DOMICILIADO")
    private String domiciliado;
    @Size(max = 2)
    @Column(name = "IDIOMA")
    private String idioma;
    @Size(max = 3)
    @Column(name = "MONEDA")
    private String moneda;
    @Size(max = 3)
    @Column(name = "PAIS")
    private String pais;

    public Clientes() {
    }

    public Clientes(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Clientes(String codigoCliente, String iniciales, String apellidos, String dniCif, String representante, String zona, double nroOrden) {
        this.codigoCliente = codigoCliente;
        this.iniciales = iniciales;
        this.apellidos = apellidos;
        this.dniCif = dniCif;
        this.representante = representante;
        this.zona = zona;
        this.nroOrden = nroOrden;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getIniciales() {
        return iniciales;
    }

    public void setIniciales(String iniciales) {
        this.iniciales = iniciales;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAptdoCorreos() {
        return aptdoCorreos;
    }

    public void setAptdoCorreos(String aptdoCorreos) {
        this.aptdoCorreos = aptdoCorreos;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPersonaContacto() {
        return personaContacto;
    }

    public void setPersonaContacto(String personaContacto) {
        this.personaContacto = personaContacto;
    }

    public String getDniCif() {
        return dniCif;
    }

    public void setDniCif(String dniCif) {
        this.dniCif = dniCif;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getNroFax() {
        return nroFax;
    }

    public void setNroFax(String nroFax) {
        this.nroFax = nroFax;
    }

    public String getNombreAlmacen() {
        return nombreAlmacen;
    }

    public void setNombreAlmacen(String nombreAlmacen) {
        this.nombreAlmacen = nombreAlmacen;
    }

    public String getNroDeAlmacen() {
        return nroDeAlmacen;
    }

    public void setNroDeAlmacen(String nroDeAlmacen) {
        this.nroDeAlmacen = nroDeAlmacen;
    }

    public String getBancoCaja() {
        return bancoCaja;
    }

    public void setBancoCaja(String bancoCaja) {
        this.bancoCaja = bancoCaja;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getNroCtaCte() {
        return nroCtaCte;
    }

    public void setNroCtaCte(String nroCtaCte) {
        this.nroCtaCte = nroCtaCte;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getAsegurado() {
        return asegurado;
    }

    public void setAsegurado(String asegurado) {
        this.asegurado = asegurado;
    }

    public String getNroAsegurado() {
        return nroAsegurado;
    }

    public void setNroAsegurado(String nroAsegurado) {
        this.nroAsegurado = nroAsegurado;
    }

    public String getRecargo() {
        return recargo;
    }

    public void setRecargo(String recargo) {
        this.recargo = recargo;
    }

    public String getCifComunitario() {
        return cifComunitario;
    }

    public void setCifComunitario(String cifComunitario) {
        this.cifComunitario = cifComunitario;
    }

    public String getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(String codProveedor) {
        this.codProveedor = codProveedor;
    }

    public BigDecimal getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(BigDecimal riesgo) {
        this.riesgo = riesgo;
    }

    public Double getAlbaranesFactur() {
        return albaranesFactur;
    }

    public void setAlbaranesFactur(Double albaranesFactur) {
        this.albaranesFactur = albaranesFactur;
    }

    public Double getCopiasFactura() {
        return copiasFactura;
    }

    public void setCopiasFactura(Double copiasFactura) {
        this.copiasFactura = copiasFactura;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getDelegacion() {
        return delegacion;
    }

    public void setDelegacion(String delegacion) {
        this.delegacion = delegacion;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Double getSaldoEnvases() {
        return saldoEnvases;
    }

    public void setSaldoEnvases(Double saldoEnvases) {
        this.saldoEnvases = saldoEnvases;
    }

    public double getNroOrden() {
        return nroOrden;
    }

    public void setNroOrden(double nroOrden) {
        this.nroOrden = nroOrden;
    }

    public String getCtaCobro() {
        return ctaCobro;
    }

    public void setCtaCobro(String ctaCobro) {
        this.ctaCobro = ctaCobro;
    }

    public Double getDtoFra() {
        return dtoFra;
    }

    public void setDtoFra(Double dtoFra) {
        this.dtoFra = dtoFra;
    }

    public String getFAlta() {
        return fAlta;
    }

    public void setFAlta(String fAlta) {
        this.fAlta = fAlta;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getBaja() {
        return baja;
    }

    public void setBaja(String baja) {
        this.baja = baja;
    }

    public String getDtosMensuales() {
        return dtosMensuales;
    }

    public void setDtosMensuales(String dtosMensuales) {
        this.dtosMensuales = dtosMensuales;
    }

    public String getEnvases() {
        return envases;
    }

    public void setEnvases(String envases) {
        this.envases = envases;
    }

    public String getFraeuros() {
        return fraeuros;
    }

    public void setFraeuros(String fraeuros) {
        this.fraeuros = fraeuros;
    }

    public String getVtoFijo1() {
        return vtoFijo1;
    }

    public void setVtoFijo1(String vtoFijo1) {
        this.vtoFijo1 = vtoFijo1;
    }

    public String getVtoFijo2() {
        return vtoFijo2;
    }

    public void setVtoFijo2(String vtoFijo2) {
        this.vtoFijo2 = vtoFijo2;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Double getProduccion() {
        return produccion;
    }

    public void setProduccion(Double produccion) {
        this.produccion = produccion;
    }

    public String getCtaRepr() {
        return ctaRepr;
    }

    public void setCtaRepr(String ctaRepr) {
        this.ctaRepr = ctaRepr;
    }

    public String getObsCobro() {
        return obsCobro;
    }

    public void setObsCobro(String obsCobro) {
        this.obsCobro = obsCobro;
    }

    public Double getDiasGracia() {
        return diasGracia;
    }

    public void setDiasGracia(Double diasGracia) {
        this.diasGracia = diasGracia;
    }

    public String getFBaja() {
        return fBaja;
    }

    public void setFBaja(String fBaja) {
        this.fBaja = fBaja;
    }

    public String getIntegradoEn() {
        return integradoEn;
    }

    public void setIntegradoEn(String integradoEn) {
        this.integradoEn = integradoEn;
    }

    public String getCampoDatos() {
        return campoDatos;
    }

    public void setCampoDatos(String campoDatos) {
        this.campoDatos = campoDatos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClteFactura() {
        return clteFactura;
    }

    public void setClteFactura(String clteFactura) {
        this.clteFactura = clteFactura;
    }

    public String getClteCadena() {
        return clteCadena;
    }

    public void setClteCadena(String clteCadena) {
        this.clteCadena = clteCadena;
    }

    public Double getNroAsoc() {
        return nroAsoc;
    }

    public void setNroAsoc(Double nroAsoc) {
        this.nroAsoc = nroAsoc;
    }

    public String getDomiciliado() {
        return domiciliado;
    }

    public void setDomiciliado(String domiciliado) {
        this.domiciliado = domiciliado;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoCliente != null ? codigoCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.codigoCliente == null && other.codigoCliente != null) || (this.codigoCliente != null && !this.codigoCliente.equals(other.codigoCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.acisa.aplicacionoptica.modelos.Clientes[ codigoCliente=" + codigoCliente + " ]";
    }
    
}
