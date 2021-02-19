import java.util.Scanner;

public class Mearge_Two_Sorted_Array {
	
	public static int[] Merge(int[] array1,int[] array2) {
		   int n= (array1.length)+(array2.length);
		   System.out.println(n);
		int[] ans = new int[n];
		int k=0;
		int j=0;
		int i=0;
		while(i<array1.length && j<array2.length) {
//			System.out.println(array1[i]+ " "+array2[j]);
			if(array1[i]<=array2[j]) {
				ans[k]=array1[i];
				k++;
				i++;
			}else if(array1[i]>array2[j]) {
				ans[k]= array2[j];
				k++;
				j++;
			}
		}
		
		while(i<array1.length) {
			ans[k]=array1[i];
			k++;
			i++;
		}
		while(j<array2.length) {
			ans[k]=array2[j];
			k++;
			j++;
		}
		return ans;
											
	}
	public static void PrintArray(int array[]) {
		int n= array.length;
		  for(int i=0;i<=n-1;i++) {
		        System.out.print(array[i]+" ");
		         
		        }
	        System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = {1,3,4,7,11};
		int[] array2 = {2,4,6};
		int[] ans=Merge(array1, array2);
		int n= ans.length;
	
		PrintArray(ans);
	}

}
