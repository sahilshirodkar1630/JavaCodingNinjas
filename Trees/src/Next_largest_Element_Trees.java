import java.util.Scanner;

import Problems.QueueEmptyException;
import Problems.QueueUsingLL;
import Problems.TreeNode;

public class Next_largest_Element_Trees {
public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		
		// Write your code here
	if(root==null) {
		return null;
	}
	TreeNode<Integer> ans = null;
	if(root.data>n) {
		ans= root;
	}

	for(int i=0;i<root.children.size();i++) {
		TreeNode<Integer> ChildAns= findNextLargerNode(root.children.get(i), n);
		if(ChildAns==null) {
			continue;
		}
		if(ans==null) {
			ans = ChildAns;
		}else if(ChildAns.data<ans.data) {
			ans = ChildAns;
		}
	}
	
	return ans;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode<Integer> root =  takeTreeInputLevelWise();
		TreeNode<Integer> ans = findNextLargerNode(root, 10);
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
