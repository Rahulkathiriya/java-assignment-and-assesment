package springWithoutXml;

import org.springframework.stereotype.Component;

@Component
public class SavingAccount implements Account {

	public void getBalance() {
		double belance = 12000;
		System.out.println("Saving account  balance : " + belance);
	}

}
@Component("myAccount")
class myAccount extends SavingAccount {

	int myAccountBalance = 980000;

	public myAccount() {
		System.out.println("My Account Balance is : " + myAccountBalance);
	}

}
