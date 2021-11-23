package com.greenstech;

public class Exception_Handling {
	
	
	public static void main(String[] args) { //Main Method
		
		int a = 10;
		
		try {
			try {
				
				int b = 20;
				
				System.out.println(b/0);
				
			} catch (Exception e) {
				
				System.out.println("Process 2 in Progress");
				
				e.printStackTrace();
			}
			
			System.out.println(a/2);
			
			
		} catch (Exception e) {
			
			System.out.println("Process completed");
			
			e.printStackTrace();
		}
		
		finally { //block
			
			System.out.println("......InProgress......");
		}
		
	
	}
}
