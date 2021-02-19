package Classes_and_objects;

public class ComplexNumberUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ComplexNumber c1= new ComplexNumber(3,4);
		ComplexNumber c2= new ComplexNumber(7,2);
		c1.print();
		c2.print();
		c1.plus(c2);
		c1.print();
		c1.Conjugate();
		c1.print();
	}

}
