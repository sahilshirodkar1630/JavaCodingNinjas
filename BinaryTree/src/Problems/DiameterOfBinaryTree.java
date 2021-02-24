package Problems;
import java.util.Scanner;
import Implementation.BinaryTreeNode;
import Implementation.QueueEmptyException;
import Implementation.QueueUsingLL;

public class DiameterOfBinaryTree {
	public static class Pair<T,V>{
		public T first;
		public V second;
	}

	public static Pair<Integer, Integer> heightDiameter(BinaryTreeNode<Integer> root){
	
		if(root == null) {
			Pair<Integer, Integer> ans = new Pair<Integer, Integer>();
			ans.first= 0;
			ans.second =0;
			return ans;
		}
		
		Pair<Integer, Integer> lAns = heightDiameter(root.left);
		
		Pair<Integer, Integer> rAns = heightDiameter(root.right);
		
		
		
		int height= 1+Math.max(lAns.first, rAns.first);
		
		int option1 = lAns.first+rAns.first;
		int option2 = lAns.second;
		int option3 = rAns.second;
		
		int diameter = Math.max(option1, Math.max(option2, option3));
		
		Pair<Integer, Integer> ans = new Pair<Integer, Integer>();
		ans.first = height;
		ans.second = diameter;
		return ans;
		
		
		
	}
	
	public static int diameter(BinaryTreeNode<Integer> root) {
		if(root == null ) {
			return 0;
		}
		int option1 = height(root.left)+height(root.right);
		int option2 = diameter(root.left);
		int option3 = diameter(root.right);
		
		return Math.max(option1,Math.max(option2, option3));
	}
	public static int height(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int lh =  height(root.left);
		int rh = height(root.right);
		return Math.max(lh, rh)+1;
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
	
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		
		QueueUsingLL<BinaryTreeNode<Integer>> queue =  new QueueUsingLL<BinaryTreeNode<Integer>>();
		queue.enqueue(root);
		
		while(!queue.isEmpty()) {
			
			BinaryTreeNode<Integer> frontNode;
			try {
				frontNode = queue.dequeue();
				String s = frontNode.data+":";
				if(frontNode.left==null) {
					s+= "L:-1"+",";
				}else {
					s+="L:"+frontNode.left.data+",";
					queue.enqueue(frontNode.left);
				}
				
				if(frontNode.right==null) {
					s+= "R:-1";
				}else {
					s+="R:"+frontNode.right.data;
					queue.enqueue(frontNode.right);
				}
				System.out.println(s);
				
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTreeNode<Integer> root = takeInputLevelWise();
		System.out.println("Diameter : "+heightDiameter(root).second);
		System.out.println("Height : "+heightDiameter(root).first);

		
	
	}

}
