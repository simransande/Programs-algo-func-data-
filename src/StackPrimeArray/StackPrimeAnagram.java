package StackPrimeArray;
	public class StackPrimeAnagram 
	{
			QNode top;

			public StackPrimeAnagram() 
			{

				this.top = null;

			}

			public void push(int data) {
				QNode temp = new QNode(data);

				if (top == null) {

					top = temp;
					temp.next = null;

				} else {

					temp.next = top;
					top = temp;

				}
			}

			public int pop() {

				if (isEmpty()) {

					return 0;

				}

				QNode temp = top;
				top = temp.next;

				return temp.data;

			}

			public QNode peek() {
				if (isEmpty()) {
					System.out.println("The stack is empty");
				}
				return top;

			}

			private boolean isEmpty() {

				return top == null;
			}

		

	}


