package Project;

import java.util.Scanner;

public class Selection 
{

	public static void main(String[] args) 
	{
		int i,j,l,n;
		int []a=new int [100];
		System.out.print("Enter length of array :");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Before Sorting: ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		int temp;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("\nAfter Sorting: ");
		for( i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
