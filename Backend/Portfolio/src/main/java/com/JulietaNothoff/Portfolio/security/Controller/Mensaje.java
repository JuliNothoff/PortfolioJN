
package com.JulietaNothoff.Portfolio.security.Controller;

/**
 *
 * @author julie
 */
public class Mensaje {
    
    private String mensaje;

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    public Mensaje(){
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}
