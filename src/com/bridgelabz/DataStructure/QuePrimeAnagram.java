/*package com.bridgelabz.DataStructure;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.Utility.QNode;


		public class QuePrimeAnagram
		{
			QNode front,rear;
			
			

			public QuePrimeAnagram
			() 
			{
				
				this.front = null;
				this.rear = null;
			}


			public void enQue(int data) 
			{
				Utility u=new Utility();
				Object QNode1 = u.QNode1(data);
				QNode temp=new QNode(data);
				//QNode=u.QNode(data):
				if(rear==null) 
				{
					rear=temp;
					front=rear;
				}
				else 
				{
					rear.next=temp;
					rear=temp;
				}
				
			}
			
			public QNode deQue() {
				
				if(front==null) {
					
					return null;
				}
					
					QNode temp=front;
					front=front.next;
			
				return temp;
			}

		
	}


	*/