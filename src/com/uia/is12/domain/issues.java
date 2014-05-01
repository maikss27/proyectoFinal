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
public class issues {

    private int proyecto_id;
    private int tarea_id;
    private int issue_id;
    private String issue_desc;
    private int user_id;
    private String fecha_digita;
    private String estado;

    public issues() {
    }

    public issues(int proyecto_id, String issue_desc, int user_id, String fecha_digita, String estado) {
        this.proyecto_id = proyecto_id;
        this.issue_desc = issue_desc;
        this.user_id = user_id;
        this.fecha_digita = fecha_digita;
        this.estado = estado;
    }
    
    public issues(int tarea_id, int issue_id){
      this.tarea_id = tarea_id;
      this.issue_id = issue_id;
    }
    
    public issues(int proyecto_id, int issue_id, String issue_desc, int user_id, String fecha_digita, String estado) {
        this.proyecto_id = proyecto_id;
        this.issue_id = issue_id;
        this.issue_desc = issue_desc;
        this.user_id = user_id;
        this.fecha_digita = fecha_digita;
        this.estado = estado;
    }    

    public issues(int proyecto_id, int tarea_id, int issue_id,String issue_desc, int user_id, String fecha_digita, String estado) {
        this.proyecto_id = proyecto_id;
        this.tarea_id = tarea_id;
        this.issue_id = issue_id;
        this.issue_desc = issue_desc;
        this.user_id = user_id;
        this.fecha_digita = fecha_digita;
        this.estado = estado;
    }

    public int getProyecto_id() {
        return proyecto_id;
    }

    public void setProyecto_id(int proyecto_id) {
        this.proyecto_id = proyecto_id;
    }

    public int getIssue_id() {
        return issue_id;
    }

    public void setIssue_id(int issue_id) {
        this.issue_id = issue_id;
    }

    public String getIssue_desc() {
        return issue_desc;
    }

    public void setIssue_desc(String issue_desc) {
        this.issue_desc = issue_desc;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getFecha_digita() {
        return fecha_digita;
    }

    public void setFecha_digita(String fecha_digita) {
        this.fecha_digita = fecha_digita;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getTarea_id() {
        return tarea_id;
    }

    public void setTarea_id(int tarea_id) {
        this.tarea_id = tarea_id;
    }

    
}
