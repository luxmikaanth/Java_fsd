package project;
import java.util.Scanner;
public class Throw1 {

	public static void main(String[] args) 
	{
		Throw1 T =new Throw1();
		try
		{
			T.Division();
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Error: "+ex.getMessage());
			
		}
	}
	
	void Division()throws ArithmeticException
	{
		int a,b,c;
		Scanner u = new Scanner(System.in);
		System.out.println("Enter 2 number: ");
		a =u.nextInt();
		b=u.nextInt();
		c=a/b;
		System.out.println("solution: "+c);
	}

}
