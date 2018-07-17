package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import DSbanking.Queue;
import Regex.userdetails;
import StackPrimeArray.StackPrimeAnagram;

public class Utility {
	BufferedReader br;
	private final String NAME = "<<name>>";
	private final String FULLNAME = "<<full name>> ";
	private final String MOBILE_NO = "xxxxxxxxxx";
	private final String DATE = "2017/06/30 10:50:55";
	private static final char[] Array2D = null;
	private static final String MagicNumber = null;
	private static final int String = 0;
	static Random rand = new Random();
	static Scanner scanner = new Scanner(System.in);

	public static String ipstring() {
		return scanner.next();
	}

	public static int ipnumber() {

		return scanner.nextInt();
	}

	public int[] ipArray(int n) {
		int Array[] = new int[n];
		System.out.println("enter your array");
		for (int i = 0; i < n; i++) {

			Array[i] = ipnumber();
		}
		return Array;
	}

	public static int getrandomInt() {

		return rand.nextInt();
	}

	public static double getrandomdouble() {

		return rand.nextDouble();
	}

	public static boolean getrandomboolean() {

		return rand.nextBoolean();
	}

	public static int getprime(int i) {
		int x;

		for (x = 2; x < i; x++) {
			if (i % x == 0) {
				break;
			}
		}
		if (i == x) {
			return x;

		}

		return 0;

	}

	// [1] StringReplace
	public static void replacestring() {
		String username = "<user name>";

		System.out.println("enter username");
		String name = ipstring();
		username = username.replaceAll(username, name);
		try {
			int x = Integer.parseInt(username);
			System.out.println("inValid input use only string");
		} catch (NumberFormatException e) {
			System.out.println("hello " + username + " , How are you?");
		}
	}

	// [2] flipcoin
	public static void Flipcoin(int numtime) {
		int headcount = 0, tailcount = 0;
		double per1, per2;
		for (int i = 0; i < numtime; i++) {
			double val = getrandomdouble();
			if (val < 0.5) {
				tailcount++;
			} else
				headcount++;
		}
		per1 = (double) tailcount / numtime * 100;
		per2 = (double) headcount / numtime * 100;
		System.out.println("percentage of tailcount is" + per1);
		System.out.println("percentage of headcount is" + per2);
	}

