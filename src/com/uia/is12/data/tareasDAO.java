/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uia.is12.data;

import com.uia.is12.connection.qa_traquer;
import com.uia.is12.domain.tareas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author michael
 */
public class tareasDAO {

    qa_traquer db;
   

    public tareasDAO() {

        db = new qa_traquer();

    }

   
  public void add(tareas t) throws SQLException{
  
        java.util.Date fecha = new Date();
        String sql = "insert into qa_traquer.tareas (proyecto_id,tarea_desc,estado, fecha_inicio,fecha_final,"
                   + "comentarios, user_id,avance) values(" + 1 + ",'" + t.getTarea_desc() + "',' " + t.getEstado() +
                     " ','" +t.getFecha_inicio()+"','" + t.getFecha_final() +"',' "+t.getComentarios() +" ',"+ 1 +","+t.getAvance()+")";
        System.out.print(sql);
        db.execute(sql);
        db.closeExecute();
  
  }
  
   public void update(tareas t) throws SQLException {
        
        String sql = "update qa_traquer.tareas set tarea_desc = '" + t.getTarea_desc() + "',estado = '" + t.getEstado() + "','"+t.getFecha_inicio()+
                     " ', ' "+ t.getFecha_final() +" ',' "+t.getComentarios()+" ',' "+t.getAvance()+" '  where proyecto_id = " + 1 + 
                     "and tarea_id = "+t.getTarea_id();

        
        System.out.println(sql);
        
        db.execute(sql);
        db.closeExecute();

    }

    public void delete(int pid, int tid) throws SQLException {

        String sql = "delete qa_traquer.tareas "
                   + " where proyecto_id = " + pid + " and tarea_id = " + tid;

        db.execute(sql);
        db.closeExecute();

    }

    public LinkedList<tareas> select_tareas(int tid) throws SQLException {

        LinkedList<tareas> tareas = new LinkedList<>();

        String sql = "select tarea_id, tarea_desc,estado,fecha_inicio,fecha_final,"
                   + "comentarios,avance "
                   + "from qa_traquer.tareas "
                   + "where tarea_id = " + tid;
        ResultSet r = db.executeQuery(sql);
        while (r.next()) {
            tareas.add(new tareas( r.getInt("tarea_id"), r.getString("tarea_desc"),
                    r.getString("estado"), r.getString("fecha_inicio"), r.getString("fecha_final"),
                    r.getString("comentarios"),r.getInt("avance")));
        }
        db.closeExecuteQuery();
        return tareas;
    }
    
        public int tarea_id() throws SQLException {
        int tarea_id;
        String sql = "select isnull(max(tarea_id),1) tarea_id "
                   + "from qa_traquer.tareas";
        ResultSet r = db.executeQuery(sql);     
        tarea_id = r.getInt("tarea_id");
       
        return tarea_id;
    }
                
/*
    public void deleteGroup(String proyectos, String issues) throws SQLException {

        String sql = "delete from qa_traquer.issues where proyecto_id in (" + proyectos.substring(1, proyectos.length())
                + ") and issues_id in (" + issues.substring(1, issues.length()) + ")";
        db.execute(sql);
        db.closeExecute();
    }*/
   
}
