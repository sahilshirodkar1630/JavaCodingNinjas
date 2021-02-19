package Problems;

import java.util.Scanner;
import java.util.Stack;

import Implementation.BinaryTreeNode;
import Implementation.QueueEmptyException;
import Implementation.QueueUsingLL;

public class ZigZagTree {

	public static void printZigZag(BinaryTreeNode<Integer> root){

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		if(root == null) {
			return;
		}
		
		
		Stack<BinaryTreeNode<Integer>> S1 = new Stack<BinaryTreeNode<Integer>>();
		Stack<BinaryTreeNode<Integer>> S2 = new Stack<BinaryTreeNode<Integer>>();
		S1.push(root);
		while(!S1.isEmpty()||!S2.isEmpty()){
		
		while(!S1.isEmpty()) {
			BinaryTreeNode<Integer> frontNodeS1= S1.pop();
			System.out.print(frontNodeS1.data+" ");
			if(frontNodeS1.left!=null) {
				S2.push(frontNodeS1.left);
			}
			if(frontNodeS1.right!=null) {
				S2.push(frontNodeS1.right);
			}
			
		}
		System.out.println();
		while(!S2.isEmpty()) {
			BinaryTreeNode<Integer> frontNodeS2 = S2.pop();
			System.out.print(frontNodeS2.data+" ");
			if(frontNodeS2.right!=null) {
				S1.push(frontNodeS2.right);
			}
			if(frontNodeS2.left!=null) {
				S1.push(frontNodeS2.left);
			}
		}
		System.out.println();
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
	public static void main(String args[]) {
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		printZigZag(root);
	}
}
