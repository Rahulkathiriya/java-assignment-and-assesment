package opreation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.student;
import model.studentDetail;

public class addData {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure("resource/hibernate.cfg.xml").addAnnotatedClass(student.class)
				.addAnnotatedClass(studentDetail.class).buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		studentDetail sd = new studentDetail();
		sd.setAddress("Mota varachha nilkanth Banglows.");
		sd.setCity("surat");
		sd.setState("Gujarat");
		sd.setPinCode(395001);

		student st = new student();

		st.setName("Hemish");
		st.setEmail("hemish123@gmail.com");
		st.setStudentDetail(sd);

	
		s.save(sd);
		s.save(st);
		tx.commit();

	}
}
