
package com.JulietaNothoff.Portfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author julie
 */
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    private String periodoE;

    public Experiencia() {
    }

    public Experiencia(String nombreE, String descripcionE, String periodoE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.periodoE = periodoE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getPeriodoE() {
        return periodoE;
    }

    public void setPeriodoE(String periodoE) {
        this.periodoE = periodoE;
    }
    
    
    
}
