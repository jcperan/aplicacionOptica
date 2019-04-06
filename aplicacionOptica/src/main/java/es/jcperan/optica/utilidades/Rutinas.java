package es.jcperan.optica.utilidades;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@SuppressWarnings("deprecation")
public class Rutinas {

    /**
     * Convertir objeto en cadena String
     * @param pObjeto
     * @return 
     */
    public static String Cadena(Object pObjeto) {
        String resultado = "";

        try {
            if (pObjeto != null) {
                resultado = pObjeto.toString();
            }

        } catch (Exception e) {
            resultado = "";
        }

        return resultado;
    }

    /**
     * Obtener el Valor double de un objeto
     * @param pObjeto
     * @return 
     */
    public static Double Valor(Object pObjeto) {
        return Valor(pObjeto, -1);
    }

    public static Double Valor(Object pObjeto, Integer pDecimales) {
        Double resultado = 0D;

        try {
            if (pObjeto != null) {
                resultado = Double.parseDouble(pObjeto.toString());

                if (pDecimales >= 0) {
                    Double potencia = Math.pow(10, pDecimales);
                    resultado = Math.floor((resultado * potencia) + 0.5) / potencia;
                }
            }
        } catch (Exception e) {
            resultado = 0D;
        }

        return resultado;
    }

    /**
     * Convertir Fecha a Texto
     * @param pFecha
     * @return 
     */
    public static String FechaATexto(Date pFecha) {
        return FechaATexto(pFecha, "dd/MM/yyyy");
    }

    public static String FechaATexto(Date pFecha, String pFormato) {
        String resultado = "";

        try {
            SimpleDateFormat sdf = new SimpleDateFormat(pFormato);
            resultado = sdf.format(pFecha);

        } catch (Exception e) {
            resultado = "";
        }

        return resultado;
    }

    /**
     * Obtener una fecha desde valores de dia, mes y ano
     * @param pDia
     * @param pMes
     * @param pAno
     * @return 
     */
    public static Date Fecha(Integer pDia, Integer pMes, Integer pAno) {
        Date resultado = null;
        Calendar cal = Calendar.getInstance();

        try {
            if (pDia != null && pDia != 0) {
                cal.set(pAno, pMes - 1, pDia);

                resultado = cal.getTime();
            }

        } catch (Exception e) {
            resultado = null;
        }

        return resultado;
    }

    public static Date Fecha(String pFecha) {
        return Fecha(pFecha, "dd/MM/yyyy");
    }

    public static Date Fecha(String pFecha, String pFormato) {
        Date resultado = null;

        try {
            SimpleDateFormat sdf = new SimpleDateFormat(pFormato);
            resultado = sdf.parse(pFecha);

        } catch (Exception e) {
            resultado = null;
        }

        return resultado;
    }

    /**
     * Dar formato a un numero
     * @param entrada
     * @param formato
     * @return 
     */
    public static String FormatoNumero(Object entrada, String formato) {
        DecimalFormat df = new DecimalFormat(formato);

        return df.format(Double.valueOf(entrada.toString()));
    }
    

    public static void verMensaje(String textoMensaje) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, textoMensaje, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }    

    //// Log
    public static void Log(String pMensaje) {
        Log(pMensaje, null, false);
    }

    public static void Log(String pMensaje, Exception pExcepcion) {
        Log(pMensaje, pExcepcion, false);
    }

    public static void Log(String pMensaje, Exception pExcepcion, boolean pSoloLog) {
        String mensajeLog = "", mensaje = "";

        mensajeLog = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(Calendar.getInstance().getTime()) + " ";

        if (pExcepcion != null) {
            mensaje = "ERROR: " + pMensaje + " _ ";
            // Si hay excepción, mensaje contiene el nombre del método
            mensajeLog += "ERROR en " + pMensaje + ":";

            // Causa
            try {
                if (pExcepcion.getCause() != null) {
                    mensaje += " CAUSA: " + pExcepcion.getCause().toString() + " _ ";
                    mensajeLog += " CAUSA: " + pExcepcion.getCause().toString() + " _ ";
                }
            } catch (Exception ex) {
            }

            // Mensaje
            try {
                mensaje += pExcepcion.getMessage();
                mensajeLog += pExcepcion.getMessage();
            } catch (Exception ex) {
            }

        } else {
            mensaje = pMensaje;
            mensajeLog += "LOG: " + pMensaje;
        }

        // Envíar mensaje a System.out
        System.out.println(mensajeLog);

        if (!pSoloLog) {
            // Enviar mensaje a FacesContext
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(mensaje));
        }
    }
}
