package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("saving")
public class SavingAccount implements Account {

	@Autowired
	@Qualifier("secret")
	User user;

public static void display() {
	System.out.println("Hello");
}
	public void getBalance() {

		double SavingBalance = 120000.36;
		System.out.println("Saving account Balance : " + SavingBalance);
		user.userData();
		
	}

}
@Component("anotherOne")
class AnotherAccount extends SavingAccount {
	
	public void getBalance() {
		
		System.err.println("I am AnotherClass Method");
		SavingAccount.display();
		
		
	}
	
	
	
}

