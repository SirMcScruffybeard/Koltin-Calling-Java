package com.sirmcscruffybeard.kotlin_calling_java.java

fun main(args: Array<String>) {
	
	val java = Java()
	
	println(java.FIRST_NAME_PROMPT)
	
	java.setFirstName(readLine())
	
	println(java.LAST_NAME_PROMPT)
	
	java.setLastName(readLine())
	
	println("Your name is " + java.getFirstName() + " " + java.getLastName())
	
}