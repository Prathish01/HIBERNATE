package com.jspiders.hibernate.dto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ProductDao {
   public static void insertProduct(int productId,String name, String price,String type) {
	   Product product=new Product();
       product.setProductId(productId);
       product.setProductName(name);
       product.setProductType(type);
       product.setProductPrice(price);
       
	   EntityManagerFactory factory=Persistence.createEntityManagerFactory("devolopment");
	   EntityManager manager = factory.createEntityManager();
	   EntityTransaction transaction=manager.getTransaction();
	   transaction.begin();
	   manager.persist(product);
	   transaction.commit();
       
   } 
}
