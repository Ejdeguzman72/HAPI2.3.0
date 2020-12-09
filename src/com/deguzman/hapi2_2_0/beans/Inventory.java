/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deguzman.hapi2_2_0.beans;

import java.util.ArrayList;

/**
 *
 * @author EJ DeGuzman
 */
public class Inventory {

    private int inventoryId;
    private String name;
    private String descr;
    private int quantity;
    private int conditionId;
    private int locationId;

    public long getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getConditionId() {
        return conditionId;
    }

    public void setConditionId(int conditionId) {
        this.conditionId = conditionId;
    }

    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (conditionId ^ (conditionId >>> 32));
        result = prime * result + ((descr == null) ? 0 : descr.hashCode());
        result = prime * result + (int) (inventoryId ^ (inventoryId >>> 32));
        result = prime * result + (int) (locationId ^ (locationId >>> 32));
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + quantity;
        return result;
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
        Inventory other = (Inventory) obj;
        if (conditionId != other.conditionId) {
            return false;
        }
        if (descr == null) {
            if (other.descr != null) {
                return false;
            }
        } else if (!descr.equals(other.descr)) {
            return false;
        }
        if (inventoryId != other.inventoryId) {
            return false;
        }
        if (locationId != other.locationId) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (quantity != other.quantity) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InventoryBean [inventoryId=" + inventoryId + ", name=" + name + ", descr=" + descr + ", quantity="
                + quantity + ", conditionId=" + conditionId + ", locationId=" + locationId + "]";
    }

    public Inventory(int inventoryId, String name, String descr, int quantity, int conditionId, int locationId) {
        super();
        this.inventoryId = inventoryId;
        this.name = name;
        this.descr = descr;
        this.quantity = quantity;
        this.conditionId = conditionId;
        this.locationId = locationId;
    }

    public Inventory() {
        super();
        // TODO Auto-generated constructor stub
    }
}
