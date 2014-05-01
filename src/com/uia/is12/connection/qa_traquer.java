/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uia.is12.connection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author michael
 */
public class qa_traquer {
    
     
    private final String DB_URL = "jdbc:mysql://localhost:3306/qa_traquer";
    private final String USER = "root";
    private final String PASS = "admin";
    private Connection con = null;
    private CallableStatement cstmt;
    private Statement stmt;

    public qa_traquer(){        
    }
    
    public ResultSet executeQuery(String sql) throws SQLException{
        con = DriverManager.getConnection(DB_URL, USER, PASS);        
        cstmt = con.prepareCall(sql);
        ResultSet res = cstmt.executeQuery();         
        return res;
    }
    
    public void closeExecuteQuery() throws SQLException{        
        cstmt.close();
        con.close();
    }
    
    public void closeExecute() throws SQLException{        
        stmt.close();
        con.close();
    }
    
    public void execute(String sql) throws SQLException{
        con = DriverManager.getConnection(DB_URL, USER, PASS);       
        stmt = con.createStatement();
        stmt.execute(sql); 
    }
    
}
