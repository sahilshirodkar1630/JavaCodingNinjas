package Problems;

import java.util.Scanner;

import Implementation.BinaryTreeNode;

public class Check_Cousins {

//	Given the binary Tree and two nodes say ‘p’ and ‘q’.
//	Determine whether the two nodes are cousins of each other or not. 
//	Two nodes are said to be cousins of each other if they are at same level of the Binary Tree and have different parents.
//	Do it in O(n).
//	Input format :
//	Line 1 : Nodes in level order form (separated by space). If any node does not have left or right child, take -1 in its place
//	Line 2 : integer value of p 
//	Line 3 : Integer value of q
//	
	public static int isCousinHelper(BinaryTreeNode<Integer> root, int a, int b,int depth) {
		// Write your code here
		if(root == null) {
			return 0;
		}
		
		if(root.data == a||root.data==b) {
			return depth+1;
		}
		int leftOutput = isCousinHelper(root.left, a, b, depth+1);
		int rightOutput = isCousinHelper(root.right, a, b, depth+1);
		if(leftOutput!=0&&rightOutput!=0) {
			if(leftOutput==rightOutput) {
				return Integer.MAX_VALUE;
			}
		}else if(leftOutput==0) {
			return rightOutput;
		}else if(rightOutput==0) {
			return leftOutput;
		}
		return 0;
		

	}
	public static boolean isCousin(BinaryTreeNode<Integer> root, int a, int b) {
		// Write your code here
		int ans = isCousinHelper(root, a, b, 0);
		if(ans== Integer.MAX_VALUE) {
			return true;
		}else {
			return false;
		}
		

	}
	
	static Scanner s = new Scanner(System.in);

	public static BinaryTreeNode<Integer> takeInput(){
		QueueUsingLL<BinaryTreeNode<Integer>>  pendingNodes = new QueueUsingLL<BinaryTreeNode<Integer>>(); 
		int rootData = s.nextInt();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);

		while(!pendingNodes.isEmpty()){
			BinaryTreeNode<Integer> currentNode;
			try {
				currentNode = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				return null;
			}
			int leftChildData = s.nextInt();
			if(leftChildData != -1){
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftChildData);
				currentNode.left = leftChild;
				pendingNodes.enqueue(leftChild);
			}
			int rightChildData = s.nextInt();
			if(rightChildData != -1){
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightChildData);
				currentNode.right = rightChild;
				pendingNodes.enqueue(rightChild);
			}
		}
		return root;
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInput();
		int p = s.nextInt();
		int q = s.nextInt();
		System.out.println(isCousin(root, p, q));
	}

}
