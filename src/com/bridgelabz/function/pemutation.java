package com.bridgelabz.function;
import com.bridgelabz.utility.Utility;
public class pemutation 
{
	public static void main(String[] args) {
		
		Utility ut=new Utility();
		System.out.println("Enter a string to permute");
		String str = ut.ipstring();
	        int n = str.length();
	        ut.permute1(str, 0, n-1);
	}
}
