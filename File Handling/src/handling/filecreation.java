package handling;
import java.io.*;
public class filecreation
{
	public static void main(String[] args)
	{
		File a =new File("Project\\test1.txt");
		boolean present= a.exists();
		if(present==false)
		{
			try 
			{
				boolean created =a.createNewFile();
				System.out.println("File Created "+created);
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			} 
		}
	}

}
  