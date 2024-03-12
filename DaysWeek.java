package com.progrs;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DaysWeek {

	public static void main(String[] args) {
		
		 int year = 2024;
	        int month = 3;
	        int day = 12;

	        LocalDate date = LocalDate.of(year, month, day);
	        
	        DayOfWeek day1 = date.getDayOfWeek();
	        
	        System.out.println("Todays Date is " + date);
	        System.out.println("Todays Day is " + day1);
	        

	}

}
