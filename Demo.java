package com.demo;

import java.util.Deque;
import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {

     Deque<String> dq = new LinkedList<String>();
     
     // adding elements to queue in different ways
     dq.add("Sayali");
     
     //add string element at first of the list
     dq.addFirst("Twinkle");
     
     //add string element at last of the list
     dq.addLast("Sakshi");
     
     dq.offer("Snehal");
     dq.offerFirst("Siddhi");
     
     
     System.out.println("Names list" + dq);

	}

}
