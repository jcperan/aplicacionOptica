package es.jcperan.optica.controladores;

import es.jcperan.optica.modelos.Clientes;
import es.jcperan.optica.modelos.PrgRgpd;
import es.jcperan.optica.objetos.ClientesDAO;
import es.jcperan.optica.utilidades.Rutinas;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIParameter;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

/**
 * Controlador para la gestión de clientes
 * @author jcperan
 */
@ManagedBean(name="ControladorClientes")
@SessionScoped
public class ControladorClientes implements Serializable {
    
    @ManagedProperty(value = "#{ControladorLogin}")
    private ControladorLogin controladorLogin = new ControladorLogin();
    public void setControladorLogin(ControladorLogin controladorLogin) { this.controladorLogin = controladorLogin; }
    public ControladorLogin getControladorLogin() { return controladorLogin; }

    /**
     * Acceso a la entidad de los datos del cliente
     */
    private ClientesDAO clientes = new ClientesDAO();
    public ClientesDAO getClientes() { return clientes; }
    public void setClientes(ClientesDAO clientes) { this.clientes = clientes; }
    

    private String datoConsulta = "";
    public String getDatoConsulta() { return datoConsulta; }
    public void setDatoConsulta(String datoConsulta) { this.datoConsulta = datoConsulta; }
    
    
    private String firmaRgpd = "";

    public String getFirmaRgpd() {
        if (clientes.getClienteRGPD() == null) {
            this.firmaRgpd = "";
        } else {
            if (clientes.getClienteRGPD().getFirma1() == null) {
                this.firmaRgpd = "";
            } else {
                this.firmaRgpd = clientes.getClienteRGPD().getFirma1().toString();
            }
        }
        return firmaRgpd;
    }

    public void setFirmaRgpd(String firmaRgpd) {
        this.firmaRgpd = firmaRgpd;
    }
    
    private String firmaSepa = "";

    public String getFirmaSepa() {
        if (clientes.getClienteRGPD() == null) {
            this.firmaSepa = "";
        } else {
            if (clientes.getClienteRGPD().getFirma2() == null) {
                this.firmaSepa = "";
            } else {
                this.firmaSepa = clientes.getClienteRGPD().getFirma2().toString();
            }
        }
        return firmaSepa;
    }

    public void setFirmaSepa(String firmaSepa) {
        this.firmaSepa = firmaSepa;
    }
    
    
    /**
     * Evento de pulsar en el botón de buscar cliente
     * @param event 
     */
    public void cmdBuscaCliente(ActionEvent event) {
        clientes.listarClientes(datoConsulta);
    }
    
    /**
     * Evento de pulsar en el botón de aceptar cliente
     * @param event 
     */
    public void cmdAceptaCliente(ActionEvent event) {
        String codigo = ((UIParameter) event.getComponent().getFacet("id")).getValue().toString();
        clientes.setCliente((Clientes) clientes.Leer(Clientes.class, codigo));
        clientes.setClienteRGPD((PrgRgpd) clientes.Leer(PrgRgpd.class, codigo) );
    }
    
    public void cmdAceptaGraduacion(ActionEvent event) {
        
    }
    
    /**
     * Evento de pulsar en el botón de grabar firma rgpd
     */
    public void cmdGrabarFirma1() {
        clientes.GrabarFirma1(clientes.getCliente().getCodigoCliente(), this.firmaRgpd);
        clientes.setClienteRGPD((PrgRgpd) clientes.Leer(PrgRgpd.class, clientes.getCliente().getCodigoCliente()) );
        Rutinas.verMensaje("Firma Guardada");
    }
    
    public void cmdGrabarFirma2() {
        clientes.GrabarFirma2(clientes.getCliente().getCodigoCliente(), this.firmaSepa);
        clientes.setClienteRGPD((PrgRgpd) clientes.Leer(PrgRgpd.class, clientes.getCliente().getCodigoCliente()) );
        Rutinas.verMensaje("Firma Guardada");
    }
    
    
    public void subirFoto(FileUploadEvent event) {
        
        UploadedFile uploadedPhoto=event.getFile();
 
        byte[] bytes=null;
        if (null!=uploadedPhoto) {
            bytes = uploadedPhoto.getContents();
            clientes.GrabarFoto(clientes.getCliente().getCodigoCliente(), bytes);
            clientes.setClienteRGPD((PrgRgpd) clientes.Leer(PrgRgpd.class, clientes.getCliente().getCodigoCliente()) );
        }
 
        FacesContext.getCurrentInstance().addMessage("messages",new FacesMessage(FacesMessage.SEVERITY_INFO,"Carga de Foto Ejecutada.", ""));        
        
    }
        
}
