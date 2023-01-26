package opreation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.catagory;
import model.product;

public class deleteProductOrCatagory {
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure("resource/hibernate.cfg.xml")
				.addAnnotatedClass(catagory.class).addAnnotatedClass(product.class).buildSessionFactory();

		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		catagory ct = new catagory();
//		 delete catagory and connected all product using catagory id
		ct = s.load(catagory.class, 1);
		s.delete(ct);

		// Delete product using id
		product p = s.load(product.class, 8);
		s.delete(p);

		tx.commit();

	}
}
