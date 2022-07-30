package project;
import java.util.Scanner;
public class encap 
{
	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length :");
		a=sc.nextInt();
		System.out.print("Enter width :");
		b=sc.nextInt();
		Area rectangle = new Area(a,b);
	    rectangle.getArea();
	}

}
class Area
{
	int len,wid;
	Area(int len,int wid)
	{
		this.len = len;
		this.wid = wid;
	}
	public void getArea()
	{
		int area = len*wid;
		System.out.println("Area: " +area);
		
	}
}
