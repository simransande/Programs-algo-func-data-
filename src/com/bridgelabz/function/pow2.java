/******************************************************************************
  
 *  Purpose: Power of two
 *
 *  @author  Simran Sande
 *  @version 1.0
 *  @since   25-06-2018
 *
 ******************************************************************************/

package com.bridgelabz.function;

import com.bridgelabz.utility.Utility;

public class pow2
{
	public static void main(String args[])
	{
		int number;
		Utility u=new Utility();
		System.out.println("enter the power");
		number=u.ipnumber();
		u.power(number);
		
	}
}
