package Implementation;

import java.util.Scanner;

public class BinaryTreeUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
//		BinaryTreeNode<Integer> node1 = new BinaryTreeNode<Integer>(2);
//		root.left =node1;
//		BinaryTreeNode<Integer> node2 = new BinaryTreeNode<Integer>(3);
//		root.right = node2;
//		System.out.println();
//		Scanner sc= new Scanner(System.in);
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		printLevelWise(root);
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
	
	public static void printLevelWise(BinaryTreeNode<Integer> root)  {
        QueueUsingLL<BinaryTreeNode<Integer>> queue = new QueueUsingLL<BinaryTreeNode<Integer>>();
        queue.enqueue(root);
        queue.enqueue(null);
        while(!queue.isEmpty()) {
        	try {
				BinaryTreeNode<Integer> frontNode = queue.dequeue();
				
				if(frontNode==null) {
					if(queue.isEmpty()) {
						break;
					}
					System.out.println();
					queue.enqueue(null);
				}else {
					System.out.print(frontNode.data+" ");
					if(frontNode.left!=null) {
						queue.enqueue(frontNode.left);
					}
					if(frontNode.right!=null) {
						queue.enqueue(frontNode.right);
						
					}
					
				}
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        }
	}
	
//	public static void printLevelWise(BinaryTreeNode<Integer> root) {
//		
//		QueueUsingLL<BinaryTreeNode<Integer>> queue =  new QueueUsingLL<BinaryTreeNode<Integer>>();
//		queue.enqueue(root);
//		
//		while(!queue.isEmpty()) {
//			
//			BinaryTreeNode<Integer> frontNode;
//			try {
//				frontNode = queue.dequeue();
//				String s = frontNode.data+":";
//				if(frontNode.left==null) {
//					s+= "L:-1"+",";
//				}else {
//					s+="L:"+frontNode.left.data+",";
//					queue.enqueue(frontNode.left);
//				}
//				
//				if(frontNode.right==null) {
//					s+= "R:-1";
//				}else {
//					s+="R:"+frontNode.right.data;
//					queue.enqueue(frontNode.right);
//				}
//				System.out.println(s);
//				
//			} catch (QueueEmptyException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			
//			
//		}
//		   
//		
//	}
	
	public static BinaryTreeNode<Integer> takeInput(Scanner sc){
		int rootData;
		System.out.println("Enter root data");
		rootData= sc.nextInt();
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		
		root.left= takeInput(sc);
		root.right = takeInput(sc);
		return root;
	
	}
	
	public static void print(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		String s = root.data+" :";
		if(root.left != null) {
			s += "L"+root.left.data+",";		
		}
		if(root.right != null) {
			s += "R"+root.right.data;	
		}
		System.out.println(s);
		print(root.left);
		print(root.right);
		
	}

}
