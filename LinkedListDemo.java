package com.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Vector;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
    LinkedList list = new LinkedList();
		
    list.add(1);
        list.add(5);
        list.add("Sayali");
        list.add('S');
        list.add(null);
        list.add(true);
        list.add(7);
        list.add('P');
        list.add(2.3);
        list.addLast(10);
        list.addAll(0, list);
        list.addFirst(11);
        list.addLast(100);
        list.get(2);
        
        
        System.out.println(list); 
        
        LinkedList<Integer> list2=new LinkedList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list.remove(7);
        
        System.out.println(list2);
        
        //fetch the record using iterator and list iterator  from linkedlist
        
        Iterator iterator=list2.iterator();
        while(iterator.hasNext())
        {
        	System.out.println(iterator.next());
        }

	}

}
