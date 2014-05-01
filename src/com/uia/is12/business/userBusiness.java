/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uia.is12.business;

import com.uia.is12.data.usersDAO;
import com.uia.is12.domain.users;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author michael
 */
public class userBusiness {
    
    usersDAO r;
    
    public userBusiness(){
    
        r = new usersDAO();
    }
    
     public boolean userExist(users u) throws SQLException {
         
         return r.userExist(u);
     
     }
    
     public void add(users u) throws SQLException {
         
         r.add(u);
 
     }
     
     public void delete(int user_id ) throws SQLException {
         
         r.delete(user_id);
     
     }
     
     public LinkedList<users> select_users() throws SQLException{
        return r.select_users();
     }
     
     public void update(users u) throws SQLException {
       r.update(u);
     }
     
     public void deleteGroup(String l) throws SQLException {
       r.deleteGroup(l);
     }
}
