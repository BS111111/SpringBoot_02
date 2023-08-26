package com.rt.ProductController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String Product(@RequestBody ProductEntity p) {
		pService.addProduct(p);
		return "Product Add";
	}

	@GetMapping("/addProduct/productId/{productId}")
	public ProductEntity GetProductById(@PathVariable int productId) {
		ProductEntity p = pService.GetProductById(productId);
		return p;
	}

	@DeleteMapping("/addProduct/productId/{productId}")
	public ProductEntity deleteProductById(@PathVariable int productId) {
		ProductEntity p = pService.deleteProductById(productId);
		return p;
	}
	
   @GetMapping("/product")
   public List<ProductEntity> getAllEmp(){
	 List<ProductEntity>   productList= pService.GetAllProduct();
	return productList;
   }
   
//   @GetMapping("/product/productName/{productName}")
//   public List<ProductEntity> getProductName(@PathVariable String productName){
//	 List<ProductEntity>   productList= pService.getEmpName(productName);
//	return productList;
//   }
   @GetMapping("/product/productName/{productName}")
   public List<ProductEntity> getProductName(@PathVariable String productName){
	 List<ProductEntity>   productList= pService.getEmpName(productName);
	return productList;
   }
}
