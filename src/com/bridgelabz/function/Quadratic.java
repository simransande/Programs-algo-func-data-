package com.bridgelabz.function;

import com.bridgelabz.utility.Utility;

public class Quadratic
{
	public static void main(String args[])
	{
		int a,b,c;
		Utility u=new Utility();
		System.out.println("Enterthe value a");
		a=u.ipnumber();
		System.out.println("Enterthe value b");
		b=u.ipnumber();
		System.out.println("Enterthe value c");
		c=u.ipnumber();
		u.root(a,b,c);
	}
}
