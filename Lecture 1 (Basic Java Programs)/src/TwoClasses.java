
//Sahil Exp1
class Room {
	float l,br;
	void getdata(float a,float b) {
		l=a;
		br=b;
	}
}
public class TwoClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float area;
		Room room1 =new Room();
		room1.getdata(14,10);
		area = room1.l*room1.br;
		System.out.println("Area= "+area);
		
	}

}
