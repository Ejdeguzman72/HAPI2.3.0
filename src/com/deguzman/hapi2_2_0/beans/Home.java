/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deguzman.hapi2_2_0.beans;

/**
 *
 * @author EJ DeGuzman
 */
public class Home {
    
	public long home_id;
	public String address;
	public String town;
	public String stateInitial;
	public String zipcode;
	
	public long getHome_id() {
		return home_id;
	}
	public void setHome_id(long home_id) {
		this.home_id = home_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getStateInitial() {
		return stateInitial;
	}
	public void setStateInitial(String stateInitial) {
		this.stateInitial = stateInitial;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + (int) (home_id ^ (home_id >>> 32));
		result = prime * result + ((stateInitial == null) ? 0 : stateInitial.hashCode());
		result = prime * result + ((town == null) ? 0 : town.hashCode());
		result = prime * result + ((zipcode == null) ? 0 : zipcode.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Home other = (Home) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (home_id != other.home_id)
			return false;
		if (stateInitial == null) {
			if (other.stateInitial != null)
				return false;
		} else if (!stateInitial.equals(other.stateInitial))
			return false;
		if (town == null) {
			if (other.town != null)
				return false;
		} else if (!town.equals(other.town))
			return false;
		if (zipcode == null) {
			if (other.zipcode != null)
				return false;
		} else if (!zipcode.equals(other.zipcode))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Home [home_id=" + home_id + ", address=" + address + ", town=" + town + ", stateInitial=" + stateInitial
				+ ", zipcode=" + zipcode + "]";
	}
	
	
}
