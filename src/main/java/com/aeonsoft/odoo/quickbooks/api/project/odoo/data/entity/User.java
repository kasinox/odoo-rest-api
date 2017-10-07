package com.aeonsoft.odoo.quickbooks.api.project.odoo.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="res_users")
public class User {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name="ID")
	 private long id;

	 @Column(name="partner_id")
	 private String partner_id;

	 @Column(name="login_id")
	 private String login_id;
	
	 @Column(name="active")
	 private boolean active;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPartner_id() {
		return partner_id;
	}

	public void setPartner_id(String partner_id) {
		this.partner_id = partner_id;
	}

	public String getLogin_id() {
		return login_id;
	}

	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	 
	 

}
