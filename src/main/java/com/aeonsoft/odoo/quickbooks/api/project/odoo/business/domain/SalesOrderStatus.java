package com.aeonsoft.odoo.quickbooks.api.project.odoo.business.domain;

public class SalesOrderStatus {
	
	private Long id;
	private String soNumber;
	private String customerName;
	private String contractType;
	private String deliveryTerm;
	private String paymentTerm;
	private String status;
	private String deliveryDate;
	private String salesRep;
	private String amount_total;
	private int customer_id;
	private int salesRep_id;
	
	public String getSoNumber() {
		return soNumber;
	}
	public void setSoNumber(String soNumber) {
		this.soNumber = soNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getContractType() {
		return contractType;
	}
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}
	public String getDeliveryTerm() {
		return deliveryTerm;
	}
	public void setDeliveryTerm(String deliveryTerm) {
		this.deliveryTerm = deliveryTerm;
	}
	public String getPaymentTerm() {
		return paymentTerm;
	}
	public void setPaymentTerm(String paymentTerm) {
		this.paymentTerm = paymentTerm;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getSalesRep() {
		return salesRep;
	}
	public void setSalesRep(String salesRep) {
		this.salesRep = salesRep;
	}
	public String getAmount_total() {
		return amount_total;
	}
	public void setAmount_total(String amount_total) {
		this.amount_total = amount_total;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getSalesRep_id() {
		return salesRep_id;
	}
	public void setSalesRep_id(int salesRep_id) {
		this.salesRep_id = salesRep_id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	

}
