package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class callingStudentClass {

	public static void main(String[] args) {
		
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContex.xml");
//		student st = context.getBean(student.class,"std");
//		st.display();
//		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContex2.xml");
		employee emp = context.getBean(employee.class,"employe");
		emp.display();
		
		
	}
}
