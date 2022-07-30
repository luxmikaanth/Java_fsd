package project;
import java.util.Scanner;
public class age {

	public static void main(String[] args) {
			int a[]=new int[3];
			try{
				a[8]=3;
				}
			catch(ArrayIndexOutOfBoundsException ae){
				System.out.println("ArrayIndexOutOfBounds Exception occurs");
				System.out.println(ae.getMessage());
				}
			finally{
				System.out.println("The array size is "+a.length);
				}
		}

}