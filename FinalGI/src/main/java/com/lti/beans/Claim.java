
package com.lti.beans;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "CLAIM_HISTORY")
public class Claim {

	@Id
	@Column(name="ClaimId",length = 20)
	private int cid;

	@Column(name = "ClaimDate")
	private  String date;

	@Column(name = "Status",length = 20)
	private String status;//approved or pending, not approved 

	@Column(name = "ClaimAmount",length = 20)
	private double amount;

	@Column(name = "Reason",length = 20)
	private String reason;

	@Column(name = "ContactNo",length = 10)
	private long contactNo;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CustId")
	private Customer customer;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "InsId")
	private InsurancePlan insurance;
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "adminId")
//	private Admin admin;


	public Claim() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	public Claim(int cid, String date, String status, double amount, String reason, long contactNo, Customer customer,
			InsurancePlan insurance) {
		super();
		this.cid = cid;
		this.date = date;
		this.status = status;
		this.amount = amount;
		this.reason = reason;
		this.contactNo = contactNo;
		this.customer = customer;
		this.insurance = insurance;
	}




	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public String getReason() {
		return reason;
	}


	public void setReason(String reason) {
		this.reason = reason;
	}


	public long getContactNo() {
		return contactNo;
	}


	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	


	public InsurancePlan getInsurance() {
		return insurance;
	}


	public void setInsurance(InsurancePlan insurance) {
		this.insurance = insurance;
	}


	@Override
	public String toString() {
		return "Claim [cid=" + cid + ", date=" + date + ", status=" + status + ", amount=" + amount + ", reason="
				+ reason + ", contactNo=" + contactNo + ", customer=" + customer + ", insurance=" + insurance + "]";
	}


	
	
	
	




	

}
