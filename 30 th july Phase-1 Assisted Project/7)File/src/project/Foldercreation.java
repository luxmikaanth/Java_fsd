package project;
import java.io.File;
import java.util.*;
public class Foldercreation
{
	public static void main(String[] args) 
	{
		File a= new File("Demo");
		boolean value=a.exists();
		System.out.println("Folder Present : "+ value);
		if(value==false)
			a.mkdirs();
		value = a.exists();
		System.out.println("Folder Present : "+ value);
		
	}

}
