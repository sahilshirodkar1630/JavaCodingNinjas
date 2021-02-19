
public class NoMatchException extends Exception{
	private String str;
	   
    NoMatchException(String str1)
    {
        str=str1;
    }

    public String toString()
    {
        return "NoMatchException --> String is not JAVA and string is "+str;
    }
}
