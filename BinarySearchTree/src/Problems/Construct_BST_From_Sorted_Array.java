package Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Construct_BST_From_Sorted_Array {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	
	
	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int start,int end){
        if(start>end){
            return null;
        }
        
        int size = start+end;
        int mid = size/2;
    	BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[mid]);
    	System.out.println(root.data);
        root.left = SortedArrayToBST(arr,start,mid-1);
        root.right = SortedArrayToBST(arr,mid+1,end);
//        System.out.println(root.data+" "+root.left.data+" "+root.right.data);
        
        return root;
	}
		
    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
		return SortedArrayToBST(arr,0,arr.length-1);
		
    }

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int len = Integer.parseInt(st.nextToken());
		int arr[] = new int[len];
		if(len>0)
		{
			st = new StringTokenizer(br.readLine());
		}
		for(int i=0;i<len;i++)
		{
		    arr[i]=Integer.parseInt(st.nextToken());
		}
		BinaryTreeNode<Integer> ans = SortedArrayToBST(arr, len);
		preOrder(ans);
	}
	
	private static void preOrder(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

}
