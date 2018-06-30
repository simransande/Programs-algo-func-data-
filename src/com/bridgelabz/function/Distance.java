package com.bridgelabz.function;

import com.bridgelabz.utility.Utility;

public class Distance
{
	public static void main(String args[])
	{
    int x,y;
    Utility u=new Utility();
    System.out.println("Enter the value x");
    x=u.ipnumber();
    System.out.println("Enter the value y");
    y=u.ipnumber();
    double answer=u.distance(x,y);
    System.out.println("distance is"+answer);
     
	}
}
