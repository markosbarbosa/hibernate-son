package com.schoolofnet.hibernate;

import org.hibernate.Session;

import com.schoolofnet.model.HibernateSession;
import com.schoolofnet.model.User;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
	
	Session session = HibernateSession.getSessionFactory().openSession();
	
	User user = new User();
	
	user.setUsername("mbarbosa");
	user.setName("Marcos");
	user.setLastName("Barbosa");
	
	
        System.out.println("Hello World!");
        System.out.println(session);
        
        System.out.println(user.getName() + " " + user.getLastName());
        
    }
}
