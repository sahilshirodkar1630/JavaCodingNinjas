import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
public class Java_SingletonPattern {
	
	  public String str;
	     private Java_SingletonPattern(){
	     }
	    private static Java_SingletonPattern obj = null;
	    public static Java_SingletonPattern getSingleInstance(){
	        if(obj ==null){
	            obj = new Java_SingletonPattern();
	        }
	        return obj;
	    }
	

}
