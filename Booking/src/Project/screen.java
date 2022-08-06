package Project;

public class screen 
{
	void display_seats()
	{
		System.out.println("*****************Screen this side*****************");
		System.out.println();
		System.out.println("\t       A --> Gold –  ₹ 100");
		System.out.println("\t       B --> Gold –  ₹ 100");
		System.out.println();
		System.out.println("\t      C --> Silver –  ₹ 150");
		System.out.println("\t      D --> Silver –  ₹ 150");
		System.out.println();
		System.out.println("\t     E --> Platinum –  ₹ 200");
		System.out.println("\t     F --> Platinum –  ₹ 200");		
		System.out.println("\n  Please Enter Preferred Row. Seat will be booked as per availability.");
	}
	
	String getcat(String a)
	{
		String cat;
		if(a.compareToIgnoreCase("A")==0||a.compareToIgnoreCase("B")==0)
			cat="Gold";
		else if(a.compareToIgnoreCase("C")==0||a.compareToIgnoreCase("D")==0)
			cat="Silver";
		else if(a.compareToIgnoreCase("E")==0||a.compareToIgnoreCase("F")==0)
			cat="Platinum";
		else
			cat="N/A";
		return cat;
	}
	
	int getcost(String cat)
	{
		int cost = 0;
		if(cat.compareToIgnoreCase("Gold")==0)
			cost=100;
		else if(cat.compareToIgnoreCase("Silver")==0)
			cost=150;
		else if(cat.compareToIgnoreCase("Platinum")==0)
			cost=200;
		else
			return 0;
		return cost;
	}
}
