/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deguzman.hapi2_2_0.beans;

import java.util.Objects;

/**
 *
 * @author EJ DeGuzman
 */
public class VehicleMod {

    public int vehicle_mod_id;
    public String manufacturer;
    public String model;
    public String year;
    public int quantity;
    public int vehicle_id;

    public VehicleMod() {
    }

    public VehicleMod(int vehicle_mod_id, String manufacturer, String model, String year, int quantity, int vehicle_id) {
        this.vehicle_mod_id = vehicle_mod_id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.quantity = quantity;
        this.vehicle_id = vehicle_id;
    }

    public int getVehicle_mod_id() {
        return vehicle_mod_id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_mod_id(int vehicle_mod_id) {
        this.vehicle_mod_id = vehicle_mod_id;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final VehicleMod other = (VehicleMod) obj;
        if (this.vehicle_mod_id != other.vehicle_mod_id) {
            return false;
        }
        if (this.quantity != other.quantity) {
            return false;
        }
        if (this.vehicle_id != other.vehicle_id) {
            return false;
        }
        if (!Objects.equals(this.manufacturer, other.manufacturer)) {
            return false;
        }
        if (!Objects.equals(this.model, other.model)) {
            return false;
        }
        if (!Objects.equals(this.year, other.year)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "VehicleMod{" + "vehicle_mod_id=" + vehicle_mod_id + ", manufacturer=" + manufacturer + ", make=" + model + ", year=" + year + ", quantity=" + quantity + ", vehicle_id=" + vehicle_id + '}';
    }

}
