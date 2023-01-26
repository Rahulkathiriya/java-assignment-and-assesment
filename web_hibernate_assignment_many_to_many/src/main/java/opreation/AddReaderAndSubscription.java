package opreation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Reader;
import model.Subscription;

public class AddReaderAndSubscription {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure("resource/hibernate.cfg.xml").addAnnotatedClass(Reader.class)
				.addAnnotatedClass(Subscription.class).buildSessionFactory();

		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Subscription sub = s.load(Subscription.class, 2);

		Reader red = new Reader();
		red.setEmail("hemishdholariya@gmail.com");
		red.setFirstName("Hemish");
		red.setLastName("Dholariya");
		red.addSubscription(sub);
			
		s.saveOrUpdate(red);
		tx.commit();

	}
}
