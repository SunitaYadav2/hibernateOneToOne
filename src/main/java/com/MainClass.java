package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		
		
		

		//----------------------------
        SessionFactory sf= new Configuration().configure().buildSessionFactory();        
        // obtains the session
        Session session = sf.openSession();
        session.beginTransaction();
		
		Customer cst= new Customer("sunita"," su@12.com");
		Account ac= new Account("saving",150000,cst);
		  session.save(ac);
		
		Customer cst1= new Customer("ram"," ram@gmail.com");
		Account ac1= new Account("fixed",57000,cst1);
		 session.save(ac1);
		
		Customer cst2= new Customer("hari"," 12@hari.com");
		
		Account ac2= new Account("checking",60000,cst2);
		 session.save(ac2);
		//Customer cst3= new Customer("pratik"," 111pk@gmail.com");
		
	
		


		//Account ac3= new Account("General",50000,cst3);
        
       // session.save(ac3);
		 
			
			Customer cs3= new Customer("sanunita"," su@12.com");
			Account ac3= new Account("savingA",150000,cs3);
			  session.save(ac3);
			
        
        
        //------------    
        session.getTransaction().commit();
        session.close();
        //-----------------------  

        
        
	}

}
