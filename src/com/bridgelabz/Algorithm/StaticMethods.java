package com.bridgelabz.Algorithm;

import com.bridgelabz.utility.Utility;

public class StaticMethods
{
	public static void main(String args[])
	{
		int option;
		Utility u=new Utility();
		System.out.println("1:binarySearch method for integer");
		System.out.println("2:binarySearch method for String");
		System.out.println("3:insertionSort method for integer");
		System.out.println("4:insertionSort method for String");
		System.out.println("5:bubbleSort method for integer");
		System.out.println("6:bubbleSort method for String");
		
		option=u.ipnumber();
		switch(option)
		{
		case 1:
		{
			System.out.println("What you want to search");
			int a=u.ipnumber();
			int s[]=u.ipArray(50);
			//u.WordSearchBinary(a,s);
		}
		
		}
	}
}
		 


