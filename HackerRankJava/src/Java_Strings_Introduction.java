import java.util.Scanner;

public class Java_Strings_Introduction {
	
public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum =a.length();
        sum = sum +b.length();
        System.out.println(sum);
         int g= a.compareTo(b);
                            if(g<=0){
                                System.out.println("No");
                            }
                            else {
                                System.out.println("Yes");
                            }
              String c[]=a.split("");
                for(int i=0;i<c.length;i++)
                {
                        if(i==0)
                        {
                            System.out.print(c[0].toUpperCase());
                        }
                        else {
                    
                    System.out.print(c[i]);
                        }
                }
                System.out.print(" ");
                String d[]=b.split("");
                for(int i=0;i<d.length;i++)
                {
                    if(i==0) {
                        System.out.print(d[0].toUpperCase());
                    }else {
                    System.out.print(d[i]);
                    }
                }                   
    }
	
}
