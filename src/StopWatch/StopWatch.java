/******************************************************************************
  
 *  Purpose: Stopwatch.
 *
 *  @author  Simran Sande
 *  @version 1.0
 *  @since   25-06-2018
 *
 ******************************************************************************/





package StopWatch;

import com.bridgelabz.utility.Utility;

public class StopWatch
{
	

		
		public static void main(String args[]) {
			Utility u=new Utility();
			UtilityStopWatch  usw=new UtilityStopWatch ();
			System.out.println("Press 1 to start the timer");
			u.ipnumber();
			usw.start();
			System.out.println("Press 2 to stop the timer");
			u.ipnumber();
			usw.stop();
			double elasped=usw.elaspedTime();
			System.out.println("Elasped time :"+elasped+" sec.");
		}
		
	}

