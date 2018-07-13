/*package OOPComercialDataProcessing;

import com.bridgelabz.utility.Utility;

public class CommercialDataProcessing {

		public static void main(String[] args) throws Throwable 
		{
			Utility u=new Utility();
			// Utility.companyShares();

			int choice;
			do {
				System.out.println("\n"+"Enter your choice:");
				System.out.println("1.Create user:");
				System.out.println("2.Buy:");
				System.out.println("3.Sell:");
				System.out.println("4.Display:");
				System.out.println("5.Exit:");
				choice = u.ipnumber();

			switch (choice) {
				case 1:
					System.out.println("Create User:" + "\n");
					u.createUser();
					break;

				case 2:
					u.buyShare();
					break;

				case 3:
					Utility.sellShare();
					break;

				case 4:
					Utility.displayReport();
					break;
				case 5:
					System.exit(0);
					break;
				}
			} while (choice <= 4);

		}
	
}
*/