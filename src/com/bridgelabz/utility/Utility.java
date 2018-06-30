package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Collections;
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
	
	//string replace
	public static void replacestring()
	{
	 String username="<user name>";
	
	 System.out.println("enter username");
	 String name = ipstring();
	 username=username.replaceAll(username, name);
	 System.out.println("hello "+username+" , How are you?");
	}
	
	//flipcoin
	public static void Flipcoin(int numtime)
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
	
	//LeapYear
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
	public int magic;
	public int magicno;
	public void power(int number) 
	{
		int power=1;
		for(int i=1;i<=number;i++)
		{
			power=power*2;
			System.out.println("2^"+i+"=" +power);
		}
		
	}
	public void harmonic(int number) 
	{
		double num=0.0;
		for(int i=1;i<=number;i++)
		{
			num=num+(1.0/i);
			System.out.println("1/"+i+"=" +num);
		}
		
	}
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
	public void Gamnler(int trails) 
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
	public void root(int a, int b, int c) 
	{
		double delta=(b*b)-(4*a*c);
		int Firstroot=(int)((-b+Math.sqrt(delta))/2*a);
		int Secondroot=(int)((-b-Math.sqrt(delta))/2*a);
		System.out.println("First sqare root is "+Firstroot);
		System.out.println("Second sqare root is "+Secondroot);
		
	}
	public double distance(int x, int y) 
	{
		double dis=(double) (Math.pow(x, 2)+Math.pow(y, 2));
		double OrignDistance=(double)(Math.sqrt(dis));
	
		
		return OrignDistance;
	}
	public void Windchill(int t, int v) 
	{
		double power=(double)(Math.pow(v, 0.18));
		double w=35.74+(0.6215*t)+((0.4275*t)-35.75)*power;
		System.out.println("WInd speed is"+w);
		
	}
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
	public String Binary(int m)
	{
		String x="";
		String y="";
		
		do
		{
			int a=m%2;
			if (a==1)
			{
				x=x+""+1;
				m=m/2;
			}
			else
				x=x+""+0;
			m=m/2;
		}while(m>0);
		for(int i=x.length()-1;i>=0;i--)
		{
			y=y+x.charAt(i);
		}
		System.out.println(y);
		return y;
			}
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


	public void WordSearchBinary(String  search , String  array[ ]) 
	{
		
			try{
				Scanner sc = new Scanner( System.in );
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
			int  c;
			System.out.println("String Array Before Buuble Sort ="+array.length);     		
			for ( c = 0; c < array.length  ; c++)
			{
	      			System.out.print( array[ c ] + "\t" );
	 		}
			//bubbleSort( array );
			String[] a=insertionsortSrting( array);
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
}
		
	
	 

	


	



