import java.util.Queue;
import java.util.Scanner;

public class TreeUse {

	public static TreeNode<Integer> takeTreeInput(Scanner sc){
		int n;
		
		System.out.println("Enter next node data");
		n= sc.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(n);
		System.out.println("Enter number of children for "+n);
		
		int chidCount = sc.nextInt();
		for(int i=0;i<chidCount;i++) {
			TreeNode<Integer> child = takeTreeInput(sc);
			root.children.add(child);
		}
		return root;
		
		
	}
	
	public static void printTree (TreeNode<Integer> root) {
		String s = root.data + ":";
		for(int i=0;i<root.children.size();i++) {
			s= s+ root.children.get(i).data+",";
			
		}
		System.out.println(s);
		for(int i=0;i<root.children.size();i++) {
			printTree(root.children.get(i));
			
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
	public static void  printTreeLevelWise(TreeNode<Integer> root) {
		
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		System.out.println(root.data);
		int count =0;
		while(!pendingNodes.isEmpty()) {
			TreeNode<Integer> frontNode;
			try {
				frontNode = pendingNodes.dequeue();
				System.out.print(frontNode.data+" ");
				for(int i=0;i<frontNode.children.size();i++) {
					pendingNodes.enqueue(frontNode.children.get(i));
//					System.out.print(frontNode.children.get(i).data+" ");
				}
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		TreeNode<Integer> root = takeTreeInputLevelWise();
		printTree(root);

	}

}
