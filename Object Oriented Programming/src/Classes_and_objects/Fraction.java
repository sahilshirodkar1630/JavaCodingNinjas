package Classes_and_objects;

public class Fraction {
	private int numerator;
	private int denominator;
	

	public Fraction(int numerator,int denominator)throws DivideByZeroException {
		this.numerator=numerator;
		if(denominator ==0) {
//			TODO error out;
			DivideByZeroException e = new DivideByZeroException();
			throw e;
		}
		
		this.denominator=denominator;
		simplify();
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public void setDenominator(int d) throws DivideByZeroException{
		if(d==0) {
			DivideByZeroException e = new DivideByZeroException();
			throw e;
		}
		this.denominator= d;
		this.simplify();
	}
	
	public void setNumerator(int n) {
		this.numerator= n;
		this.simplify();
	}
	
	public void Print() {
		if(denominator == 1) {
			System.out.println(numerator);
		} else {
			System.out.println(numerator+"/"+denominator);
		}
	}

	private void simplify() {
//		Greater Common Divisor
		int gcd = 1;
		int smaller = Math.min(numerator,denominator);
		 for(int i=2;i<=smaller;i++) {
			 if(numerator%i==0 && denominator%i==0) {
				 gcd= i;
			 }
		 }
		 numerator = numerator/gcd;
		 denominator = denominator/gcd;
	}

	public static Fraction add(Fraction f1,Fraction f2) throws DivideByZeroException {
		int Newnumerator = (f1.numerator * f2.denominator) + (f1.denominator * f2.numerator);
		int Newdenominator = f1.denominator + f2.denominator;
		Fraction f = new Fraction(Newnumerator,Newdenominator);
		return f;
	}
	
	public void add(Fraction f2) {
		 this.numerator = (this.numerator*f2.denominator)+(this.denominator*f2.numerator);
		 this.denominator= this.denominator+f2.denominator;
		 simplify();
	}

	public  void multiply(Fraction f2) {
		this.numerator = this.numerator *f2.numerator;
		this.denominator = this.denominator  * f2.denominator;
		simplify();
		
	}


}
