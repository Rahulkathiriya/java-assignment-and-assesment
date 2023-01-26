package com;

import java.util.List;
import java.util.Set;
 
public class employee {

	int id;
	String name;
	String email;
	List<String> projectName;
	Set<String> language;

	public employee(int id, String name, String email, List<String> projectName, Set<String> language) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.projectName = projectName;
		this.language = language;
	}

	public void display() {

		System.out.println(id + " " + name + " " + email);

		for (String s : projectName) {
			System.out.println(s);

		}

		for (String lang : language) {
			System.out.println(lang);
		}

	}

}
