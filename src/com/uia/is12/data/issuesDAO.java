/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uia.is12.data;

import com.uia.is12.connection.qa_traquer;
import com.uia.is12.domain.issues;
import com.uia.is12.domain.proyecto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author michael
 */
public class issuesDAO {

    qa_traquer db;

    public issuesDAO() {

        db = new qa_traquer();
    }

    public void add(issues s) throws SQLException {
        java.util.Date fecha = new Date();
        String sql = "insert into qa_traquer.issues (proyecto_id,tarea_id,issue_desc,user_id,fecha_digita,estado) "
                + "values(" + s.getProyecto_id() + "," + 1 + ",'" + s.getIssue_desc() + "'," + s.getUser_id() + ",'" +fecha.getDate()+"','" + s.getEstado() + "')";

        db.execute(sql);
        db.closeExecute();
    }

    public void update(issues s) throws SQLException {
        
        String sql = "update qa_traquer.issues set issue_desc = '" + s.getIssue_desc() + "',estado = '" + s.getEstado() + "' "
                + "where proyecto_id = " + s.getProyecto_id() + "and tarea_id = "+s.getTarea_id()+" and issue_id = " + s.getIssue_id();

        
        System.out.println(sql);
        
        db.execute(sql);
        db.closeExecute();

    }
    
        public void updateTarea(int tarea_id, int issue_id) throws SQLException {
        
        String sql = "update qa_traquer.issues set tarea_id = "+tarea_id+
                     " where issue_id = "+issue_id;

        
        System.out.println(sql);
        
        db.execute(sql);
        db.closeExecute();

    }

    public void delete(int pid, int iid) throws SQLException {

        String sql = "delete qa_traquer.issues "
                + " where proyecto_id = " + pid + " and issue_id = " + iid;

        db.execute(sql);
        db.closeExecute();

    }

    public LinkedList<issues> select_issues(int pid) throws SQLException {

        LinkedList<issues> issues = new LinkedList<>();

        String sql = "select proyecto_id, issue_id, issue_desc, user_id, fecha_digita, estado "
                + "from qa_traquer.issues "
                + "where proyecto_id = " + pid;
        ResultSet r = db.executeQuery(sql);
        while (r.next()) {
            issues.add(new issues(r.getInt("proyecto_id"), r.getInt("issue_id"), r.getString("issue_desc"),
                    r.getInt("user_id"), r.getString("fecha_digita"), r.getString("estado")));
        }
        db.closeExecuteQuery();
        return issues;
    }

    public void deleteGroup(String proyectos, String issues) throws SQLException {

        String sql = "delete from qa_traquer.issues where proyecto_id in (" + proyectos.substring(1, proyectos.length())
                + ") and issues_id in (" + issues.substring(1, issues.length()) + ")";
        db.execute(sql);
        db.closeExecute();
    }
    
    public void llenaComboProy(int pid ){
        
        String sql =" select id_proyecto, proyecto_desc from qa_traquer ";


     }

}

    