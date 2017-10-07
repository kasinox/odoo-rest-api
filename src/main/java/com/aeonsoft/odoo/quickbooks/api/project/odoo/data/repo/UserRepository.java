package com.aeonsoft.odoo.quickbooks.api.project.odoo.data.repo;

import org.springframework.data.repository.CrudRepository;

import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.entity.User;

public interface UserRepository extends CrudRepository<User,Long>{
	
	User findById(long id);

}
