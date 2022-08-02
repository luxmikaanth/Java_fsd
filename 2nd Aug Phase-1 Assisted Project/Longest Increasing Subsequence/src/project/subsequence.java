package project;
import java.util.Scanner;
public class subsequence
{
	public static void main(String[] args) 
	{
		int []a=new int [100];
		int n,i;
		System.out.print("Enter length of array :");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
	    System.out.println("The length of the longest increasing subsequence is " +  incre_subseq(a, n));
	}
	 static int incre_subseq(int arr[], int len){
	      int seq_arr[] = new int[len];
	      int i, j, max = 0;
	      for (i = 0; i < len; i++)
	         seq_arr[i] = 1;
	      for (i = 1; i < len; i++)
	      for (j = 0; j < i; j++)
	      if (arr[i] > arr[j] && seq_arr[i] < seq_arr[j] + 1)
	      seq_arr[i] = seq_arr[j] + 1;
	      for (i = 0; i < len; i++)
	      if (max < seq_arr[i])
	      max = seq_arr[i];
	      return max;
	   }

}
