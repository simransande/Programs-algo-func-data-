package com.bridgelabz.Algorithm;
import com.bridgelabz.utility.Utility;
	public class DayOfWeek 
	{
	  public static void main(String args[])
	  {
	  int m,d,y;
	  Utility u=new Utility();
	  System.out.println("Enter date:");
	  d=u.ipnumber();
	  System.out.println("Enter month:");
	  m=u.ipnumber();
	  System.out.println("Enter year:");
	  y=u.ipnumber();
	  int ans=u.DayOfWeek(d,m,y);
	  switch(ans)
	  {
	  case 1 : 
		  
			  System.out.print("MONDAY");
			  break;
		  
	  case 2 :
		  
			  System.out.print("TUESDAY");
			  break;
		  
	  case 3 : 
		  
			  System.out.print("WEDNESDAY");
			  break;
		  
	  case 4 : 
		  
			  System.out.print("THURSDAY");
			  break;
		  
	  case 5 : 
		  
			  System.out.print("FRIDAY");
			  break;
		  
	  case 6 : 
		  
			  System.out.print("SATURDAY");
			  break;
		  
	  case 7 : 
		  
			  System.out.print("SUNDAY");
			  break;
		  
	  }
	  }
	}

