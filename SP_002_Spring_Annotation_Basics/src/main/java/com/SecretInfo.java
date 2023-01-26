package com;

import org.springframework.stereotype.Component;

@Component("secret")
public class SecretInfo implements User {

	private int accountNumber = 98745653;
	private String IFSC_CODE = "VARA120012";

	public void userData() {

		System.out.println("Account number is : " + accountNumber);
		System.out.println("IFSC CODE : " + IFSC_CODE);
	}

}
