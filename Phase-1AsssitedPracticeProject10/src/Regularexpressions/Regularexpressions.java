package Regularexpressions;
import java.util.regex.*;
public class Regularexpressions 
{
	public static void main(String[] args) 
	{
		Pattern a = Pattern.compile("hello", Pattern.CASE_INSENSITIVE);
		Matcher b = a.matcher("Hi!Helloeveryone");
		boolean value = b.find();
	    if(value) 
	    {
	      System.out.println("Match found");
	    } 
	    else 
	    {
	      System.out.println("Match not found");
	    }
	}
	

}
