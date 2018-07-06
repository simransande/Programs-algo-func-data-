package CliniqueManagement;


	import com.bridgelabz.utility.Utility;

	public class Doctor 
	{
		int DrId;
		String DrName;
		String avail;
		String spec;
		Utility u1;

		//getter and setter methods
		public int getDrId() 
		{
			return DrId;
		}
		public void setDrId(int DrId) 
		{
			this.DrId = DrId;
		}
		public String getDrName() 
		{
			return DrName;
		}
		public void setDrName(String DrName) 
		{
			this.DrName = DrName;
		}
		public String getAvail() 
		{
			return avail;
		}
		public void setAvail(String avail) 
		{
			this.avail = avail;
		}
		public String getSpec() {
			return spec;
		}
		public void setSpec(String spec) 
		{
			this.spec = spec;
		}
		//toString method
		public String toString() 
		{
			return "Doctor [did=" + DrId + ", dname=" + DrName + ", avail=" + avail + ", spec=" + spec + "]";
		}
		//to add doctor details
		public void addDoctor()
		{
			Utility u1=new Utility();
			System.out.println("Enter Your Details ...");

			System.out.println("Enter Name: ");
			this.DrName=u1.ipstring();
			System.out.println();

			System.out.println("Enter Id: ");
			this.DrId=u1.ipnumber();
			System.out.println();

			System.out.println("Enter Specialization: ");
			this.spec=u1.ipstring();
			System.out.println();

			System.out.println("Enter Availability (1:AM   2:PM  3:Both) :");
			this.avail=u1.ipstring();
			System.out.println();
		}
	}

