package com.aeonsoft.odoo.quickbooks.api.project.odoo.data.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.entity.SalesOrder;



public interface SalesOrderRepository extends CrudRepository<SalesOrder,Long>{
	List<SalesOrder> findByName(String name);

}
