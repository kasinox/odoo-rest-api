package com.aeonsoft.odoo.quickbooks.api.project.odoo.business.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeonsoft.odoo.quickbooks.api.project.odoo.business.domain.SalesOrderLineStatus;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.entity.Partner;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.entity.SalesOrderLine;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.entity.User;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.repo.PartnerRepository;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.repo.SalesOrderLineRepository;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.repo.UserRepository;

@Service
public class SalesOrderLineService {
	
	
	private SalesOrderLineRepository salesorderlineRepository;
	private PartnerRepository partnerRepository;
	private UserRepository userRepository;
	
	@Autowired
	public SalesOrderLineService(SalesOrderLineRepository salesorderlineRepository, 
			PartnerRepository partnerRepo,UserRepository userRepository) {
		
		this.salesorderlineRepository = salesorderlineRepository;
		this.partnerRepository = partnerRepo;
		this.userRepository=userRepository;
	}

	public List<SalesOrderLineStatus> getSalesOrderLineByOrderId(String order_id){
		Integer id = Integer.parseInt(order_id);
		Iterable<SalesOrderLine> soline = this.salesorderlineRepository.findByOrderId(id);
		List<SalesOrderLineStatus> solineStatus = mapSalesOrderLine(soline);
		return solineStatus;
	}
	
	public List<SalesOrderLineStatus> getSalesLineLineAll(){
		Iterable<SalesOrderLine> soline = this.salesorderlineRepository.findAll();
		List<SalesOrderLineStatus> solineStatus = mapSalesOrderLine(soline);
		return solineStatus;
	}


	private List<SalesOrderLineStatus> mapSalesOrderLine(Iterable<SalesOrderLine> soline) {
		Map<Long,SalesOrderLineStatus> soLineStatusMap = new HashMap<>();
		
		for(SalesOrderLine line: soline) {
			
			SalesOrderLineStatus solineStatus = new SalesOrderLineStatus();
			
			solineStatus.setId(line.getId());
			solineStatus.setSequence(line.getSequence());
			solineStatus.setOrder_id(line.getOrderId());
			solineStatus.setPrice(line.getPrice_unit());
			solineStatus.setSo_desc(line.getName());
			System.out.println();
			if(null!=line.getProduct_id()) {
				int id = Integer.parseInt(line.getProduct_id());
				solineStatus.setProduct_id(id);
			}
			solineStatus.setQty(line.getProduct_uom_qty());
			if(null!=line.getOrder_partner_id()) {
				int id = Integer.parseInt(line.getOrder_partner_id());
				solineStatus.setOrder_partner_id(id);
			}
			if(null!=line.getSalesman_id()) {
				int id = Integer.parseInt(line.getSalesman_id());
				solineStatus.setSalesman_id(id);
				
				User user = this.userRepository.findById(id);
				long partner_id = Long.parseLong(user.getPartner_id());	
				Partner salesRep = this.partnerRepository.findOneById(partner_id);
				solineStatus.setSalesman_name(salesRep.getName());			
			}
			
			soLineStatusMap.put(line.getId(),solineStatus);
		}
		
		
		List<SalesOrderLineStatus> solineStatus= new ArrayList<>();
		for(Long soLineID:soLineStatusMap.keySet()) {
			solineStatus.add(soLineStatusMap.get(soLineID));
		}
		return solineStatus;
	}
	

	







}
