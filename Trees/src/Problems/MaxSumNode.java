package Problems;

import java.util.Scanner;

public class MaxSumNode {
	
//	Node having sum of children and node is max
//	Send Feedback
//	Given a tree, find and return the node for which sum of data of all children and the node itself is maximum. In the sum, data of node itself and data of immediate children is to be taken.
//	Input format :
//
//	Line 1 : Elements in level order form separated by space (as per done in class). Order is -
//
//	Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element
//
//	Output format : Node with maximum sum.
//
//	Sample Input 1 :
//	5 3 1 2 3 1 15 2 4 5 1 6 0 0 0 0
//	Sample Output 1 :
//	1
	
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		// Write your code here
		if (root == null) {
			return root;
		}
		if(root.children.size()==0) {
			return root;
		}
		TreeNode<Integer> ans = root;
		int rootSum = root.data;
		for(int i=0;i<root.children.size();i++) {
			rootSum+= root.children.get(i).data;
		}
		
		for(int i=0;i<root.children.size();i++) {
			TreeNode<Integer> child = maxSumNode(root.children.get(i));
			int childSum = child.data;
			for(int j=0;j<child.children.size();j++) {
				childSum+= child.children.get(j).data;
			}
			if(childSum>rootSum) {
				ans = child;
			}
		
		}
		return ans;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode<Integer> root =  takeTreeInputLevelWise();
		TreeNode<Integer> ans = maxSumNode(root);
		System.out.println(ans.data);
	}
	
public static TreeNode<Integer> takeTreeInputLevelWise(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData = sc.nextInt();
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			try {
				TreeNode<Integer> fronNode = pendingNodes.dequeue();
				System.out.println("Enter num of children of "+ fronNode.data);
				int numChildren = sc.nextInt();
				for(int i=0;i<numChildren;i++) {
					System.out.println("Enter "+(i+1)+"th child of "+fronNode.data);
					int child = sc.nextInt();
					TreeNode<Integer> childNode = new  TreeNode<Integer>(child);
					fronNode.children.add(childNode);
					pendingNodes.enqueue(childNode);
				}
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				///Shouldnt come here
				return null;
			}
			
		}
		return root;
		
	}

}
