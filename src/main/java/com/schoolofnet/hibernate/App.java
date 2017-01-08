package com.schoolofnet.hibernate;

import java.util.List;

import org.hibernate.Session;

import com.schoolofnet.model.Address;
import com.schoolofnet.model.HibernateSession;
import com.schoolofnet.model.Product;
import com.schoolofnet.model.User;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
	
	Session session = HibernateSession.getSessionFactory().openSession();

	Product product = new Product();
	
	product.setName("P 1");
	product.setPrice(10.00);
        
//	session.save(product);

	List<Product> products = session.createQuery("from Product").getResultList();
	
	Product p2 = session.find(Product.class, 3);
	
	System.out.println(products);
	System.out.println(p2.getName());
	
//	session.getTransaction().commit();
	
    }
}
