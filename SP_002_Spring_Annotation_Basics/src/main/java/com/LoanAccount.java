package com;

import org.springframework.stereotype.Component;

@Component("loan")
public class LoanAccount implements Account{

	public  void getBalance() {
		double loanBalance = 450000.21;
		System.out.println("Loan account balance :" + loanBalance);
	}
}

@Component("personalLoan")
class PersonalLoan extends LoanAccount  {

	public void getBalance() {
		float amount = 450000.23f;
		System.out.println("Personal loan total amount :" + amount);
       
	}

}
