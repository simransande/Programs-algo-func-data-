/*package CliniqueManagement;

import java.io.IOException;
import java.text.ParseException;

import com.bridgelabz.utility.Utility;

public class clinique
{

	public static void main(String[] args) {
		int choice;
		do
		{
			Utility u=new Utility();
			System.out.println("1.Add Patient:");
			System.out.println("2.Fix appointment:");
			System.out.println("3.Appointment Details:");
			System.out.println("4.Display Clinique Report:");
			System.out.println("5.Quit");
			choice=u.ipnumber();
			
			switch(choice)
			{
			case 1:
				u.addPatient();
				break;
			case 2:
				FixAppointment.fixAppointment();
				break;
			case 3:
				Utility.displayCliniqueDetails();
				break;
			case 4:
				System.exit(0);
			}
		}
		while(choice<=4);
	}

}
*/