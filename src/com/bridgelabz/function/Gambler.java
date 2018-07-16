package com.bridgelabz.function;

import com.bridgelabz.utility.Utility;

public class Gambler
{
	public static void main(String args[])
	{
		int trails;
		int stake;
		int goal;
	
		Utility u=new Utility();
		System.out.println("Enter the trails");
		trails=u.ipnumber();
		System.out.println("Enter the stake");
		stake=u.ipnumber();
		System.out.println("enter the goals");
		goal=u.ipnumber();
		u.Gambler(trails,stake,goal);
		
		
	}
}
