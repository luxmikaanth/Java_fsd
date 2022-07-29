package handling;
import java.io.File;
import java.util.*;
public class deletefile 
{

	public static void main(String[] args)
	{ 
		File a = new File("Project\\test1 ");
		a.delete();
		boolean present=a.exists();
		System.out.println("Folder present :" +present);
	}

}
