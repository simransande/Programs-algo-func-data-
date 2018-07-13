package StopWatch;

public class UtilityStopWatch 
{
	long startTimer=0;
		long stopTimer=0;
		long elasped=0;
		public void start() 
		{
			startTimer=System.currentTimeMillis();
			int seconds = (int) ((startTimer / 1000) % 60);
			//long startTimer = System.currentTimeMillis.toSeconds(millis);
			System.out.println("Start-Time:"+" "+seconds);
		}
		public void stop() 
		{
			stopTimer=System.currentTimeMillis();
			int seconds1 = (int) ((stopTimer / 1000) % 60);
			System.out.println("Stop-Time:"+" "+seconds1);
		}
		public double elaspedTime()
		{
			elasped=stopTimer-startTimer;		
			return elasped/1000;
		}		
}
