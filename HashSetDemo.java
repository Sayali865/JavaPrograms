package com.demo;

/*
 * null values are allowed multiple null values are allowed but it considers only one of them it only one
 * in the set
 *  no ordering of the data
 * clone method arrange the data in unsorted form
 * */
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet lh = new HashSet();
		lh.add(1);
		lh.add("Apple");
		lh.add(100);
		lh.add(2.5);
		lh.add("Hi..");
		lh.add("Hello");
		lh.add(1000);
		lh.add(null);
		
		System.out.println(lh);
		System.out.println(lh.size());
		
		lh.remove(null);
		
		System.out.println(lh);
		System.out.println(lh.size());
		
		System.out.println("-------------");
		
		HashSet lhs = new HashSet();
		lhs.add(2);
		lhs.add("Mango");
		lhs.add("Cherry");
		lhs.add("grapes");
		
		System.out.println(lhs);
		System.out.println(lhs.clone());
		System.out.println(lh.addAll(lhs));
		
		Iterator iterator = lhs.iterator();
		 while(iterator.hasNext())
	        {
	        	System.out.println(iterator.next());
	        }
		 
		 System.out.println("-------------");

		 
		 HashSet<String> set = new HashSet<String>();
			set.add("Red");
			set.add("Blue");
			set.add("Green");
			set.add("Orange");
			System.out.println(set);
			System.out.println(set.contains("Red"));
			System.out.println(set.contains("Apple"));
		    

	}

}
