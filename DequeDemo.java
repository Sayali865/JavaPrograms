package com.demo;

import java.util.ArrayDeque;

// user define class
public class DequeDemo {

	public static void main(String[] args) {
		
		// creating object of inbuilt class that is ArrayDeque
		ArrayDeque dq = new ArrayDeque();
		dq.add("Hey");
		dq.add(1);
	    dq.add(true);
		dq.add("Hii...");
		dq.add(2.3);
		dq.add("Hello");
		dq.add(30);
	
		
		 try
	        {
	        	dq.add(null);
	        }
	        catch(NullPointerException ex)
	        {
	        	System.out.println("dont use null");
	        }
		
		System.out.println(dq);
	}


}
