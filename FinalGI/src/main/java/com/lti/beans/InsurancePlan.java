package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "INSURANCE_PLAN")
public class InsurancePlan {
	
	@Id
	@Column(name = "InsId",length = 10)
	private int insid;
	
	@Column(name = "InsName",length = 20)
	private String name;
	
	@Column(name = "InsType",length = 20)
	private String type;//third party or comprehensive
	
	@Column(name = "InsAmount",length = 20)
	private double amount;//2000
	
	@Column(name = "Commission",length = 20)
	private int commission;//500
	
	@Column(name = "CompanyName",length = 20)
	private String companyName;

	public InsurancePlan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InsurancePlan(int insid, String name, String type, double amount, int commission, String companyName) {
		super();
		this.insid = insid;
		this.name = name;
		this.type = type;
		this.amount = amount;
		this.commission = commission;
		this.companyName = companyName;
	}

	public int getInsid() {
		return insid;
	}

	public void setInsid(int insid) {
		this.insid = insid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "InsurancePlan [insid=" + insid + ", name=" + name + ", type=" + type + ", amount=" + amount
				+ ", commission=" + commission + ", companyName=" + companyName + "]";
	}

	
	

		
}