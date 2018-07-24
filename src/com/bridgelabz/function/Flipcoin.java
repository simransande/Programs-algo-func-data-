/******************************************************************************
  
 *  Purpose: Flip a coint and get the prcentage of Head vs Tails
 *
 *  @author  Simran Sande
 *  @version 1.0
 *  @since   25-06-2018
 *
 ******************************************************************************/


package com.bridgelabz.function;

import com.bridgelabz.utility.Utility;
public class Flipcoin 
{
	public static void main(String[] args) 
	{
	
	Utility u=new Utility();
	System.out.println("enter number of flip you want");
	int numtime=u.ipnumber();
	u.Flipcoin(numtime);

	
	}
}
