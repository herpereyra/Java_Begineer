package com.educacionit.oop;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student ();
		s.name = "Homer";
		s.lastname = "Simpson";
		s.age = 33;
		s.dni = "123";
		
		Student s2 = new Student ();
		s2.name = "Bart";
		s2.lastname = "Simpson";
		s2.age = 12;
		s2.dni = "1234";
		
		s.read ();
		s2.read ();
		
	}

}
