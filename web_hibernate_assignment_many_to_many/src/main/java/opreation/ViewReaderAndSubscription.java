package opreation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Reader;
import model.Subscription;

public class ViewReaderAndSubscription {
	@SuppressWarnings({ "deprecation", "unchecked" })
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure("resource/hibernate.cfg.xml").addAnnotatedClass(Reader.class)
				.addAnnotatedClass(Subscription.class).buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		List<Reader> list = s.createQuery("from Reader where firstName='Rahul'").list();
		for (Reader r : list) {
			System.out.println(r.getRaderId() + " " + r.getFirstName() + " " + r.getLastName() + " " + r.getEmail());
			for (Subscription sb : r.getSubscription()) {
				System.out.println(sb.getSubscriptionName());
			}
		}

	}
}
