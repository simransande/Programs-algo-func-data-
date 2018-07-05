package DSbanking;

import com.bridgelabz.utility.Utility;



	public class Banking {
	public static int balance=500;
	//private static Object Queue;
	public static void main(String[] args) {
	Utility u=new Utility();

	System.out.println("Enter the number of person");
	int person=u.ipnumber();

	System.out.println("Enter the size of the queue");
	int size=u.ipnumber();

	Queue q=new Queue(size,person);
	u.UtilityBanking(q,balance,person);
	}
	}
