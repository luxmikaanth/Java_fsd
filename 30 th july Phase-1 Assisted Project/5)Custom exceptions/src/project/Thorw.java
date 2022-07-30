package project;
import java.util.Scanner;
public class Thorw 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner u = new Scanner(System.in);
		System.out.println("Enter 2 number: ");
		a =u.nextInt();
		b=u.nextInt();
        try
        {
            if(b==0)        
            	throw(new ArithmeticException("Can't divide by zero."));
            else
            {
                c = a / b;
                System.out.print("The result is : " + c);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.println("Error : " + Ex.getMessage());
        }
    }
}
