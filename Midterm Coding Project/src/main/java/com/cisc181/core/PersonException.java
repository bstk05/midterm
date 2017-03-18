package com.cisc181.core;

import java.util.Date;

public class PersonException extends Exception {
	
	private Person Person;
	private String newPhone_number;
	
	public PersonException(Person Person){
	
		this.Person = Person;
	}

	public PersonException(String newPhone_number) {
		this.newPhone_number = newPhone_number;
	}


	
	
	
}
