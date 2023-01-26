package opreation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.student;
import model.studentDetail;

public class viewData {

	@SuppressWarnings({ "deprecation", "unchecked" })
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure("resource/hibernate.cfg.xml").addAnnotatedClass(student.class)
				.addAnnotatedClass(studentDetail.class).buildSessionFactory();

		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		List<student> list = s.createQuery("from student").list();
		for (student st : list) {
			System.out.println(st.getId() + " " + st.getName() + " " + st.getEmail() + "    ");
			System.out.println(st.getStudentDetail().getAddressId() + " " + st.getStudentDetail().getCity() + " "
					+ st.getStudentDetail().getState() + " " + st.getStudentDetail().getPinCode() + " "
					+ st.getStudentDetail().getAddress());
		}

//		List<studentDetail> list = s.createQuery("from studentDetail").list();
//		for (studentDetail st : list) {
//			System.out.println(st.getAddress() + " => " + st.getStudent().getId() + " " + st.getStudent().getName()
//					+ " " + st.getStudent().getEmail());
//		}

	}
}
