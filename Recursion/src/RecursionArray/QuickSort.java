package RecursionArray;

public class QuickSort {
	
	public static int Partition(int[]input, int s,int e) {
	
		int i= s;
		int j=e;
		int pivot = input[s];
		System.out.println(pivot+" pivot");
		int count =0;
		for(int k=s;k<input.length;k++) {
			if(input[k]<pivot) {
				count++;
			}
		}
		int pivotpos=s+count;
		System.out.println(pivotpos);
		int temp =input[s];
		input[s]=input[pivotpos];
		input[pivotpos]=temp;
		
	
		while(i<pivotpos&& j>pivotpos) {
			
			if(input[i]>=pivot) {
				if(input[j]<pivot) {
					temp = input[i];
					input[i]= input[j];
					input[j]= temp;	
					i++;
					j--;
				}else {
					j--;
				}	
			}else {
				i++;
			}
			
		
		}
		for(int k=0;k<input.length;k++) {
			System.out.print(input[k]);
		}
		System.out.println();
		return pivotpos;
		
	}
	public static void quickSort(int[]input,int s,int e) {
	if(s>=e) {
		return;
	}
	int pivotposition= Partition(input,s,e);
	quickSort(input, s, pivotposition-1);
	quickSort(input, pivotposition+1, e);
	
	
	}
	public static void quickSort(int[]input) {
		quickSort(input,0,input.length-1);
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2,4,7,8,2,4,7,8};
		quickSort(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
		}
		
	}

}
