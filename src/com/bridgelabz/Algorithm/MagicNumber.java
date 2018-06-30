package com.bridgelabz.Algorithm;

import com.bridgelabz.utility.Utility;

public class MagicNumber 
{
	public static void main(String args[])
	{
			int no;
			int count=0;
			Utility u=new Utility();
			System.out.println("Enter N");
			 int N=u.ipnumber();
			String answer=null;
			int lowerbound=0;
			int upperbound=N;
			int middle=(upperbound+lowerbound)/2;
			u.magicno(N,lowerbound,upperbound,middle);
			
			
	}
}
