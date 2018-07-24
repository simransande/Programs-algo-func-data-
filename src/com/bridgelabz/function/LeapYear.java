/******************************************************************************
  
 *  Purpose: Is year is leap or not
 *
 *  @author  Simran Sande
 *  @version 1.0
 *  @since   25-06-2018
 *
 ******************************************************************************/


package com.bridgelabz.function;

import com.bridgelabz.utility.Utility;
public class LeapYear 
{
	public static void main(String[] args)
			{
				int year;
				Utility u=new Utility();
				System.out.println("enter the year");
				year=u.ipnumber();
				boolean value=u.leapyear(year);
				if(value==true)
				{
					System.out.println("leap year");
				}
				else
					System.out.println("not leap year");
			}
																																							
			
}
