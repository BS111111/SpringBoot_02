package com.rt.ProductController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rt.Entity.ProductEntity;
import com.rt.Services.ProductService;

@RestController
public class ProductController {
@Autowired
ProductService pService;

@PostMapping("/addProduct")
	public String Product(@RequestBody ProductEntity p){
		pService.addProduct(p);
		return"Product Add";
	}
	
}
