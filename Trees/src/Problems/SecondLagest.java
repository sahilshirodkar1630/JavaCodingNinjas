package Problems;

import java.util.Scanner;
class DoubleNode {
	TreeNode<Integer> largest ; 
	TreeNode<Integer> Seclargest;
}
public class SecondLagest {
	
	public static DoubleNode findSecondLargestNode(TreeNode<Integer> root){

		if(root == null) {
			DoubleNode d = new DoubleNode();
			d.largest= null;
			d.Seclargest= null;
			return d;
		}

		DoubleNode ans = new DoubleNode();
		ans.largest = root;
		ans.Seclargest = null;
		for(int i=0;i<root.children.size();i++) {
			
			DoubleNode temp = findSecondLargestNode(root.children.get(i));
			if(temp.largest.data>ans.largest.data) {
				TreeNode<Integer> x = ans.largest;
				ans.largest= temp.largest;
				if(ans.Seclargest==null&& temp.Seclargest==null) {
					ans.Seclargest = x;
				}else if(ans.Seclargest==null) {	
						if(x.data< temp.Seclargest.data) {
							ans.Seclargest= temp.Seclargest;
						}else {
							ans.Seclargest= x;
						}
				} else if (temp.Seclargest== null) {
				 if(x.data>temp.largest.data) {
						ans.Seclargest= x;
					}else {
						ans.Seclargest= temp.largest;
					}
				}
			}else {
				if(ans.Seclargest==null&& temp.Seclargest==null) {
					ans.Seclargest = temp.largest; 
				} else if(ans.Seclargest== null) {
					ans.Seclargest= temp.largest;
				}else if(temp.largest.data>ans.Seclargest.data) {
					ans.Seclargest=temp.largest;
				}
					
			}
		}
			
			return ans;

}
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){

		// Write your code here
		DoubleNode ans = findSecondLargestNode(root);
		return ans.Seclargest;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode<Integer> root =  takeTreeInputLevelWise();
		TreeNode<Integer> ans = findSecondLargest(root);
		System.out.println(ans.data);
		
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

}
