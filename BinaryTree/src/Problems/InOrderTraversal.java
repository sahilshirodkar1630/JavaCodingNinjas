package Problems;

import java.util.Scanner;
import java.util.Stack;

import Implementation.BinaryTreeNode;

public class InOrderTraversal {

	
	// Left - Root - Right 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		InOrderRecursive(root);
		System.out.println();
		InOrderIterative(root);
	}
	
	public static void  InOrderRecursive(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return ;
		}
		
		InOrderRecursive(root.left);
		System.out.print(root.data+" ");
		InOrderRecursive(root.right);
		
	}
	
	
	public static void  InOrderIterative(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return ;
		}
		
		Stack<BinaryTreeNode<Integer>> stack = new Stack<BinaryTreeNode<Integer>>();
		BinaryTreeNode<Integer> current = root;
		
		while(current!= null || !stack.isEmpty()) {
	 
			while(current != null) {
				stack.push(current);
				current = current.left;
			}
			
			current = stack.pop();
			System.out.print(current.data + " ");
			current = current.right;
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
