package com.aeonsoft.odoo.quickbooks.api.project.odoo.data.entity.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_product")
public class ProductProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")		
	private long id	;//	
    
	@Column(name="create_uid")		
	private String	create_uid	;//	Created by
	
	@Column(name="create_date")		
	private String	create_date	;//	Created on
	
	@Column(name="ean13")		
	private String	ean13	;//	EAN13 Barcode
	
	@Column(name="write_uid")		
	private String	write_uid	;//	Last Updated by
	
	@Column(name="message_last_post")		
	private String	message_last_post	;//	Last Message Date
	
	@Column(name="default_code")		
	private String	default_code	;//	Internal Reference
	
	@Column(name="write_date")		
	private String	write_date	;//	Last Updated on
	
	@Column(name="name_template")		
	private String	name_template	;//	Template Name
	
	@Column(name="active")		
	private String	active	;//	Active
	
	@Column(name="image_variant")		
	private String	image_variant	;//	Variant Image
	
	@Column(name="product_tmpl_id")		
	private long product_tmpl_id	;//	Product Template
	
	@Column(name="x_length_net")		
	private String	x_length_net	;//	Net Length (cm)
	
	@Column(name="x_width_net")		
	private String	x_width_net	;//	Net Width (cm)
	
	@Column(name="x_height_net")		
	private String	x_height_net	;//	Net Height (cm)

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCreate_uid() {
		return create_uid;
	}

	public void setCreate_uid(String create_uid) {
		this.create_uid = create_uid;
	}

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}

	public String getEan13() {
		return ean13;
	}

	public void setEan13(String ean13) {
		this.ean13 = ean13;
	}

	public String getWrite_uid() {
		return write_uid;
	}

	public void setWrite_uid(String write_uid) {
		this.write_uid = write_uid;
	}

	public String getMessage_last_post() {
		return message_last_post;
	}

	public void setMessage_last_post(String message_last_post) {
		this.message_last_post = message_last_post;
	}

	public String getDefault_code() {
		return default_code;
	}

	public void setDefault_code(String default_code) {
		this.default_code = default_code;
	}

	public String getWrite_date() {
		return write_date;
	}

	public void setWrite_date(String write_date) {
		this.write_date = write_date;
	}

	public String getName_template() {
		return name_template;
	}

	public void setName_template(String name_template) {
		this.name_template = name_template;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getImage_variant() {
		return image_variant;
	}

	public void setImage_variant(String image_variant) {
		this.image_variant = image_variant;
	}



	public String getX_length_net() {
		return x_length_net;
	}

	public void setX_length_net(String x_length_net) {
		this.x_length_net = x_length_net;
	}

	public String getX_width_net() {
		return x_width_net;
	}

	public void setX_width_net(String x_width_net) {
		this.x_width_net = x_width_net;
	}

	public String getX_height_net() {
		return x_height_net;
	}

	public void setX_height_net(String x_height_net) {
		this.x_height_net = x_height_net;
	}

	public long getProduct_tmpl_id() {
		return product_tmpl_id;
	}

	public void setProduct_tmpl_id(long product_tmpl_id) {
		this.product_tmpl_id = product_tmpl_id;
	}



}
