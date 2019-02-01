package com.synechron.restwithspringbootjpaH2;

public class StudentNotFoundException extends Exception {

	public StudentNotFoundException(String string) {
		System.out.println("Student Id Not Present");
	}

}
