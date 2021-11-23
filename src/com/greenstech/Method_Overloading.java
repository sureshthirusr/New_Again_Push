package com.greenstech;

public class Method_Overloading {

	private void method_Overloading() {
		
		System.out.println("Method Overloading");

	}

	public void method_Overloading(int age) {
		System.out.println("Method One :"+age);

	}

	public void method_Overloading(String name, char initial) {
		
		System.out.println("Name of the M :"+name); //concordination
		
		System.out.println("Initial of M : "+initial);

	}
	
	public static void main(String[] args) {
		
		Method_Overloading m = new Method_Overloading();
		m.method_Overloading();
		m.method_Overloading(45);
		m.method_Overloading("Selenium", 'D');
		m.method_Overloading(58);
		m.method_Overloading("Testing", 'F');
	}

}
