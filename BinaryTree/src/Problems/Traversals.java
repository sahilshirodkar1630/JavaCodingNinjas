package Problems;

import java.util.Scanner;

import Implementation.BinaryTreeNode;
import Implementation.QueueEmptyException;
import Implementation.QueueUsingLL;

public class Traversals {

	

		public static void Inorder(BinaryTreeNode<Integer> root) {
			
			if(root == null) {
				 return;
			}
			Inorder(root.left);
			System.out.print(root.data+" ");
			Inorder(root.right);
		}
		public static void Preorder(BinaryTreeNode<Integer> root) {
			
			if(root == null) {
				 return;
			}
			System.out.print(root.data+" ");
			Preorder(root.left);
			Preorder(root.right);
		}

public static void Postorder(BinaryTreeNode<Integer> root) {
			
			if(root == null) {
				 return;
			}
			
			Postorder(root.left);
			Postorder(root.right);
			System.out.print(root.data+" ");
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
			Preorder(root);
			System.out.println();
			Inorder(root);
			System.out.println();
			Postorder(root);
		}
	

}
