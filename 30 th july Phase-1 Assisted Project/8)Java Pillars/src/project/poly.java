package project;
import java.util.regex.Pattern;
public class poly 
{
	public static void main(String args[]) 
    { 
        poly s = new poly(); 
        System.out.println("Sum of two value :" +s.poly(10, 20)); 
        System.out.println("Sum of three value :" +s.poly(10, 20, 30)); 
        System.out.println("Sum of two value :"+s.poly(10.5, 20.5)); 
    } 
	public int poly(int x,int y)
	{
		return(x+y);
	}
	public int poly(int x,int y,int z)
	{
		return(x+y+z);
	}
	public double poly(double x,double y)
	{
		return(x+y);
	}

}