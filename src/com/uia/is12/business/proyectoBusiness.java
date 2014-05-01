/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uia.is12.business;

import com.uia.is12.data.proyectoDAO;
import com.uia.is12.domain.proyecto;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author michael
 */
public class proyectoBusiness {

    proyectoDAO pd;

    public proyectoBusiness() {

        pd = new proyectoDAO();
    }

    public void add(proyecto p) throws SQLException {

        pd.add(p);

    }
    
     public void update(proyecto p) throws SQLException {
         
       pd.update(p);
         
     }
     
     public void delete(int pid) throws SQLException {
         
       pd.delete(pid);
         
     }
     
    public LinkedList<proyecto> select_proy() throws SQLException {
        
      return pd.select_proy();
        
    }     
    
 public void deleteGroup(String l) throws SQLException {
     pd.deleteGroup(l);
 }    

}
