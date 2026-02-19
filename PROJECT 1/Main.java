package com.jspiders.hibernate;
import java.sql.DriverManager;
import com.jspiders.hibernate.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Mainclas 
{
public static void main(String [] args)
{
	EntityManagerFactory factory =Persistence.createEntityManagerFactory("development");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	Student s2 = new Student();
	s2.setRollno(2);
	s2.setName("suresh");
	s2.setContact("0123456789");
	s2.setAge(24);
	transaction.begin();
	manager.persist(s2);
	transaction.commit();

}
}
