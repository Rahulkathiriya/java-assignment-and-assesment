package com;

import java.util.List;

public class student {

	int id;
	String name;
	String email;
	List<String> sub;
	List<String> lang;
	address adr;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getSub() {
		return sub;
	}

	public void setSub(List<String> sub) {
		this.sub = sub; 
	}

	public List<String> getLang() {
		return lang;
	}

	public void setLang(List<String> lang) {
		this.lang = lang;
	}

	public address getAdr() {
		return adr;
	}

	public void setAdr(address adr) {
		this.adr = adr;
	}

	public void display() {

		System.out.println(id + " " + name + " " + email);
		for (String s : sub) {
			System.out.println(s);
		}
		for (String language : lang) {
			System.out.println(language);
		}

		adr.display();

	}

}
