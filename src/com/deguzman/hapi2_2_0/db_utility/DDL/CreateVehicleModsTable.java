/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deguzman.hapi2_2_0.db_utility.DDL;

import com.deguzman.hapi2_2_0.db_utility.cleanup.ExecCleanup;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author EJ DeGuzman
 */
public class CreateVehicleModsTable {
    private final static String dbhost = "jdbc:postgresql://localhost:5432/InventoryTrackerDB";
    
    private final static String user = "postgres";
    
    private final static String password = "password";
    
    private final static String createVehicleModsTable = "CREATE TABLE IF NOT EXISTS vehicle_mods "
            + "(vehicle_mod_id SERIAL PRIMARY KEY, " 
            + "manufacturer TEXT, "
            + "model TEXT, "
            + "year TEXT, "
            + "quantity INT, "
            + "vehicle_id INT)";
    
    public static void createTable() {
        
        try {
            
            Connection connection = DriverManager.getConnection(dbhost,user,password);
            
            Statement statement = connection.createStatement();
            
            statement.execute(createVehicleModsTable);
        }
        
        catch (SQLException se) {
            se.printStackTrace();
        }
        
        finally {
            ExecCleanup.cleanup();
        }
    }
}
