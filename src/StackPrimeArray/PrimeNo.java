package StackPrimeArray;

import com.bridgelabz.utility.Utility;

public class PrimeNo 
{
	
	
		public static void main(String[] args) {
		

			Utility u=new Utility();
			
			System.out.println("Prime numbers between 1-1000");
			
			
			int[] x = u.primeArray();
			u.stackPrimeAnagram(x);
		}



}
