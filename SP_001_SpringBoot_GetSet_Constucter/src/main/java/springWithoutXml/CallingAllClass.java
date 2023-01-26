package springWithoutXml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CallingAllClass {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Account sa = context.getBean("savingAccount", Account.class);
        sa.getBalance();
        
        Account la = context.getBean("loanAccount",Account.class);
        la.getBalance();
        
        Account myAccount = context.getBean("myAccount",Account.class);
        myAccount.getBalance();
        
        
	}
}
