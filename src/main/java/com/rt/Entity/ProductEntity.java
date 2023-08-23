package com.rt.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productdeatails")
public class ProductEntity {
@Id
@GeneratedValue
@Column(name="productId")
private int productId;

@Column(name="productName")
private String productName;

@Column(name="ProductQuantity")
private int ProductQuantity;

@Column(name="productPrice")
private float productPrice;

public ProductEntity(){}

public ProductEntity(int productId, String productName, int productQuantity, float productPrice) {
	super();
	this.productId = productId;
	this.productName = productName;
	ProductQuantity = productQuantity;
	this.productPrice = productPrice;
}

public int getProductId() {
	return productId;
}

public void setProductId(int productId) {
	this.productId = productId;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public int getProductQuantity() {
	return ProductQuantity;
}

public void setProductQuantity(int productQuantity) {
	ProductQuantity = productQuantity;
}

public float getProductPrice() {
	return productPrice;
}

public void setProductPrice(float productPrice) {
	this.productPrice = productPrice;
}



}
