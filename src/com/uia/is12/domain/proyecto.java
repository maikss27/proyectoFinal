/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uia.is12.domain;

/**
 *
 * @author michael
 */
public class proyecto {

    private int proyecto_id;
    private String proyecto_name;
    private String proyecto_desc;
    private String estado;

    public proyecto(String proyecto_name, String proyecto_desc, String estado) {
        this.proyecto_name = proyecto_name;
        this.proyecto_desc = proyecto_desc;
        this.estado = estado;
    }

    public proyecto(int proyecto_id, String proyecto_name, String proyecto_desc, String estado) {
        this.proyecto_id = proyecto_id;
        this.proyecto_name = proyecto_name;
        this.proyecto_desc = proyecto_desc;
        this.estado = estado;
    }

    public proyecto() {
    }

    public int getProyecto_id() {
        return proyecto_id;
    }

    public void setProyecto_id(int proyecto_id) {
        this.proyecto_id = proyecto_id;
    }

    public String getProyecto_name() {
        return proyecto_name;
    }

    public void setProyecto_name(String proyecto_name) {
        this.proyecto_name = proyecto_name;
    }

    public String getProyecto_desc() {
        return proyecto_desc;
    }

    public void setProyecto_desc(String proyecto_desc) {
        this.proyecto_desc = proyecto_desc;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
