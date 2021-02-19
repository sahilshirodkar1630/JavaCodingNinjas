package Problems;

import java.util.ArrayList;
import java.util.Scanner;

import Implementation.BinaryTreeNode;
import Implementation.QueueEmptyException;
import Implementation.QueueUsingLL;

public class LevelWiseLinkedList {
	
	public static ArrayList<Node<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
		// Write your code here
		QueueUsingLL<BinaryTreeNode<Integer>> queue =  new QueueUsingLL<BinaryTreeNode<Integer>>();
		Node<Integer> head = null;
		Node<Integer> tail = null;
		ArrayList<Node<Integer>> output = new ArrayList<Node<Integer>>();
		
		queue.enqueue(root);
		queue.enqueue(null);
		while(!queue.isEmpty()) {
			try {
				BinaryTreeNode<Integer> frontNode = queue.dequeue();
				if(frontNode==null) {
					output.add(head);
					if(queue.isEmpty()) {
						break;
					}
					queue.enqueue(null);
					head = null;
					tail = null;
				}else {
				Node<Integer> n = new Node<Integer>(frontNode.data);
				if(head==null) {
					head= n;
					tail= n;
				}else {
					tail.next= n;
					tail= tail.next;
				}
				if(frontNode.left!= null) {
					queue.enqueue(frontNode.left);
				}
				if(frontNode.right!= null) {
					queue.enqueue(frontNode.right);
				}
				}
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		return output;
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
		ArrayList<Node<Integer>> ans = constructLinkedListForEachLevel(root);
		for(int i=0;i<ans.size();i++) {
			System.out.print(ans.get(i).data+" ");
		}
	}

}
