package com.greenstech;

import java.util.ArrayList;
import java.util.List;

//import java.util.ArrayList;
//import java.util.List;

public class List_Col {
	
	public static void main(String[] args) {
		
//		List<Integer> l = new ArrayList<Integer>();
		
		List<Object> l = new ArrayList<Object>();
		
		List<Object> l1 = new ArrayList<Object>();
		
		l.add("String");
		l.add(10);
		l.add('A');
		l.add(40);
		l.add(45.98);
		l.add(true); //remove
		l.add(10);
		l1.add(40);
		l1.add(50);
		l1.add('D');
		
		System.out.println(l);
		
		System.out.println(l1);
		
		int s = l.size();
		
		System.out.println(s);
		
		Object ob = l.get(2);
		
		System.out.println(ob);
		
		l.set(4, 50);
		
		System.out.println(l);
		
		l.remove(5);
		
		System.out.println(l);
		
		int ind = l.indexOf('A');
		
		System.out.println(ind);
		
		boolean con = l.contains(45.98);
		
		System.out.println(con);
		
		l.addAll(l1);
		
		System.out.println(l);
		
		l.retainAll(l1);
		
		System.out.println(l);
		
		l.removeAll(l1);
		
		System.out.println(l);
	}

}
