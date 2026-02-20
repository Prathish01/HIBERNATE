package com.hibernate.manytomany;
import hibernate.dto.Coursedto;
import hibernate.dto.Studentdto;

/**
 * Hello world!
 *
 */
public class App 
{	
    public static void main( String[] args )
    {
    	Studentdto.insertStudentdao(1, "Prat", "gmail", 829251, "PRA");
      
    }
}
