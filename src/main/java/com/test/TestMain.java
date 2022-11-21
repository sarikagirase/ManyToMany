package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMain {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory = configuration.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
    
		Users user1= new Users("Vaibhavi","vaibhavi@gmail.com");
		Users user2=new Users("Rani","ranigirase@gmail.com");
		
		Nominees nominees1=new Nominees("Varsha");
		Nominees nominees2=new Nominees("Shruti");
		Nominees nominees3=new Nominees("Sakshi");
		 
		user1.getList().add(nominees1);
		user1.getList().add(nominees2);
		user1.getList().add(nominees3);
		
		nominees1.getUserList().add(user1);
		nominees2.getUserList().add(user1);
		nominees3.getUserList().add(user1);
		
		
		
		user2.getList().add(nominees1);
		user2.getList().add(nominees2);
		nominees1.getUserList().add(user2);
		nominees2.getUserList().add(user2);
		
		session.persist(user1);
		session.persist(user2);
		
		transaction.commit();
		session.close();
		

	}

}
