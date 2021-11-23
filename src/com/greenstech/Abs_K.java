package com.greenstech;

public class Abs_K extends Abstraction{

	@Override
	void read_P() {

		System.out.println("Abstraction username");
	}
	
	public static void main(String[] args) {
		
		Abs_K k = new Abs_K();
		k.read_P();
	}

}
