package com.LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkedList {

	static Node headNode=null;


	public static void main(String args[]) throws NumberFormatException, IOException
	{
		boolean flag=true;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(flag)
		{
		addAtTail(Integer.parseInt(br.readLine()));
		System.out.println("Enter 'true' for adding more elements, otherwise 'false'");
		flag=Boolean.parseBoolean(br.readLine());
		}
		printLinkedList(headNode);
		flag=true;
		while(flag)
		{
		addAtHead(Integer.parseInt(br.readLine()));
		System.out.println("Enter 'true' for adding more elements, otherwise 'false'");
		flag=Boolean.parseBoolean(br.readLine());
		}
		printLinkedList(headNode);
	}



private static void printLinkedList(Node headNode) {

	
	Node currentNode=headNode;

		while(currentNode!=null)
		{
			System.out.print(currentNode.getData()+"<--");
			currentNode=currentNode.Next;
		}
	
}
private static void addAtTail(int data) {

	if(headNode!= null)
	{
		Node currentNode=headNode;
		while(currentNode.Next!=null)
		{
			currentNode=currentNode.Next;
		}
		currentNode.setNext(new Node(data, null));

	}
	else {
		
		headNode=new Node(data,null);	
	}

}
private static void addAtHead(int data) {

	if(headNode!= null)
	{
		
		Node newNode=new Node(data,null);
		newNode.setNext(headNode);
		headNode=newNode;

	}
	else {
		
		headNode=new Node(data,null);	
	}

}


}
