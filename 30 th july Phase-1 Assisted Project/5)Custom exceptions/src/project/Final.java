package project;

import java.util.Scanner;

public class Final 
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
            c = a / b;
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\nError : " + Ex.getMessage());
        }
        finally
        {
            System.out.print("\nThe result is : " + c);
        }

	}

}
