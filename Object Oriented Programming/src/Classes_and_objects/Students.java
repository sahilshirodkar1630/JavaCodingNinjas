package Classes_and_objects;

public class Students {
	
    String name;
    int rollNo;
    Students(int num){
    rollNo = num;
    }   
    public void print(){
    System.out.print(name +" " + rollNo+" ");
    }
//	String Name;
//	private int Roll_no;
//	public Students(String N) {
//		Name = N;
//	}
//	public Students(String N,int rn) {
//		Name= N;
//		Roll_no= rn;
//	}
//	public void Print() {
//		System.out.print("Name: "+ Name);
//		System.out.println(" Roll no: "+ Roll_no);
//	}
//	public void setRollno(int rn) {
//		if(rn<=0) {
//			return;
//		}
//		Roll_no = rn;
//	}
//	public int getRollno() {
//		return Roll_no;
//	}

}
