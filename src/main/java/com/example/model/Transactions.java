package com.example.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

@Entity
public class Transactions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name="id",updatable =false,nullable = false)
	private long id;
	
	@Column(name="amount")
	private BigDecimal amount;
	
	@Column(name="details")
	private String details;
	
	@CreationTimestamp
	private Date createdDate;
	
	@Column(name="total_amount")
	private BigDecimal totalAmount;
	
	@CreationTimestamp
	private Date updatedTime;
	
	@Column(name="senderId")
	private long senderid;

	
	public Transactions() {}
	
	

	
	public Transactions(long id, BigDecimal amount, String details, BigDecimal totalAmount, long senderid) {
		super();
		this.id = id;
		this.amount = amount;
		this.details = details;
		this.totalAmount = totalAmount;
		this.senderid = senderid;
	//	this.customer = customer;
	}




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public BigDecimal getAmount() {
		return amount;
	}




	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}




	public String getDetails() {
		return details;
	}




	public void setDetails(String details) {
		this.details = details;
	}




	public BigDecimal getTotalAmount() {
		return totalAmount;
	}




	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}




	public long getSenderid() {
		return senderid;
	}




	public void setSenderid(long senderid) {
		this.senderid = senderid;
	}




	



	/*
	 * public Customer getCustomer() { return customer; }
	 */




	/*
	 * public void setCustomer(Customer customer) { this.customer = customer; }
	 */



	

	

}
