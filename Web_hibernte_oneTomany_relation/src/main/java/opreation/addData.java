package opreation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.catagory;
import model.product;

public class addData {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure("resource/hibernate.cfg.xml")
				.addAnnotatedClass(catagory.class).addAnnotatedClass(product.class).buildSessionFactory(); 
		
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		
		catagory ct = new catagory();
//		ct.setCname("Electronic"); // add new catagory

		ct = s.load(catagory.class, 2); // add product thorugh 2 number of catagory
		
		product p1 = new product();
		p1.setPname("Ac");
		p1.setPrice(25000);
		p1.setCatagory(ct);
		
		product p2 = new product();
		p2.setPname("lemp");
		p2.setPrice(100);
		p2.setCatagory(ct);
		
		product p3 = new product();
		p3.setPname("Fridge");
		p3.setPrice(36000);
		p3.setCatagory(ct);
		
		
//		s.save(ct);
		s.save(p1);
		s.save(p2);
		s.save(p3);
		
		tx.commit();
		

	}
}
