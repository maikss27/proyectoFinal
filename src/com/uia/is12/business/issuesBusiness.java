/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uia.is12.business;

import com.uia.is12.data.issuesDAO;
import com.uia.is12.data.proyectoDAO;
import com.uia.is12.domain.issues;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author michael
 */
public class issuesBusiness {

    issuesDAO pd;

    public issuesBusiness() {

        pd = new issuesDAO();
    }

    public void add(issues s) throws SQLException {

        pd.add(s);

    }

    public void update(issues s) throws SQLException {

        pd.update(s);

    }
    
    public void updateTarea(int tarea_id, int issue_id) throws SQLException { 
    
        pd.updateTarea(tarea_id, issue_id);
        
    }   

    public void delete(int pid, int iid) throws SQLException {

        pd.delete(pid, iid);

    }

    public LinkedList<issues> select_issues(int pid) throws SQLException {

        return pd.select_issues(pid);

    }

    public void deleteGroup(String proyectos, String issues) throws SQLException {

        pd.deleteGroup(proyectos, issues);

    }
}
