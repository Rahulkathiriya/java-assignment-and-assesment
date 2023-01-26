package opreation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import model.Faculty;
import model.Subjects;

public class Add_Faculty_Subjects {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure("resource/hibernate.cfg.xml").addAnnotatedClass(Faculty.class)
				.addAnnotatedClass(Subjects.class).buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		Subjects sb = s.load(Subjects.class, 1); 
		
		Faculty f = new Faculty();
		f.setFaclutyName("Ravi Patel");
		f.addSubjects(sb);

		s.save(f);
		tx.commit();
	}

}
