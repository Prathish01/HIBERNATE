package com.hibernate.dao;
	import com.hibernate.dto.Adharcard;
import com.hibernate.dto.User;

import jakarta.persistence.EntityManager;
	import jakarta.persistence.EntityManagerFactory;
	import jakarta.persistence.EntityTransaction;
	import jakarta.persistence.Persistence;

	public class AdharDao {
		 static EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
		 static EntityManager manager = factory.createEntityManager();
		 static EntityTransaction transaction =manager.getTransaction();
		 public static void insertAdharcard(int adharId,long adharnumber, String name, long contact,String dateofBirth, String address, int userId)
		 {
		 Adharcard card=new Adharcard();
		 card.setAadharId(adharId);
		 card.setAadharnumber(adharnumber);
		 card.setName(name);
	     card.setDob(dateofBirth);
		 card.setAddress(address);
			 
		User user =manager.find(User.class,userId);
		if (user!=null)
			user.setCard(card);
		
		transaction.begin();
		manager.persist(card);
		transaction.commit();
			 
		 }   
		   
	}

