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
