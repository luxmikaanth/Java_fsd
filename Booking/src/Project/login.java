package Project;
import java.util.Scanner;
public class login 
{
	public static boolean happy()
    {
        String username, password;
        Scanner sc = new Scanner(System.in);
        System.out.println("========================Welcome To Sathiyam Cinemas=======================");
        System.out.print("Enter username:");
        username = sc.nextLine();
        System.out.print("Enter password:");
        password = sc.nextLine();
        if(username.equals("happy") && password.equals("1234"))
        {
            System.out.println("Authentication Successful\n");
            return true;
        }
        else
        {
            System.out.println("Your username or password is wrong please enter properly... \n");
            return false;
        }
        
    }
}
