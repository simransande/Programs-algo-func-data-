package com.bridgelabz.Algorithm;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class InsertionSort
{
		public static void main( String[ ]  args )
		{

			Utility u=new Utility();
			System.out.println(  "Enter legth of string= "  );
			int s=u.ipnumber();
			String result[]=u.insertionsort(s);
			System.out.println(Arrays.toString(result));
		}
}
		

