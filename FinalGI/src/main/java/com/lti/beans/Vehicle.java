package com.lti.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "VEHICLES")
public class Vehicle {
	
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name = "VehId")
	private int vid;
	
	@Column(name = "VehType")
	private String type;
	
	@Column(name = "VehModel")
	private String model;
	
	@Column(name = "Manufacturer")
	private String manufacturer;
	
	@Column(name = "DrivingLicense", unique = true)
	private String drivingLicense;
	
	@Column(name = "RegNo", unique = true)
	private String registrationNo;
	
	@Column(name = "ChassisNo", unique = true)
	private String chassisNo;
	
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "CustId")
	private Customer customer;


	public Vehicle(int vid, String type, String model, String manufacturer, String drivingLicense,
			String registrationNo, String chassisNo, Customer customer) {
		super();
		this.vid = vid;
		this.type = type;
		this.model = model;
		this.manufacturer = manufacturer;
		this.drivingLicense = drivingLicense;
		this.registrationNo = registrationNo;
		this.chassisNo = chassisNo;
		this.customer = customer;
	}


	public int getVid() {
		return vid;
	}


	public void setVid(int vid) {
		this.vid = vid;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	public String getDrivingLicense() {
		return drivingLicense;
	}


	public void setDrivingLicense(String drivingLicense) {
		this.drivingLicense = drivingLicense;
	}


	public String getRegistrationNo() {
		return registrationNo;
	}


	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}


	public String getChassisNo() {
		return chassisNo;
	}


	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", type=" + type + ", model=" + model + ", manufacturer=" + manufacturer
				+ ", drivingLicense=" + drivingLicense + ", registrationNo=" + registrationNo + ", chassisNo="
				+ chassisNo + ", customer=" + customer + "]";
	}
	
	




	
	
	
	
}
