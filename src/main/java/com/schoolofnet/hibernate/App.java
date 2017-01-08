package com.schoolofnet.hibernate;

import org.hibernate.Session;

import com.schoolofnet.model.Address;
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
	Address address = new Address();
	
	user.setUsername("mbarbosa");
	user.setName("Marcos");
	user.setLastName("Barbosa");
	user.setAddress(address);
	
	address.setNumber(900);
	address.setStreet("Down town");
	address.setUser(user);
	
        System.out.println("Hello World!");
        System.out.println(session);
        
        System.out.println(user.getName() + " " + user.getLastName());
        System.out.println(user.getAddress().getStreet());
        
    }
}
