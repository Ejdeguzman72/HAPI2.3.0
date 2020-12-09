/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deguzman.hapi2_2_0.db_utility.connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author EJ DeGuzman
 */
public class DBConnectionUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    }
    
    final public static String dbhost = "jdbc:postgresql://localhost:5432/InventoryTrackerDB";
    
    final public static String user = "postgres";
    
    final public static String password = "password";
    
    public static Connection dbConnect() {
        Connection conn = null;
        try {
           conn = DriverManager.getConnection(dbhost,user,password); 
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(conn + "this is the connection");
        return conn;
    }
}
