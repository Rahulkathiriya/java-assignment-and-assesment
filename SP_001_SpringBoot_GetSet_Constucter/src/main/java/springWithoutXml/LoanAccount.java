package springWithoutXml;

import org.springframework.stereotype.Component;

@Component
public class LoanAccount implements Account{

	public void getBalance() {
       double loanBalance = 20000;
       System.out.println("Loan Account Balance :"+loanBalance);
	}

}
