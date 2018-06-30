package com.bridgelabz.function;

import com.bridgelabz.utility.Utility;

public class SumAddsToZero 
{
	 
	 public static void main(String[] args) 
	 {

	    Utility u =new Utility();
	    System.out.println("Enter  array size:");
	    int n=u.ipnumber();
	    int array[]=u.ipArray(n);
	    u.sumzero(array,n);

}
}