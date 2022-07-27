package Email;
import java.util.Scanner;
public class Email 
{
	public static void main(String[] args) 
	{
		String email;
		Scanner u = new Scanner(System.in);
		System.out.println("Enter your E-mail ID: " );
		email = u.nextLine();
		System.out.println("Is the above E-mail Id valid ?" + isValid(email));
	}
	static boolean isValid(String email)
	{
		String regex = "^(.+)@(.+)$";
		  return email.matches(regex);
		
	}
}
