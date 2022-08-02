package Project;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class main 
{
	public static void main(String[] args) 
	{
		int []a=new int [100];
		int k=4,i,n;
		System.out.print("Enter length of array :");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		k--;
		Set<Integer> s = new TreeSet<Integer>();
		for(i=0;i<n;i++)
			s.add(a[i]);
		Iterator<Integer> itr = s.iterator();
		while(k>0)
		{
			itr.next();
			k--;
		}
		System.out.print("k'th Smallest Element: ");
		System.out.print(itr.next());
		
		
	}


}
