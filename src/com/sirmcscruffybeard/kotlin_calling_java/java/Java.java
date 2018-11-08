package com.sirmcscruffybeard.kotlin_calling_java.java;

public class Java {

	final String FIRST_NAME_PROMPT = "Please type your first name";
	
	final String LAST_NAME_PROMPT = "Please type your last name";
	
	private String firstName = "";
	
	private String lastName = "";
	
	public Java() {
		
		
	}
	
	public void setFirstName(String inName) { this.firstName = inName; }
	
	public String getFirstName() { return this.firstName; }
	
	public void setLastName(String inName) { this.lastName = inName; }
	
	public String getLastName() { return this.lastName; }
	
}
