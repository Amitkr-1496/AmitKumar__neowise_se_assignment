package com.example.model;

import java.math.BigDecimal;


public class TransactionsVo {

private BigDecimal amount;
private String details;
private long sender;


public TransactionsVo() {}

public TransactionsVo(BigDecimal amount, String details, long sender) {
	super();
	this.amount = amount;
	this.details = details;
	this.sender = sender;
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
public long getSender() {
	return sender;
}
public void setSender(long sender) {
	this.sender = sender;
}
	

}
