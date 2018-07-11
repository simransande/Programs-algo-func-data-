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
