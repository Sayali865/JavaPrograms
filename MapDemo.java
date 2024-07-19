package com.demo;
/*
 * null values are allowed
 * multiple null values are allowed but it considers only one
 * Duplicate values are allowed but it considers only one
 * if duplicate value is there and we want to retrieve that data the also it is possible.
 * does not maintain any particular order of its elements.
 * */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> m=new HashMap();
		m.put(3,"Grapes");
		m.put(1,"Apple");
		m.put(1,"Apple");
		m.put(2, "Cherry");
		m.put(null, null);
		m.put(8, null);
		
		
		
		System.out.println(m);
		m.remove(1,"Apple");
		System.out.println(m);
		System.out.println(m.get(2));
		System.out.println(m.isEmpty());
		System.out.println(m.entrySet());
		System.out.println(m.equals(m));
		
		System.out.println("-----");
		
		HashMap<String,Integer> m1=new HashMap();
		m1.put("white",3);
		m1.put( "Purple",4);
		m1.put("Black",5);
		System.out.println(m1);
		System.out.println(m1.containsKey(m));
		System.out.println(m1.equals(m1));

	}

}
