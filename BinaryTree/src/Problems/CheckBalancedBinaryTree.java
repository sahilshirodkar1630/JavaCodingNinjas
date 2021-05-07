package Problems;

import java.util.Scanner;


import Implementation.BinaryTreeNode;

public class CheckBalancedBinaryTree {


	/*
	Check Balanced
	Send Feedback
	Given a binary tree, check if it is balanced. Return true if given binary tree is balanced, false otherwise.
	Balanced Binary Tree:
	A empty binary tree or binary tree with zero nodes is always balanced. For a non empty binary tree to be balanced, following conditions must be met:
	1. The left and right subtrees must be balanced.
	2. |hL - hR| <= 1, where hL is the height or depth of left subtree and hR is the height or depth of right subtree.    
	Input format:
	The first line of input contains data of the nodes of the tree in level order form. 
	The data of the nodes of the tree is separated by space. If any node does not have a left or right child, take -1 in its place.
	 Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.
	Output format
	The first and only line of output contains true or false.
	Constraints
	Time Limit: 1 second
	Sample Input 1 :
	5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
	Sample Output 1 :
	false
	Sample Input 2 :
	1 2 3 -1 -1 -1 -1
	Sample Output 2 :
	true
	*/
	
	
	public static class Pair{
		int height;
		boolean isBalanced;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	BinaryTreeNode<Integer> root = takeInputLevelWise();
	System.out.println(checkBalanced(root));

	}
	
	
	public static boolean checkBalanced(BinaryTreeNode<Integer> root) {
		
		return checkBalancedHelper(root).isBalanced;
	}
	
	public static Pair checkBalancedHelper(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			Pair output = new Pair();
			output.height = 0;
			output.isBalanced = true;
			return output;
		}
	
		Pair left = checkBalancedHelper(root.left);
		Pair right = checkBalancedHelper(root.right);
		
		int heightDiff = (left.height > right.height)?(left.height - right.height): (right.height - left.height);
		
		
		Pair output = new Pair();
		int height = 1+ Math.max(left.height, right.height);
		output.height = height;
		
		if(!left.isBalanced || !right.isBalanced ||heightDiff>1) {
			output.isBalanced = false;
		}else {
			output.isBalanced = true;
		}
		return output;
		
		
		
		
		
	}
	
	
	public static BinaryTreeNode<Integer> takeInputLevelWise(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData = sc.nextInt();
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		QueueUsingLL<BinaryTreeNode<Integer>> queue = new QueueUsingLL<BinaryTreeNode<Integer>>();
		queue.enqueue(root);
		while(!queue.isEmpty()) {
			try {
				BinaryTreeNode<Integer> frontNode = queue.dequeue();
				
				System.out.println("Enter left child of "+ frontNode.data);
				int left = sc.nextInt();
				if(left !=-1) {
				BinaryTreeNode<Integer> leftNode = new BinaryTreeNode<Integer>(left);
				frontNode.left= leftNode;
				queue.enqueue(leftNode);
				}
				
				System.out.println("Enter right child of "+ frontNode.data);
				int right =sc.nextInt();
				if(right!=-1) {
				BinaryTreeNode<Integer> rightNode = new BinaryTreeNode<Integer>(right);
				frontNode.right= rightNode;
				queue.enqueue(rightNode);
				}
				
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return root;
	}

}
