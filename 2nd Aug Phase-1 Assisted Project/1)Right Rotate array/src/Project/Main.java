package Project;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		int n,i,j,l;
		int []a=new int [100];
		System.out.print("Enter length of array :");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Original Array: ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(i=0;i<n;i++)
		{
			l=a[n-1];
			for(j=n-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			a[0]=l;
			System.out.print("\nAfter Array Rotation: ");
			for(i=0;i<n;i++){
    			System.out.print(a[i]+" ");
		}
		}
	}

}
