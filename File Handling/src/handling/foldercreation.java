package handling;
import java.io.*;
public class foldercreation 
{
	public static void main(String[] args)
	{
		File a = new File("Project\\value ");
		boolean present = a.exists();
		System.out.println("Folder present :" +present);
		if(present == false )
			a.mkdirs();
		present = a.exists();
		System.out.println("Folder present :" +present);
	}

}
   