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
class ElDup
{
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
		head=del(head);
		printList(head);
	}
	public static void printList(Node head)
	{
		while(head!=null)
		{
			System.out.print(head.data+"->");
			head=head.next;
		}
		System.out.print("null");
	}
	public static Node del(Node head)
	{
		Node temp=head;
		while(temp.next!=null)
		{
			Node x=temp.next;
			if(x.data==temp.data)
				temp.next=x.next;
		}
		return head;
	}
}