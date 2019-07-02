package com.LinkedList;

public class Node {
	
	private int data;
	Node Next;
	
	public Node(int data, Node next) {
		super();
		this.data = data;
		Next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return Next;
	}
	public void setNext(Node next) {
		Next = next;
	}

	
	

}
