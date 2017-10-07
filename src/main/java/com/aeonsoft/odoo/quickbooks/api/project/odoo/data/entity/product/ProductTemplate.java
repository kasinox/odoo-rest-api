package com.aeonsoft.odoo.quickbooks.api.project.odoo.data.entity.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="product_template")
public class ProductTemplate {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")	
	private long id;
	@Column(name="list_price")			
	private double	list_price	;//	Sale Price
//	@Column(name="weight")			
//	private double	weight	;//	Gross Weight
	
	@Column(name="description")			
	private String	description	;//	Description
	
	@Column(name="weight_net")			
	private String	weight_net	;//	Net Weight
	
	@Column(name="name")			
	private String	name;//	Name
	
	@Column(name="description_sale")			
	private String	description_sale	;//	Sale Description
	
	@Column(name="description_purchase")			
	private String	description_purchase	;//	Purchase Description
	
//	@Column(name="x_length_net")			
//	private double	x_length_net	;//	Net Length (cm)
//	
//	@Column(name="x_width_net")			
//	private double	x_width_net	;//	Net Width (cm)
//	
//	@Column(name="x_height_net")			
//	private double	x_height_net	;//	Net Height (cm)

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getList_price() {
		return list_price;
	}

	public void setList_price(double list_price) {
		this.list_price = list_price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription_sale() {
		return description_sale;
	}

	public void setDescription_sale(String description_sale) {
		this.description_sale = description_sale;
	}


	public String getDescription_purchase() {
		return description_purchase;
	}

	public void setDescription_purchase(String description_purchase) {
		this.description_purchase = description_purchase;
	}

	public String getWeight_net() {
		return weight_net;
	}

	public void setWeight_net(String weight_net) {
		this.weight_net = weight_net;
	}

	
	
	
//	@Column(name="warranty")			
//	private String	warranty	;//	Warranty
//	
//	@Column(name="uos_id")			
//	private String	uos_id	;//	Unit of Sale

//	@Column(name="color")			
//	private String	color	;//	Color Index
//	
//	@Column(name="image")			
//	private String	image	;//	Image
//	
//	@Column(name="write_uid")			
//	private String	write_uid	;//	Last Updated by
//	
//	@Column(name="mes_type")			
//	private String	mes_type	;//	Measure Type
//	
//	@Column(name="uom_id")			
//	private String	uom_id	;//	Unit of Measure
//	

//	
//	@Column(name="create_date")			
//	private String	create_date	;//	Created on
//	
//	@Column(name="uos_coeff")			
//	private String	uos_coeff	;//	Unit of Measure -> UOS Coeff
//	
//	@Column(name="create_uid")			
//	private String	create_uid	;//	Created by
//	
//	@Column(name="rental")			
//	private String	rental	;//	Can be Rent
//	
//	@Column(name="product_manager")			
//	private String	product_manager	;//	Product Manager
//	
//	@Column(name="message_last_post")			
//	private String	message_last_post	;//	Last Message Date
//	
//	@Column(name="company_id")			
//	private String	company_id	;//	Company
//	
//	@Column(name="state")			
//	private String	state	;//	Status
//	
//	@Column(name="uom_po_id")			
//	private String	uom_po_id	;//	Purchase Unit of Measure
//	
//	@Column(name="type")			
//	private String	type	;//	Product Type
//	
//
//	
//	@Column(name="volume")			
//	private double	volume	;//	Volume
//	
//	@Column(name="write_date")			
//	private String	write_date	;//	Last Updated on
//	
//	@Column(name="active")			
//	private boolean	active	;//	Active
//	
//	@Column(name="categ_id")			
//	private int	categ_id	;//	Internal Category
//	
//	@Column(name="sale_ok")			
//	private int	sale_ok	;//	Can be Sold
//	
//	@Column(name="image_medium")			
//	private String	image_medium	;//	Medium-sized image
//
//	
//	@Column(name="image_small")			
//	private String	image_small	;//	Small-sized image
//	
//	@Column(name="loc_rack")			
//	private String	loc_rack	;//	Rack
//	
//	@Column(name="track_incoming")			
//	private String	track_incoming	;//	Track Incoming Lots
//	
//	@Column(name="sale_delay")			
//	private String	sale_delay	;//	Customer Lead Time
//	
//	@Column(name="track_all")			
//	private String	track_all	;//	Full Lots Traceability
//	
//	
//	@Column(name="track_outgoing")			
//	private String	track_outgoing	;//	Track Outgoing Lots
//
//	
//	@Column(name="loc_row")			
//	private String	loc_row	;//	Row
//	
//	@Column(name="loc_case")			
//	private String	loc_case	;//	Case
//	
//	@Column(name="purchase_ok")			
//	private int	purchase_ok	;//	Can be Purchased
//	
//	@Column(name="website_meta_description")			
//	private String	website_meta_description	;//	Website meta description
//	
//	@Column(name="website_sequence")			
//	private int	website_sequence	;//	Sequence
//	
//	@Column(name="website_meta_keywords")			
//	private String	website_meta_keywords	;//	Website meta keywords
//	
//	@Column(name="website_meta_title")			
//	private String	website_meta_title	;//	Website meta title
//	
//	@Column(name="website_published")			
//	private String	website_published	;//	Available in the website
//	
//	@Column(name="website_description")			
//	private String	website_description	;//	Description for the website
//	
//	@Column(name="website_size_x")			
//	private String	website_size_x	;//	Size X
//	
//	@Column(name="website_size_y")			
//	private String	website_size_y	;//	Size Y
//	
//	@Column(name="purchase_requisition")			
//	private String	purchase_requisition	;//	Call for Bids
//	
//	@Column(name="sale_line_warn_msg")			
//	private String	sale_line_warn_msg	;//	Message for Sales Order Line
//	
//	@Column(name="purchase_line_warn_msg")			
//	private String	purchase_line_warn_msg	;//	Message for Purchase Order Line
//	
//	@Column(name="purchase_line_warn")			
//	private String	purchase_line_warn	;//	Purchase Order Line
//	
//	@Column(name="sale_line_warn")			
//	private String	sale_line_warn	;//	Sales Order Line
//	
//	@Column(name="quote_description")			
//	private String	quote_description	;//	Description for the quote
//	
//	@Column(name="email_template_id")			
//	private String	email_template_id	;//	Product Email Template
//	
//	@Column(name="produce_delay")			
//	private String	produce_delay	;//	Manufacturing Lead Time
//	
//	@Column(name="track_production")			
//	private String	track_production	;//	Track Manufacturing Lots
//	
//	@Column(name="hr_expense_ok")			
//	private int	hr_expense_ok	;//	Can be Expensed
//	
//	@Column(name="x_hs_code_cn")			
//	private String	x_hs_code_cn	;//	HS CODE CN
//	
//	@Column(name="x_hs_code_us")			
//	private String	x_hs_code_us	;//	HS CODE US
	

}
