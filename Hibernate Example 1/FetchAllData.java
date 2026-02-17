package com.jsp.hibernate_first;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllData {

	public static void main(String []args) {
		 EntityManagerFactory emf= Persistence.createEntityManagerFactory("prathish");
	        EntityManager em=emf.createEntityManager();
	        EntityTransaction et =em.getTransaction();	
	       Query q=em.createQuery("selet stu from Student stu");
	       List<Student> list2=q.getResultList();
	       for(Student st: list2) {
	    	   System.out.println(st.getMarks()+""+st.getName()+""+st.getPhono()+""+st.getStuid());
	       }       
	et.begin();
	et.commit();
	}

    
}
