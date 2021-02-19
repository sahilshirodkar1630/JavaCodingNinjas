package Problems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import Implementation.BinaryTreeNode;

public class ContructTree_from_PRE_and_IN {

	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		//Your code goes here
		return buildTreeHelper(preOrder, inOrder, 0, preOrder.length-1, 0, inOrder.length-1);
	}
	
	public static BinaryTreeNode<Integer> buildTreeHelper(int inorder[],int preorder[],int inStart,int inEnd,int preStart,int preEnd){
		
		if(inStart>inEnd) {
			return null;
		}
		
		
		int rootData =  preorder[preStart];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		
		int rootInIndex = -1;
		for(int i=inStart;i<=inEnd;i++) {
			if(inorder[i]== rootData) {
				rootInIndex = i;
				break;
			}
		}
		if(rootInIndex == -1) {
			return null;
		}
		
		int leftInS = inStart;
		int leftInE = rootInIndex -1;
		int leftPreS = preStart+1;
		int leftPreE= leftInE-leftInS+leftPreS;
		int rightInS= rootInIndex+1;
		int rightInE= inEnd;
		int rightPreS = leftPreE+1;
		int rightPreE= preEnd;
		
		root.left = buildTreeHelper(inorder, preorder, leftInS, leftInE, leftPreS, leftPreE);
		root.right = buildTreeHelper(inorder, preorder, rightInS, rightInE, rightPreS, rightPreE);
		
		return root;
	
	}
	
	
	
//	public static BinaryTreeNode<Integer> buildTreeHelper(int[] preOrder, int[] inOrder,int preStart,int preEnd,int inStart,int inEnd) {
//		
//		   if(inStart>inEnd)
//	        {
//	            return null;
//	        }
//			int rootData = preOrder[preStart];
//			BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
//			int count =-1;
//			for(int i=0;i<inOrder.length;i++) {
//				if(inOrder[i]==rootData) {
//					count=i;
//	                break;
//				}
//				// count++;
//			}
//	         if(count==-1)
//	        {
//	            return null;
//	        }
//			
//			int leftInStart=inStart;
//	        int leftInEnd=count-1;
//	        int leftPreStart=preStart+1;
//	        int leftPreEnd=leftInEnd-leftInStart+leftPreStart;
//	        int rightInStart=count+1;
//	        int rightInEnd=inEnd;
//	        int rightPreStart=leftPreEnd+1;
//	        int rightPreEnd=preEnd;
//	        
//			BinaryTreeNode<Integer> leftroot = buildTreeHelper(preOrder,inOrder,leftPreStart,leftPreEnd,leftInStart,leftInEnd);
//			BinaryTreeNode<Integer> rightroot = buildTreeHelper(preOrder,inOrder,rightPreStart,rightPreEnd,rightInStart,rightInEnd);
//			root.left =leftroot;
//			root.right=rightroot;
//			
//	        return root;
//	}
	
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
