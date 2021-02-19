package Assignments;

import java.util.Scanner;
import java.lang.*;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int basic=sc.nextInt();
        double hra = (0.2*basic);
        double da =(0.5*basic);
        double pf =0.11 * basic;
        char grade = sc.next().charAt(0);
        System.out.println(da);
        System.out.println(pf);
        int allow=0;
        if(grade =='A') {
        	allow =1700;
        	
        }else if(grade =='B') {
        	allow =1500;
        }else {
        	allow =1500;
        }
        double totalsalary = basic+hra+da+allow-pf;
        System.out.println(Math.round(totalsalary));
        

	}

}
