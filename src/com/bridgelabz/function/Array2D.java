/******************************************************************************
  
 *  Purpose: 2D Array
 *
 *  @author  Simran Sande
 *  @version 1.0
 *  @since   25-06-2018
 *
 ******************************************************************************/




package com.bridgelabz.function;

import com.bridgelabz.utility.Utility;

public class Array2D 
{
	public static void main(String args[])
	{
	int row,column;
	Utility u=new Utility();
	System.out.println("Enter the siz of row");
	row=u.ipnumber();
	System.out.println("Enter the siz of column");
	column=u.ipnumber();
	
	
	u.Array2D (row,column);
	
}
	}
