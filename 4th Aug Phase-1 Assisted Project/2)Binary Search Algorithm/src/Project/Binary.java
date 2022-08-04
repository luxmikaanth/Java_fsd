package Project;
import java.util.Scanner;
public class Binary 
{
	public static void main(String args[])
    {  
        int arr[] = {5,10,15,20,25,30,35,40,45,50};
        Scanner u =new Scanner(System.in);
        System.out.print("Enter your Searching Number:");
        int key=u.nextInt();
        int last=arr.length-1;  
        int result = binarySearch(arr,0,last,key);  
        if (result == -1)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result);  
    }
	public static int binarySearch(int arr[], int first, int last, int key)
	{  
        if (last>=first)
        {  
            int mid = first + (last - first)/2;  
            if (arr[mid] == key)
            {  
            	return mid;  
            }  
            if (arr[mid] > key)
            {  
            	return binarySearch(arr, first, mid-1, key);  
            }
            else
            {  
            	return binarySearch(arr, mid+1, last, key);  
            }  
        }  
        return -1;  
    }  
      
}


