package Calculator;
import java.util.Scanner;
public class Calculator 
{
	public static void main(String[] args) 
	{
		double a,b,c;
		char d;
		Scanner u = new Scanner(System.in);
		System.out.print("choose one operator (+, -, *, /): ");
		d=u.next().charAt(0);
		System.out.println("Enter 2 number");
		a=u.nextDouble();
		b=u.nextDouble();
		switch(d) 
		{
			case '+':c=a+b;
			break;
			case '-':c=a-b;
			break;
			case '*':c=a*b;
			break;
			case '/':c=a/b;
			break;
			default:System.out.println("Error! Please enter proper operator");
			return;
		}
		System.out.println("Your output is:");
		System.out.println(a+" "+d+" "+b+"="+c);
	}
}
