package Classes_and_objects;

public class ComplexNumber {

	private int realNumber;
    private int imaginaryNumber;
    private Boolean isConjugate= false;
    int cont=0;
    
    public ComplexNumber(int realNumber,int imaginaryNumber){
        this.realNumber = realNumber;
        this.imaginaryNumber= imaginaryNumber;
    }
    
    public int getRealNumber() {
    	return realNumber;
    }
    
    public int getImaginaryNumber() {
    	return imaginaryNumber;
    }
    
    public void setRealNumber(int realNumber) {
    	this.realNumber= realNumber;
    }
    
    public void setImaginaryNumber(int imaginaryNumber) {
    	this.imaginaryNumber= imaginaryNumber;
    }
    
    public void print(){
    	if(isConjugate) {
    		System.out.println(realNumber+" - i"+imaginaryNumber);
    	}else {
        System.out.println(realNumber+" + i"+imaginaryNumber);
    	}
    }
    
    public static ComplexNumber add(ComplexNumber c1,ComplexNumber c2) {
    	int RealNumber =  c1.realNumber+c2.realNumber;
        int ImaginaryNumber = c1.imaginaryNumber+c2.imaginaryNumber;
        
        ComplexNumber C = new ComplexNumber(RealNumber,ImaginaryNumber);
        return C;
    }
    
    public void plus(ComplexNumber f2){
        this.realNumber = this.realNumber+f2.realNumber;
        this.imaginaryNumber = this.imaginaryNumber+f2.imaginaryNumber;
    }
        
    public void multiply (ComplexNumber f2){
        int RealNumber=this.realNumber;
        this.realNumber =  (this.realNumber*f2.realNumber)-(this.imaginaryNumber*f2.imaginaryNumber);
        this.imaginaryNumber = f2.imaginaryNumber*RealNumber+this.imaginaryNumber*f2.realNumber;
    }

    public void Conjugate() {
    	if(cont %2 ==0) {
    	isConjugate = true;
    	}else {
    		isConjugate = false;
    	}
    	cont++;
    }
}
