package com.aeonsoft.odoo.quickbooks.api.project.odoo.business.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeonsoft.odoo.quickbooks.api.project.odoo.business.domain.SalesOrderStatus;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.entity.Partner;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.entity.SalesOrder;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.entity.User;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.repo.PartnerRepository;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.repo.SalesOrderRepository;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.repo.UserRepository;

@Service
public class SalesOrderService {
	
	private SalesOrderRepository salesorderRepository;
	private PartnerRepository partnerRepository;
	private UserRepository userRepository;
	
    @Autowired
	public SalesOrderService(SalesOrderRepository salesorderRepository, 
			PartnerRepository partnerRepo, UserRepository userRepository) {

		this.salesorderRepository = salesorderRepository;
		this.partnerRepository =partnerRepo;
		this.userRepository=userRepository;

	}
	
	public List<SalesOrderStatus> getSalesOrderByNumber(String soNumber){
		
		Iterable<SalesOrder> salesorder = this.salesorderRepository.findByName(soNumber);
		List<SalesOrderStatus> soStatus = mapSalesOrder(salesorder);	
		return soStatus;
	}

	public List<SalesOrderStatus> getSalesOrderAll(){
		
		Iterable<SalesOrder> salesorder = this.salesorderRepository.findAll();
		List<SalesOrderStatus> soStatus = mapSalesOrder(salesorder);	
		return soStatus;	
	}

	private List<SalesOrderStatus> mapSalesOrder(Iterable<SalesOrder> salesorder) {
		Map<Long,SalesOrderStatus> soStatusMap = new HashMap<>();
		
		for(SalesOrder so: salesorder) {
			SalesOrderStatus soStatus = new SalesOrderStatus();
			
			soStatus.setId(so.getId());
			soStatus.setSoNumber(so.getSo_number());
			soStatus.setAmount_total(so.getAmount_total());
			soStatus.setContractType(so.getX_type());
			soStatus.setDeliveryTerm(so.getIncoterm());
			soStatus.setPaymentTerm(so.getPayment_term());
			setCustomerId(so, soStatus);
			setSalesRepId(so, soStatus);
			
			soStatusMap.put(so.getId(),soStatus);
			
		}
		
		List<SalesOrderStatus> soStatus = new ArrayList<>();
		for(Long soID:soStatusMap.keySet()) {
			soStatus.add(soStatusMap.get(soID));
		}
		return soStatus;
	}

	private void setSalesRepId(SalesOrder so, SalesOrderStatus soStatus) {
		if(null!=so.getUser_id()) {
			int id = Integer.parseInt(so.getUser_id());
			soStatus.setSalesRep_id(id);	
			User user = this.userRepository.findById(id);
			long partner_id = Long.parseLong(user.getPartner_id());	
			Partner salesRep = this.partnerRepository.findOneById(partner_id);
			soStatus.setSalesRep(salesRep.getName());
		}else {
			soStatus.setSalesRep_id(0);
		}
	}

	private void setCustomerId(SalesOrder so, SalesOrderStatus soStatus) {
		if(null!=so.getPartner_id()) {
			int id = Integer.parseInt(so.getPartner_id());
			soStatus.setCustomer_id(id);
			Partner customer = this.partnerRepository.findOneById(id);
			soStatus.setCustomerName(customer.getName());
		}
		else {
			soStatus.setCustomer_id(0);
		}
	}
}
