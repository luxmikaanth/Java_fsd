package array;
import java.util.Scanner;
public class array {

	public static void main(String[] args) 
	{
		char a[]=new char[20];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a numbers :");
		int n = sc.nextInt();
		System.out.print("Enter a numbers one by one :");
		int b[]=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			System.out.print("your numbers :");
			System.out.println(b[i]+" ");
		}

	}

}
