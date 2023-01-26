package opreation;

import java.util.Set;
import java.util.HashSet;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Cart;
import model.Items;

public class AddCartItema {
	@SuppressWarnings({ "deprecation", "unchecked" })
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure("resource/hibernate.cfg.xml").addAnnotatedClass(Cart.class)
				.addAnnotatedClass(Items.class).buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		Cart cart = s.load(Cart.class, 1);

		Items item = new Items("Cheese", 20, 4, cart);
		Items item1 = new Items("Panner", 12, 3, cart);

		Set<Items> items = new HashSet<Items>();
		items.add(item);
		items.add(item1);

		List<Items> list = s.createQuery("from Items").list();
		for (Items i : list) {
			double total = i.getCart().getTotal() + item.getItemTotal() * item.getQuantitiy()
					+ item1.getItemTotal() * item1.getQuantitiy();
			cart.setItems(items);
			cart.setTotal(total);
		}

		s.saveOrUpdate(item);
		s.saveOrUpdate(item1);
		tx.commit();

	}

}
