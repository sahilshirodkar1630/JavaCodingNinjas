import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Rotate_leftHackerRank {
	
	
	 public static List<Integer> rotateLeft(int d, List<Integer> arr) {
		    // Write your code here
		        ArrayList<Integer> output = new ArrayList<Integer>();
		        int array[]= new int[arr.size()];
		        for(int i=0;i<arr.size();i++) {
		        	array[i]=arr.get(i);
		        }
		        
		       int temp[]= new int[d];
		       for(int i=0;i<temp.length;i++) {
		    	   temp[i]= array[i];
//		    	   System.out.println(array[i]);
		       }
		        for(int i=d;i<array.length;i++) {
		        	array[i-d]=array[i];
//		        	System.out.print(array[i-d]+"");
		        }
		        int k=0;
		        for(int i=array.length-d;i<array.length;i++) {
		        	array[i]=temp[k];
		        	k++;
		        }
		        arr.clear();
		        for(int i=0;i<array.length;i++) {
		          arr.add(array[i]);
		        }

		        return arr;
		    }

	 public static void main(String[] args) throws IOException {
	     Scanner sc = new Scanner (System.in);
	     ArrayList<Integer> array = new ArrayList<Integer>();
	     int n = sc.nextInt();
	     for(int i=0;i<n;i++) {
	    	 array.add(sc.nextInt());
	     }
	     
	     List<Integer> ans = rotateLeft(4, array);
	     for(int i: ans) {
	    	 System.out.print(i+" ");
	     }
	     
	 }

}
