package com.bridgelabz.function;

import com.bridgelabz.utility.Utility;

public class Gambler
{
	public static void main(String args[])
	{
		int trails;
	
		Utility u=new Utility();
		System.out.println("Enter the trails");
		trails=u.ipnumber();
	
		u.Gambler(trails);
		
		
	}
}
