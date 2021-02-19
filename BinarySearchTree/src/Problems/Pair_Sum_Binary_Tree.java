package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
//1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
public class Pair_Sum_Binary_Tree {
	
	public static void preorder(BinaryTreeNode<Integer> root, ArrayList<Integer> array) {
		if(root == null) {
			return;
		}
		array.add(root.data);
		preorder(root.left, array);
		preorder(root.right, array);
	}
	
	 public  static int pairSum(BinaryTreeNode<Integer> root, int sum) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		preorder(root, array);
		
		System.out.println();
		Collections.sort(array);
		
		int i=0;
		int j= array.size()-1;
		while(i<j) {
			int value = array.get(i)+array.get(j);
//			System.out.println(value);
			if(value == sum) {
				System.out.println(array.get(i)+" "+array.get(j));
				i++;
				j--;
			}else if(value>sum) {
				j--;
			}else if(value<sum) {
				i++;
			}
		}
				
		return 0;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		pairSum(root, 9);

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

}
