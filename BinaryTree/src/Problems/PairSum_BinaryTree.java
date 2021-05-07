package Problems;

import java.util.ArrayList;
import java.util.Collections;

import Implementation.BinaryTreeNode;

public class PairSum_BinaryTree {

	/*
	Pair Sum Binary Tree
	Send Feedback
	Given a binary tree and an integer S, print all the pair of nodes whose sum equals S.
	Note:
	1. Assume the given binary tree contains all unique elements.
	2. In a pair, print the smaller element first. Order of different pairs doesn't matter.
	Input format :
	The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have a left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.
	The following line of input contains an integer, that denotes the value of S.
	Output Format :
	Print each pair in a new line, as described in the task. 
	Constraints:
	Time Limit: 1 second
	Sample Input 1:
	5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1
	15
	Sample Output 1:
	5 10
	6 9

	 */

    public static void preorder(BinaryTreeNode<Integer> root, ArrayList<Integer> array) {
    	
	if(root == null) {
		return;
	}
	array.add(root.data);
	preorder(root.left, array);
	preorder(root.right, array);
	
    }

    public  static int pairSum(BinaryTreeNode<Integer> root, int sum) {

		ArrayList<Integer> array = new ArrayList<Integer>();
		preorder(root, array);
		Collections.sort(array);
		
		int i=0;
		int j= array.size()-1;
		
		while(i<j) {
			int value = array.get(i)+array.get(j);
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
}
