package project;

import java.util.Scanner;

public class main 
{
	public static void main(String[] args) 
	{
		int a,b,c = 0;
		Scanner u = new Scanner(System.in);
		System.out.println("Enter 2 number: ");
		a =u.nextInt();
		b=u.nextInt();
		try
		{
	      c=a/b;
	    }
	    catch (ArithmeticException e) 
		{
	      System.out.println("ArithmeticException => " + e.getMessage());
	    }
	    finally 
	    {
	      System.out.println("This is the finally block " +c);
	    }
	}

}
