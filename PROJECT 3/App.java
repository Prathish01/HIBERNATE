package Hibernate.Mappingdemo;

import com.hibernate.dao.AdharDao;
import com.hibernate.dao.UserDao;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args)
    {
  UserDao.insertUser(32721,"pratzzzz", 10370, "Pallikaranai","Prathish@gmail.com", 7377); 	
  AdharDao.insertAdharcard(80360, 7492629, "Pr",02-07-2004, "Balaji,Pallikaranai", null, 0);
    	
    	System.out.println("Hello World!");
    }
}
