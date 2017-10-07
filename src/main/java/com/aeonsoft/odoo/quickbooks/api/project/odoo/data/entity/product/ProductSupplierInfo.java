package com.aeonsoft.odoo.quickbooks.api.project.odoo.data.entity.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * List of Supplier information embedded in the product page
 */

@Entity
@Table(name="product_supplierinfo")
//name of the table must match the table in sql exactly

public class ProductSupplierInfo {
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="ID")		
		private long id;		
			
		@Column(name="name")		
		private String	name	;//	Supplier Id, need to look up
		
		@Column(name="product_tmpl_id")		
		private long productTemplateId	;//	Product Template
		
		@Column(name="product_code")		
		private String	product_code	;//	Supplier Product Code
		@Column(name="product_name")		
		private String	product_name	;//	Supplier Product Name
		
		@Column(name="sequence")		
		private int	sequence	;//	Sequence
		
		public int getSequence() {
			return sequence;
		}

		public void setSequence(int sequence) {
			this.sequence = sequence;
		}

		public String getProduct_code() {
			return product_code;
		}

		public void setProduct_code(String product_code) {
			this.product_code = product_code;
		}

		public String getProduct_name() {
			return product_name;
		}

		public void setProduct_name(String product_name) {
			this.product_name = product_name;
		}

		public long getProductTemplateId() {
			return productTemplateId;
		}

		public void setProductTemplateId(long productTemplateId) {
			this.productTemplateId = productTemplateId;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}


//		@Column(name="delay")		
//		private String	delay	;//	Delivery Lead Time	
//		@Column(name="min_qty")		
//		private String	min_qty	;//	Minimal Quantity
//		@Column(name="create_date")		
//		private String	create_date	;//	Created on
	
//		@Column(name="write_uid")		
//		private String	write_uid	;//	Last Updated by		
//		@Column(name="company_id")		
//		private int	company_id	;//	Company	
//		@Column(name="qty")		
//		private double	qty	;//	Quantity
//		@Column(name="create_uid")		
//		private int	create_uid	;//	Created by
//		@Column(name="write_date")		
//		private String	write_date	;//	Last Updated on	
		
}
