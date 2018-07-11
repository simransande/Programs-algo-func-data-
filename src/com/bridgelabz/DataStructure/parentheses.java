package com.bridgelabz.DataStructure;
import com.bridgelabz.utility.Utility;

public class parentheses 
{
	public static void main(String[] args) 
		{
			Utility u=new Utility();
			System.out.println("Enter max size: ");
			int n=u.ipnumber();
			
			/* Creating Stack */     
			Stackclass stack = new Stackclass (n);
			System.out.println("Enter expression: ");
			String exp = u.ipstring();        
			
			int len = exp.length();
			System.out.println("Matches and Mismatches: ");

			for (int i = 0; i < len; i++)
			{    
			char ch = exp.charAt(i);

				if (ch == '(')
				{
				stack.push(i);
				}
					else if (ch == ')')
					{
						try
						{
						long p = (stack.pop() );
						System.out.println("')' at index "+(i+1)+" matched with '(' at index "+p);
					    }
						catch(Exception e)
						{
						System.out.println("')' at index "+(i+1)+" is unmatched");
						}
						} 
			}
			if (!stack.isEmpty() )
			{
			System.out.println("'(' at index "+(stack.pop() +1)+" is unmatched");
			System.out.println("unbalenced expression");
			}    
			else
			{
				System.out.println("balanced expression");
			}
		}
	    }
	 



