/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deguzman.hapi2_2_0.db_utility.DDL;

import com.deguzman.hapi2_2_0.db_utility.cleanup.ExecCleanup;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author EJ DeGuzman
 */
public class CreateHomeTable {
    
	public static final String dbhost = "jdbc:postgresql://localhost:5432/InventoryTrackerDB";
	
	public static final String user = "postgres";
	
	public static final String password = "password";
	
	public static final String createHomeTableSQL = "CREATE TABLE IF NOT EXISTS HOME " 
	+ "(home_id SERIAL PRIMARY KEY, "
	+ "address TEXT NOT NULL, "
	+ "town TEXT NOT NULL, "
	+ "stateInitial TEXT NOT NULL, "
	+ "zipcode TEXT NOT NULL)";
	
	public static void createTable() {
          
		try {
			Connection connection = DriverManager.getConnection(dbhost,user,password); 
			
			if (connection != null) {				
				Statement statement = connection.createStatement();
				
				statement.execute(createHomeTableSQL);
			}
		} catch (SQLException se) {
			printSQLException(se);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
                    ExecCleanup.cleanup();
                }
	}
	
	public static void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
 }
