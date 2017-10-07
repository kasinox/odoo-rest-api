package com.aeonsoft.odoo.quickbooks.api.project.odoo.data.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.entity.product.ProductProduct;

public interface ProductProductRepository  extends CrudRepository<ProductProduct,Long>{

//	List<ProductProduct> findById(long id);
	ProductProduct findById(long id);
	List<ProductProduct> findAll();
}
