package OOP_AdressBook;

public class Person
{
	
		private String fname;
		private String lname;
		private long phonenumber;
		private Address address;
		
		public long getPhonenumber() {
			return phonenumber;
		}

		public void setPhonenumber(long phonenumber) {
			this.phonenumber = phonenumber;
		}

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "Person [fname=" + fname + ", lname=" + lname + ", address="
					+ address + "]";
		}
	}


