
public class Java_Inheritance1 {
	public static class Animal{
		void walk()
		{
			System.out.println("I am walking");
		}
	}
	public static class Bird extends Animal
	{
		void fly()
		{
			System.out.println("I am flying");
		}
	    void sing()
	    {
	        System.out.println("I am singing");
	    }
	}
	public static void main(String args[]){

		  Bird bird = new Bird();
		  bird.walk();
		  bird.fly();
	      bird.sing();
		
	   }
}
