package Problems;

import java.util.Scanner;

//Given a Binary tree, find the largest BST subtree.
//That is, you need to find the BST with maximum height in the given binary tree.
//You have to return the height of largest BST.
public class Largest_BST {

	public static class Output{
		int min;
		int max;
		boolean isBST;
		int height;
	
	}
	
	
	public static Output largestBSTSubtreeHelper(BinaryTreeNode<Integer> root) {
		// Write your code here
		if(root == null) {
			Output ans  = new Output();
			ans.min = Integer.MAX_VALUE;
			ans.max = Integer.MIN_VALUE;
			ans.isBST = true;
			ans.height = 0;
			return ans;
		}
		
		Output lAns = largestBSTSubtreeHelper(root.left);
		Output rAns = largestBSTSubtreeHelper(root.right);
		
		Output Ans  = new Output();
		
		if(lAns.isBST && rAns.isBST) {
			if(lAns.max<root.data&& rAns.min>root.data) {
				Ans.isBST= true;
				Ans.height= Math.max(lAns.height,rAns.height)+1;
			}else {
				Ans.isBST = false;
				Ans.height= Math.max(lAns.height,rAns.height);
			}
		}else {
			Ans.isBST= false;
			Ans.height =Math.max(lAns.height,rAns.height);
		}
		if(lAns.min == Integer.MAX_VALUE&& rAns.min == Integer.MAX_VALUE) {
			Ans.min = root.data;
		}else if(lAns.min == Integer.MAX_VALUE ) {
			if(root.data<rAns.min) {
				Ans.min = root.data;
			}else {
				Ans.min = rAns.min;
			}
		}else if(rAns.min == Integer.MAX_VALUE ) {
			if(root.data<lAns.min) {
				Ans.min = root.data;
			}else {
				Ans.min = lAns.min;
			}
		}
		else {
			if(lAns.min<rAns.min) {
				
			  Ans.min = lAns.min;
			}else {
				Ans.min = rAns.min;
			}
		}
		
		if(lAns.max == Integer.MIN_VALUE&& rAns.max == Integer.MIN_VALUE) {
			Ans.max = root.data;
		}else {
			if(lAns.max>rAns.max) {
			  Ans.max = lAns.max;
			}else {
				Ans.max = rAns.max;
			}
		}
		System.out.println(root.data +" "+Ans.isBST+" "+Ans.height);
		System.out.println("Min "+Ans.min+"Max "+Ans.max);
		
		
		
		return Ans;
		
		
	}
	
	
	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		// Write your code here
		Output ans = largestBSTSubtreeHelper(root);
		return ans.height;
		
		
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTreeNode<Integer> root = takeInputLevelWise();
		System.out.println(largestBSTSubtree(root));
	}

}
