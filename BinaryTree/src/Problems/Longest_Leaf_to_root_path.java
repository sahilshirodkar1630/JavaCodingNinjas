package Problems;

import java.util.ArrayList;
import java.util.Scanner;

import Implementation.BinaryTreeNode;

public class Longest_Leaf_to_root_path {

//	Longest Leaf to root path
//	Send Feedback
//	Given a binary tree, return the longest path from leaf to root. Longest means, a path which contain maximum number of nodes from leaf to root.
//	Input format :
//
//	Elements in level order form (separated by space)
//
//	(If any node does not have left or right child, take -1 in its place)
//
//	Line 1 : Binary Tree 1 (separated by space)
//
//	Sample Input 1 :
//	 5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
//	Sample Output 1 :
//	9
//	3
//	6
//	5
	
	
public static class Pair{
	ArrayList<Integer> array ;
	int height;
}

	public static Pair helper(BinaryTreeNode<Integer> root){
		if(root == null) {
			Pair output = new Pair();
			output.array= new ArrayList<Integer>() ;
			output.height = 0;
			return output;
		}
		ArrayList<Integer> array = new ArrayList<Integer>();
		Pair leftOutput = helper(root.left);
		Pair rightOutput = helper(root.right);
		if(leftOutput.height>rightOutput.height) {
			
			leftOutput.array.add(root.data);
			leftOutput.height = leftOutput.height+1;
			return leftOutput;
		}else {
			rightOutput.array.add(root.data);
			rightOutput.height = rightOutput.height+1;
			return rightOutput;
		}
		
	}

	public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root){
		// Write your code here
		Pair ans = helper(root);
		return ans.array;
		
	}
	static Scanner s = new Scanner(System.in);

	public static BinaryTreeNode<Integer> takeInput(){
		QueueUsingLL<BinaryTreeNode<Integer>>  pendingNodes = new QueueUsingLL<BinaryTreeNode<Integer>>(); // we can skip writing again inside <> after java version 1.7 
		Scanner s = new Scanner(System.in);
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
		ArrayList<Integer> output = longestRootToLeafPath(root);
		for(int i : output) {
			System.out.println(i);
		}
	}

}
