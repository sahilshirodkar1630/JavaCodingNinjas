package Problems;

import java.util.Scanner;

import Problems.isBST.Pair;

public class isBST {
	
	public static class Pair{
		public boolean isBst;
		public int min;
		public int max;
	}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		System.out.println(isBST3(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}
	
	public static  Pair isBST(BinaryTreeNode<Integer> root) {
	
		if(root == null) {
			Pair p = new Pair();
			p.isBst  = true;
			p.min = Integer.MAX_VALUE;
			p.max = Integer.MIN_VALUE;
		}
		
		Pair left  = isBST(root.left);
		Pair right = isBST(root.right);
		
		int min = Math.min(root.data, Math.min(left.min, right.min));
		int max = Math.max(root.data, Math.max(left.max, right.max));
		
		boolean isBst = (root.data > left.max) && (root.data < right.min) && left.isBst && right.isBst;
		
		Pair ans = new Pair();
		
		ans.isBst = isBst;
		ans.max = max;
		ans.min = min;
		return ans;
		
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
//		if(root.data<=leftmax || root.data>=rightmin ) {
//			return false;
//		}
//		
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
