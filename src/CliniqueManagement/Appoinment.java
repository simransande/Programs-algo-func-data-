package CliniqueManagement;
import java.sql.Date;
public class Appoinment
	{
		 Integer did;
		Date date;
		//constructor
		public Appoinment(int did,Date date)
		{ 
			this.did=did;
			this.date=date;
		}
		//getter and setter methods
		public int getDid() 
		{
			return did;
		}
		public void setDid(int did) 
		{
			this.did = did;
		}

		public Date getDate() 
		{
			return date;
		}
		public void setDate(Date date) 
		{
			this.date = date;
		}

		public String toString() 
		{
			return "Appointment [did=" + did + ", date=" + date +  "]";
		}

		public int hashCode()
		{
	    	return this.did.hashCode()+this.date.hashCode();
		}
		//checking for equality
		public boolean equals(Object object)
		{
	    	if (object == null) 
				return false;
	    	if (object == this) 
				return true;
	    	if (!(object instanceof Appoinment))
				return false;
	    	Appoinment dA = (Appoinment) object;
	    	if((this.did==dA.did) && (this.date.equals(dA.date)))
				return true;
			else
				return false;
		}
	}


