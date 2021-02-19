import java.util.Scanner;

public class Highest_Occuring_Character {
	public static void PrintArray(int array[]) {
		int n= array.length;
		  for(int i=0;i<=n-1;i++) {
		        System.out.print(array[i]+" ");
		         
		        }
	        System.out.println();
	}

	public static char HighestChar(String str){
		int a[] = new int[256];
		int max =0;
		int val =0;
		for(int i=0;i<str.length();i++) {
			int value = a[(int)(str.charAt(i))];
			a[(int)(str.charAt(i))]= value=value+1;
			
		}
		PrintArray(a);
		
			for(int j=1;j<a.length;j++) {
			if(a[j]>a[max]) {
				max=j;
				val=j;
			}
			}

		System.out.println(val);


		char ch = (char)val ;
		return ch;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch =HighestChar(str);
		System.out.println(ch);
	}

}
