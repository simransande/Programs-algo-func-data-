package Hashing;
public class Hashing 
	{
	public static void main(String args[])
	{
		Orderedlist[] data=new Orderedlist[11];
		NodeUtility n=new NodeUtility();
		int[] ipArray=n.integerFileReader();
			for(int i=0;i<ipArray.length;i++)
			{
				int remainder=ipArray[i]%11;
				if(data[remainder]==null)
				
				{
					data[remainder]=new Orderedlist();
					data[remainder].addItem(ipArray[i]);
				
				}
				
				else
					data[remainder].addItem(ipArray[i]);
			}

			for(int i=0;i<11;i++)
			{
				System.out.println(i);
				if(data[i]!=null)
				{
					data[i].display();
				}
			}
	   }
}

