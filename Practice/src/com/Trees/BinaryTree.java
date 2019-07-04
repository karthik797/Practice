package com.Trees;
import com.Trees.Node;

public class BinaryTree {
	public Node root;
	
	BinaryTree() {
		root=null;
	}

	public static void  main(String args[])
	{
		BinaryTree bTree=new BinaryTree();
		
				
	}

	public void insert(int data) {
		
		if(root==null)
		{
			root=new Node(data);
		}
		else{
			Node temp=root;
			while(data<temp.data)
			{
				if(temp.left==null)
				{
					temp.left=new Node(data);
				}
				else{
					temp=temp.left;
				}
			}
			while(data>temp.data)
			{
				if(temp.right==null)
				{
					temp.right=new Node(data);
				}
				else{
					temp=temp.right;
				}
			}
		}
	}

}
