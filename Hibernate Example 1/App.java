package com.jsp.hibernate_first;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("prathish");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        //Student st=new Student(102,"tom",90.0,987654321);
        Employee emp=new Employee(001,"Prathish",40000,123456789,"pr@gamil.com");
        em.persist(emp);
        et.begin();
        et.commit();
        
    }
}
