package com.LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
	static Node headNode=null;

	public static void main(String[] args)
	{
		int data=-1;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			data=Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(
				"1.Add element to LinkedList at tail\n" +
						"2.Add element to LinkedList at head" +
						"3.Remove element from tail " +
						"4.Remove element from head " +
						"5.Print all elements "	
				);
		while(data>1)
		{
			switch(data)
			{
			case 1:
				addAtTail(headNode,data);
				break;
			case 2:
				System.out.println("test");
				break;
			case 3:
				printLinkedList(headNode);
				break;
			}
		}

	}
	private static void printLinkedList(Node headNode) {

		Node currentNode=headNode;
		if(headNode!=null)
		{
			while(currentNode.Next!=null)
			{
				System.out.println(currentNode.getData());
				currentNode=currentNode.Next;
			}
		}	
	}
	private static void addAtTail(Node headNode, int data) {

		if(headNode!=null)
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


}
