package DSPalindrome;

public class Queue 
{
	public static final int DEFAULT_SIZE=20;
	private Object data[];
	private int index;
	public Queue()
	{
		data=new Object[DEFAULT_SIZE];
	}
	public boolean isEmpty()
	{
		return index==0;
	}
	public void enqueue(Object obj)
	{
		
		this.data[index]=obj;
		this.index++;
	}
	public Object removeFront()
	{
		Object obj=this.data[0];
		for(int i=0;i<this.index-1;i++)
		{
			data[i]=data[i+1];
		}
		this.index--;
		return obj;
	}
	public Object removeRear()
	{
		Object obj=this.data[this.index];
				this.index--;
				
		
				return obj;
	}

}
		
	

