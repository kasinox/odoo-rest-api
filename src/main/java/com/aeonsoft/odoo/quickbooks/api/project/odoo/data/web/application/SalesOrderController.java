package com.aeonsoft.odoo.quickbooks.api.project.odoo.data.web.application;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aeonsoft.odoo.quickbooks.api.project.odoo.business.domain.SalesOrderStatus;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.business.service.SalesOrderService;

@Controller
@RequestMapping(value="/salesorderstatus")
public class SalesOrderController {
	
	private SalesOrderService saleorderservice;
	
	public String getSalesOrder(@RequestParam(value="soNumber",required=false) String soNumber,Model model) {
		
		List<SalesOrderStatus> salesorderstatusList = this.saleorderservice.getSalesOrderByNumber("84682");
		model.addAttribute("salesorderStatus",salesorderstatusList);
		return "salesorderstatus";
	}

}
