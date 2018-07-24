/******************************************************************************
  
 *  Purpose: Get the prime factors for input value
 *
 *  @author  Simran Sande
 *  @version 1.0
 *  @since   25-06-2018
 *
 ******************************************************************************/


package com.bridgelabz.function;

import com.bridgelabz.utility.Utility;

public class PrimeFactor 
{
	public static void main(String args[])
	{
		Utility u=new Utility();
		int number;
		System.out.println("Enter the number you want to fing Primefactors");
		number=u.ipnumber();
		u.Primefact(number);
	}
}
