package com.rt.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rt.Dao.ProductDao;
import com.rt.Entity.ProductEntity;

@Component
public class ProductService {
	@Autowired
	ProductDao pDAo;

	public void addProduct(ProductEntity p) {
		pDAo.save(p);
	}

}
