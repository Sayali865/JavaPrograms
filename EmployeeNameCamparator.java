package com.demo;

import java.util.Comparator;

public class EmployeeNameCamparator implements Comparator<Employee21> 
{

	@Override
	public int compare(Employee21 o1, Employee21 o2)
	{
		
			return o1.getName().compareTo(o2.getName());
		
	}

}
