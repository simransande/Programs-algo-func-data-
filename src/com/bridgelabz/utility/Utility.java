package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;


public class Utility
{
	private static final char[] Array2D = null;
	private static final String MagicNumber = null;
	static Random rand=new Random();
	static Scanner scanner=new Scanner(System.in);
	public static String ipstring()
	{
		return scanner.next();
	}
	public static int ipnumber()
	{
			
			return scanner.nextInt();
	}
	
		public int[] ipArray(int n)
		{
		int Array[]=new int[n];
		System.out.println("enter your array");
		for(int i=0;i<n;i++)
		{

		Array[i]=ipnumber();
		}
		return Array;
		}
	
	public static int getrandomInt()
	{
		
			return rand.nextInt();
	}
	public static double getrandomdouble()
	{
		
			return rand.nextDouble();
	}
	public static boolean getrandomboolean()
	{
		
			return rand.nextBoolean();
	}
	
	//[1] StringReplace
	public static void replacestring()
	{
	 String username="<user name>";
	
	 System.out.println("enter username");
	 String name = ipstring();
	 username=username.replaceAll(username, name);
	 System.out.println("hello "+username+" , How are you?");
	}
	
	//[2] flipcoin
	public static void  Flipcoin(int numtime)
	{
		int headcount=0,tailcount=0;
		double per1,per2;
		
		
		for(int i=0;i<numtime;i++)
		{
			double val=getrandomdouble();
			if(val<0.5)
			{
				tailcount++;
			}
			else
				headcount++;
			
		}
		per1=(double)tailcount/numtime*100;
		per2=(double)headcount/numtime*100;
		System.out.println("percentage of tailcount is"+per1);
		System.out.println("percentage of headcount is"+per2);
		
	}
	
	//[3] LeapYear
	public static boolean leapyear(int year)
	{
	if(year%4==0)
		{
			if(year%100==0)
				{
					if(year%400==0)
						{
							return true;
						}
					else
					return false;
				}
			else
			return true;
			
	}
	else
	return false;
	}

	//[4] pow2
	public void power(int number) 

	{
		int power=1;
		for(int i=1;i<=number;i++)
		{
			power=power*2;
			System.out.println("2^"+i+"=" +power);
		}
	
		
	}
	
	//[5] Harmonic
	public void harmonic(int number) 

	{
		double num=0.0;
		for(int i=1;i<=number;i++)
		{
			num=num+(1.0/i);
			System.out.println("1/"+i+"=" +num);
		}
		
	}
	
	//[6] PrimeFactor
	public void Primefact(int number) 
	{
	
		int fact;
		
		int j;
		for(int i=2;i<number;i++)
		{
			int n=i;
			for(j=2;j<=n;j++)
			{
				if(n%j==0)
				{
					break;
				}
				}
		if(j==n)
		{
			if(number%n==0)
			{
				System.out.println(n);
			}
		}
			}
		}
	
	//[7] Gambler
	public void Gambler(int trails) 

	{
		int stake=25;
		int goals=200;
		int bets=0;
		int wins=0;
		for(int t=0;t<=trails;t++)
		{
		int cash=stake;
		while(cash>0&&cash<goals)
		{
			bets++;
			if(Math.random()<0.5)
				cash++;
			else
				cash--;
		}
		if(cash==goals)
		{
			wins++;
		}
		System.out.println(wins+"wins of" +trails);
		System.out.println("percent of games won="+100.0*wins/trails);
		System.out.println("avg of bets=" +1.0*bets/trails);
		}
	}
	
	//[8] CouponNumber 
	public int CouponGenerate(int num)
		{
			 
			 boolean[] isCollected=new boolean[num];
			 int f=0;
			 int count=0;
			 while(f<num)
			 {
			 int value=(int)(Math.random()*num);
			 count++;
			 if(!isCollected[value])
			 {
				 f++;
			 isCollected[value]=true;
			 }

			 }
			 return count;
		}
	
