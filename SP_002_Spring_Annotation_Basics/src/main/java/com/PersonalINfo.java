package com;

import org.springframework.stereotype.Component;

@Component("personal")
public class PersonalINfo implements User {

	String email = "rahul.kathiriya.61@gmail.com";
	double salary = 15000;

	public void userData() {
		System.out.println("Email Address : " + email);
		System.out.println("Salary : " + salary);
	}

}
