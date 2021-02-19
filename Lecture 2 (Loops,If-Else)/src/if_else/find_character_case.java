package if_else;

import java.util.Scanner;

public class find_character_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char a=sc.next().charAt(0);	
		if(a =='A'|| a=='B'|| a=='C'|| a=='D'|| a=='E'|| a=='F'|| a=='J'|| a=='H'|| a=='I'|| a=='J'|| a=='K'|| a=='L'|| a=='M'|| a=='N'|| a=='O'|| a=='P'|| a=='Q'|| a=='R'|| a=='S'|| a=='T'|| a=='U'|| a=='V'|| a=='X'|| a=='Y'|| a=='Z') {
			System.out.println("1");
		}else if(a =='a'|| a=='b'|| a=='c'|| a=='d'|| a=='e'|| a=='f'|| a=='j'|| a=='h'|| a=='i'|| a=='j'|| a=='k'|| a=='l'|| a=='m'|| a=='n'|| a=='o'|| a=='p'|| a=='q'|| a=='r'|| a=='s'|| a=='t'|| a=='u'|| a=='v'|| a=='x'|| a=='y'|| a=='z') {
		 System.out.println("0");
		}else {
			System.out.println("-1");
		}
}
}
