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
public class Vehicle {
    
    public int vehicle_id;
    public String make;
    public String model;
    public String year;
    public int capacity;
    public String transmission;
    public int user_id;

    public Vehicle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getTransmission() {
        return transmission;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "vehicle_id=" + vehicle_id + ", make=" + make + ", model=" + model + ", year=" + year + ", capacity=" + capacity + ", transmission=" + transmission + ", user_id=" + user_id + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.vehicle_id;
        hash = 59 * hash + Objects.hashCode(this.make);
        hash = 59 * hash + Objects.hashCode(this.model);
        hash = 59 * hash + Objects.hashCode(this.year);
        hash = 59 * hash + this.capacity;
        hash = 59 * hash + Objects.hashCode(this.transmission);
        hash = 59 * hash + this.user_id;
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
        final Vehicle other = (Vehicle) obj;
        return true;
    }

    public Vehicle(int vehicle_id, String make, String model, String year, int capacity, String transmission, int user_id) {
        this.vehicle_id = vehicle_id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.capacity = capacity;
        this.transmission = transmission;
        this.user_id = user_id;
    }
}
