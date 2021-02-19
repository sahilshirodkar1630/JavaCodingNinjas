package Problems;

import java.util.Scanner;

public class PrintAllNodesAtKthDepth {

	public static void printAtKDepth(TreeNode<Integer> root,int k) {
		if(k< 0 ) {
			return;
		}
		if(k==0) {
			System.out.print(root.data+" ");
			return;
		}
		for(int i=0;i<root.children.size();i++) {
			printAtKDepth(root.children.get(i), k-1);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeTreeInputLevelWise();
		printAtKDepth(root, 2);

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


	public static void printTree (TreeNode<Integer> root){
	String s = root.data + ":";
	for(int i=0;i<root.children.size();i++) {
		s= s+ root.children.get(i).data+",";	
	}
	System.out.println(s);
	for(int i=0;i<root.children.size();i++) {
		printTree(root.children.get(i));
		
	}
	
	}
}
