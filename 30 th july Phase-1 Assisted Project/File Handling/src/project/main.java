package project;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class main
{
	public static void main(String[] args) 
	{
		String s;
		Scanner u=new Scanner(System.in);
		char[] a=new char[100];
		try{
			File file = new File("Demo prg\\Demo.txt");
			if(file.createNewFile())
			{
				System.out.println("File is Created.");
			}else
			{
				System.out.println("File is already exists.");
			}
			FileWriter writer = new FileWriter(file);
			writer.write("This is the 1st file to create like this. \n");
			System.out.println("Enter the statement which you wants to append...");
			s=u.nextLine();
			writer.append(s+"- This statement is appended");
			writer.close();
			FileReader in=new FileReader("Demo prg\\Demo.txt");
			in.read(a);
			System.out.println(a);   
		}catch (IOException e) {
            System.out.println("exception occurred " + e);
        }
	}

}
