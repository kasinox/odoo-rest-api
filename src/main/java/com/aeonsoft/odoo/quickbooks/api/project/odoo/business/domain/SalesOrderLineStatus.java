package com.aeonsoft.odoo.quickbooks.api.project.odoo.business.domain;

public class SalesOrderLineStatus {
	
	private long id;
	
	private double qty;
	private int sequence;
	private int order_id;
	private double price;
	private double discount;
	private int salesman_id;
	private int product_id;
	private String so_desc;
	private String state;
	private int order_partner_id;
	private String location;
	private String sale_layout;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public int getSalesman_id() {
		return salesman_id;
	}
	public void setSalesman_id(int salesman_id) {
		this.salesman_id = salesman_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getSo_desc() {
		return so_desc;
	}
	public void setSo_desc(String so_desc) {
		this.so_desc = so_desc;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getOrder_partner_id() {
		return order_partner_id;
	}
	public void setOrder_partner_id(int order_partner_id) {
		this.order_partner_id = order_partner_id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSale_layout() {
		return sale_layout;
	}
	public void setSale_layout(String sale_layout) {
		this.sale_layout = sale_layout;
	}
	
	
	

}
