package com.example.crud.cons;

public class ConsMain {
	public static void main(String[] args) {

		/*
		 * Provider provider = () -> { return new Student(); };
		 */	
		Provider provider = Student::new;
		Student student = provider.getStudent();
		student.display();
	}

}
