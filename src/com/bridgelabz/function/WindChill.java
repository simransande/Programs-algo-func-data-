/******************************************************************************
  
 *  Purpose: WindChill
 *
 *  @author  Simran Sande
 *  @version 1.0
 *  @since   25-06-2018
 *
 ******************************************************************************/


package com.bridgelabz.function;

import com.bridgelabz.utility.Utility;

public class WindChill
{
    public static void main(String args[])
    {
    	int t,v;
    	Utility u=new Utility();
    	System.out.println("Enter the emperature");
    	t=u.ipnumber();
    	System.out.println("Enter the wind speed");
    	v=u.ipnumber();	
    	u.Windchill(t,v);
    	
	}
    
    

}
