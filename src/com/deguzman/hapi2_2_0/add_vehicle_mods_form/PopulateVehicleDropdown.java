/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deguzman.hapi2_2_0.add_vehicle_mods_form;

import static com.deguzman.hapi2_2_0.db_utility.connection.DBConnectionUtil.dbConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author EJ DeGuzman
 */
public class PopulateVehicleDropdown {
    public ResultSet populateVehicleDropdown() {
        String sql = "SELECT CONCAT(manufacturer,' ',model) FROM vehicle";
        ResultSet rs = null;
        try {
            Connection connection = dbConnect();
            
            PreparedStatement pst = connection.prepareStatement(sql);
            
            rs = pst.executeQuery();
        }
        
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return rs;
    }
}
