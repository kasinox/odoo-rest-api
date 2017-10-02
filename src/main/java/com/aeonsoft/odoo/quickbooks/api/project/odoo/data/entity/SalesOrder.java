package com.aeonsoft.odoo.quickbooks.api.project.odoo.data.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sale_order")
public class SalesOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    @Column(name="ID")
	long id;
    @Column(name="name")
	String name;
    
    @Column(name="ORIGIN")
    String origin;
    
    @Column(name="client_order_ref")
    String ref;
    
    @Column(name="partner_id")
    int partner_id;
    
    @Column(name="amount_tax")
    String amount_tax;
    
    @Column(name="amount_untaxed")
    String amount_untaxed;
    
    @Column(name="note")
    String text;
    
    @Column(name="state")
    String state;
    
    @Column(name="user_id")
    int user_id;
    
    @Column(name="date_confirm")
    Date date_confirm;
    
    @Column(name="amount_total")
    String amount_total;
    
    @Column(name="partner_shipping_id")
    String partner_shiping_id;
    
    @Column(name="incoterm")
	String incoterm;
    
    @Column(name="x_contract")	
    String x_contract;
    
    @Column(name="x_contact_signed")
	String x_contract_signed;
    
    @Column(name="x_type")
	String x_type;
	
	@Column(name="x_special_request")
	String x_special_request;
	
	@Column(name="payment_term")
	String payment_term;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSo_number() {
		return name;
	}
	public void setSo_number(String so_number) {
		this.name= so_number;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	

	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public Date getDate_confirm() {
		return date_confirm;
	}
	public void setDate_confirm(Date date_confirm) {
		this.date_confirm = date_confirm;
	}
	public String getAmount_total() {
		return amount_total;
	}
	public void setAmount_total(String amount_total) {
		this.amount_total = amount_total;
	}

	public String getIncoterm() {
		return incoterm;
	}
	public void setIncoterm(String incoterm) {
		this.incoterm = incoterm;
	}
	public String getX_contract() {
		return x_contract;
	}
	public void setX_contract(String x_contract) {
		this.x_contract = x_contract;
	}
	public String getX_contract_signed() {
		return x_contract_signed;
	}
	public void setX_contract_signed(String x_contract_signed) {
		this.x_contract_signed = x_contract_signed;
	}
	public String getX_type() {
		return x_type;
	}
	public void setX_type(String x_type) {
		this.x_type = x_type;
	}
	public String getX_special_request() {
		return x_special_request;
	}
	public void setX_special_request(String x_special_request) {
		this.x_special_request = x_special_request;
	}

	public String getAmount_tax() {
		return amount_tax;
	}
	public void setAmount_tax(String amount_tax) {
		this.amount_tax = amount_tax;
	}
	public String getAmount_untaxed() {
		return amount_untaxed;
	}
	public void setAmount_untaxed(String amount_untaxed) {
		this.amount_untaxed = amount_untaxed;
	}
	public String getPartner_shiping_id() {
		return partner_shiping_id;
	}
	public void setPartner_shiping_id(String partner_shiping_id) {
		this.partner_shiping_id = partner_shiping_id;
	}
	public String getPayment_term() {
		return payment_term;
	}
	public void setPayment_term(String payment_term) {
		this.payment_term = payment_term;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPartner_id() {
		return partner_id;
	}
	public void setPartner_id(int partner_id) {
		this.partner_id = partner_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	

}
