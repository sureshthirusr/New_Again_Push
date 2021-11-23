package com.greenstech;

public class Method_Overriding extends Method_Overloading {

	@Override //Annotations
	public void method_Overloading(int age) {
		super.method_Overloading(age);
		
		//super --> keyword-->Refer the parent class
	}
	
	@Override
	public void method_Overloading(String name, char initial) {
		super.method_Overloading(name, initial);
	}
	
	public static void main(String[] args) {
		
		Method_Overriding m1 = new Method_Overriding();
		m1.method_Overloading(25);
		m1.method_Overloading("Automation", 'B');
	}
}
