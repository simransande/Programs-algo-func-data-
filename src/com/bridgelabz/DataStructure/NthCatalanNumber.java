package com.bridgelabz.DataStructure;
import java.util.Scanner;

public class NthCatalanNumber 
{
	   public static long fact(int i) 
	   {
	      if(i <= 1) 
	      {
	         return 1;
	      }
	      return i * fact(i - 1);
	      
	   }
	   public static void main(String args[]) 
	   {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number :");
	      int num = sc.nextInt();
	      
	      //(2n)!/(n+1)!*n!
	      long Cn = (fact(2*num))/(fact(num+1)*fact(num));
	      System.out.println("Catalan number :"+Cn);
	   }
	}



