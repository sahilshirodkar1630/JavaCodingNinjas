package Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

import Implementation.BinaryTreeNode;
import Problems.ContructTree_from_PRE_and_IN.Pair;

public class ConstructTree_from_Post_N_In {

//	7
//	4 5 2 6 7 3 1 
//	4 2 5 1 6 3 7 
	
	
	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
		//Your code goes here
		return buildTreeHelper(postOrder, inOrder, 0, inOrder.length-1, 0, postOrder.length-1);
		
	}
	
	
	public static BinaryTreeNode<Integer> buildTreeHelper(int[] postOrder, int[] inOrder,int inStart,int inEnd,int postStart,int postEnd) {
		
		//Your code goes here
		if(inStart>inEnd) {
			return null;
		}
		
		
		int rootData = postOrder[postEnd];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		
		int count = -1;	
		for(int i=inStart;i<=inEnd;i++) {
			if(inOrder[i] == rootData) {
				count = i;
				break;
			}
		}
		if(count == -1) {
			return null;
		}
//		4 5 2 6 7 3 1 
//		4 2 5 1 6 3 7 
		
		int leftInS=  inStart;
		int leftInE = count-1;
		int leftPostS= postStart;
		int leftPostE= leftInE- leftInS+leftPostS;
		int rightInS= count+1;
		int rightInE= inEnd; 
		int rightPostS = leftPostE+1;
		int rightPostE = rightInE- rightInS+ rightPostS;
		
		root.left = buildTreeHelper(postOrder, inOrder, leftInS, leftInE, leftPostS, leftPostE);
		root.right = buildTreeHelper(postOrder, inOrder, rightInS, rightInE, rightPostS, rightPostE);
		
		return root;
	}
	
	public static class Pair {
		int[] preOrder;
		int[] inOrder;

		public Pair(int[] preOrder, int[] inOrder) {
			this.preOrder = preOrder;
			this.inOrder = inOrder;
		}

	}
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static Pair takeInput() throws NumberFormatException, IOException {
    	int n = Integer.parseInt(br.readLine().trim());

    	int pre[] = new int[n];
    	int in[] = new int[n];

    	String[] preOrder = br.readLine().trim().split(" ");
    	String[] inOrder = br.readLine().trim().split(" ");


    	for (int i = 0; i < n; i++) {
    		pre[i] = Integer.parseInt(preOrder[i].trim());
    		in[i] = Integer.parseInt(inOrder[i].trim());
    	}

    	return new Pair(pre, in);

    }

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		
		Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
		pendingNodes.add(root);
        pendingNodes.add(null);

		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = pendingNodes.poll();

        
	        if (frontNode == null) {
	            System.out.println();

	            if (!pendingNodes.isEmpty()) {
	                pendingNodes.add(null);
	            }

	        } else {
	        	System.out.print(frontNode.data + " ");

	            if (frontNode.left != null) {
	                pendingNodes.add(frontNode.left);
	            } 

	            if (frontNode.right != null) {
	                pendingNodes.add(frontNode.right);
	            } 
	        }

		}
		
	}
    public static void main(String[] args) throws NumberFormatException, IOException {

    	Pair input = takeInput();

    	int[] preOrder = input.preOrder;
    	int[] inOrder = input.inOrder;

    	BinaryTreeNode<Integer> root = buildTree(preOrder, inOrder);

    	printLevelWise(root);

    }
}
