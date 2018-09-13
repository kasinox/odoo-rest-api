package com.aeonsoft.odoo.quickbooks.api.project.odoo.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="res_partner")
public class Partner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private long id;
    
    @Column(name="NAME")
    private String name;
    
    @Column(name="company_id")
    private String company_id;
    
    @Column(name="use_parent_address")
    private String use_parent_address;
    
    @Column(name="active")
    private boolean active;
    
    @Column(name="street")
    private String street;
    
    @Column(name="supplier")
    private String supplier;
    
    @Column(name="user_id")
    private String user_id;
    
    @Column(name="zip")
    private String zip;
    
    @Column(name="title")
    private String title;
    
    @Column(name="function")
    private String function;
    
    @Column(name="country_id")
    private String country_id;
    
    @Column(name="parent_id")
//    @Column(nullable=true)
    private Integer parent_id;
    
    @Column(name="employee")
    private String employee;
    
    @Column(name="type")
    private String type;
    
    @Column(name="email")
    private String email;
    
    @Column(name="vat")
    private String vat;
    
    @Column(name="website")
    private String website;
    
    @Column(name="lang")
    private String lang;
    
    @Column(name="fax")
    private String fax;
    
    @Column(name="city")
    private String city;
    
    @Column(name="street2")
    private String street2;
    
    @Column(name="phone")
    private String phone;
    
    @Column(name="credit_limit")
    private String credit_limit;
    
    @Column(name="tz")
    private String tz;
    
    @Column(name="write_date")
    private String write_date;
    
    @Column(name="display_name")
    private String display_name;
    
    @Column(name="customer")
    private String customer;
    
    
    @Column(name="create_uid")
    private String create_uid;
    
    @Column(name="image_medium")
    private String image_medium;
    
    @Column(name="mobile")
    private String mobile;
    
    @Column(name="ref")
    private String ref;
    
    @Column(name="image_small")
    private String image_small;
    
    @Column(name="birthdate")
    private String birthdate;
    
    @Column(name="is_company")
    private String is_company;
   
    @Column(name="state_id")
    private Integer state_id;
    
    @Column(name="commercial_partner_id")
    private String commercial_partner_id;
    
    @Column(name="notify_email")
    private String notify_email;
    
    @Column(name="x_name_cn")
    private String x_name_cn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany_id() {
		return company_id;
	}

	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}

	public String getUse_parent_address() {
		return use_parent_address;
	}

	public void setUse_parent_address(String use_parent_address) {
		this.use_parent_address = use_parent_address;
	}

	public boolean getActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getCountry_id() {
		return country_id;
	}

	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}

	public Integer getParent_id() {
		return parent_id;
	}

	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVat() {
		return vat;
	}

	public void setVat(String vat) {
		this.vat = vat;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCredit_limit() {
		return credit_limit;
	}

	public void setCredit_limit(String credit_limit) {
		this.credit_limit = credit_limit;
	}

	public String getTz() {
		return tz;
	}

	public void setTz(String tz) {
		this.tz = tz;
	}

	public String getWrite_date() {
		return write_date;
	}

	public void setWrite_date(String write_date) {
		this.write_date = write_date;
	}

	public String getDisplay_name() {
		return display_name;
	}

	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getCreate_uid() {
		return create_uid;
	}

	public void setCreate_uid(String create_uid) {
		this.create_uid = create_uid;
	}

	public String getImage_medium() {
		return image_medium;
	}

	public void setImage_medium(String image_medium) {
		this.image_medium = image_medium;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getImage_small() {
		return image_small;
	}

	public void setImage_small(String image_small) {
		this.image_small = image_small;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getIs_company() {
		return is_company;
	}

	public void setIs_company(String is_company) {
		this.is_company = is_company;
	}

	public Integer getState_id() {
		return state_id;
	}

	public void setState_id(Integer state_id) {
		this.state_id = state_id;
	}

	public String getCommercial_partner_id() {
		return commercial_partner_id;
	}

	public void setCommercial_partner_id(String commercial_partner_id) {
		this.commercial_partner_id = commercial_partner_id;
	}

	public String getNotify_email() {
		return notify_email;
	}

	public void setNotify_email(String notify_email) {
		this.notify_email = notify_email;
	}

	public String getX_name_cn() {
		return x_name_cn;
	}

	public void setX_name_cn(String x_name_cn) {
		this.x_name_cn = x_name_cn;
	}
    
    
    
    
    
    
    
  
}