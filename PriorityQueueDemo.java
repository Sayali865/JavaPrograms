package com.demo;

import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/*
 * The queue interface extends Collection interface.
 * */
public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue queue=new PriorityQueue();
       // queue.add(12);
       // queue.add(null); cannot use null values
        try
        {
        	queue.add(null);
        }
        catch(NullPointerException ex)
        {
        	System.out.println("dont use null");
        }
       // queue.add(12);
        
        System.out.println(queue);
        //no Random access interface is implement by queue interface
        //queue.get(2);
       // System.out.println(queue.poll());//gives null if data is null
        //System.out.println(queue.remove());//gives exception handle using try and catch
        try
        {
        	System.out.println(queue.remove());
        }
        catch(NoSuchElementException ex)
        {
        	System.out.println("There is nothing in the object");
        }
        
        System.out.println(queue.peek());
        try
        {
        	System.out.println(queue.element());
        }
        catch(NoSuchElementException ex)
        {
        	System.out.println("There is nothing in the object1");
        }
       // System.out.println(queue.element());
        
      //  System.out.println(queue.remove());
	}
	

}
