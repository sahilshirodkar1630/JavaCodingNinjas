import java.util.Scanner;

public class Check_number_sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		boolean isDec = true;
		int prev = sc.nextInt();
		int current = sc.nextInt();
		int i=1;
	    while(i<n-1) {
		if(prev==current) {
			System.out.println("false");
			return;
		}else if(current>prev) {
			isDec=false;
			if(isDec==true) {
				System.out.println("false");
				return;
			}
		}else if(current < prev) {
			if(isDec==false) {
				System.out.println("false");
				return;
			}
		}
			prev = current;
			current = sc.nextInt();
		 i++;
		}
		System.out.println("true");
	

}
}
