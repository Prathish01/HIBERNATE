package com.hibernate.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Adharcard {
@Id
	private int AdharId;
	private long Adharnumber;
	private String name;
	private String gender;
	private String dob;
	private String Address;
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getAadharId() {
		return AdharId;
	}
	public void setAadharId(int aadharId) {
		AdharId = aadharId;
	}
	public long getAadharnumber() {
		return Adharnumber;
	}
	public void setAadharnumber(long aadharnumber) {
		Adharnumber = aadharnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
}
