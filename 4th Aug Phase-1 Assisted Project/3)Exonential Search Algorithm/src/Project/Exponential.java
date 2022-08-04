package Project;
import java.util.Arrays;
import java.util.Scanner;
public class Exponential
{

	public static void main(String[] args) 
	{
		int array[] = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60};
		Scanner u= new Scanner(System.in);
		System.out.print("Enter your searching Number: ");
		int searchValue = u.nextInt();
		int result = expSearch(array, array.length, searchValue);
		System.out.println("Element is present at index: " + result);
	}
	static int expSearch(int array[], int n, int searchValue) 
	{
	  if(array[0] == searchValue)
	  {
		  return 0;
	  }
	  int i = 1;
	  while (i < n && array[i] <= searchValue)
	  {
		  i = i * 2;
	  }
	  return Arrays.binarySearch(array, (i / 2), Math.min(i, n), searchValue);
	}
}