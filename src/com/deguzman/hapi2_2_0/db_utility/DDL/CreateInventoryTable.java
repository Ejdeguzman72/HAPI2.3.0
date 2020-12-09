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
public class CreateInventoryTable {

    private final static String url = "jdbc:postgresql://localhost:5432/InventoryTrackerDB";

    private final static String user = "postgres";

    private final static String password = "password";

    private static final String createInventoryTable = "CREATE TABLE IF NOT EXISTS INVENTORY"
            + "(inventory_id SERIAL PRIMARY KEY,"
            + "name TEXT, "
            + "descr VARCHAR(50), "
            + "quantity VARCHAR(50), "
            + "condition_id VARCHAR(50), "
            + "location_id VARCHAR(50))";

    public static void createTable()  {

        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();

            statement.execute(createInventoryTable);
        } catch (SQLException e) {
            printSQLException(e);
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
