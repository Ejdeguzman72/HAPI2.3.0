/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deguzman.hapi2_2_0.view_inventory_form;

import com.deguzman.hapi2_2_0.beans.Inventory;
import com.deguzman.hapi2_2_0.db_utility.connection.DBConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author EJ DeGuzman
 */
public class ViewInventory {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    }

    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    String sql = "SELECT * FROM inventory";
    Inventory inventory;

    public ArrayList<Inventory> getInventoryList() {
        ArrayList<Inventory> inventoryList = new ArrayList<>();
        
        try {
            conn = DBConnectionUtil.dbConnect();
            pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                inventory = new Inventory(
                        rs.getInt("inventory_id"),
                        rs.getString("name"),
                        rs.getString("descr"),
                        rs.getInt("quantity"),
                        rs.getInt("condition_id"),
                        rs.getInt("location_id")
                );
                
                inventoryList.add(inventory);
            }
        }
        
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return inventoryList;
    }

}
