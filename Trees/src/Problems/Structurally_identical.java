package Problems;

import java.util.Scanner;

public class Structurally_identical {

	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){

		// Write your code here
        
        if(root1==null||root2==null){
            return false;
        }
        boolean isIdentical=false;
        if(root1.data==root2.data){
            isIdentical=true;
        }
        int r1 = root1.children.size();
        int r2 = root2.children.size();
        if(r1==r2){
            isIdentical= true;
        }
        if(isIdentical){
            
        	for(int i=0;i<root1.children.size();i++){
        		isIdentical= checkIdentical(root1.children.get(i), root2.children.get(i));
            }
   		 }
        
        return isIdentical;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode<Integer> root =  takeTreeInputLevelWise();
		
		System.out.println();
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
