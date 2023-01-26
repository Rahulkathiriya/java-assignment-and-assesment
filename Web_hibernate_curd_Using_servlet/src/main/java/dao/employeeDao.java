package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.employee;

public class employeeDao {

	SessionFactory sf;
	Configuration cfg;

	public employeeDao() {

		cfg = new Configuration();
		cfg.configure("resource/hibernate.cfg.xml");
		cfg.addAnnotatedClass(employee.class);
	}

	public void addEMployee(employee e) {

		sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.saveOrUpdate(e);
		tx.commit();
	}

	public List<employee> viewAllEmployee() {

		List<employee> al = new ArrayList<employee>();
		sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		return al = s.createQuery("from employee").list();
	}

	public employee getDataById(int id) {

		employee e = new employee();

		sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		e = s.load(employee.class, id);
		return e;
	}

	public void deleteEmployee(int id) {

		sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		employee e = s.load(employee.class, id);
		s.delete(e);
		tx.commit();
	}

}
