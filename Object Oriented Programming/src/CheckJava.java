
public class CheckJava {
	public static void main(String args[ ])
    {
        String str1= new String("JAVA");
        String str2= new String("PYTHON");   
           
        try
        {
            if(str1.equals("JAVA"))           
                System.out.println(" String is : "+str1);
            else           
           
                throw new NoMatchException(str1);
           
            if(str2.equals("JAVA"))
                System.out.println("\n String is : "+str2);
            else
                throw new NoMatchException(str2);            
        }
        catch(NoMatchException e)
        {
            System.out.println("\nCaught ...."+e);
        }
    }
}
