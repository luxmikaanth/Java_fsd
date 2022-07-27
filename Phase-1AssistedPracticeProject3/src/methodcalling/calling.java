package methodcalling;
import java.util.Scanner;
public class calling 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int a=sc.nextInt();
		calling b=new calling(a);
	}
	calling (int a)
	{
		if(a>=18)
		{
			System.out.println("Your are eligible to vote");
		}
		else
		{
			System.out.println("Sorry your are not eligible to vote");
		}
	}
}
