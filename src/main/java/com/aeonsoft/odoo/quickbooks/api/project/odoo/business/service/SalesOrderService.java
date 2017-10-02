package com.aeonsoft.odoo.quickbooks.api.project.odoo.business.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeonsoft.odoo.quickbooks.api.project.odoo.business.domain.SalesOrderStatus;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.entity.SalesOrder;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.repo.SalesOrderRepository;

@Service
public class SalesOrderService {
	
	private SalesOrderRepository salesorderRepository;

    @Autowired
	public SalesOrderService(SalesOrderRepository salesorderRepository) {

		this.salesorderRepository = salesorderRepository;

	}
	
	public List<SalesOrderStatus> getSalesOrderByNumber(String soNumber){
		
		Iterable<SalesOrder> salesorder = this.salesorderRepository.findByName(soNumber);
		Map<Long,SalesOrderStatus> soStatusMap = new HashMap<>();
		
		for(SalesOrder so: salesorder) {
			SalesOrderStatus soStatus = new SalesOrderStatus();
			soStatus.setId(so.getId());
			soStatus.setCustomer_id(so.getPartner_id());
			soStatus.setSoNumber(so.getSo_number());
			soStatus.setSalesRep_id(so.getUser_id());
			soStatus.setAmount_total(so.getAmount_total());
			soStatus.setContractType(so.getX_type());
			soStatus.setDeliveryTerm(so.getIncoterm());
			soStatus.setPaymentTerm(so.getPayment_term());
			soStatusMap.put(so.getId(),soStatus);
		}
				
		List<SalesOrderStatus> soStatus = new ArrayList<>();
		for(Long soID:soStatusMap.keySet()) {
			soStatus.add(soStatusMap.get(soID));
		}
		
		return soStatus;
	}

}
