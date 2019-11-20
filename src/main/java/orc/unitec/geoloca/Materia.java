/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orc.unitec.geoloca;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author Aaron
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Materia {
    private String nobre;
    private float calificacion;

    /**
     * @return the nobre
     */
    public String getNobre() {
        return nobre;
    }

    /**
     * @param nobre the nobre to set
     */
    public void setNobre(String nobre) {
        this.nobre = nobre;
    }

    /**
     * @return the calificacion
     */
    public float getCalificacion() {
        return calificacion;
    }

    /**
     * @param calificacion the calificacion to set
     */
    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

}
