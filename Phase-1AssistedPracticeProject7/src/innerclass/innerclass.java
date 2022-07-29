package innerclass;
import java.util.Scanner;
public class innerclass 
{
	public static void main(String[] args) 
	{
		outer x= new outer();
		x.exit();
	}
}
	class outer
	{
		void exit()
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter a number:");
			int x=sc.nextInt();
			System.out.print("Innner value ");
			class inner
			{
				void exit1()
				{
					System.out.print("x= "+x);
				}
			}
			inner y =new inner();
			y.exit1();
			
		}
	}