	//[9] Array2D	
	public void Array2D(int row, int column)
	{
		int x[][]=new int[row][column];
		System.out.println("enter the value of 2D array");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				x[i][j]=ipnumber();
			}
		}
		System.out.println("2D array in matrix are");
		for(int i=0;i<column;i++)
		{
			for(int j=0;j<row;j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	
	//[10]  SumAddsToZero 
	public void sumzero(int[] array, int n)
	{
		int f=0;
		for(int i=0;i<n-2;i++)
			{
			for(int j=i+1;j<n-1;j++)
				{
					for(int k=j+1;k<n;k++)
					{
						if(array[i]+array[j]+array[k]==0)
						{
							System.out.println("Triplet is "+array[i]+" "+array[j]+" "+array[k]);
							f++;
						}
					}
				}
			}
			if(f==0)
			{
				System.out.println("There are no Triplets in this");
				
			}
	}
	
	//[11] Distance
	public double distance(int x, int y) 
	{
		double dis=(double) (Math.pow(x, 2)+Math.pow(y, 2));
		double OrignDistance=(double)(Math.sqrt(dis));
	
		
		return OrignDistance;
	}
	
	//[15] Quadratic
	public void root(int a, int b, int c) 
	{
		double delta=(b*b)-(4*a*c);
		int Firstroot=(int)((-b+Math.sqrt(delta))/2*a);
		int Secondroot=(int)((-b-Math.sqrt(delta))/2*a);
		System.out.println("First sqare root is "+Firstroot);
		System.out.println("Second sqare root is "+Secondroot);
		
	}
	
	//[16] WindChill
	public void Windchill(int t, int v) 
	{
		double power=(double)(Math.pow(v, 0.18));
		double w=35.74+(0.6215*t)+((0.4275*t)-35.75)*power;
		System.out.println("WInd speed is"+w);
		
	}
	
	//[1] Anagram
	public void Anagram(String array,String array2)
	{
		String str1 = array,str2=array2;
		int l1=str1.length();
		int l2=str2.length();
		
		char arr1[]=str1.toLowerCase().toCharArray();
		char arr2[]=str2.toLowerCase().toCharArray();
 
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if(Arrays.equals(arr1, arr2))
			{
				System.out.println("strings are anagram");
			}
			else
			System.out.println("strings not anagram");
			}
	
	
	//[2] Prime numbers
	public int Primenumber() {

		{

			int   x , i , f ;
			
			System.out.println( "Prime Number List = " );
			for( x = 1 ; x <= 1000 ; x++ ) 
			{

				f = 0 ;

				for( i=2 ; i < x ; i++ )
				{
					if( x % i == 0 )
					{
						
					f = 1;
					break;
					}
				}
				if( x == i )
				{

				   	System.out.print( x + "\t" );		
				}
		
				}
			}
		return 0;
		}
	
	//[3] PRime Anagram and Palindrom
	public void PrimeAngpali() 

	{

		int   x , i , f ;
		
		System.out.println( "Prime Number List = " );
		for( x = 1 ; x <= 1000 ; x++ ) 
		{

			f = 0 ;

			for( i=2 ; i < x ; i++ )
			{
				if( x % i == 0 )
				{
					
				f = 1;
				break;
				}
			}
			if( x == i )
			{
				
				int no =  x;
				int s   =  0;

				while( no > 0 )
				{
					int r = no % 10;
					s = s * 10 + r;
					no = no / 10;
				}		
				if( x == s )
				{
				
			
			   	System.out.print( x + "\t" );		
			}
			
		
	}
		}
	}
	
	//[5] Magic number
	public void magicno(int N,int lowerbound,int upperbound,int middle) 
	{
	
		System.out.println("Is your number :"+middle);
		System.out.println("Enter your anser yes or high or low");
		String ans=scanner.next();
		int i;
		int count=0;
		for(i=0;i<N;i++)
		{
			
		
			
			if(ans.equals("high"))
			{
				lowerbound=middle;
				count++;
			}
			else if(ans.equals("yes"))
					{
				System.out.println("the number you thought:"+middle);
				int no1=count+1;
				System.out.println("it takes "+no1 +" times to find your no");
					break;
					}
						else if(ans.equals("low"))
						{
							upperbound=middle;
							count++;
							
						}
						if(count<N)
						{
							
							middle=(lowerbound+upperbound)/2;
							System.out.println("is your anwer"+middle);
							ans=scanner.next();
						}
					}
		}
	
	//[7] Insertion Sort
	public String[] insertionsort(int s)

	{
		String arr[]=new String[s];
		System.out.println("enter elements in strings");
		for(int k=0;k<s;k++)
		{
			arr[k]=scanner.next();
		}
		int n;         		
		String  temp;		
		for( int i = 1 ; i < s  ; i++ )
		{
			temp = arr[i];
			int  j = i - 1;	
			while(j>=0)
			{
				if(temp.compareTo(arr[j]) > 0 )
			{
					break;
			}
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
			System.out.println(Arrays.toString(arr));
		}	
		return arr;
	}
	public String[] insertionsortSrting(String[] s)
	{
		int n=s.length;         		
		String  temp;	
		System.out.println(Arrays.toString(s));
		for( int i = 1 ; i < n; i++ )
		{
			temp =s[i];
			int  j = i - 1;	
			while(j>=0)
			{
				if(temp.compareTo(s[j]) > 0 )
			{
					break;
			}
				s[j+1] = s[j];
				j--;
			}
			s[j+1] = temp;
			long[] arr;
			System.out.println(Arrays.toString(s));
		}	
		return s;
	}
	
	//[8] Bubble sort
	public void bubblesort(int n) 
	{
		int i,j;
		int  str[ ] = new int[ n] ;
		System.out.println("Enter elements in array");
		for(i=0 ; i<n ; i++ )
		{
			str[ i ] = scanner.nextInt( );
		}
		int  temp;
		
		for( i=0;i <n-1;i++)
		{
		
			for(j=0;j<n-i-1;j++)
			{
				if(str[j]>str[j+1])
				{
					temp=str[j];
					str[j]=str[j+1] ;
					str[j+1]=temp;	
				}	
			}
		}
		System.out.println(  "Sorted number list   = "  );
		for(i=0 ; i<n ; i++ )
		{
			System.out.println( str[ i ] ) ;
		}
	}
	public void bubblesortstring(int[] s) 
	{
		int n=s.length;
		System.out.println(Arrays.toString(s));
		for(int i=0 ; i<n ; i++ )
		{
		int  temp=s[i];
		int[] str = null;
		for( i=0;i <n-1;i++)
		{
		
			for(int j = 0;j<n-i-1;j++)
			{
				if(str[j]>str[j+1])
				{
					temp=str[j];
					str[j]=str[j+1] ;
					str[j+1]=temp;	
				}	
			}
		}
		System.out.println(  Arrays.toString(s) );
		for(i=0 ; i<n ; i++ )
		{
			System.out.println( str[ i ] ) ;
		}
	}
	}
	
	//[11] Day of week
	public int DayOfWeek(int d, int m, int y)
	{
		double y0;
		double x;
		double m0;
		int day;
		y0 = y-(1 -m) / 12;
		x = y0 + y0/4-y0/100 + y0/400;
		m0 = m+12*((14-m)/12)-2;
		day = (int) ((d + x + 31*m0/12)%7);
		System.out.print(day+" ");
		return day;
	}
	
	
	//[12] Temperature conversion
	public int tempconv(int temp) {
		int choice;
		int F = 0;
		  System.out.println(" 1 to convert into Celsius");
		  System.out.println(" 2 to convert into Fahrenheit");
		  choice=ipnumber();
		  switch(choice)
		  {
		  case 1:
		      F=(temp * 9/5)+32;
		  break;
		  case 2:
			  F=(temp - 32) * 5/9;
		  break;
		  default:
		  System.out.println("Enter the correct conditon");
		  }
		return F;
	}
	
	
	//[13] Monthly payment
	public void MonthlyPayment(double P, double Y, double R) 
	{
		double n;
		double R1;
		double payment;
		n=12*Y;
		R1=R/(12*100);
		payment=(P*R1)/(1-(Math.pow((1+R1),-n)));
		System.out.println("MOnthly payment you have ="+payment);
		
	
		
	
	}
	
	//[14] sqrt number
	public void SqrtNonNega(double c) 
	{
		double t = c;              
		 double epsilon = 1e-15; 
        while (Math.abs(t - c/t) > epsilon*t) 
        {
            t = (c/t + t) / 2.0;
        }
      
        System.out.println(t);
	}
	
	//[15] dec to binary
	public String Binary(int m)
	{
		String x="";
		String y="";
		int a;
		int count=0;

        while(m > 0)
        {
            a = m % 2;
            if(a == 1)
            {
                count++;
            }
            x = x + "" + a;
            m = m / 2;
        }
		for(int i=x.length()-1;i>=0;i--)
		{
			y=y+x.charAt(i);
		}
		System.out.println(y);
		return y;
			}
	
	
	
	public void WordSearchBinary(String  search , String[]  array) 
	{
		
			try{
				Scanner sc = new Scanner( System.in );
					File  f = new File( "file.txt" );

					if( !f.exists() )
					{
						System.out.println("file.txt file is unavailable.... ");
						
					}
					else
					{
						System.out.println("available");
					}

					FileReader  in = new FileReader( f );
					BufferedReader  br = new BufferedReader( in );
			
					 int i=0;
					String  str="";
					String  data = "";

					while( (str=br.readLine( ) ) != null )
					{
						data = data + str;				
					}
			int  c;
			System.out.println("String Array Before Buuble Sort ="+array.length);     		
			for ( c = 0; c < array.length  ; c++)
			{
	      			System.out.print( array[ c ] + "\t" );
	 		}
			//String[] a=bubblesorts(array);
			//String[] a=insertionsort(array);
			System.out.println("\n\nString Array After Insertion Sort =");     		
			for ( c = 0; c < array.length  ; c++)
			{
	      			System.out.print( array[ c ] + "\t" );
	 		}

			}catch(Exception  e)
			{
				System.out.print( "Error = "+e);
			}
		
	
	
			}
	 
	

	//[1] unordered
	public void unorderd( ) 

		{
			Scanner sc = new Scanner( System.in );

			try
			{
				File  f = new File( "Word.txt" );

				if( !f.exists() )
				{
					System.out.println("Word.txt file is unavailable.... ");
					
				}

				FileReader  in = new FileReader( f );
				BufferedReader  br = new BufferedReader( in );
		
				 int i=0;
				String  str="";
				String  data = "";

				while( (str=br.readLine( ) ) != null )
				{
					data = data + str;				
				}
				//System.out.println("data = "+data);
				String   x[ ]  = data.split(" ");
				
				
				LinkedList  ob = new LinkedList();			
				for( i=0 ; i < x.length ; i++)
				{
					ob.add( x[ i ] );
					//System.out.println( x[ i ] );
				}
		
				Iterator<String>  il = ob.iterator() ;

				while( il.hasNext() )
				{
					System.out.println( il.next( )  );
				}

				String  word;
				System.out.println("enter word for searching in files list = ");
				word = sc.next( );

				if( ob.contains( word ) )
				{
				    //System.out.println("word is found in list ");
				    ob.remove( word );
				}
				else
				{
				    System.out.println("word is not found in list ");
				    ob.add( word );
				}


				 System.out.println("data after opeartion  ");
				 il = ob.iterator() ;

				while( il.hasNext() )
				{
					System.out.println( il.next() );
				}
					
			}catch( Exception  e )		
			{
				System.out.println("error = "+e);
			}
}

	//[2] ordered list
	public void Orderd()
	 
	{
	int   x[ ] = new int[ 1000 ] ;
	int   size , i ;

	Scanner sc = new Scanner( System.in );
	try
	{
	File  f = new File("number.txt");

	if( !f.exists() )
	{
	System.out.println("number.txt file is unavailable.... ");
	return;
	}
	FileReader  in = new FileReader( f );
	BufferedReader  br = new BufferedReader( in );
	i=0;
	String str="";
	while( (str=br.readLine( ) ) != null )
	{
	x[ i ] = Integer.parseInt( str );
	System.out.println( x[ i ] );
	i++;
	}

	size = i;
	LinkedList  ob = new LinkedList();	
	for( i=0 ; i < size ; i++)
	{
	ob.add( x[ i ] );
	System.out.println( x[ i ] );
	}

	Collections.sort( ob );

	Iterator<Integer>  il = ob.iterator() ;

	while( il.hasNext() )
	{
	System.out.println( il.next() );
	}

	int  num;

	System.out.println("enter new number = ");
	num = sc.nextInt( );
	int  pos = ob.indexOf( num ) ;

	if( pos != -1 )
	{
	ob.remove( pos );
	System.out.println("number found in lis, list after poping = ");
	il = ob.iterator() ;	
	while( il.hasNext() )
	{
	System.out.println( il.next( ));
	}
	}
	else
	{	
	ob.add( num );
	Collections.sort( ob );	
	System.out.println("number found in lis, list after adding = ");
	il = ob.iterator() ;	
	while( il.hasNext() )
	{	
	System.out.println(  il.next() );
	}
	}

	}catch(Exception  e)	
	{
	System.out.println("error = "+e);
	}	
	}
	
	//[5] Palindrome
	public void  palindrome(String str)
	{
	
		Deque<Character>    dequeA   =   new    LinkedList<Character>( );
		
	
		for(int  i=0 ; i < str.length() ; i++ )
		{
			dequeA.add( str.charAt( i )  );
		}
		
		/* System.out.println("string is = ");
		Iterator iterator = dequeA.iterator( );
		while( iterator.hasNext( ) )
		{
			 System.out.println(  (char) iterator.next( ) );
		}*/
		
		char  front , rear;
		int     f = 0;

		do
		{			
			front = (char) dequeA.removeFirst() ;
			//System.out.println( front  ) ;		
			if(  dequeA.isEmpty( ) )
			{				
				break;
			}	
			rear = (char) dequeA.removeLast() ;
			//System.out.println( rear);
			if( front != rear )
			{			
				f = 1;
				break;
			}

		}while( !dequeA.isEmpty() );
	
		//System.out.println( dequeA.removeFirst( )  ) ;
		//System.out.println( dequeA.removeLast()  );
		if( f == 1 )
		{
			System.out.println("strings is not palindrome");
		}	
		else
		{
			System.out.println("strings is palindrome");
		}
	}

	//[8] calender
	public static boolean isleapyear(int year)
	{
	if(year%4==0)
	{
	if(year%100==0)
	{
	if(year%400==0)
	{
	return true;
	}
	else
	return false;
	}
	else
	return true;
	}
	else
	return false;
	}
	public static int day(int month, int day, int year) 
	{
	       int y = year - (14 - month) / 12;
	       int x = y + y/4 - y/100 + y/400;
	       int m = month + 12 * ((14 - month) / 12) - 2;
	       int d = (day + x + (31*m)/12) % 7;
	       return d;
	 
	}
}
	

		
	
	

	/*public void binarysearch(int search, int[] array)
		{
	Scanner sc = new Scanner( System.in );

	try
	{
		File  f = new File( "file.txt" );

		if( !f.exists() )
		{
			System.out.println("file.txt file is unavailable.... ");
			
		}
		else
		{
			System.out.println("file available");
		}
		FileReader  in = new FileReader( f );
		BufferedReader  br = new BufferedReader( in );

	int c, first, last, middle, pos ,  n = 10 ; 	
	//Arrays.sort( array );
	
	bubblesortstring( array );

		pos = 0; 

	first  = 0;
	last   = n - 1;
	middle = (first + last)/2; 
	while( first <= last )
	{
		if ( array[middle] < search )
		{
			first = middle + 1;    
		}
		else  if ( array[middle] == search ) 
  			{	      
		pos = middle+1;
		System.out.println(search + " found at location " + pos );
    			break;
  			}			
  			else
		{
     				last = middle - 1;
		} 
  			middle = (first + last)/2;
		}
		if ( first > last )
	{
  			System.out.println(search + " not found in list" );	
	}		
	}
	
catch( Exception  e )		
{
	System.out.println("error = "+e);
}
		}

		}*/
	
/*public void permutation(String str1) 
{
	   String str;
	   int l;
	   int r;
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    
}
private void permute(String str, int i, int r) 
{
   String str1;;
	        int n = str1.length();
	        Permutation permutation = new Permutation();
	        permutation.permute(str1, 0, n-1);
	    
	
}
private String swap(String str, int l, int i) {
	// TODO Auto-generated method stub
	return null;
}
}*/

		
	
	 

	


	



