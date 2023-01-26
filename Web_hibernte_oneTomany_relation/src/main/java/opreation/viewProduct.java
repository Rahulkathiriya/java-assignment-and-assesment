package opreation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.catagory;
import model.product;

public class viewProduct {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure("resource/hibernate.cfg.xml")
				.addAnnotatedClass(catagory.class).addAnnotatedClass(product.class).buildSessionFactory();

		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		List<catagory> list = s.createQuery("from catagory").list();
		for (catagory c : list) {

			System.out.println(c.getCid() + " " + c.getCname());
			for (product p : c.getProduct()) {

				System.out.println(p.getPid() + " " + p.getPname() + " " + p.getPrice());
			}
		}

	}
}
