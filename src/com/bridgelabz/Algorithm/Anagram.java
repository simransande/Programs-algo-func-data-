package com.bridgelabz.Algorithm;

import com.bridgelabz.utility.Utility;

public class Anagram
{
	public static void main(String args[])
	{
		String str1,str2;
		Utility u=new Utility();
		System.out.println("Enter the string1");
		str1=u.ipstring();
		String str3 = str1.replaceAll("\\s","");
		System.out.println("Enter the string2");
		str2=u.ipstring();
		String str4 = str2.replaceAll("\\s","");
		u.Anagram(str3,str4);
		
	}
}
