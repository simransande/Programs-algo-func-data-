/******************************************************************************
  
 *  Purpose: Check if the arrays returned by two string functions are equal.
 *
 *  @author  Simran Sande
 *  @version 1.0
 *  @since   25-06-2018
 *
 ******************************************************************************/



package com.bridgelabz.function;
import com.bridgelabz.utility.Utility;
public class pemutation 
{
	public static void main(String[] args) {
		
		Utility u=new Utility();
		System.out.println("Enter a string to permute");
		String str = u.ipstring();
	        int n = str.length();
	        u.permute1(str, 0, n-1);
	}
}
