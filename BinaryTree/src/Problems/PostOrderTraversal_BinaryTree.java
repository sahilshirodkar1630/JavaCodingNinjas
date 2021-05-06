package Problems;

import java.util.Scanner;
import java.util.Stack;

import Implementation.BinaryTreeNode;

public class PostOrderTraversal_BinaryTree {

	// Left - Right - Root
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		postOrderRecursive(root);
		System.out.println();
		postOrderIterative(root);
	}
	

	public static void  postOrderIterative(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		Stack<BinaryTreeNode<Integer>> s1 = new Stack<BinaryTreeNode<Integer>>();
		Stack<BinaryTreeNode<Integer>> s2 = new Stack<BinaryTreeNode<Integer>>();
		 s1.push(root);
		 while (!s1.isEmpty()) {
	            // Pop an item from s1 and push it to s2
	            BinaryTreeNode<Integer> temp = s1.pop();
	            s2.push(temp);
	  
	            // Push left and right children of
	            // removed item to s1
	            if (temp.left != null)
	                s1.push(temp.left);
	            if (temp.right != null)
	                s1.push(temp.right);
		 }
	           
		 while (!s2.isEmpty()) {        
			 BinaryTreeNode<Integer> temp = s2.pop();
	         System.out.print(temp.data + " ");      
		 }
	}
	
	public static void  postOrderRecursive(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return ;
		}
		
		postOrderRecursive(root.left);
		postOrderRecursive(root.right);
		System.out.print(root.data+" ");
		
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
				int left =sc.nextInt();
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
