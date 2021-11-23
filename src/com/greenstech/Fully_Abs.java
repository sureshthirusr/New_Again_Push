package com.greenstech;

public class Fully_Abs { 
	
	public Fully_Abs(int age) { //parameterised constructor

	
		System.out.println("Default Constructor :"+age);
	}
	
	private void method_Cons(String name) {

		System.out.println("Method :"+name);
	}

	
	public static void main(String[] args) {
		
		Fully_Abs a = new Fully_Abs(); //Default constructor
		
		a.method_Cons("Selenium");
	}
	
	 public Fully_Abs() {

	
		System.out.println("C");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
	}
}
