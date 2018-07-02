package com.bridgelabz.Algorithm;
import com.bridgelabz.utility.Utility;
public class TemperatureConversion
{

	public static void main(String args[])
	{
	      int temp;
	      Utility u= new Utility();
	      System.out.println("Enter the tempreture");
	      temp=u.ipnumber();
	      int txtemp=u.tempconv(temp);
	      System.out.println("your temp is" +txtemp);

	   }
	}

