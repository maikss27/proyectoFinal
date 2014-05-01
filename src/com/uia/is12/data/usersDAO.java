/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uia.is12.data;

import com.uia.is12.connection.qa_traquer;
import com.uia.is12.domain.users;
import com.uia.is12.view.view;
import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author michael
 */
public class usersDAO {

    qa_traquer db;

    public usersDAO() {

        db = new qa_traquer();

    }

    public boolean userExist(users u) throws SQLException {
        boolean existe = false;
        try {

            String sql = ("select user_id from users where user_name='" + u.getUser_name() + "'and user_pass='" + u.getUser_pass() + "'");

            ResultSet r = db.executeQuery(sql);
            if (r.next()) {
                existe = true;
            }
        } catch (SQLException e) {
        }

        return existe;

    }

    public void add(users u) throws SQLException {

        String sql = "insert into qa_traquer.users (user_name, user_pass, user_type, name, last_name)"
                + "values ('" + u.getUser_name() + "','" + u.getUser_pass() + "' ,'" + u.getUser_type() + "',"
                + "'" + u.getName() + "', '" + u.getLast_name() + "')";

        db.execute(sql);
        db.closeExecute();
    }

    public void delete(int user_id) throws SQLException {

        String sql = "delete from qa_traquer.users where user_id = '" + user_id + "'";

        db.execute(sql);
        db.closeExecute();

    }

    public LinkedList<users> select_users() throws SQLException {

        LinkedList<users> usuarios = new LinkedList<>();

        String sql = "select user_id, user_name, user_pass, user_type, name, last_name "
                + "from qa_traquer.users";
        ResultSet r = db.executeQuery(sql);
        while (r.next()) {
            usuarios.add(new users(r.getInt("user_id"), r.getString("user_name"), r.getString("user_pass"),
                    r.getString("name"), r.getString("last_name"), r.getString("user_type")));
        }
        db.closeExecuteQuery();
        return usuarios;
    }

    public void update(users u) throws SQLException {

        String sql = "update qa_traquer.users set user_name = '" + u.getUser_name() + "', user_pass = '"
                + u.getUser_pass() + "', user_type = '" + u.getUser_type() + "', name = '" + u.getName() + "', last_name = '" + u.getLast_name() + "'"
                + " where user_id = " + u.getUser_id();

        db.execute(sql);
        db.closeExecute();
    }

    public void deleteGroup(String l) throws SQLException {

        String sql = "delete from qa_traquer.users where user_id in (" + l.substring(1, l.length()) + ")";
        db.execute(sql);
        db.closeExecute();
    }
}
