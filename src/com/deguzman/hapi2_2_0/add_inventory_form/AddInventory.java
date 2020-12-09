/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deguzman.hapi2_2_0.add_inventory_form;

import com.deguzman.hapi2_2_0.db_utility.cleanup.ExecCleanup;
import static com.deguzman.hapi2_2_0.db_utility.cleanup.ExecCleanup.cleanup;
import com.deguzman.hapi2_2_0.db_utility.connection.DBConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ejdeg
 */
public class AddInventory {
    
    Connection conn;
    PreparedStatement pst;
    String sql = "INSERT INTO inventory VALUES (?,?,?,?,?,?)";
    ResultSet rs;
    
    public PreparedStatement prepareStatement(int inventory_id, String name, String descr,int quantity, int condition_id, int location_id) {
        try {
            conn = DBConnectionUtil.dbConnect();
            pst = conn.prepareStatement(sql);
            pst.setInt(1,inventory_id);
            pst.setString(2,name);
            pst.setString(3,descr);
            pst.setInt(4,quantity);
            pst.setInt(5,condition_id);
            pst.setInt(6,location_id);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            cleanup();
        }
        return pst;
    }
}