	// [3] LeapYear
	public static boolean leapyear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} else
					return false;
			} else
				return true;

		} else
			return false;
	}

	// [4] pow2
	public void power(int number)

	{
		int power = 1;
		for (int i = 1; i <= number; i++) {
			power = power * 2;
			System.out.println("2^" + i + "=" + power);
		}

	}

	// [5] Harmonic
	public void harmonic(int number) {
		double num = 0.0;
		for (int i = 1; i <= number; i++) {
			num = num + (1.0 / i);
			System.out.println("1/" + i + "=" + num);
		}
	}

	// [6] PrimeFactor
	/*
	 * public void primefactors(int number) 
	{
		System.out.println("Prime factors are");
		int factor,n,j;
		for(int i=2;i<=number;i++)
		{
			n=i;
			for(j=2;j<=n;j++)
			{
				if(n%j==0)
				{
					break;
				}
			}
			
			if(j==n);
			{
				if(number%n==0)
				{
					System.out.println(n);
				}
			}
		}
	}
	 */
	
	public void Primefact(int number) 
	{
		int fact;
		int j;
		int f = 0;
		for (int i = 2; i < number; i++) 
		{
			int n = i;
			for (j = 2; j <= n; j++)
			{
				if (n % j == 0)
				{
					break;
				}
			}
			if (j == n) 
			{
				if (number % n == 0)
				{
					System.out.println(n);
					f++;
				}
			}
	}
	if (f == 0) 
		{
			System.out.println("prime factror is its own number that is :" + number);
		}
	}

	// [7] Gambler
	public void Gambler(int trails, int stake, int goal) 
	{
		
		int cash = 0;
		int loss = 0;
		int wins = 0;
		int t;
		
		if(cash>=goal)
		{
		for ( t = 0; t < trails; t++) 
		{
			cash = stake;
			while (cash > 0 && cash < goal) 
			{
				
				if (Math.random() < 0.5)
					cash++;
				else
					cash--;
			}
			if (cash == goal) 
			{
				wins++;
				//System.out.println(wins);
			}
			else
				
			{
				loss++;
			}
		
			//System.out.println(wins + "wins of" + trails);
			System.out.println("percent of games won=" + 100.0 * wins / trails);
			System.out.println("percent of games loss=" + 100.0 * loss / trails);
			}
		}
		else
		{
		System.out.println("cash is maximum plz entered valis ammount");
		}
		
	}
		



	// [8] CouponNumber
	
	/*
	 * public int generatecoupon(int number) 
	{
			boolean[] isCollected=new boolean[number];
			int different=0;
			int count=0;
			while(different<number)
			{
				int value=(int)(Math.random()*number);
				count++;
				if(!isCollected[value])
				{
					different++;
					isCollected[value]=true;
				}
			
			}
		return count;

	 */
	public int CouponGenerate(int num)
	{
		boolean[] isCollected = new boolean[num];
		int f = 0;
		int count = 0;
		while (f < num)
		{
			int value = (int) (Math.random() * num);
			// System.out.println("value"+value);

			count++;
			if (!isCollected[value]) 
			{
				f++;
				isCollected[value] = true;
			}

		}
		return count;
	}

	// [9] Array2D
	public void Array2D(int row, int column) {
		int x[][] = new int[row][column];
		System.out.println("enter the value of 2D array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				x[i][j] = ipnumber();
			}
		}
		System.out.println("2D array in matrix are");
		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(x[i][j] + " ");
				
			}
			 System.out.println("");
		}
	}

	// [10] SumAddsToZero
	public void sumzero(int[] array, int n) 
	{
		int f = 0;
		for (int i = 0; i < n - 2; i++)
		{
			for (int j = i + 1; j < n - 1; j++) 
			{
				for (int k = j + 1; k < n; k++) 
				{
					if (array[i] + array[j] + array[k] == 0) 
					{
						System.out.println("Triplet is " + array[i] + " " + array[j] + " " + array[k]);
				f++;
					}
				}
			}
		}
		if (f == 0)
		{
			System.out.println("There are no Triplets in this");
		}		
	}
	

	// [11] Distance
	public double distance(int x, int y) {
		double dis = (double) (Math.pow(x, 2) + Math.pow(y, 2));
		double OrignDistance = (double) (Math.sqrt(dis));
		return OrignDistance;
	}

	// [15] Quadratic
	public void root(int a, int b, int c) {
		double delta = (b * b) - (4 * a * c);
		int Firstroot = (int) ((-b + Math.sqrt(delta)) / 2 * a);
		int Secondroot = (int) ((-b - Math.sqrt(delta)) / 2 * a);
		System.out.println("First sqare root is " + Firstroot);
		System.out.println("Second sqare root is " + Secondroot);
	}

	// [16] WindChill
	public void Windchill(int t, int v) {
		double power = (double) (Math.pow(v, 0.18));
		double w = 35.74 + (0.6215 * t) + ((0.4275 * t) - 35.75) * power;
		System.out.println("WInd speed is" + w);

	}

	// [1] Anagram
	public void Anagram(String array, String array2) {
		String str1 = array, str2 = array2;
		int l1 = str1.length();
		int l2 = str2.length();

		char arr1[] = str1.toLowerCase().toCharArray();
		char arr2[] = str2.toLowerCase().toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("strings are anagram");

		} else
			System.out.println("strings not anagram");

	}

	// [2] Prime numbers
	public static int Primenumber() 
	{
		int x, i, f;
		System.out.println("Prime Number List = ");
		for (x = 1; x <= 1000; x++) {
			f = 0;

			for (i = 2; i < x; i++) {
				if (x % i == 0) {

					f = 1;
					break;
				}
			}
			if (x == i) {
				System.out.print(x + "\t");
				int [] newArray = new int[x];
			}
			
		}
		    return 0;
	}

	// [3] PRime Anagram and Palindrom
	public int PrimeAnagramAndPalindrome()

	{
		System.out.println("1.Palindrome Prime numbers are:");
		System.out.println("2.Anagram Prime numbers are:");
		int x, i, f = 0;
		int choice=ipnumber();
		switch(choice)
		{
		case 1:
			
			//System.out.println("Prime Number List = ");
			for (x = 1; x <= 1000; x++) {
				f = 0;

				for (i = 2; 	i < x; i++) {
					if (x % i == 0) {

						f = 1;
						break;
					}
				}
				if (x == i) 
					{
					{
						int no = x;
						int s = 0;

						while (no > 0) {
							int r = no % 10;
							s = s * 10 + r;
							no = no / 10;
						}
						if (x == s) {
							System.out.print(x + "\t");
						}
					}
					}
			}
			
			break;
			
	
			case 2:
				
			System.out.println("angrams of prime numbers are:");
			int[] a = null;
			int n = 0;
			//int result=isPrime(a,n);
				
			break;
		
					}	
		return f;


}
	
	public static boolean isPrime (int number) {
		  
	     for(int i=2; i<=number/2; i++){
	         if(number % i == 0){
	             return false;
	         }
	     }
	     return true;
	    }
	//Method for Prime Numbers
	    public static int[] primeNumbers(int n)
	    {
	            int a[]=new int[n];int k=0;
	            for(int i=0;i<n;i++)
	            {
	                if(isPrime(i))
	                {
	                    a[k]=i;
	                    k++;
	                }
	            }
	            int len=0;
	            for (int i=0; i<a.length; i++)
	                {
	                    if (a[i] != 0)
	                        len++;
	                }
	               
	                int [] newArray = new int[len];
	                int j=0;
	                for (int i=0; i<a.length; i++)
	                {
	                    if (a[i] != 0) {
	                        newArray[j] = a[i];
	                        j++;
	                    }
	                }
	                System.out.println();
	              
	              /*  for (int integer : newArray) {
	                    System.out.println(integer);
	                } */
	            return newArray;
	           
	       
	    }

	//Method to display array
	    public static void display(int array[])
	    {
	       
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i]+" ");
	        }
	        System.out.println();
	    }

	//Method to find prime anagram
	    public static boolean FindAnagram(int[] out) {
	        int len=out.length;
	       boolean status=false;
	        for(int i=0;i<len;i++)
	        {
	            for(int j=i+1;j<len;j++)
	            {
	                //System.out.println(out[i]+" "+out[j]);
	          //  status=	 AnagramInteger(out[i],out[j]);
	           
	            }
	        }
	       return status;
	    }
	//Method to display anagram
	    public static void displayangaram(boolean status) {
			if(status)
			{
				System.out.println("Is Anagram");
			}
			else
				System.out.println("Is Not Anagram");
		}
	//Method for integer anagram
	  //  public static boolean AnagramInteger(int n1, int n2) {
	   
	    //    String num1=String.valueOf(n1);
	     //   String num2=String.valueOf(n2);
	     //  boolean status= Anagram(num1, num2);
	      // return status;
	    
	// [5] Magic number
	public void magicno(int N, int lowerbound, int upperbound, int middle) {
		System.out.println("Is your number :" + middle);
		System.out.println("Enter your anser yes or high or low");
		String ans = scanner.next();
		int i;
		int count = 0;
		for (i = 0; i < N; i++) {
			if (ans.equals("high")) {
				lowerbound = middle;
				count++;
			} else if (ans.equals("yes")) {
				System.out.println("the number you thought:" + middle);
				int no1 = count + 1;
				System.out.println("it takes " + no1 + " times to find your no");
				break;
			} else if (ans.equals("low")) {
				upperbound = middle;
				count++;
				// System.out.println(count);
			}
			if (count < N) {
				middle = (lowerbound + upperbound) / 2;
				System.out.println("is your anwer" + middle);
				ans = scanner.next();
			}
		}
	}

	// [7] Insertion Sort
	public String[] insertionsort(int s) {
		String arr[] = new String[s];
		System.out.println("enter elements in strings");
		for (int k = 0; k < s; k++) {
			arr[k] = scanner.next();
		}
		int n;
		String temp;
		for (int i = 1; i < s; i++) {
			temp = arr[i];
			int j = i - 1;
			while (j >= 0) {
				if (temp.compareTo(arr[j]) > 0) {
					break;
				}
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
			System.out.println(Arrays.toString(arr));
		}
		return arr;
	}

	public String[] insertionsortSrting(String[] s) {
		int n = s.length;
		String temp;
		System.out.println(Arrays.toString(s));
		for (int i = 1; i < n; i++) {
			temp = s[i];
			int j = i - 1;
			while (j >= 0) {
				if (temp.compareTo(s[j]) > 0) {
					break;
				}
				s[j + 1] = s[j];
				j--;
			}
			s[j + 1] = temp;
			long[] arr;
			System.out.println(Arrays.toString(s));
		}
		return s;
	}

	// [8] Bubble sort
	public void bubblesort(int n) {
		int i, j;
		int str[] = new int[n];
		System.out.println("Enter numbers in array");
		for (i = 0; i < n; i++) {
			str[i] = scanner.nextInt();
		}
		int temp;

		for (i = 0; i < n - 1; i++) {

			for (j = 0; j < n - i - 1; j++) {
				if (str[j] > str[j + 1]) {
					temp = str[j];
					str[j] = str[j + 1];
					str[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted number list   = ");
		for (i = 0; i < n; i++) {
			System.out.println(str[i]);
		}
	}

	public void bubblesortstring(int[] s) {
		int n = s.length;
		System.out.println(Arrays.toString(s));
		for (int i = 0; i < n; i++) {
			int temp = s[i];
			int[] str = null;
			for (i = 0; i < n - 1; i++) {

				for (int j = 0; j < n - i - 1; j++) {
					if (str[j] > str[j + 1]) {
						temp = str[j];
						str[j] = str[j + 1];
						str[j + 1] = temp;
					}
				}
			}
			System.out.println(Arrays.toString(s));
			for (i = 0; i < n; i++) {
				System.out.println(str[i]);
			}
		}
	}

	// [11] Day of week

	public static int dayOfWeek(int d, int m, int y) {
		// System.out.println("Entered date is : " + month + "/" + date + "/" +
		// year);
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12) % 7;
		return d0;
	}

	// [12] Temperature conversion
	public int tempconv(int temp) {
		int choice;
		int F = 0;
		System.out.println(" 1 to convert into Celsius");
		System.out.println(" 2 to convert into Fahrenheit");
		choice = ipnumber();
		switch (choice) {
		case 1:
			F = (temp * 9 / 5) + 32;
			break;
		case 2:
			F = (temp - 32) * 5 / 9;
			break;
		default:
			System.out.println("Enter the correct conditon");
		}
		return F;
	}

	// [13] Monthly payment
	public void MonthlyPayment(double P, double Y, double R) {
		double n;
		double R1;
		double payment;
		n = 12 * Y;
		R1 = R / (12 * 100);
		payment = (P * R1) / (1 - (Math.pow((1 + R1), -n)));
		System.out.println("MOnthly payment you have =" + payment);

	}

	// [14] sqrt number
	public void SqrtNonNega(double c) {
		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;
		}

		System.out.println(t);
	}

	// [15] dec to binary
	public String Binary(int m) {
		String x = "";
		String y = "";
		int a;
		int count = 0;

		while (m > 0)
		{
			a = m % 2;
			if (a == 1)

			{
				count++;
			}

			x = x + "" + a;
			m = m / 2;
		}
		for (int i = x.length() - 1; i >= 0; i--) 
		{
			y = y + x.charAt(i);
		}
		System.out.println(y);
		return y;
	}

	public void WordSearchBinary(String search, String[] array) {

		try {
			Scanner sc = new Scanner(System.in);
			File f = new File("file.txt");

			if (!f.exists()) {
				System.out.println("file.txt file is unavailable.... ");

			} else {
				System.out.println("available");
			}

			FileReader in = new FileReader(f);
			BufferedReader br = new BufferedReader(in);

			int i = 0;
			String str = "";
			String data = "";

			while ((str = br.readLine()) != null) {
				data = data + str;
			}
			int c;
			System.out.println("String Array Before Buuble Sort =" + array.length);
			for (c = 0; c < array.length; c++) {
				System.out.print(array[c] + "\t");
			}
			// String[] a=bubblesorts(array);
			// String[] a=insertionsort(array);
			System.out.println("\n\nString Array After Insertion Sort =");
			for (c = 0; c < array.length; c++) {
				System.out.print(array[c] + "\t");
			}

		} catch (Exception e) {
			System.out.print("Error = " + e);
		}

	}

	// [1] unordered
	public void unorderd()

	{
		Scanner sc = new Scanner(System.in);

		try {
			File f = new File("Word.txt");

			if (!f.exists()) {
				System.out.println("Word.txt file is unavailable.... ");

			}

			FileReader in = new FileReader(f);
			BufferedReader br = new BufferedReader(in);

			int i = 0;
			String str = "";
			String data = "";

			while ((str = br.readLine()) != null) {
				data = data + str;
			}
			// System.out.println("data = "+data);
			String x[] = data.split(" ");

			LinkedList ob = new LinkedList();
			for (i = 0; i < x.length; i++) {
				ob.add(x[i]);
				// System.out.println( x[ i ] );
			}

			Iterator<String> il = ob.iterator();

			while (il.hasNext()) {
				System.out.println(il.next());
			}

			String word;
			System.out.println("enter word for searching in files list = ");
			word = sc.next();

			if (ob.contains(word)) {
				// System.out.println("word is found in list ");
				ob.remove(word);
			} else {
				System.out.println("word is not found in list ");
				ob.add(word);
			}

			System.out.println("data after opeartion  ");
			il = ob.iterator();

			while (il.hasNext()) {
				System.out.println(il.next());
			}

		} catch (Exception e) {
			System.out.println("error = " + e);
		}
	}

	// [2] ordered list

	public void OrderdList() {

		int x[] = new int[1000];
		int size, i;

		Scanner sc = new Scanner(System.in);
		try {
			File f = new File("number.txt");

			if (!f.exists()) {
				System.out.println("number.txt file is unavailable.... ");
				return;
			}
			FileReader in = new FileReader(f);
			BufferedReader br = new BufferedReader(in);
			i = 0;
			String str = "";
			while ((str = br.readLine()) != null) {
				x[i] = Integer.parseInt(str);
				System.out.println(x[i]);
				i++;
			}

			size = i;
			LinkedList ob = new LinkedList();
			for (i = 0; i < size; i++) {
				ob.add(x[i]);
				System.out.println(x[i]);
			}

			Collections.sort(ob);

			Iterator<Integer> il = ob.iterator();

			while (il.hasNext()) {
				System.out.println(il.next());
			}

			int num;

			System.out.println("enter new number = ");
			num = sc.nextInt();
			int pos = ob.indexOf(num);

			if (pos != -1) {
				ob.remove(pos);
				System.out.println("number found in lis, list after poping = ");
				il = ob.iterator();
				while (il.hasNext()) {
					System.out.println(il.next());
				}
			} else {
				ob.add(num);
				Collections.sort(ob);
				System.out.println("number found in lis, list after adding = ");
				il = ob.iterator();
				while (il.hasNext()) {
					System.out.println(il.next());
				}
			}

		} catch (Exception e) {
			System.out.println("error = " + e);
		}
	}

	// [5] Palindrome
	public void palindrome(String str) {

		Deque<Character> dequeA = new LinkedList<Character>();

		for (int i = 0; i < str.length(); i++) {
			dequeA.add(str.charAt(i));
		}

		/*
		 * System.out.println("string is = "); Iterator iterator =
		 * dequeA.iterator( ); while( iterator.hasNext( ) ) {
		 * System.out.println( (char) iterator.next( ) ); }
		 */

		char front, rear;
		int f = 0;

		do {
			front = (char) dequeA.removeFirst();
			// System.out.println( front ) ;
			if (dequeA.isEmpty()) {
				break;
			}
			rear = (char) dequeA.removeLast();
			// System.out.println( rear);
			if (front != rear) {
				f = 1;
				break;
			}

		} while (!dequeA.isEmpty());

		// System.out.println( dequeA.removeFirst( ) ) ;
		// System.out.println( dequeA.removeLast() );
		if (f == 1) {
			System.out.println("strings is not palindrome");
		} else {
			System.out.println("strings is palindrome");
		}
	}

	// [8] calender
	public static boolean isleapyear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} else
					return false;
			} else
				return true;
		} else
			return false;
	}

	public static int day(int month, int day, int year) {
		int y = year - (14 - month) / 12;
		int x = y + y / 4 - y / 100 + y / 400;
		int m = month + 12 * ((14 - month) / 12) - 2;
		int d = (day + x + (31 * m) / 12) % 7;
		return d;

	}

	// [4] banking
	public void UtilityBanking(Queue q, int balance, int person) {
		int count = 0;
		while (count < person) {
			boolean flag;
			System.out.println("Bank Counter");
			do {
				System.out.println();

				System.out.println("1.Deposit");
				System.out.println("2.Withdraw");
				System.out.println("3.check Current Balance is ");
				System.out.println("4.Number of person in queue");
				System.out.println("5.Dequeue");
				System.out.println("6.Enqueue");
				System.out.println("Enter your choice");
				int choice = ipnumber();
				switch (choice) {

				case 1:
					System.out.println("Enter the amt to deposit");
					int amt = ipnumber();
					balance = balance + amt;
					System.out.println("Balance is " + balance);
					break;

				case 2:
				{
					System.out.println("Enter the amt to withdraw");
					int withdrawal = ipnumber();
					if (withdrawal < balance) 
					{

						balance = balance - withdrawal;
						System.out.println("Balance is " + balance);
					}
					class QNode {
						public int data;

						public QNode next;

						public QNode(int data) {

							this.data = data;
							this.next = null;
						}
					}
					if(balance<500)
					{
						System.out.println("Insufficient balance");
					}
				}// else { System.out.println("Insufficient balance"); }
					  break;
				
				case 3:
					System.out.println("Current balance is " + balance);
					break;

				case 4:
					int number = q.sizeOfQue();
					System.out.println("Number of person in Queue" + " " + number);
					break;

				case 5:
					q.deQue();
					number = q.sizeOfQue();
					System.out.println("Number of person in Queue" + " " + number);
					break;

				case 6:
					q.enQue();
					number = q.sizeOfQue();
					System.out.println("Number of person in Queue" + " " + number);
					break;

				default:
					System.out.println("Invalid choice");
					break;

				}
				System.out.println("Do you want to continue the transaction");
				System.out.println("Press true or false");

				flag = scanner.nextBoolean();
			} while (flag);
			q.deQue();
		}

	}
	/*
	 * public int calenderqueue(int month, int year,int day) { int y = year -
	 * (14 - month) / 12; int x = y + y/4 - y/100 + y/400; int m = month + 12 *
	 * ((14 - month) / 12) - 2; int d = (day + x + (31*m)/12) % 7; return d;
	 */

	public int calenderqueue(int month, int year, int day) {
		int y = year - (1 - month) / 12;
		int x = y + y / 4 - y / 100 + y / 400;
		int m = month + 12 * ((14 - month) / 12) - 2;
		int d = (day + x + (31 * m) / 12) % 7;
		System.out.println(d + "");
		return d;
		/*
		 * double y0; double x; double m0; int day; y0 = y-(1 -m) / 12; x = y0 +
		 * y0/4-y0/100 + y0/400; m0 = m+12*((14-m)/12)-2; day = (int) ((d + x +
		 * 31*m0/12)%7); System.out.print(day+" "); return day;
		 */
	}

	public Date printDate(String string) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		try {
			String date;

			return (Date) dtf.parse(date = null);
		}

		catch (Exception e) {
			return null;
		}
	}
	/*
	 * public String getCurrentDate(Date date) {
	 * 
	 * DateTimeFormatter dtf =
	 * DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); try{ String date;
	 * return sdf.parse(date=null); } catch(Exception e) { return null; }
	 * LocalDateTime now = LocalDateTime.now(); //
	 * System.out.println(dtf.format(now)); return dtf.format(now); }
	 * 
	 */
	/*
	 * public void binarysearch(int search, int[] array) { Scanner sc = new
	 * Scanner( System.in );
	 * 
	 * try { File f = new File( "file.txt" );
	 * 
	 * if( !f.exists() ) {
	 * System.out.println("file.txt file is unavailable.... ");
	 * 
	 * } else { System.out.println("file available"); } FileReader in = new
	 * FileReader( f ); BufferedReader br = new BufferedReader( in );
	 * 
	 * int c, first, last, middle, pos , n = 10 ; //Arrays.sort( array );
	 * 
	 * bubblesortstring( array );
	 * 
	 * pos = 0;
	 * 
	 * first = 0; last = n - 1; middle = (first + last)/2; while( first <= last
	 * ) { if ( array[middle] < search ) { first = middle + 1; } else if (
	 * array[middle] == search ) { pos = middle+1; System.out.println(search +
	 * " found at location " + pos ); break; } else { last = middle - 1; }
	 * middle = (first + last)/2; } if ( first > last ) {
	 * System.out.println(search + " not found in list" ); } }
	 * 
	 * catch( Exception e ) { System.out.println("error = "+e); } }
	 * 
	 * }
	 */

	// Permutation of string
	public void permute1(String str, int l, int r) {
		if (l == r) {
			System.out.println(str);

		} else {
			for (int i = l; i <= r; i++)

			{
				str = swap1(str, l, i);
				permute1(str, l + 1, r);
				str = swap1(str, l, i);
			}
		}
	}

	public String swap1(String a, int i, int j) {
		char temp;
		String str11 = "";
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		for (int k = 0; k < charArray.length; k++)
			str11 = str11 + charArray[k];
		return str11;
	}

	public String replaceString(userdetails userDetails, String message) 
	{
		Pattern p = Pattern.compile(NAME);
		Matcher m = p.matcher(message);
		message = m.replaceAll(userDetails.getfName());

		p = Pattern.compile(FULLNAME);
		m = p.matcher(message);
		message = m.replaceAll(userDetails.getfName() + " " + userDetails.getlName());

		p = Pattern.compile(MOBILE_NO);
		m = p.matcher(message);
		message = m.replaceAll(userDetails.mobileNo());

		p = Pattern.compile(DATE);
		m = p.matcher(message);
		message = m.replaceAll(userDetails.date());

		return message;
	}

	public String getCurrentDate(Date date) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		// System.out.println(dtf.format(now));
		return dtf.format(now);
	}

	public String getFileText(String fileName) {

		try {
			FileReader f = new FileReader(fileName);
			br = new BufferedReader(f);
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			return sb.toString();
		} catch (Exception e) {
			return null;
		} finally {
			try {

				br.close();
			} catch (IOException e) {
			}
		}
	}

	public static int[] primeArray() {

		int z = 0;
		int primes[] = new int[500];
		for (int i = 0; i < 1000; i++) {
			int x = Primenumber();
			if (x != 0) {
				primes[z] = x;
				z++;
			}

		}
		return primes;// TODO Auto-generated method stub

	}

	public boolean AnagramBoolean(String str1, String str2) {
		str1 = str1.replaceAll("\\s", " ");
		str2 = str2.replaceAll("\\s", " ");
		int l1 = str1.length();
		int l2 = str2.length();
		if (l1 != l2) {
			return false;
			// System.out.println("Please enter equal length string for checking
			// they are angaram or not..");

		}

		char arr1[] = str1.toLowerCase().toCharArray();
		char arr2[] = str2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if (Arrays.equals(arr1, arr2)) {
			return true;
		}
		return false;
	}

	public static int[] getprimeArray() {
		int z = 0;
		int primes[] = new int[500];
		for (int i = 0; i < 1000; i++) {
			int x = getprime(i);
			if (x != 0) {
				primes[z] = x;
				z++;
			}

		}
		return primes;
	}

	public boolean chackAnageam(String str1, String str2) {

		str1 = str1.replaceAll("\\s", " ");
		str2 = str2.replaceAll("\\s", " ");
		int l1 = str1.length();
		int l2 = str2.length();
		if (l1 != l2) {
			return false;
			// System.out.println("Please enter equal length string for checking
			// they are angaram or not..");

		}

		char arr1[] = str1.toLowerCase().toCharArray();
		char arr2[] = str2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if (Arrays.equals(arr1, arr2)) {
			return true;
		}
		return false;
	}

	// Merge Sort[9]----print array,mergesort,merge
	public void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++)
			System.out.println(arr[i]);
		System.out.println();
	}

	public void mergesort(int[] arr, int lower, int upper) {
		if (lower < upper) {
			int middle = (lower + upper) / 2;
			mergesort(arr, lower, middle);
			mergesort(arr, middle + 1, upper);
			merge(arr, lower, middle, upper);
		}
	}

	private void merge(int[] arr, int lower, int middle, int upper) {
		// TODO Auto-generated method stub
		int n1 = middle - lower + 1;
		int n2 = upper - middle;
		int l[] = new int[n1];
		int r[] = new int[n2];
		for (int i = 0; i < n1; ++i)
			l[i] = arr[lower + i];
		for (int j = 0; j < n2; ++j)
			r[j] = arr[middle + 1 + j];
		int i = 0, j = 0;
		int k = lower;
		while (i < n1 && j < n2) {
			if (l[i] <= r[i]) {
				arr[k] = l[i];
				i++;
			} else {
				arr[k] = r[j];
				j++;
			}
			k++;
			while (i < n1) {
				arr[k] = l[i];
				i++;
				k++;
			}
			while (j < n2) {
				arr[k] = r[j];
				j++;
				k++;
			}
		}
	}

	/*
	 * private void quePrimeAna(int[] x) { QuePrimeAnagram qp = new
	 * QuePrimeAnagram(); for (int i = 0; i < x.length; i++) { if (x[i] != 0) {
	 * qp.enQue(x[i]); } } for (int i = 0; i < x.length; i++) { //qp.deQue();
	 * //System.out.println(qp.deQue().data); } }
	 * 
	 * 
	 * }
	 * 
	 * public Object QNode(int data) { public int data; public QNode next;
	 * public Object QNode1(int data) { this.data = data; this.next = null; }
	 * 
	 * }
	 * 
	 */
	// -------------------------------------
	public boolean binarysearchInt(int[] array, int number) {
		int upper = array.length;
		int lower = 0;
		int x = array.length;
		int middle = (upper + lower) / 2;
		for (int i = 0; i < array.length; i++) {
			if (number > array[middle]) {
				lower = middle;
			} else if (number == array[middle]) {
				return true;
			} else if (number < array[middle]) {
				upper = middle;
			}
			while (x > 0) {
				middle = (upper + lower) / 2;
				x--;
				break;
			}
		}
		return false;
	}

	public boolean binarysearchStr(String[] str, String str1) {
		int upper = str.length;
		int lower = 0;
		int x = str.length;
		int middle = (upper + lower) / 2;
		for (int i = 0; i < str.length; i++) {
			if (str1.compareTo(str[middle]) > 0) {
				lower = middle;
			} else if (str1.equals(str[middle])) {
				return true;
			} else if (str1.compareTo(str[middle]) < 0) {
				upper = middle;
			}
			while (x > 0) {
				middle = (upper + lower) / 2;
				x--;
				break;
			}
		}
		return false;
	}

	public int[] insertionsortInt(int[] input, int data) {
		int i, j;
		int key;
		System.out.println(Arrays.toString(input));
		for (j = 1; j < data; j++) {
			key = input[j];
			i = j - 1;
			while (i >= 0) {
				if (key > input[i]) {
					break;
				}
				input[i + 1] = input[i];
				i--;
			}
			input[i + 1] = key;
			System.out.println(Arrays.toString(input));
		}
		return input;
	}

	public void bubblesortStr(String[] arr) {

		int i, j;
		int n = arr.length;
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - i - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted array is = ");
		for (i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

	}

	public int[] bubblesort(int[] arr) {
		int i, j;
		int n = arr.length;
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted array is = ");
		for (i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		return arr;
	}

	public String[] insertionsort(String[] input, int data) {
		int i, j;
		String key;
		System.out.println(Arrays.toString(input));
		for (j = 1; j < data; j++) {
			key = input[j];
			i = j - 1;
			while (i >= 0) {
				if (key.compareTo(input[i]) > 0) {
					break;
				}
				input[i + 1] = input[i];
				i--;
			}
			input[i + 1] = key;
			System.out.println(Arrays.toString(input));
		}
		return input;
	}

	public String[] getString(int data) {
		String string[] = new String[data];
		System.out.println("enter your string");
		for (int i = 0; i < data; i++) {

			string[i] = ipstring();
		}
		return string;
	}

	public void stackPrimeAnagram(int[] x) {
		StackPrimeAnagram st = new StackPrimeAnagram();
		for (int i = 0; i < x.length; i++) {
			if (x[i] != 0) {
				st.push(x[i]);
			}
		}
		System.out.println("Anagram present in the Stack are : ");
		for (int i = 0; i < x.length; i++) {
			int temp = st.pop();
			if (temp != 0) {
				System.out.println(temp);
			}
		}
	}

	// Stock report [3]
	public static FileReader fileRead(String string2) {

		FileReader f = null;
		try {
			f = new FileReader(string2);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		return f;

	}

	public static void stockReport(FileReader fileRead)
			throws IOException, ParseException, org.json.simple.parser.ParseException {
		JSONParser parse = new JSONParser();
		int total = 0;
		JSONObject object = (JSONObject) parse.parse(fileRead);
		// System.out.println(object);
		Iterator iterator = object.keySet().iterator();
		while (iterator.hasNext()) {
			String topkey = (String) iterator.next();
			JSONObject obj = (JSONObject) object.get(topkey);
			System.out.println("Company name:" + topkey);
			long price = (Long) obj.get("Price");
			long num = (Long) obj.get("NumShare");
			total += price * num;

			System.out.println("Price:" + price);
			System.out.println("Number Of Shares:" + num);
			System.out.println("Total Stock is:" + price * num);
			System.out.println();
		}
		System.out.println("Total amount of shares is:" + total);
	}

	// Rice pulses and wheat report (inventory management) [1]

	public static FileReader fileRead1(String string2) {

		FileReader f = null;
		try {
			f = new FileReader(string2);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		return f;

	}

	public static void RisePulseWheat(FileReader fileRead1)
	
			throws IOException, ParseException, org.json.simple.parser.ParseException 
	{
		JSONParser parse = new JSONParser();
		
		JSONObject object = (JSONObject) parse.parse(fileRead1);
		
		// System.out.println(object);
		int total = 0;
		
		Iterator<?> iterator = object.keySet().iterator();// Keys of
															// Object(rice,wheat,pulses)
		while (iterator.hasNext()) 
		{
			String toppkey = (String) iterator.next();
			JSONObject obj = (JSONObject) object.get(toppkey);
			Iterator<?> iterate = obj.keySet().iterator();// keys of each
															// specific object
			while (iterate.hasNext()) 
			{
				String key = (String) iterate.next();
				System.out.println(key + ":" + obj.get(key));
			}
Integer amount = (Integer.parseInt(obj.get("Price").toString()))* (Integer.parseInt(obj.get("Weight").toString()));
			System.out.println("The total cost of " + obj.get("Name") + " is: " + amount);
			System.out.println();
			total = total + amount;
		}
		System.out.println("The total Amount of inventory is:" + total);
	}

	// Inventory management by manager [4]

	public static FileReader fileRead2(String string2) {

		FileReader f = null;
		try {
			f = new FileReader(string2);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		return f;

	}

	public static void InventoryManager(FileReader fileRead2)
			throws IOException, ParseException, org.json.simple.parser.ParseException {
		JSONParser parse = new JSONParser();
		JSONObject object = (JSONObject) parse.parse(fileRead2);
		// System.out.println(object);
		int total = 0;
		Iterator<?> iterator = object.keySet().iterator();// Keys of
															// Object(rice,wheat,pulses)
		while (iterator.hasNext()) {
			String topkey = (String) iterator.next();
			JSONObject obj = (JSONObject) object.get(topkey);
			Iterator<?> iterate = obj.keySet().iterator();// keys of each
															// specific object
			while (iterate.hasNext()) {
				String key = (String) iterate.next();
				System.out.println(key + ":" + obj.get(key));
			}
			Integer amount = (Integer.parseInt(obj.get("Price").toString()))
					* (Integer.parseInt(obj.get("Weight").toString()));
			System.out.println("The total cost of " + obj.get("Name") + " is: " + amount);
			System.out.println();
			total = total + amount;
		}
		System.out.println("The total Amount of inventory is:" + total);
	}

	public void stackPrimeAnagram(String string1, String string2) 
	{
		int x, i, f;
		System.out.println("Prime Number List = ");
		for (x = 1; x <= 1000; x++) {
			f = 0;

			for (i = 2; i < x; i++) {
				if (x % i == 0) {

					f = 1;
					break;
				}
			}
			if (x == i) {
				int no = x;
				int s = 0;

				while (no > 0) {
					int r = no % 10;
					s = s * 10 + r;
					no = no / 10;
				}
				if (x == s) {
					System.out.print(x + "\t");
				}
			}
		}
	}

	
}
	


	
	// OOP_Adress Book [11]
	
	/*public void addNewPerson() 
	{
		try
		{
			File file = new File("/adressBook.json");
			
			if(file.exists())
			{
				if(file.canRead() && file.canWrite())
				{
					FileReader fileReader = new FileReader(file);
					JSONObject json=new JSONObject();
					JSONParser parser=new JSONParser();
					JSONArray array=(JSONArray) parser.parse(fileReader);
					
					JSONObject JSON=new JSONObject();
					System.out.println("Enter the fisrt name:");
					String name=ipstring();
					
					System.out.println("Enter the last name:");
					String Lname=ipstring();
					
					System.out.println("Enter the adress:");
					String Address=ipstring();
					
					System.out.println("Enter the name of city:");
					String city=ipstring();
					
					System.out.println("Enter the name state");
					String state=ipstring();
					
					System.out.println("Enter the ZIP");
					String ZIP=ipnumber();
					
					System.out.println("Enter the mobile number");
					String MbNo=ipnumber();
				
				}
				
	*/		
		
		// TODO Auto-generated method stub
		
		



//

/*
 * public static void QueuePrimeAnagram() {
 * 
 * int array[][]=PrimeAnagram2D(); QueueLinkList queue=new QueueLinkList();
 * System.out.println("----------------------------------");
 * System.out.println("Prime Anagram using Queue");
 * System.out.println("----------------------------------"); for (int i = 0; i <
 * 10; i++) { for (int j = 0; j < 30; j++) { if(array[i][j]>0 &&
 * array[i][j]<1000) { queue.insert(array[i][j]+"\t");
 * //System.out.print(a[i][j]+"\t"); }
 * 
 * } queue.insert("\n"); } queue.display();
 * 
 * 
 * }
 */

// calender Queue

/*
 * public static void CalendarQueue(int month,int year) { QueueLinkList
 * weekday=new QueueLinkList(); String[] months = {"January", "February",
 * "March","April", "May", "June", "July", "August", "September","October",
 * "November", "December"};
 * 
 * int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; if ((month ==
 * 2) && (isLeapOrNot(year))) { days[month] = 29; } System.out.println("\t\t\t"
 * + months[month-1] + " " + year);
 * System.out.println("\tSun\tMon\tTue\tWed\tThu\tFri\tSat"); int d =
 * dayOfWeek(month, 1, year); for(int i=0;i<d;i++) { weekday.insert("\t"); } for
 * (int i = 1; i <= days[month-1]; i++) { //System.out.printf("%2d ", i);
 * weekday.insert("\t"+i); if (((i + d) % 7 == 0) || (i == days[month-1]))
 * weekday.insert("\n"); } weekday.display(); }
 * 
 * private static boolean isLeapOrNot(int year) { if(year%4==0 || year%400==0 &&
 * year%100!=0) { System.out.println("Is a Leap Year"); return true; } else {
 * System.out.println("Is not a Leap Year"); return false; }
 * 
 * } }
 */

