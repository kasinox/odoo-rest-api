package com.aeonsoft.odoo.quickbooks.api.project.odoo.business.domain;

public class ProductStatus {
	
	private long id;
	private String name;

	private long pp_id;//product product id
	private long pt_id;//product template id
	
	private String salesDescription;
	private String purchaseDescription;
	
	private long supp_id;
	private String product_name;
	private String product_code;

	private String supp_name;
	
	private int cost_id;
	private String cost_value;
	private String res_id;
	
	private int income_id;
	private String accountIncome_code;
	
	private int expense_id;
	private String accountExpense_code;
	
	private double weight_gross;
	private double weight_net;
	
	private double height_net;
	private double width_net;
	private double length_net;
	
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
	public long getPp_id() {
		return pp_id;
	}
	public void setPp_id(long pp_id) {
		this.pp_id = pp_id;
	}
	public long getPt_id() {
		return pt_id;
	}
	public void setPt_id(long pt_id) {
		this.pt_id = pt_id;
	}
	public long getSupp_id() {
		return supp_id;
	}
	public void setSupp_id(long supp_id) {
		this.supp_id = supp_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_code() {
		return product_code;
	}
	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}
	public String getSupp_name() {
		return supp_name;
	}
	public void setSupp_name(String supp_name) {
		this.supp_name = supp_name;
	}
	public int getCost_id() {
		return cost_id;
	}
	public void setCost_id(int cost_id) {
		this.cost_id = cost_id;
	}
	public String getCost_value() {
		return cost_value;
	}
	public void setCost_value(String cost_value) {
		this.cost_value = cost_value;
	}
	public String getRes_id() {
		return res_id;
	}
	public void setRes_id(String res_id) {
		this.res_id = res_id;
	}
	public int getIncome_id() {
		return income_id;
	}
	public void setIncome_id(int income_id) {
		this.income_id = income_id;
	}
	public String getAccountIncome_code() {
		return accountIncome_code;
	}
	public void setAccountIncome_code(String accountIncome_code) {
		this.accountIncome_code = accountIncome_code;
	}
	public int getExpense_id() {
		return expense_id;
	}
	public void setExpense_id(int expense_id) {
		this.expense_id = expense_id;
	}
	public String getAccountExpense_code() {
		return accountExpense_code;
	}
	public void setAccountExpense_code(String accountExpense_code) {
		this.accountExpense_code = accountExpense_code;
	}
	public double getWeight_gross() {
		return weight_gross;
	}
	public void setWeight_gross(double weight_gross) {
		this.weight_gross = weight_gross;
	}
	public double getWeight_net() {
		return weight_net;
	}
	public void setWeight_net(double weight_net) {
		this.weight_net = weight_net;
	}
	public double getHeight_net() {
		return height_net;
	}
	public void setHeight_net(double height_net) {
		this.height_net = height_net;
	}
	public double getWidth_net() {
		return width_net;
	}
	public void setWidth_net(double width_net) {
		this.width_net = width_net;
	}
	public double getLength_net() {
		return length_net;
	}
	public void setLength_net(double length_net) {
		this.length_net = length_net;
	}
	public String getSalesDescription() {
		return salesDescription;
	}
	public void setSalesDescription(String salesDescription) {
		this.salesDescription = salesDescription;
	}
	public String getPurchaseDescription() {
		return purchaseDescription;
	}
	public void setPurchaseDescription(String purchaseDescription) {
		this.purchaseDescription = purchaseDescription;
	}
	
	
	
}
