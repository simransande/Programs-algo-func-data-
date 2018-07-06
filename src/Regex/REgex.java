package Regex;

	
	import java.util.Date;
	import com.bridgelabz.utility.Utility;

	public class REgex 
	{

	public static void main(String args[])
	{
	Utility u=new Utility();

	userdetails user=new userdetails();
	System.out.println();

	//asking user to enter his data
	System.out.println("Enter FirstName:");
	user.setfName(u.ipstring());
	System.out.println();

	System.out.println("Enter LastName:");
	user.setlName(u.ipstring());
	System.out.println();

	System.out.println("Enter Mobile Number:");
	user.setmobileNo(u.ipstring());
	System.out.println();	

	//Setting current date
	user.setdate(u.getCurrentDate(new Date()));
	System.out.println(u.replaceString(user,u.getFileText("File.txt")));	
	}
	}

