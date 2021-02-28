import java.util.Scanner;

public class Min_Steps_to_1 {

	
	public static int countMinStepsToOne(int n) {
		//Your code goes here
		if(n==1) {

			return 0;
		}
		int step = countMinStepsToOne(n-1);
		
		if(n%3==0) {
			int temp =countMinStepsToOne(n/3);
			if(temp<step) {
				step = temp;
			}
		}
		if(n%2==0) {
			int temp = countMinStepsToOne(n/2);
			if(temp<step) {
				step = temp;
			}
		}
		return step+1;
	}
	
	
	
	
	
	public static int countMinStepsToOneM(int n) {
		//Your code goes here
		int[] storage = new int[n+1];
		for(int i=0;i<=n;i++) {
			storage[i] = -1;
		}
		return countMinStepsToOneM(n, storage);
	}
	public static int countMinStepsToOneM(int n,int[]storage) {
		//Your code goes here
		if(n==1) {
			storage[n]= 0;
			return storage[n];
		}
		
		if(storage[n]!=-1) {
			return storage[n];
		}
		
		int step = Integer.MAX_VALUE;
		
		if(n%3==0) {
			step=countMinStepsToOneM(n/3,storage)+1;
		}
		if(n%2==0) {
			int temp = countMinStepsToOneM(n/2,storage)+1;
			if(temp<step) {
				step = temp;
			}
		}
		int temp = countMinStepsToOneM(n-1,storage)+1;
		if(temp<step) {
			step = temp;
		}
		storage[n]= step;
		return step;
		
	}
	
	// Dynamic Programming
	public static int countMinStepsToOneDP(int n) {
		//Your code goes here
		int[] storage = new int[n+1];
		storage[1] = 0;
		
		
		for(int i=2;i<=n;i++) {
			int steps =storage[i-1];;
			if(i%3==0) {
				int option2=storage[i/3];
				if(option2<steps) {
					steps = option2;
				}
			}
			if(i%2==0) {
				int option3  = storage[i/2];
				if(option3<steps) {
					steps = option3;
				}
			}
			storage[i]= steps+1;
			
			
		}
		return storage[n];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println(countMinStepsToOneDP(n));
		System.out.println(countMinStepsToOneM(n));
		System.out.println(countMinStepsToOne(n));
		
	}

}
