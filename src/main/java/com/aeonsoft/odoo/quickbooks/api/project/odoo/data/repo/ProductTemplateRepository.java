package com.aeonsoft.odoo.quickbooks.api.project.odoo.data.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.entity.product.ProductTemplate;

public interface ProductTemplateRepository extends CrudRepository<ProductTemplate,Long>{

	ProductTemplate findById(long id);
}
