package com.aeonsoft.odoo.quickbooks.api.project.odoo.data.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.entity.SalesOrderLine;

public interface SalesOrderLineRepository  extends CrudRepository<SalesOrderLine,Long>{

	List<SalesOrderLine> findById(long id);

	List<SalesOrderLine> findByOrderId(int order_id);
}
