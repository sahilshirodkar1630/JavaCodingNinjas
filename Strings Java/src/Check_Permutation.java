import java.util.Scanner;

//For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.
//Permutations of each other
//Two strings are said to be a permutation of each other when either of the string's 
//characters can be rearranged so that it becomes identical to the other one.
//
//Example: 
//str1= "sinrtg" 
//str2 = "string"
//
//The character of the first string(str1) can be rearranged to form str2 and 
//hence we can say that the given strings are a permutation of each other.
public class Check_Permutation {
	public static boolean isPermutation(String str1, String str2) {
		//Your code goes here

	
		
		
		int[] a = new int[256];
	
		int i=0;
		while(i<str1.length()) {
			int value =a[(int)(str1.charAt(i))];
			a[(int)(str1.charAt(i))] = value=value+1;
			i++;
		}
		for(int j=0;j<str2.length();j++) {
			int value = a[(int)(str2.charAt(j))];
			a[(int)(str2.charAt(j))] = value = value-1;
		}
		for(int j=0;j<a.length;j++) {
			if(a[j]!=0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println(isPermutation(str1, str2));
	}
	public static void PrintArray(int array[]) {
		int n= array.length;
		  for(int i=0;i<=n-1;i++) {
		        System.out.print(array[i]+" ");
		         
		        }
	        System.out.println();
	}

}
