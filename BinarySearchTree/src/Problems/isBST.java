package Problems;

import java.util.Scanner;

public class isBST {
	
	public static class Pair<T,V>{
		public T first;
		public V second;
	}
	
	public static Pair<Boolean,Pair<Integer,Integer>> isBST2(BinaryTreeNode<Integer> root){
		if(root == null) {
			Pair<Boolean, Pair<Integer,Integer>> output = new Pair<Boolean, isBST.Pair<Integer,Integer>>();
			output.first = true;
			output.second = new Pair<Integer, Integer>();
			output.second.first = Integer.MAX_VALUE;
			output.second.second = Integer.MIN_VALUE;
			return output;
		}
		Pair<Boolean, Pair<Integer,Integer>> leftOutput = isBST2(root.left);
		Pair<Boolean, Pair<Integer,Integer>> rightOutput = isBST2(root.right);
		int min = Math.min(root.data,Math.min(leftOutput.second.first, rightOutput.second.first));
		int max = Math.max(root.data,Math.max(leftOutput.second.second, rightOutput.second.second));
		
		boolean isBst= (root.data>leftOutput.second.second) 
				&& (root.data <= rightOutput.second.first)
				&& leftOutput.first && rightOutput.first;
		
		Pair<Boolean, Pair<Integer,Integer>> output = new Pair<Boolean, isBST.Pair<Integer,Integer>>();
		output.first = isBst;
		output.second = new Pair<Integer, Integer>();
		output.second.first = min;
		output.second.second = max;
		return output;
		
		
		
	}
	public static boolean isBST3(BinaryTreeNode<Integer> root,int min ,int max) {
		if(root == null) {
			return true;
		}
		if(root.data < min || root.data > max) {
			return false;
		}
		boolean isLeftOk = isBST3(root.left, min, root.data-1);
		boolean isRightOk = isBST3(root.right, root.data, max);
		
		return isLeftOk&& isRightOk;
	}
	
	

//	public static int minimum(BinaryTreeNode<Integer> root) {
//		if(root == null) {
//			return Integer.MAX_VALUE;
//		}
//		return Math.min(root.data, Math.min(minimum(root.left),minimum(root.right)));
//	}
//	public static int maximum(BinaryTreeNode<Integer> root) {
//		if(root == null) {
//			return Integer.MIN_VALUE;
//		}
//		return Math.max(root.data, Math.max(maximum(root.left),maximum(root.right)));
//	}
//	public static boolean isBST(BinaryTreeNode<Integer> root) {
//		if(root == null) {
//			return true;
//		}
//		int leftmax = maximum(root.left);
//		int rightmin = minimum(root.right);
//		if(root.data<=leftmax) {
//			return false;
//		}else if (root.data>=rightmin) {
//			return false;
//		}
//		boolean isleftBST = isBST(root.left);
//		boolean isRightBST = isBST(root.right);
//		if(isleftBST&& isRightBST ) {
//			return true;
//		}else {
//			return false;
//		}
//		
//		
//	}
//	
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTreeNode<Integer> root = takeInputLevelWise();
		System.out.println(isBST3(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

}
