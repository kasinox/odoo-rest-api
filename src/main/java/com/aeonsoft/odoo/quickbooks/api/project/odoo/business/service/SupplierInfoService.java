package com.aeonsoft.odoo.quickbooks.api.project.odoo.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeonsoft.odoo.quickbooks.api.project.odoo.business.domain.SupplierStatus;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.entity.product.ProductSupplierInfo;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.repo.ProductSupplierInfoRepository;

@Service
public class SupplierInfoService {
	
	private ProductSupplierInfoRepository supplierInfoRepository;
	
	@Autowired
	public SupplierInfoService(ProductSupplierInfoRepository supplierInfoRepo) {
		
		this.supplierInfoRepository=supplierInfoRepo;
	}
	
	public List<SupplierStatus> getSupplierStatusById(String id){	
		ProductSupplierInfo ps = this.supplierInfoRepository.findById(249);
		return null;
	}

}
