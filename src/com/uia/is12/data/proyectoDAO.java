/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uia.is12.data;

import com.uia.is12.connection.qa_traquer;
import com.uia.is12.domain.proyecto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author michael
 */
public class proyectoDAO {

    qa_traquer db;

    public proyectoDAO() {

        db = new qa_traquer();
    }

    public void add(proyecto p) throws SQLException {

        String sql = "insert into qa_traquer.proyectos (proyecto_name,proyecto_desc,estado)"
                + "values ('" + p.getProyecto_name() + "','" + p.getProyecto_desc() + "','" + p.getEstado() + "')";

        db.execute(sql);
        db.closeExecute();

    }
    
    public void update(proyecto p) throws SQLException {

        String sql = "update qa_traquer.proyectos "
                + "set proyecto_name = '"+p.getProyecto_name()+"' ,proyecto_desc = '"+p.getProyecto_desc()+"' ,estado ='"+p.getEstado()+"' "
                + " where proyecto_id = "+p.getProyecto_id();

        db.execute(sql);
        db.closeExecute();

    }    
    
    public void delete(int pid) throws SQLException {

        String sql = "delete qa_traquer.proyectos "
                + " where proyecto_id = "+pid;

        db.execute(sql);
        db.closeExecute();

    }     
    
    public LinkedList<proyecto> select_proy() throws SQLException {

        LinkedList<proyecto> proyectos = new LinkedList<>();

        String sql = "select proyecto_id, proyecto_name, proyecto_desc, estado "
                + "from qa_traquer.proyectos";
        ResultSet r = db.executeQuery(sql);
        while (r.next()) {
            proyectos.add(new proyecto(r.getInt("proyecto_id"), r.getString("proyecto_name"), r.getString("proyecto_desc"),
                    r.getString("estado")));
        }
        db.closeExecuteQuery();
        return proyectos;
    }    
   
    public void deleteGroup(String l) throws SQLException {

        String sql = "delete from qa_traquer.proyectos where proyecto_id in (" + l.substring(1, l.length()) + ")";
        db.execute(sql);
        db.closeExecute();
    }    

}
