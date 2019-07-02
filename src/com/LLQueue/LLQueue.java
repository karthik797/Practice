package com.LLQueue;

import com.LinkedList.Node;

public class LLQueue {

	static Node head;
	static Node tail;
	
	LLQueue()
	{
		head=null;
		tail=null;
	}

	
	
	public static void main(String args[])
	{
	
		LLQueue queue=new LLQueue();
		
		enqQueue(1);
		enqQueue(2);
		enqQueue(3);
		enqQueue(4);
		printQueue(head);
		deQueue();
		deQueue();
		deQueue();
		deQueue();
		System.out.println("");
		printQueue(head);

		
	}


	private static int deQueue(){
		
		if(head!=null)
		{
		int returnItem=head.getData();
		head=head.getNext();
		return returnItem;
		}
		else
		{
			return -1;
		}
		
	}



	private static void printQueue(Node head) {
		
		while(head!=null)
		{
			System.out.print(head.getData()+"<--");
			head=head.getNext();
		}
		
	}



	private static void enqQueue(int n) {
		
		if(head==null)
		{
			head=new Node(n,null);
			tail=head;
		}
		else {
			
			Node temp=new Node(n,null);
			tail.setNext(temp);
			tail=temp;
		}
	
	}
	
	
}
