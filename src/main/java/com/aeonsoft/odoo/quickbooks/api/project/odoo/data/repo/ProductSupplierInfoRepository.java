package com.aeonsoft.odoo.quickbooks.api.project.odoo.data.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.entity.product.ProductSupplierInfo;


public interface ProductSupplierInfoRepository extends CrudRepository<ProductSupplierInfo,Long> {
	
	ProductSupplierInfo findById(long id);
	List<ProductSupplierInfo> findByProductTemplateId(long id);
}
