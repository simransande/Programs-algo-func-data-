package DS2DarrayPRIMENUMBER;

import com.bridgelabz.utility.Utility;

public class Anagram2DArray
{
	

	public static void main(String arg[])
	{
	int arrays[][] = new int[100][1000];
	int primes[] = new  int[1000];
	int[] arr = { 001, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };
	int k,i;
	int z=0;
	Utility u=new Utility();
	for( i = 0;i<1000;i++)
	{ 
	int x=u.getprime(i);
	if(x!=0)
	{
	primes[z]=x;
	   z++;
	}

	}
	for (i = 0; i < arr.length-1; i++) 
	   {
	              k=0;
	  int m = arr[i], m1 = arr[i + 1];
	  for (int j = 0; j < primes.length; j++) 
	      {
	         if (primes[j] > m && primes[j] < m1) 
	         	{
	       	 arrays[i][k] = primes[j];
	       	 k++;
	       	
	         	}
	      }

	}
	for(int x=0;x<10;x++)
	{
	int m = arr[x], m1 = arr[x + 1];
	System.out.print(m + "-" + m1 + " |");
	for(int b=0;b<25;b++)
	{
	if(arrays[x][b]!=0)
	{
	System.out.print(arrays[x][b]+" " );
	}
	}
	System.out.println(" ");
	}
	   }
	}

