package com.cisc181.core;

import java.util.Date;

public class PersonException extends Exception {
	
	private Person Person;
	private String invalidPN;
	private Date invalidDOB;
	
	public PersonException(Person Person){
	
		this.Person = Person;
	}

	public PersonException(String invalidPN){
		
		this.invalidPN = invalidPN;
	}
	
	public PersonException(Date invalidDOB){
		
		this.invalidDOB = invalidDOB;
	}
	
	
	
	
}
