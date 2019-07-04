package com.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	public static void main(String args[])
	{
		BinaryTree bTree=new BinaryTree();
		bTree.insert(1);
		bTree.insert(20);
		bTree.insert(10);
		bTree.insert(5);
		
		BFS bfs=new BFS();
		bfs.BFSTraversal(bTree.root); 
	}

	public void BFSTraversal(Node root) {
		Queue<Node> queue=new LinkedList<>();
		queue.add(root);
		Node temp;
		while(!queue.isEmpty())
		{
			temp=queue.remove();
			System.out.println(" " + temp.data);
			if(temp.left!=null)
				queue.add(temp.left);
			if(temp.right!=null)	
				queue.add(temp.right);
		}
		
	}
}
