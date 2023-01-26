package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CallingAllClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AccountConfig.class);

		Account sa = context.getBean("anotherOne", Account.class);
		sa.getBalance();

		Account la = context.getBean("personalLoan", Account.class);
		la.getBalance();
		
		   
	 
	}

}
