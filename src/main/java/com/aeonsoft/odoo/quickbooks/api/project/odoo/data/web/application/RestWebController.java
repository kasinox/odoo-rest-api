package com.aeonsoft.odoo.quickbooks.api.project.odoo.data.web.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aeonsoft.odoo.quickbooks.api.project.odoo.business.domain.CustomerStatus;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.business.domain.ProductStatus;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.business.domain.SalesOrderLineStatus;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.business.domain.SalesOrderStatus;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.business.service.CustomerService;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.business.service.ProductService;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.business.service.SalesOrderLineService;
//import com.aeonsoft.odoo.quickbooks.api.project.odoo.business.service.ProductService;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.business.service.SalesOrderService;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.entity.SalesOrder;



@RestController
@RequestMapping(value="/api")
public class RestWebController {
	
	@Autowired
	private SalesOrderService salesorderService;
	@Autowired
	private CustomerService customerService;
	@Autowired
	private SalesOrderLineService salesorderlineService;
	@Autowired
	private ProductService productService;
	
	@RequestMapping(method=RequestMethod.GET,value="/salesorder/{soNumber}")
	public List<SalesOrderStatus> getSalesOrderByNumber(@PathVariable(value="soNumber") String so_number){
		
		return this.salesorderService.getSalesOrderByNumber(so_number);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/customer/{customer_id}")
	public List<CustomerStatus> getCustomerByNumber(@PathVariable(value="customer_id") String customer_id){
		int id = Integer.parseInt(customer_id);
		return this.customerService.getCustomeById(Integer.toUnsignedLong(id));
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/product/{product_id}")
	public ProductStatus getProductByNumber(@PathVariable(value="product_id") String product_id){
		
		return this.productService.getProductProductById(product_id);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/salesorderline/{order_id}")
	public List<SalesOrderLineStatus> getSalesOrderLineByOrderId(@PathVariable(value="order_id") String order_id){
		return this.salesorderlineService.getSalesOrderLineByOrderId(order_id);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/salesorderlineID/{id}")
	public List<SalesOrderLineStatus> getSalesOrderLineById(@PathVariable(value="id") String id){
		return this.salesorderlineService.getSalesOrderLineById(id);
	}

}

