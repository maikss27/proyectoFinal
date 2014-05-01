/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uia.is12.business;

import com.uia.is12.data.tareasDAO;
import com.uia.is12.domain.issues;
import com.uia.is12.domain.users;
import com.uia.is12.domain.tareas;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author michael
 */
public class tareasBusiness {
    
    tareasDAO pd;
    
    public tareasBusiness(){
    
     pd = new tareasDAO();
    }
    
    public void add(tareas t) throws SQLException {

        pd.add(t);

    }
    
     public void update(tareas t) throws SQLException {

        pd.update(t);

    }

    public void delete(int pid, int tid) throws SQLException {

        pd.delete(pid, tid);

    }

    public LinkedList<tareas> select_tareas(int tid) throws SQLException {

        return pd.select_tareas(tid);

    }
    
    public int tarea_id() throws SQLException {
      return pd.tarea_id();
    }
/*
    public void deleteGroup(String proyectos, String issues) throws SQLException {

        pd.deleteGroup(proyectos, issues);

    }*/
    
}
