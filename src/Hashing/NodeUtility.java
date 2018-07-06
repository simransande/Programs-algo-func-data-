package Hashing;


import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io. BufferedReader;
import java.io.IOException;

import com.bridgelabz.utility.Node;

//import com.bridgelabz.utility.Node;

public class NodeUtility
{
String[] stringArray;
   int[] intArray;
private BufferedReader br;
private FileInputStream fis;
public Node readFile(Node start)
{
try
{
fis = new FileInputStream("number.txt");
char ch;
String word3="";

while (fis.available() > 0)
{
ch = (char) fis.read();
word3=word3+ch;
}
String[] wordsArray=word3.split(" ");
int[] inputArray=new int[wordsArray.length-1];

for(int i=0;i<wordsArray.length-1;i++)
{
inputArray[i]=Integer.parseInt(wordsArray[i]); 
}
inputArray=sort(inputArray);

for(int i =0; i < wordsArray.length-1 ; i++)
{
start=addWordstoList(start,inputArray[i]);
}
}
catch(IOException e)
{
System.out.println(e);
}
return start;
}
public int[] integerFileReader()
{
try
{
String intFile = new String();
FileReader fr = new FileReader("number.txt");
br = new BufferedReader(fr);
   String s;

   while((s = br.readLine()) != null) 
{
       intFile += s;
   }

   intFile = intFile.replaceAll("\\n",",");
   intFile = intFile.trim();
   stringArray = intFile.split(","); 
   intArray = new int[stringArray.length];

   for(int i=0; i <intArray.length;i++)
   {
       try
       {
           intArray[i]= Integer.parseInt(stringArray[i]);
       }
       catch(NumberFormatException e)
       {
           System.out.println(e);
       }
   }
}
catch(Exception obj)
{
   System.out.println("e");
}
       	return intArray;
   }
public Node addWordstoList(Node node1,int num)
{
   	Node node2=node1;
   	Node newNode=new Node();
   	newNode.data=num;
   	newNode.nextNode=null;

   if(node1==null)
   {
     	return newNode;
   }
   else
{
      while(node1.nextNode!=null)
     	{
node1=node1.nextNode;
     	}
      node1.nextNode=newNode;
   }
   	return node2;
}
 	public int[] sort(int[] arr )
{
   	int size=arr.length;
   	for(int i=size;i>0;i--)
{
     	for(int j=1;j<size;j++)
{
       	if(arr[j-1]>arr[j])
{
         	int temp=arr[j-1];
         	arr[j-1]=arr[j];
         	arr[j]=temp;
       	}
     	}
     	size--;
   	}
   	return arr;
 	}

 	public Node search(Node tNode1, int num)
{
   	Node tNode=tNode1;

   	
   	if(tNode==null)
{
     	Node newNode=new Node();
newNode.data=num;
tNode=newNode;
return tNode; 
   	}

   	if(tNode.data==num)
{
     	tNode=null;
}
	return tNode;
}
}
