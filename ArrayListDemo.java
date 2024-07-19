package com.demo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	//Array is internally using array data structure
// it is maintaing the insertion order
//modification (modification and deletion) of a data in array list is time consuming
//Duplicates are allowed in array list.
//multiple null are allowed in array list
	// retrival of data in array list is possible.
	public static void main(String[] args) {
		
		// creating object of ArrayList class
		ArrayList list = new ArrayList();
		
		// adding values of different type of data
        list.add(5);
        list.add("Sayali");
        list.add('S');
        list.add(null);
        list.add(true);
        list.add(7);
        list.add('P');
        list.add(2.3f);
        
        //list will store only string value as reference type is given as string
        ArrayList<String> list2=new ArrayList<String>();
        list2.add("One");
        list2.add("Two");
        list2.add("Three");
        
        //printing the size of second list object.
        System.out.println(list2.size());
        
        // add more elments in the list
        list2.add("Four");
        list2.add("Five");
        
        
        // again printing the size of list 2      
        System.out.println(list2.size());
        
        // removing the string element that is two
        list2.remove("Two");
        
     // again printing the size of list 2     
        System.out.println(list2.size());
        
        //key value pair value will added at the start of the list at 1st postion
        list.add(1,"Two");
        
        // value will get at index postion 1
        System.out.println(list.get(1));
	}

}
