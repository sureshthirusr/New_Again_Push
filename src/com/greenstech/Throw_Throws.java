package com.greenstech;

public class Throw_Throws {
	
	public static void main(String[] args) throws Exception {
		
		int age = 10;
		
		if (age==9) {
			
			System.out.println("Eligible for voting");
			
		}
		
		else {
			
			System.out.println("Not ELigible for voting");
			throw new Exception();
		}
		
		System.out.println(".....Completing.....");
		
	}

}
