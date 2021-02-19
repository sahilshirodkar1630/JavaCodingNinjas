package Problems;

import java.util.Scanner;

public class PreOrderTraversal {
	
	
	public static void preOrderTraversal(TreeNode<Integer> root) {
	
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		
		for(int i=0;i<root.children.size();i++) {
			preOrderTraversal(root.children.get(i));
		}
		
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
	public static void main(String args[]){
		TreeNode<Integer> root = takeTreeInputLevelWise();
		preOrderTraversal(root);
		
	}
}
