package com.aeonsoft.odoo.quickbooks.api.project.odoo.business.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeonsoft.odoo.quickbooks.api.project.odoo.business.domain.CustomerStatus;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.entity.Partner;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.repo.PartnerRepository;

@Service
public class CustomerService {
	
	private PartnerRepository customerRepository;
	
	@Autowired
	public CustomerService(PartnerRepository customerRepo) {
		this.customerRepository=customerRepo;
	}

	
	public List<CustomerStatus> getCustomeById(long id){
	
		Iterable<Partner> customer = this.customerRepository.findById(id);
		List<CustomerStatus> customerStatus = mapCustomer(customer);
		
		return customerStatus;
	}
	public List<CustomerStatus> getCustomerAll(){
		Iterable<Partner> customer = this.customerRepository.findAll();
		List<CustomerStatus> customerStatus = mapCustomer(customer);
		return customerStatus;
	}

	private List<CustomerStatus> mapCustomer(Iterable<Partner> customer) {
		Map<Long,CustomerStatus> customerStatusMap = new HashMap<>();
		
		for(Partner cust: customer) {
			CustomerStatus customerStatus = new CustomerStatus();
			customerStatus.setId(cust.getId());
			customerStatus.setName(cust.getName());
			customerStatus.setStreet(cust.getStreet());
			customerStatus.setStreet2(cust.getStreet2());
			customerStatus.setCity(cust.getCity());
			customerStatus.setZip(cust.getZip());
			customerStatus.setState_id(cust.getState_id());
			customerStatus.setEmail(cust.getEmail());
			customerStatus.setPhone(cust.getMobile());
			customerStatus.setMobile(cust.getMobile());
			customerStatus.setFax(cust.getFax());
			customerStatus.setActive(cust.getActive());
			if(null!=cust.getParent_id()) {
				int id= Integer.parseInt(cust.getParent_id());
				customerStatus.setParent_id(id);			
			}
			customerStatusMap.put(cust.getId(),customerStatus);
		}
				
		List<CustomerStatus> customerStatus = new ArrayList<>();
		for(Long customerID:customerStatusMap.keySet()) {
			customerStatus.add(customerStatusMap.get(customerID));
		}
		return customerStatus;
	}
	

	
}
	

