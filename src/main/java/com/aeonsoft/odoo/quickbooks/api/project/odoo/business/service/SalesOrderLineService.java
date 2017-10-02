package com.aeonsoft.odoo.quickbooks.api.project.odoo.business.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeonsoft.odoo.quickbooks.api.project.odoo.business.domain.SalesOrderLineStatus;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.entity.SalesOrderLine;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.repo.SalesOrderLineRepository;

@Service
public class SalesOrderLineService {
	
	
	private SalesOrderLineRepository salesorderlineRepository;
	
	
	@Autowired
	public SalesOrderLineService(SalesOrderLineRepository salesorderlineRepository) {
		
		this.salesorderlineRepository = salesorderlineRepository;
	}

	public List<SalesOrderLineStatus> getSalesOrderLineByOrderId(String order_id){
		Integer id = Integer.parseInt(order_id);
		Iterable<SalesOrderLine> soline = this.salesorderlineRepository.findByOrderId(id);
		Map<Long,SalesOrderLineStatus> soLineStatusMap = new HashMap<>();
		
		for(SalesOrderLine line: soline) {
			
			SalesOrderLineStatus solineStatus = new SalesOrderLineStatus();
			
			solineStatus.setId(line.getId());
			solineStatus.setSequence(line.getSequence());
			solineStatus.setOrder_id(line.getOrderId());
			solineStatus.setPrice(line.getPrice_unit());
			solineStatus.setSo_desc(line.getName());
			solineStatus.setProduct_id(line.getProduct_id());
			solineStatus.setQty(line.getProduct_uom_qty());
			solineStatus.setOrder_partner_id(line.getOrder_partner_id());
			solineStatus.setSalesman_id(line.getSalesman_id());	
			soLineStatusMap.put(line.getId(),solineStatus);
		}
		
		
		List<SalesOrderLineStatus> solineStatus= new ArrayList<>();
		for(Long soLineID:soLineStatusMap.keySet()) {
			solineStatus.add(soLineStatusMap.get(soLineID));
		}
		return solineStatus;
	}
	
	public List<SalesOrderLineStatus> getSalesOrderLineById(String order_id){
		
		int id = Integer.parseInt(order_id);
		Iterable<SalesOrderLine> soline = this.salesorderlineRepository.findById(Integer.toUnsignedLong(id));
		Map<Long,SalesOrderLineStatus> soLineStatusMap = new HashMap<>();
		
		for(SalesOrderLine line: soline) {
			
			SalesOrderLineStatus solineStatus = new SalesOrderLineStatus();
			
			solineStatus.setId(line.getId());
			solineStatus.setOrder_id(line.getOrderId());
			solineStatus.setPrice(line.getPrice_unit());
			solineStatus.setSo_desc(line.getName());
			soLineStatusMap.put(line.getId(),solineStatus);
		}
		
		
		List<SalesOrderLineStatus> solineStatus= new ArrayList<>();
		for(Long soLineID:soLineStatusMap.keySet()) {
			solineStatus.add(soLineStatusMap.get(soLineID));
		}
		return solineStatus;
	}







}
