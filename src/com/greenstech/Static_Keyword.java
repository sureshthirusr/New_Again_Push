package com.greenstech;

public class Static_Keyword extends Final_Keyword{ // Class A
	
	public static void main(String[] args) {
		
		Static_Keyword s = new Static_Keyword();
//		Final_Keyword f = new Final_Keyword();
		
		s.read_Data();
		s.read_Demo();
//		f.demo_Call();
		s.demo_Call();
	}
	
	public void read_Data() {

		System.out.println("Method One");
	}
	
	public void read_Demo() {

		System.out.println("Method Two");
	}
	

}
