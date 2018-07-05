package DSPalindrome;

import com.bridgelabz.utility.Utility;

public class palindrome 
{
	public static void main(String args[])
	
	{
		String str ;
		int size;
		Utility u=new Utility();
		System.out.println("Enter the string");
		   str=u.ipstring();
		Queue q=new Queue();
		Object front;
		Object  rear;
		int     f = 0;
		for(int i=0;i<str.length();i++)
		{
		 q.enqueue(str.charAt(i));
		}
		do
		{	
		front =q.removeFront() ;
		if(q.isEmpty())
		{	
		break;
		}	
		rear =q.removeRear();
		if(front!=rear)
		{	
		f = 1;
		break;
		}

		}while(!q.isEmpty());
		if( f == 1 )
		{
		System.out.println("strings is not palindrome");
		}	
		else
		{
		System.out.println("strings is palindrome");
		}

		}	
		}