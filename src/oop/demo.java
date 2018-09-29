package oop;

class Person {
	
	String name;
	String email;
	String phone;
	String sing;
	
	void walk() {
		System.out.println(name + " is walking");
	
	}
	
	void eat() {
		System.out.println(email);
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
		
	}
		
	void sing() {
		System.out.println("call " + name + " at" + " 894729784");
		
	}
}

public class demo {

	public static void main(String[] args) {
		// Instantiating an object
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "Joe";
		person1.email = "joe@testemail.com";
		person1.phone = "894729784";
		
		// Abstraction
		person1.walk();
		
		///
		
		person1.sleep();
		person1.sing();
		
		
		/*
		// Person
		
		// Attributes, variables, adjectives, descriptors
		String name = "Joe";
		String email = "joe@testemail.com";
		String phone = "89472974";
		
		// Action, activity, behavior
		//System.out.println(name + " is walking");
		walking(name);
		System.out.println(name + " is eating");
		
		// What if we wanted to do this for another person?
		
		// Attributes, variables, adjectives, descriptors
				String name2 = "Sarah";
				String email2 = "joe@testemail.com";
				String phone2 = "297428749";
				
				// Action, activity, behavior
				//System.out.println(name2 + " is walking");
				walking(name2);
				System.out.println(name2 + " is eating");
				
		// What about binding attributes and properties together?
				
	}

	// Enhance by adding functons to minimize code
	static void walking(String name) {
		System.out.println(name + " is walking");
		
	*/
	
	}
	
}
