

public class CheckSorted {
//
//	public static boolean Checksorted(int input[]) {
//		if(input.length<=1) {
//			return true;
//		}
//		if(input[0]>input[1]) {
//			return false;
//		}
//		int arr[] = new int[input.length-1];
//		for(int i=1;i<arr.length;i++){
//			arr[i-1]=input[i];
//		}
//		boolean ans =Checksorted(arr);
//		return ans;
//	}
	
	public static boolean Checksortedbetter(int[]input,int startIndex) {
		if(startIndex>=input.length-1) {
			return true;
			
		}
		
		if(input[startIndex]> input[startIndex +1]) {
			return false;
		}
		boolean ans = Checksortedbetter(input, startIndex+1);
		return ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {1,2,9,4,5};
		System.out.println(Checksortedbetter(input,0));
	}

}
