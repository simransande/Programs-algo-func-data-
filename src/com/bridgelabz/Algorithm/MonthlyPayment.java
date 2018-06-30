package com.bridgelabz.Algorithm;

import com.bridgelabz.utility.Utility;

public class MonthlyPayment 
{
	public static void main(String args[])
	{
		int P,Y,R;
		Utility u=new Utility();
		System.out.println("Enter the loan:");
		P=u.ipnumber();
		System.out.println("Enter the years:");
		Y=u.ipnumber();
		System.out.println("Enter the intrest:");
		R=u.ipnumber();
		u.MonthlyPayment(P,Y,R); 
		}

}
