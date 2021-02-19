package Classes_and_objects;

public class Polynomial {

	int[] array;
	
	public Polynomial() {
		array= new int[10];
	}
	
	public void setCoefficient(int degree,int value) {
		
	if(degree<array.length) {
		array[degree]=value;
	}else {
		int temp[] = array;
		array=  new int[degree+1];
		for(int i=0;i<temp.length;i++) {
			array[i]= temp[i];
		}
	}	
	}
	
	public void print() {
		for(int i=0;i<array.length;i++) {
			if(array[i]!=0) {
			System.out.println(i+"x"+array[i]+" ");
		}
		}
	}
	
	public Polynomial add(Polynomial p){

        Polynomial p1 = new Polynomial();
      int val1 = this.array.length;
      int val2 = p.array.length;
      int len = Math.min(val1, val2);
      for(int i=0;i<len;i++) {
    	  p1.setCoefficient(i, this.array[i]+p.array[i]);
      }
      
        int i=0;
        while(i<this.array.length) {
        	p1.setCoefficient(i, this.array[i]+p.array[i]);
        	i++;
        }
         i=0;
        while(i<p.array.length) {
        	p1.setCoefficient(i, this.array[i]+p.array[i]);
        	i++;
        }
        
		return p1;
	}
	
}