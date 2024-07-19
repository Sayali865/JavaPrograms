package com.demo;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Comparable and Comparator both are interfaces and can be used to sort collection elements.
 * there are many differences between Comparable and Comparator interfaces
 * Comparable provides a single sorting sequence. In other words, we can sort the collection on the 
 * basis of a single element such as id, name, and price.
 * Comparable provides compareTo() method to sort elements.
 * Comparator provides compare() method to sort elements.
 * */
class Employee implements Comparable<Employee>
{
   int id;
   String name;
   int age;
   
public Employee(int id, String name, int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}

@Override
public int compareTo(Employee o) {

	if (age == o.age )
	{
		return 0;
	}
	else if(age>o.age)
	{
		return 1;
	}
	else
	{
		return -1;
	}
}
}
public class CamparableTestDemo {

	public static void main(String[] args) {

		ArrayList<Employee> Emp= new ArrayList<Employee>();
        Employee emp1 = new Employee(1,"Sayali",23);
        Employee emp2 = new Employee(2,"Sita",22);
        Employee emp3 = new Employee(3,"gita",25);
        
        Emp.add(emp1);
        Emp.add(emp2);
        Emp.add(emp3);
        
        Collections.sort(Emp);
        for(Employee e:Emp)
        {
        	System.out.println(e.id+" "+e.name+" "+e.age+" ");
        }
	}

}
