package CliniqueManagement;

import com.bridgelabz.utility.Utility;

public class patients 
{
	
		int pid;
		String pname;
		int age;
		String mobile;

		//getter and setter methods
		public int getPid() 
		{
			return pid;
		}
		public void setPid(int pid) 
		{
			this.pid = pid;
		}

		public String getPname() 
		{
			return pname;
		}
		public void setPname(String pname) 
		{
			this.pname = pname;
		}

		public int getAge() 
		{
			return age;
		}
		public void setAge(int age) 
		{
			this.age = age;
		}

		public String getMobile() 
		{
			return mobile;
		}
		public void setMobile(String mobile) 
		{
			this.mobile = mobile;
		}
		//toString method
		public String toString() 
		{
			return "Patients [pid=" + pid + ", pname=" + pname + ", age=" + age + ", mobile=" + mobile + "]";
		}

		//method to add patients information
		public void addPatient()
		{
			Utility u1=new Utility();
			System.out.println("Enter Your Details ...");

			System.out.println("Enter Name: ");
			this.pname=u1.ipstring();
			System.out.println();

			System.out.println("Enter Id: ");
			this.pid=u1.ipnumber();
			System.out.println();

			System.out.println("Enter Age: ");
			this.age=u1.ipnumber();
			System.out.println();

			System.out.println("Enter Mobile Number: ");
			this.mobile=u1.ipstring();
			System.out.println();
		}
	}

