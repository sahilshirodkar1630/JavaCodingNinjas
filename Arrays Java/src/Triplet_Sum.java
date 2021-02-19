import java.util.Arrays;
import java.util.Scanner;

public class Triplet_Sum {
	
	public static int[] Takeinput(){
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int array[] = new  int[n];
	        for(int i=0;i<=n-1;i++) {
	         array[i]=sc.nextInt();
	        }
	        
	         return array;

	}
	public static void PrintArray(int array[]) {
		int n= array.length;
		  for(int i=0;i<=n-1;i++) {
		        System.out.print(array[i]+" ");
		         
		        }
	        System.out.println();
	}
	public static int TriSum(int[] array,int num) {

	Arrays.sort(array);
	int n=array.length;
	int count=0;
	for(int i=0;i<n;i++) {
		int pairSumfor = num=array[i];
		int countSum = pairSum(array,(i+1),(n-1),num);
		count += countSum;
	}
	return count;
	}
	public static int pairSum(int[] array,int i,int j, int num) {
		
		
		int count=0;
		while(i<j) {
			int val = array[i]+array[j];
			 if(val>num) {
				j--;
			}else if(val<num) {
				i++;
			}else {
				int  elemAtStart = array[i];
				int elemAtEnd = array[j];
				
				if(elemAtStart == elemAtEnd) {
					int totalElemFromStarttoEnd = (j-i)+1;
					count+=(totalElemFromStarttoEnd*(totalElemFromStarttoEnd-1)/2);
					return count;
				}
				int tempI = i+1;
				int tempJ = j-1;
				
				while(tempI<=tempJ && array[tempI]==elemAtStart) {
					tempI+=1;
				}
				
				while(tempJ>=tempI && array[tempJ]==elemAtEnd) {
					tempJ-=1;
				}
				int totalElementfromSTart = (tempI-i);
				int totalElementfromEnd = (j-tempJ);
				count += (totalElementfromSTart*totalElementfromEnd);
				
				i=tempI;
				j=tempJ;
				
			}
			
		}
		return count;
		
	
	}
	
	public static int TriSum(int[] array) {
		int value=0;
		for(int i=0;i<array.length;i++) {
			int sum =0;
			for(int j=i+1;j<array.length;j++) {
				
				for(int k=j+1;k<array.length;k++) {
//					System.out.print(array[i]+""+array[j]+""+array[k]+" ");
					sum = array[i]+array[j]+array[k];
				if(sum ==12) {
					value ++;
				}
				}
//				System.out.print(sum);
//				System.out.println();
			}
		}
		return value;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = Takeinput();
		System.out.println(TriSum(array));
	}

}
