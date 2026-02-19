package com.jspiders.hibernate.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
     @Id
	private int productId;
  private String productName;
  private String productPrice;
  private String productType;
  public int getProductId() {
  return productId;
}
  public String getProductName() {
	return productName;
  }
  public void setProductName(String productName) {
	this.productName = productName;
  }
  public String getProductPrice() {
	return productPrice;
  }
  public void setProductPrice(String productPrice) {
	this.productPrice = productPrice;
  }
  public String getProductType() {
	return productType;
  }
 
  public void setProductId(int productId) {
	this.productId = productId;
  }
  public void setProductType(String type) {
	// TODO Auto-generated method stub
	
  }
  
  
}
