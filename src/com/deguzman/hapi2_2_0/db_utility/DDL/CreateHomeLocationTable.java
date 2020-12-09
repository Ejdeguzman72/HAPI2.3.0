/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deguzman.hapi2_2_0.db_utility.DDL;

import com.deguzman.hapi2_2_0.db_utility.cleanup.ExecCleanup;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author EJ DeGuzman
 */
public class CreateHomeLocationTable {

    public static String host = "jdbc:postgresql://localhost:5432/InventoryTrackerDB";

    public static String user = "postgres";

    public static String password = "password";

    public static final String createHomeLocationTableSQL = "CREATE TABLE IF NOT EXISTS HOME_LOCATION"
            + "(home_id SERIAL PRIMARY KEY, " + "location_id INT)";

    public static void createTable() {

        try {
            Connection connection = DriverManager.getConnection(host, user, password);

            Statement statement = connection.createStatement();

            statement.execute(createHomeLocationTableSQL);
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
