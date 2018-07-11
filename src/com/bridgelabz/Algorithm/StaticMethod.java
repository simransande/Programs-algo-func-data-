package com.bridgelabz.Algorithm;



	import java.lang.reflect.Array;
	import java.util.Arrays;

	import com.bridgelabz.utility.Utility;

	public class StaticMethod 
	{
		
	   public static void main(String args[])
	   {
		   int choice;
		   Utility u= new Utility();
		   System.out.println("Enter your choice");
		   System.out.println("1.BinarySearch method for Integer");
		   System.out.println("2.BinarySearch method for String");
		   System.out.println("3.InsertionSort method for integer");
		   System.out.println("4.InsertionSort method for String");
		   System.out.println("5.BubbleSort method for integer");
		   System.out.println("6.BubbleSort method for String");
		   choice=u.ipnumber();
		   switch(choice)
		   {
		   case 1:
		   {
			   int array[]= {1,2,3,4,5,6,7,8,9};
			   array=u.bubblesort(array);
			   System.out.println("Enter the integer you want to search");
			   int number=u.ipnumber();
			   boolean result=u.binarysearchInt(array,number);
			   if(result==true)
			   {
				   System.out.println("The integer is found");
			   }else
				   System.out.println("The integer is not found");
			   break;
		   }
		   case 2:
		   {
			   
			String str[]= {"a","b","c","d","f","z"};
			str=u.insertionsort(str, 6);
			System.out.println("Enter the string you want to search");
			String str1=u.ipstring();
			boolean result=u.binarysearchStr(str,str1);
			if(result==true)
			{
				System.out.println("The string is found");
			}else
				System.out.println("The string is not found");
			break;
		   }
		   case 3:
		   {
			    int data;
			    System.out.println("Enter Array size");
			    data=u.ipnumber();
			    int[] input=u.ipArray(data);
			    int[] result=u.insertionsortInt(input,data);
			   // System.out.println(Arrays.toString(input));
			    break;
		   }
		   case 4:
		   {
			    int data;
			    System.out.println("Enter string element size");
			    data=u.ipnumber();
			    String[] input=u.getString(data);
			    String[] result=u.insertionsort(input,data);
			   // System.out.println(Arrays.toString(input));
			    break;
		   }
		   case 5:
		   {
			    int arr[];
				System.out.println("Enter size of your array");
				int a=u.ipnumber();
				arr=u.ipArray(a);
				u.bubblesort(arr);
				break;
		   }
		   case 6:
		   {
			    String arr[];
				System.out.println("Enter size of your string");
				int a=u.ipnumber();
				arr=u.getString(a);
				u.bubblesortStr(arr);
				break;
		   }
		   }
		   
	   }
	}

