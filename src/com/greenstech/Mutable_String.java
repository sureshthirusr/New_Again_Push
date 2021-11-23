package com.greenstech;

public class Mutable_String {
	
	public static void main(String[] args) {
		
		//Mutable string
		
		StringBuffer s = new StringBuffer("Starc");
		
		System.out.println(s);
		
		System.out.println(System.identityHashCode(s));
		
		StringBuffer s1 = new StringBuffer("Melvin");
		
		System.out.println(s1);
		
		System.out.println(System.identityHashCode(s1));
		
		StringBuffer s2 = new StringBuffer("Starc");
		
		System.out.println(s2);
		
		System.out.println(System.identityHashCode(s2));
		
		s1.append(s2);
		
		System.out.println(s1);
		
		System.out.println(System.identityHashCode(s1));
		
		
		
	}

}
