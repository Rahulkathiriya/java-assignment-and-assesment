package opreation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Faculty;
import model.Subjects;

public class View_Faculty_Subjects {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure("resource/hibernate.cfg.xml").addAnnotatedClass(Faculty.class)
				.addAnnotatedClass(Subjects.class).buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		@SuppressWarnings("unchecked")
		List<Faculty> list = s.createQuery("from Faculty where faclutyName='Rahul kathiriya'").list();

		for (Faculty sb : list) {
			System.out.println(sb.getFid() + " " + sb.getFaclutyName());
			for (Subjects f : sb.getSubjects()) {
				System.out.println(f.getSub_id() + " = " + f.getSubName());
			}
		}

	}
}
