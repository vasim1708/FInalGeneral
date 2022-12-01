package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMERS")

public class Customer {
	
	@Id
	@Column(name="CustId",length = 10)
	private int custid;
	
	@Column(name = "CustName",length = 20)
	private String custName;
	
	@Column(name = "CustMail",length = 20)
	private String custMail;
	
	@Column(name = "CustPass",length = 20)
	private String custPass;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int custid, String custName, String custMail, String custPass) {
		super();
		this.custid = custid;
		this.custName = custName;
		this.custMail = custMail;
		this.custPass = custPass;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustMail() {
		return custMail;
	}

	public void setCustMail(String custMail) {
		this.custMail = custMail;
	}

	public String getCustPass() {
		return custPass;
	}

	public void setCustPass(String custPass) {
		this.custPass = custPass;
	}

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custName=" + custName + ", custMail=" + custMail + ", custPass="
				+ custPass + "]";
	}
	
	


	
}