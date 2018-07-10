package CliniqueManagement;


	import java.lang.reflect.Field;
import java.nio.file.Paths;
import java.util.ArrayList;
	import java.util.Date;
	import java.util.HashMap;

	import com.bridgelabz.utility.Utility;

	public class clinique 
	{
		static Date date;
		
		public static void main(String[] args) 
		{ 
			Utility u=new Utility();
			find f=new find();
			HashMap<Appoinment,Integer> appoint=new HashMap<Appoinment,Integer>();
			patients p=new patients();
			Doctor d=new Doctor();
			ArrayList<Doctor> ald = new ArrayList<Doctor>();
			ArrayList<patients> alp = new ArrayList<patients>();
			int c=0;
			
			do
			{
			System.out.println();
			System.out.println("----------Clinique Management System---------");
			System.out.println();
			System.out.println("1.Add Doctor");
			System.out.println("2.Add Patients");
			System.out.println("3.Print Doctor");
			System.out.println("4.Print Patients");
			System.out.println("5.Take Appointment");
			System.out.println("6.Print Appointment");
			System.out.println("7.Search Doctor by Name ,Id or Availability");
			System.out.println("8.Search Patients by Name ,Id or Mobile Number");
			System.out.println("9.Exit");
			System.out.println();
			System.out.println("Enter your Choice: ");
			int choice=u.ipnumber();
			switch (choice) 
			{
				case 1:
						d.addDoctor();
						ald.add(d);
						break;
				case 2:
						p.addPatient();
						alp.add(p);
						break;
				case 3:
						//Printing  All Doctors Details..
						System.out.println("All Doctors Details..");
						System.out.println(ald);
						break;
				case 4:
						//Printing Patients Details..
						System.out.println("All Patients Details..");
						System.out.println(alp);
						break;
				case 5:
						System.out.println("Enter Docotor Id ");
						int did=u.ipnumber();
						ArrayList<Doctor>doc=f.FindById(ald, did);
						if(doc!=null)
						{
							if(doc.size()>=1)
							{
								System.out.println("Enter Date of Appointment: ");
								Date date=u.printDate(u.ipstring());
								if(date==null)
								{
									System.out.println("Date format is not correct");
								}
								// availability of doctors
								else
								{
									Appoinment newApp=new Appoinment( did,(java.sql.Date) date);
									if(appoint.containsKey(newApp))
									{
										//already some appointment is there on that date
										Integer appointment=appoint.get(newApp);
										if(appointment<=5)
										{
											//Appointment on given date is less then 5
											appointment++;
											appoint.put(newApp,appointment);
											System.out.println("Appointment Scheduled on "+date.toString()+" "+" with Doctor Id"+did);
										}
										else
										{
											//On given date appointment is more then 5
											System.out.println("Please Select Another Date"); 
										}
									}
									else
									{
										//No appointment is there on given date
										appoint.put(newApp,1);
									}
								}
							}
							//doctor Id does not exit in the DoctorsList
							else
							{
								System.out.println("Invalid Doctor Id");
							}
						}
						else
						{
							System.out.println("Invalid Doctor Id");
						}
						break;
				case 6:
						System.out.println("Printing All Appointments...");
						appoint.putAll(appoint);
						System.out.println(appoint);
						break;
				case 7:
						int ch1=0;
						do
						{
							//search 
							System.out.println();
							System.out.println("----------Search Doctor---------");
							System.out.println();
							System.out.println("1.Search Docotor By id");
							System.out.println("2.Search Docotor By Name");
							System.out.println("3.Search Docotor By Availability");
							System.out.println("4.Exit");
							System.out.println();
							System.out.println("Enter your Choice: ");
							int ch=u.ipnumber();

							switch (ch) 
							{
							case 1:
									System.out.println("1.Enter Docotor Id");
									int did1=u.ipnumber();
									ald=f.FindById(ald,did1);
									//search doctor by name
									System.out.println(ald);
									break;
							case 2:
									System.out.println("Enter Docotor Name");
									String dname=u.ipstring();
									ald=f.FindByName(ald,dname);
									System.out.println(ald);			
									break;
							case 3:
									//search doctor by Availability
									System.out.println("Enter Docotor Availability");
									String avail=u.ipstring();
									ald=f.FindByaval(ald,avail);
									System.out.println(ald);
									break;
							case 4:
									System.exit(0);
							default:
									System.out.println("Invalid choice");
									break;
							}
						}
						while(ch1<5);			
				case 8:
						find f1=new find();
						int ch2=0;
						do
						{
						
							System.out.println("----------Search Patients---------");
							System.out.println();
							System.out.println("1.Search Patients By Id");
							System.out.println("2.Search Patients By Name");
							System.out.println("3.Search Patients By Mobile Number");
							System.out.println("4.Exit");
							System.out.println();
							System.out.println("Enter your Choice: ");
							int ch3=u.ipnumber();
							switch (ch3) 
							{
							case 1:
									//Search Patients by id
									System.out.println("Enter Patients  Id");
									int pid1=u.ipnumber();
									alp=f1.FindById1(alp,pid1);
									System.out.println(alp);
									break;
							case 2:
									//Search Patients by Name
									System.out.println("Enter Patients Name");
									String pname1=u.ipstring();
									alp=f1.FindByName1(alp,pname1);
									System.out.println(alp);
									break;
							case 3:
									//Search Patients by Mobile Number
									System.out.println("Enter Patients Mobile Number");
									String avail1=u.ipstring();
									alp=f1.FindByAval(alp,avail1);
									System.out.println(alp);
									break;
							case 4:
									System.exit(0);
									
							default:
									System.out.println("Invalid choice");
									break;
							}
						}
						while(ch2<5);
				case 9:
						System.exit(0);
				default:
						System.out.println("Invalid choice");
						break;
						}
			}
			while(c<10);	
		}

}
