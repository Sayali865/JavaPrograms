package com.demo;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee21>{

	@Override
	public int compare(Employee21 o1, Employee21 o2) {
		
		if(o1.getSalary() > o2.getSalary())
		{
			return 1;
		}
		else if(o1.getSalary() > o2.getSalary())
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
	}

}
