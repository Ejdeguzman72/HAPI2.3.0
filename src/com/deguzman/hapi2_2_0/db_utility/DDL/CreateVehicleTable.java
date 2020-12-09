/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deguzman.hapi2_2_0.db_utility.DDL;

import com.deguzman.hapi2_2_0.db_utility.cleanup.ExecCleanup;
import static com.deguzman.hapi2_2_0.db_utility.cleanup.ExecCleanup.cleanup;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author EJ DeGuzman
 */
public class CreateVehicleTable {
    
    private final static String dbhost = "jdbc:postgresql://localhost:5432/InventoryTrackerDB";
    
    private final static String user = "postgres";
    
    private final static String password = "password";
    
    private final static String createVehicleTable = "CREATE TABLE IF NOT EXISTS vehicle "
            + "(vehicle_id SERIAL PRIMARY KEY, " 
            + "make TEXT, "
            + "model TEXT, "
            + "year TEXT, "
            + "capacity INT, "
            + "transmission TEXT, "
            + "user_id INT)";
    
    public static void createTable() {
        
        try {
            
            Connection connection = DriverManager.getConnection(dbhost,user,password);
            
            Statement statement = connection.createStatement();
            
            statement.execute(createVehicleTable);
        }
        
        catch (SQLException se) {
            se.printStackTrace();
        }
        
        finally {
            ExecCleanup.cleanup();
        }
    }
}
