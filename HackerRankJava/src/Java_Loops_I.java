import java.util.Scanner;

public class Java_Loops_I {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        for(int i=1;i<=10;i++) {
            int temp=N;
            temp =temp *i;
            System.out.println(N+" x "+i+" = "+temp);
        }
    }
}
