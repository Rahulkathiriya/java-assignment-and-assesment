package opreation;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.hibernate.cfg.Configuration;

import model.Cart;
import model.Items;

public class DeleteItems {
	@SuppressWarnings({ "deprecation", "unchecked" })
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure("resource/hibernate.cfg.xml").addAnnotatedClass(Cart.class)
				.addAnnotatedClass(Items.class).buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		Cart cart = s.load(Cart.class, 1);
		Items item = s.load(Items.class, 24);
		s.delete(item);

		List<Items> list = s.createQuery("from Items").list();
		for (Items it : list) {
//			System.out.println(it.getItemTotal()+" "+it.getQuantitiy());
			cart.setTotal(it.getItemTotal() * it.getQuantitiy());
			s.saveOrUpdate(cart);
		}
		tx.commit();

	}
}
