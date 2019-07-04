package com.Trees;

public class NormalTree {
	
	static BinaryTreeNode root;
	
	public NormalTree() {
		
		root=null;
	}
	public static void main(String[] args)
	{
		NormalTree binaryTree=new NormalTree();
		
		NormalTree.root=new BinaryTreeNode(1);
		root.left=new BinaryTreeNode(2);
		root.right=new BinaryTreeNode(3);
		root.left.left=new BinaryTreeNode(4);
		root.left.right=new BinaryTreeNode(5);
		root.right.left=new BinaryTreeNode(6);
		root.right.right=new BinaryTreeNode(7);


		
		printTree(root);
	}
	private static void printTree(BinaryTreeNode root) {
		
		
		if(root!=null)
		{
			System.out.println(root.getData());
			printTree( root.getLeft());
			printTree(root.getRight());
		}
	}
	
	

}
