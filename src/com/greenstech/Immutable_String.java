package com.greenstech;

public class Immutable_String {
	
	public static void main(String[] args) {
		
		//Immutable String
		
		String s = "Selenium";
		
		System.out.println(System.identityHashCode(s));
		
		String s1 = "Testing";
		
		System.out.println(System.identityHashCode(s1));
		
		String s2 = "Selenium"; //Duplicate
		
		System.out.println(System.identityHashCode(s2));
		
		//concordination
		
		s1 = s1+s2; //Testing+Selenium === Testing Selenium
		
		System.out.println(System.identityHashCode(s1));
		
		System.out.println(s1);
	}

}
