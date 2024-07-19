package com.demo;
// arrange the data in ascending order
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts = new TreeSet<Integer>();
	    ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		ts.add(5);
		
		System.out.println(ts);
		System.out.println(ts.ceiling(22));
		System.out.println(ts.floor(7));
		
		
		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		 ts1.add(100);
			ts1.add(120);
			ts1.add(130);
			ts1.add(140);
			ts1.add(150);
			System.out.println(ts1);
	
			ts1.add(70);
			System.out.println(ts1.descendingSet());
			System.out.println(ts1.contains(100));
			
	}

}
