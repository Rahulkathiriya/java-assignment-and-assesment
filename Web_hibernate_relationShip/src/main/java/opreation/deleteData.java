package opreation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.student;
import model.studentDetail;

public class deleteData {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure("resource/hibernate.cfg.xml").addAnnotatedClass(student.class)
				.addAnnotatedClass(studentDetail.class).buildSessionFactory();

		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

//		student st = s.load(student.class, 2); 
//		s.delete(st);
		
		studentDetail st = s.load(studentDetail.class, 1);
		s.delete(st);
		tx.commit();
	}

 	
	  
}
