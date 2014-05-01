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
public class users {

    private int user_id;
    private String user_name;
    private String user_pass;
    private String name;
    private String last_name;
    private String user_type;

    public users() {

    }

    public users(String user_name, String user_pass) {
        this.user_name = user_name;
        this.user_pass = user_pass;
    }

    public users(int user_id, String user_name, String user_pass, String name, String last_name, String user_type) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_pass = user_pass;
        this.name = name;
        this.last_name = last_name;
        this.user_type = user_type;
    }
    
    public users(int user_id, String user_name) {
        this.user_id = user_id;
        this.user_name = user_name;
    }    
    
    public users(String user_name, String user_pass, String name, String last_name, String user_type) {
        this.user_name = user_name;
        this.user_pass = user_pass;
        this.name = name;
        this.last_name = last_name;
        this.user_type = user_type;
    }    

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

}
