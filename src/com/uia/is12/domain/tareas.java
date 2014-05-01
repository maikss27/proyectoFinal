/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uia.is12.domain;

import java.sql.Date;

/**
 *
 * @author michael
 */
public class tareas {

   

    private int tarea_id;
    private String tarea_desc;
    private String estado;
    private String fecha_inicio;
    private String fecha_final;
    private String comentarios;
    private int avance;
    
    public tareas() {
    }

    public tareas(int tarea_id, String tarea_desc, String estado, String fecha_inicio, String fecha_final, String comentarios, int avance) {
        this.tarea_id = tarea_id;
        this.tarea_desc = tarea_desc;
        this.estado = estado;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
        this.comentarios = comentarios;
        this.avance = avance;
    }

    public tareas(String tarea_desc, String estado, String fecha_inicio, String fecha_final, String comentarios, int avance) {
        this.tarea_desc = tarea_desc;
        this.estado = estado;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
        this.comentarios = comentarios;
        this.avance = avance;
    }

    
 public int getTarea_id() {
        return tarea_id;
    }

    public void setTarea_id(int tarea_id) {
        this.tarea_id = tarea_id;
    }

    public String getTarea_desc() {
        return tarea_desc;
    }

    public void setTarea_desc(String tarea_desc) {
        this.tarea_desc = tarea_desc;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(String fecha_final) {
        this.fecha_final = fecha_final;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public int getAvance() {
        return avance;
    }

    public void setAvance(int avance) {
        this.avance = avance;
    }
  

}
