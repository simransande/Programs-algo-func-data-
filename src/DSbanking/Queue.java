package DSbanking;

public class Queue
{
	

	int front, rear, size, person;
	int[] arr;

	public Queue(int size, int person) 
	{
	this.size = size;
	this.person = person;
	front = 0;
	arr = new int[size];
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
	return rear == size;
	}

	public int sizeOfQue() {
	return rear - front;
	}

	}



