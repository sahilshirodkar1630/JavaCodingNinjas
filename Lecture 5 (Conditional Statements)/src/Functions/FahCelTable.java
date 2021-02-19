package Functions;

import java.util.Scanner;

public class FahCelTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start=sc.nextInt();
		int end = sc.nextInt();
		int step = sc.nextInt();
		FahCelTable.printFahrenheitTable(start, end, step);
	}
	public static void printFahrenheitTable(int start, int end, int step) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print the specified output in required format. 
		 * Taking input is handled automatically. 
		 */
        int fah= start;
        while(fah <= end){
        int cel = (5*(fah-32))/9;
        System.out.println(fah+" "+cel);
        fah=fah+step;
        }
	}

}
