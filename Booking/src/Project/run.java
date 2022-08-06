package Project;
import java.util.Scanner;
public class run 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int ch,i,n,movch; String rowch[]=new String[12];
		int colch[]=new int[12];
		boolean flag = true;
		String time = new String();
		String timecheck = new String();
		show objshow = new show();
		screen objscreen = new screen();
		ticket objticket = new ticket();
		while(true)
		{
			if((boolean) login.happy())
			{
		System.out.println("Welcome To Sathiyam Cinemas");
		System.out.println("1.Show Time/ Movies");
		System.out.println("2.Ticket Booking");
		System.out.println("3.Exit");
		System.out.println("\nEnter Your Choice 1(or)2(or)3");
		ch = sc.nextInt();
		switch(ch)
		{
			case 2:	objshow.display_show_timings();
					System.out.println("Choose the Movie");
					movch=sc.nextInt();
					do{
					System.out.println("Enter Show timings (hh:mm)");
					time=sc.next();
					timecheck=objshow.check_time(movch,time);
					}while(timecheck.equals("false"));
					System.out.println("Enter Number of seats");
					n=sc.nextInt();
					for(i=0;i<n;i++){
						objscreen.display_seats();
						rowch[i]=sc.next().toUpperCase();
						objshow.show_empty_seats(rowch[i],movch);
						colch[i]=sc.nextInt();
						if(objshow.check_seats(rowch[i],colch[i],movch))
						{
							System.out.println("Seat is not available");
							flag = false;
						}
						objshow.fill_seat(rowch[i],colch[i],movch);
					}
					for(i=0;i<n;i++)
					{
						if(flag==true)
							objticket.print_ticket(objshow.getmovie(movch), time, movch, objscreen.getcat(rowch[i]), rowch[i], colch[i]);
					}
					break;
				
			case 1: objshow.display_show_timings();
					break;
					
			case 3: System.out.println("Thankyou for visiting...\n");
					break;
		}
	}
	}
	}
}
