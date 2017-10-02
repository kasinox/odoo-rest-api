package com.aeonsoft.odoo.quickbooks.api.project.odoo.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * order_id = look up in sale_order
 * @author allen xu
 *
 */
@Entity
@Table(name="sale_order_line")
public class SalesOrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")		
	private long id;		
    @Column(name="sequence")		
	private int 	sequence	;//	Sequence
	@Column(name="order_id")		
	private Integer orderId	;//	Order Reference
	@Column(name="price_unit")		
	private double 	price_unit	;//	Unit Price
	@Column(name="discount")		
	private String 	discount	;//	Discount (%)
	@Column(name="salesman_id")		
	private int 	salesman_id	;//	Salesperson
	@Column(name="product_id")		
	private int 	product_id	;//	Product
	@Column(name="name")		
	private String 	name	;//	Description
	@Column(name="state")		
	private String 	state	;//	Status
	@Column(name="order_partner_id")		
	private int 	order_partner_id	;//	Customer
	@Column(name="purchase_price")		
	private double 	purchase_price	;//	Cost Price
	@Column(name="margin")		
	private double 	margin;//	Margin
	@Column(name="product_uom_qty")		
	private double 	product_uom_qty	;//	Quantity
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public double getPrice_unit() {
		return price_unit;
	}
	public void setPrice_unit(double price_unit) {
		this.price_unit = price_unit;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public double getPurchase_price() {
		return purchase_price;
	}
	public void setPurchase_price(double purchase_price) {
		this.purchase_price = purchase_price;
	}
	public double getMargin() {
		return margin;
	}
	public void setMargin(double margin) {
		this.margin = margin;
	}
	public double getProduct_uom_qty() {
		return product_uom_qty;
	}
	public void setProduct_uom_qty(double product_uom_qty) {
		this.product_uom_qty = product_uom_qty;
	}
	

	
//	@Column(name="product_uos_qty")		
//	private String 	product_uos_qty	;//	Quantity (UoS)
//	@Column(name="create_date")		
//	private String 	create_date	;//	Created on
//	@Column(name="create_date")		
//	private String 	product_uom	;//	Unit of Measure
//	@Column(name="write_uid")		
//	private String 	write_uid	;//	Last Updated by
//	@Column(name="write_date")		
//	private String 	write_date	;//	Last Updated on
//	@Column(name="product_uos")		
//	private String 	product_uos	;//	Product UoS
//	@Column(name="invoiced")		
//	private String 	invoiced	;//	Invoiced
//	@Column(name="create_uid")		
//	private String 	create_uid	;//	Created by	
//	@Column(name="company_id")		
//	private String 	company_id	;//	Company	
//	@Column(name="delay")		
//	private String 	delay	;//	Delivery Lead Time
//	@Column(name="th_weight")		
//	private String 	th_weight	;//	Weight
//	@Column(name="address_allotment_id")		
//	private String 	address_allotment_id	;//	Allotment Partner
//	@Column(name="route_id")		
//	private String 	route_id	;//	Route
//	@Column(name="product_packaging")		
//	private String 	product_packaging	;//	Packaging
//	@Column(name="is_delivery")		
//	private String 	is_delivery	;//	Is a Delivery
//	@Column(name="linked_line_id")		
//	private String 	linked_line_id	;//	Linked Order Line
//	@Column(name="sale_layout_cat_id")		
//	private String 	sale_layout_cat_id	;//	Section
//	@Column(name="categ_sequence")		
//	private String 	categ_sequence	;//	Layout Sequence
//	@Column(name="website_description")		
//	private String 	website_description	;//	Line Description

}