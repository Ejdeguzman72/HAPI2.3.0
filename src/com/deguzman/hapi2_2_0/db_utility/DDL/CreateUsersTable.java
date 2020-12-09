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
public class CreateUsersTable {

    public static final String dbhost = "jdbc:postgresql://localhost:5432/InventoryTrackerDB";

    public static final String user = "postgres";

    public static final String password = "password";

    public static final String createUsersTableSQL = "CREATE TABLE IF NOT EXISTS USERS "
            + "(user_id SERIAL PRIMARY KEY, "
            + "username TEXT NOT NULL, "
            + "password TEXT NOT NULL, "
            + "firstname TEXT NOT NULL, "
            + "lastname TEXT NOT NULL, "
            + "role_id INT NOT NULL, "
            + "user_status_id INT NOT NULL)";

    public static void createTable() {

        try {
            Connection connection = DriverManager.getConnection(dbhost, user, password);

            if (connection != null) {

                Statement statement = connection.createStatement();

                statement.execute(createUsersTableSQL);

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
