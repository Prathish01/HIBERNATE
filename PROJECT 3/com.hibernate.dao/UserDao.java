package com.hibernate.dao;

import com.hibernate.dto.Adharcard;
import com.hibernate.dto.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
public class UserDao {
    static EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
    static EntityManager manager = factory.createEntityManager();
    static EntityTransaction transaction =manager.getTransaction();
     public static void insertUser(int userId, String username,String dateofbirth, String address,String email, long contact)
     {
    	 User user=new User();
    	 user.setUserId(userId);
    	 user.setUsername(username);
    	 user.setDateofbirth(dateofbirth);
    	 user.setAddress(address);
    	 user.setEmail(email);
    	 user.setContact(contact);
    	 
    	 transaction.begin();
    	 manager.persist(user);
    	 transaction.commit();
   
     }
     public static void findUser(int userId) {

		 User user=manager.find(User.class, userId);
    	 Adharcard cardAdharcard= user.getCard();
    	 System.out.println();
    	 
     }
	 public static void insertUser(int userId, String username, int i, String address, String email, int contact) {
		// TODO Auto-generated method stub
		
	 } 
}
