import java.util.*;
class Node
{
	int data;
	Node next;
	Node(int n)
	{
		data=n;
		next=null;
	}
}
class NodeSwap
{
	public static void printList(Node head)
	{
		while(head!=null)
		{
			System.out.print(head.data+"->");
			head=head.next;
		}
		System.out.print("null");
	}
	public static Node swap(int a,int b,Node head)
	{
		Node temp1=head;
		Node temp2=head;
		for(int i=0;i<a-1;i++)
			temp1=temp1.next;
		for(int j=0;j<b-1;j++)
			temp2=temp2.next;
		int s=temp1.data;
		temp1.data=temp2.data;
		temp2.data=s;
		return head;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Node head=null;
		int data=s.nextInt();
		
		while(data!= -1)
		{
			Node newNode=new Node(data);
			if(head==null)
				head=newNode;
			else
			{
				Node temp=head;
				while(temp.next!=null)
					temp=temp.next;
				temp.next=newNode;
			}
			
			data=s.nextInt();
		}
		printList(head);
		head=swap(2,3,head);
		printList(head);
	}
}