package com.aeonsoft.odoo.quickbooks.api.project.odoo.data.repo;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.entity.Partner;

public interface PartnerRepository extends CrudRepository<Partner, Long>{
	
	List<Partner> findById(long id);
}
