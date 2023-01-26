package opreation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Cart;
import model.Items;

public class ViewCartItems {
	@SuppressWarnings({ "deprecation", "unchecked" })
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure("resource/hibernate.cfg.xml").addAnnotatedClass(Cart.class)
				.addAnnotatedClass(Items.class).buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		List<Cart> list = s.createQuery("from Cart").list();
		for (Cart cart : list) {
			System.out.println(cart.getCartId() + " " + cart.getName() + " " + cart.getTotal());
			for (Items it : cart.getItems()) {

				System.out.println(it.getItemId() + " " + it.getItemTotal() + " " + it.getQuantitiy());
			}
		}

	}
}
