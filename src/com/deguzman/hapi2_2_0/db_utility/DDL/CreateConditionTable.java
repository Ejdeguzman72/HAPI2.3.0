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
public class CreateConditionTable {

    private final static String dbhost = "jdbc:postgresql://localhost:5432/InventoryTrackerDB";

    private final static String user = "postgres";

    private final static String password = "password";

    private static final String createConditionTableSQL = "CREATE TABLE IF NOT EXISTS condition "
            + "(condition_id SERIAL PRIMARY KEY, "
            + "descr TEXT)";

    public static void createTable() {
        // System.out.println(createConditionTableSQL);

        try {
            Connection connection = DriverManager.getConnection(dbhost, user, password);

            Statement statement = connection.createStatement();

            statement.execute(createConditionTableSQL);
        } catch (SQLException ex) {
            printSQLException(ex);
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
