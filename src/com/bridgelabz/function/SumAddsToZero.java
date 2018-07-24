/******************************************************************************
  
 *  Purpose: Find the triplets
 *
 *  @author  Simran Sande
 *  @version 1.0
 *  @since   25-06-2018
 *
 ******************************************************************************/



package com.bridgelabz.function;

import com.bridgelabz.utility.Utility;

public class SumAddsToZero 
{
	 
	 public static void main(String[] args) 
	 {

	    Utility u =new Utility();
	    System.out.println("Enter  array size:");
	    int n=u.ipnumber();					//input string
	    int array[]=u.ipArray(n);
	    u.sumzero(array,n);

}
}