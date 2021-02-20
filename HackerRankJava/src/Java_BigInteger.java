import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Java_BigInteger {

	public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        BigInteger num = sc.nextBigInteger(); 
        BigInteger b = sc.nextBigInteger(); 
        BigInteger r= num.add(b);
        BigInteger s= num.multiply(b);
        System.out.println(r);
        System.out.println(s);
    

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
