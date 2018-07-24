/******************************************************************************
  
 *  Purpose: Get the harmonic numbers
 *
 *  @author  Simran Sande
 *  @version 1.0
 *  @since   25-06-2018
 *
 ******************************************************************************/

package com.bridgelabz.function;

import com.bridgelabz.utility.Utility;

public class Harmonic 
{
	public static void main(String arghs[])
	{
		int number;
		Utility u=new Utility();
		System.out.println("enter the number to find harmonic");
		number=u.ipnumber();
		u.harmonic(number);
	}

}
