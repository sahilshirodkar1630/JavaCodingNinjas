package Problems;

import java.util.Scanner;
import java.util.Stack;

import Implementation.BinaryTreeNode;

public class PreOrderTraversal_BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Root - Left - Right
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		preOrderRecursive(root);
		System.out.println();
		preOrderIterative(root);

	}
	
	public static void  preOrderRecursive(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return ;
		}
		
		System.out.print(root.data+" ");
		preOrderRecursive(root.left);
		preOrderRecursive(root.right);	
		
	}
	
	public static void  preOrderIterative(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return ;
		}
		Stack<BinaryTreeNode<Integer>> stack = new Stack<BinaryTreeNode<Integer>>();
		BinaryTreeNode<Integer> current = root;
		
		while(current!= null || !stack.isEmpty()) {
	 
			while(current != null) {
				System.out.print(current.data + " "); // Print left children while exist
				
				if(current.right != null) {
					stack.push(current.right); // and keep pushing right into the stack
				}
				current = current.left;
			}
			// We reach when curr is NULL, so We
	        // take out a right child from stack
			if(!stack.isEmpty()) {
				current = stack.pop();
			}
		}	
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
