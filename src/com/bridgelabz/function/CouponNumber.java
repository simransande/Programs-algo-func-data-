/******************************************************************************
  
 *  Purpose: Get the total random number needed to have all distinct numbers.
 *
 *  @author  Simran Sande
 *  @version 1.0
 *  @since   25-06-2018
 *
 ******************************************************************************/



package com.bridgelabz.function;

import com.bridgelabz.utility.Utility;

public class CouponNumber 
{
	
	public static void main(String args []) 
	{
	Utility u=new Utility();
	int num;
	System.out.println("Enter the number:");
	num=u.ipnumber();
	 int answer = u.CouponGenerate(num);
	System.out.println("the coupon numbers can generated are="+answer);
	}
	}