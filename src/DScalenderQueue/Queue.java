package DScalenderQueue;
public class Queue
{

	int front, rear, month,year;
	int[] arr;

	public Queue(int month, int year) 
	{
	this.month= month;
	this.year = year;
	front = 0;
	arr = new int[month];
	System.out.println("Queue is ready");
	}

	public void enQue() {
	if (isFull()) {
	System.out.println("Queue is full");
	} else {
	rear = rear + 1;
	}
	}

	public void deQue() {
	if (isEmpty()) {
	System.out.println("Queue is empty");
	} else {
	front++;
	}
	}

	private boolean isEmpty() {
	return front == rear;
	}

	private boolean isFull() {
	return rear == month;
	}

	public int sizeOfQue() {
	return rear - front;
	}
	}
