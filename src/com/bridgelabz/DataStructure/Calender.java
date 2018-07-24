 package com.bridgelabz.DataStructure;

import com.bridgelabz.utility.Utility;

public class Calender 
{
	public static void main(String[] args) 
	{
	       Utility u=new Utility();
	       int month,year;
	       System.out.println("Enter the month");
	       month=u.ipnumber();
	       System.out.println("Enter the year");
	       year=u.ipnumber();
	       
	       String[] months = 
	    	   {
	           "",                               
	           "January", "February", "March",
	           "April", "May", "June",
	           "July", "August", "September",
	           "October", "November", "December"
	    	   };
	       int[] days = {
	           0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
	       };
	       if (month == 2 && u.isleapyear(year)) days[month] = 29;
	       System.out.println("   " + months[month] + " " + year);
	       System.out.println(" S  M Tu  W Th  F  S");
	       int d = u.day(month, 1, year);
	       for (int i = 0; i < d; i++)
	       System.out.print("   ");
	       for (int i = 1; i <= days[month]; i++) 
	       {
	           System.out.printf("%2d ", i);
	           if (((i + d) % 7 == 0) || (i == days[month])) 
	           System.out.println();
	       }
	       

	}

	}
	