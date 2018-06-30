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
