/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deguzman.hapi2_2_0.register_form;

import com.deguzman.hapi2_2_0.db_utility.connection.DBConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author ejdeg
 */
public class RegisterUser {
    
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    String sql = "INSERT INTO users VALUES (?,?,?,?,?,?)";
    
    public PreparedStatement prepareQuery(int id, String username, String password, 
            String firstname, String lastname, int user_status_id, int role_id) {
        try {
            conn = DBConnectionUtil.dbConnect();
            pst = conn.prepareStatement(sql);
            pst.setInt(1,id);
            pst.setString(2,username);
            pst.setString(3,password);
            pst.setString(4, firstname);
            pst.setString(5,lastname);
            pst.setInt(6,user_status_id);
            pst.setInt(7,role_id);
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    return pst;  
    }
    
}
