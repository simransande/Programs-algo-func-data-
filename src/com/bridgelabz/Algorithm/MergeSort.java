package com.bridgelabz.Algorithm;
import com.bridgelabz.utility.Utility;
public class MergeSort 
{
	public static void main(String args[])
	{
		int arr[];
		Utility u=new Utility();
		int n;
		System.out.println("Enter array size");
		n=u.ipnumber();
		arr=u.ipArray(n);
		//System.out.println("Given array:");
		//u.printArray(arr);
		int length;
		u.mergesort(arr, 0, arr.length-1);

		System.out.println("sorted array:");
		u.printArray(arr);
	}
}
