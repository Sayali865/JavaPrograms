package com.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestCamparatorEmployee {

	public static void main(String[] args) {
		
		Employee21 emp1 = new Employee21(1,"Sayali",50000);
		Employee21 emp2 = new Employee21(4,"Mehak",75000);
		Employee21 emp3 = new Employee21(2,"Kashmira",70000);
		
		ArrayList<Employee21> al = new ArrayList<Employee21>();
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		System.out.println(al);
		
		System.out.println("Before sorting");
		System.out.println(al);
		
	//	EmployeeIdCamparator id = new EmployeeIdCamparator();
		
		//EmployeeSalaryComparator sall = new EmployeeSalaryComparator();
		System.out.println("After sorting");
		
		EmployeeNameCamparator nm = new EmployeeNameCamparator();
		Collections.sort(al ,nm);
		//Collections.sort(al, sall);
		//Collections.sort(al, id);
		System.out.println(al);
	}

}
