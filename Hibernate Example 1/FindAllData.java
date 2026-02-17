package com.jsp.hibernate_first;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindData {

	public static void main (String []args) {
		// TODO Auto-generated constructor stub
		 EntityManagerFactory emf= Persistence.createEntityManagerFactory("prathish");
	        EntityManager em=emf.createEntityManager();
	        EntityTransaction et=em.getTransaction();
	        Student st=em.find(Student.class, 101);
	        if(st!=null) {
	        	System.out.println(st.getStuid()+""+st.getName()+""+st.getMarks()+""+st.getPhono());
	        	
	        }else {
	        	System.out.println("Id Not available");
	        }
	        et.begin();
	        et.commit();
	}
}
