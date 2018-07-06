package Hashing;


import com.bridgelabz.utility.Node;
//import com.bridgelabz.utility.Node;
import com.bridgelabz.utility.Utility;

public class Orderedlist
{

   Node start;
   NodeUtility nu=new NodeUtility();
   Utility u1=new Utility();
private int[] sortArrays;

   // get data From a fle
   void getDataFromFile()
   {
       int[] retArry =nu.integerFileReader();
       sortArrays = nu.sort(retArry);
       int size =retArry.length;
       System.out.println("Array Size is "+size);
       for(int i=0;i<size;i++)
       {

           addItem(retArry[i]);
       }
   }

   public void List()
   {
       if(start ==null)
       {
           System.out.println("List is Empty ");
       }
   }
   public void addItem(int data)
   {
       Node head =start;
       Node temp =new Node();
       temp.data =data;
       temp.nextNode =null;
       if(start == null)
       {
           start = temp;
       }
       else
       {
           while(head.nextNode != null)
           {
               head=head.nextNode;
           }
           head.nextNode=temp;
       }
   }

  // Display Function
  public  void display()
  {
       Node temp =start;
       while( temp != null)
       {
           System.out.print(temp.data+"---->");
           temp=temp.nextNode;
       }
       System.out.println(" ");
   }

  // Size of Function
  public  int size()
  {
       int count=0;
       Node temp =start;
       while( temp.nextNode != null)
       {
           temp=temp.nextNode;
           count++;
       }
       System.out.println("sizze of Linked List"+count);
       return count;
  }

  // Serching of a Word Function
  public void searchData()
  {
       Node temp = start;
       int count=0;
       System.out.println("Enter a number to Search");
       int s =u1.ipnumber();
       int flag=0;
       while(temp.nextNode != null)
       {
           count++;
           if( temp.data==s)
           {
               System.out.println(" number is found At "+count);
               flag++;
               break;
           }
           temp=temp.nextNode;
       }

       if(flag == 1)
       {
           removeData(count);
       }
       else
       {
           addItem(s);
           System.out.println("After Adding a LIst ");
           display();
       }
   }

   // removeWord From a Linked lIst
   void removeData(int count)
   {
       Node temp = start;
       if(count==1)
       {
           start =start.nextNode;
           System.out.println("After Deleting LIst is ");
           display();
       }
       else
       {
    for(int i=0;i<count-1;i++)
    {
temp=temp.nextNode;
    }
       temp.nextNode =temp.nextNode.nextNode;
       System.out.println("After Deleting LIst is ");
       display();
       }
   }

   public static void main(String[] args)
   {
       Orderedlist obj = new Orderedlist();
       obj.getDataFromFile();
       obj.display();
       obj.size();
      obj.searchData();
   }



}

