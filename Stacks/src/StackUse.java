
public class StackUse {

	public static void main(String[] args) throws StackFullException {
		// TODO Auto-generated method stub
		StackUsingArray s  = new StackUsingArray(3);
		for(int i=1;i<=50;i++){
			s.push(i);
		}
		
		while(!s.isEmpty()) {
			try {
				System.out.println(s.pop());
				
			}catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
