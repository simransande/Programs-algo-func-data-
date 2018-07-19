package CliniqueManagement;

import com.bridgelabz.utility.Utility;

public class ClinicManagementApplication {
		public static void main(String[] args) {

			ClinicManager manager = new ClinicManager();
			do {
				System.out.println("Choose Your Options:");
				System.out.println("1. To Add Appointment/Doctor ");
				System.out.println("2. To Search Patient/Doctor");
				System.out.println("3. To display Patients/Doctor");
				switch (Utility.ipnumber()) {
				case 1:
					
					manager.addChoices();
					break;
				case 2:

					manager.searchChoices();
					break;
				case 3:

					manager.displayChoices();
					break;
				case 4:
					System.exit(0);

				}
			} while (true);
		}
	}