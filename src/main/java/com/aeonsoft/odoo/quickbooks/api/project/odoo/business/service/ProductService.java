package com.aeonsoft.odoo.quickbooks.api.project.odoo.business.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeonsoft.odoo.quickbooks.api.project.odoo.business.domain.ProductStatus;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.entity.product.ProductProduct;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.entity.product.ProductSupplierInfo;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.entity.product.ProductTemplate;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.repo.ProductProductRepository;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.repo.ProductSupplierInfoRepository;
import com.aeonsoft.odoo.quickbooks.api.project.odoo.data.repo.ProductTemplateRepository;

/*
 * product id in sales order refers to product_product, then get additional information from product_template
 */
@Service
public class ProductService {

	
	private ProductProductRepository productProductRepository;
	private ProductTemplateRepository productTemplateRepository;
	private ProductSupplierInfoRepository productSupplierInfoRepository;
	

	
	@Autowired
	public ProductService(ProductProductRepository productProductRepository,ProductTemplateRepository productTemplateRepository,
			ProductSupplierInfoRepository productSupplierInfoRepository) {
		
		this.productProductRepository = productProductRepository;
		this.productTemplateRepository = productTemplateRepository;
		this.productSupplierInfoRepository=productSupplierInfoRepository;
		
	}




	public ProductStatus getProductProductById(String product_id){
		long id = Long.parseLong(product_id);
		ProductProduct product = this.productProductRepository.findById(id);
		

			ProductStatus productStatus = new ProductStatus();			
			productStatus.setId(product.getId());
			productStatus.setPp_id(product.getId());
			productStatus.setPt_id(product.getProduct_tmpl_id());
			productStatus.setName(product.getName_template());
		
		ProductTemplate pt = this.productTemplateRepository.findById(product.getProduct_tmpl_id());
			if(null!=pt) {
				productStatus.setSalesDescription(pt.getDescription_sale());
				productStatus.setPurchaseDescription(pt.getDescription_purchase());
			}


		List<ProductSupplierInfo> ps = this.productSupplierInfoRepository.findByProductTemplateId(product.getProduct_tmpl_id());
		
		for(int i=0;i<ps.size();i++) {
			ProductSupplierInfo supplierInfo = ps.get(i);
			int sequence = supplierInfo.getSequence();
			
			if(sequence==1) {
				productStatus.setSupp_id(Long.parseLong(supplierInfo.getName()));
				productStatus.setProduct_code(supplierInfo.getProduct_code());
				productStatus.setProduct_name(supplierInfo.getProduct_name());
			}
			
		}

		return productStatus;
	}
	public List<ProductStatus> getProductProductAll(){
		
		Iterable<ProductProduct> productAll = this.productProductRepository.findAll();
		Map<Long,ProductStatus> productMap = new HashMap<>();


		for(ProductProduct product: productAll) {
			ProductStatus productStatus = new ProductStatus();	
			
			productStatus.setId(product.getId());
			productStatus.setPp_id(product.getId());
			productStatus.setPt_id(product.getProduct_tmpl_id());
			productStatus.setName(product.getName_template());
			ProductTemplate pt = this.productTemplateRepository.findById(product.getProduct_tmpl_id());
			if(null!=pt) {
				productStatus.setSalesDescription(pt.getDescription_sale());
				productStatus.setPurchaseDescription(pt.getDescription_purchase());
			}
			List<ProductSupplierInfo> ps = this.productSupplierInfoRepository.findByProductTemplateId(product.getProduct_tmpl_id());
			
			for(int i=0;i<ps.size();i++) {
				ProductSupplierInfo supplierInfo = ps.get(i);
				int sequence = supplierInfo.getSequence();
				
				if(sequence==1) {
					productStatus.setSupp_id(Long.parseLong(supplierInfo.getName()));
					productStatus.setProduct_code(supplierInfo.getProduct_code());
					productStatus.setProduct_name(supplierInfo.getProduct_name());
				}
				
			}
			productMap.put(product.getId(), productStatus);
		}
			
		List<ProductStatus> productStatusList = new ArrayList<>();
		for(Long productID:productMap.keySet()) {
			productStatusList.add(productMap.get(productID));
		}
		
		return productStatusList;
	}
}
