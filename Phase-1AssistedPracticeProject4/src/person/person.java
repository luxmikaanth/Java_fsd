package person;
public class person 
{
		int id;
		String name;
		person(int i,String n)
		{
			id=i;
			name=n;
		}
		public static void main(String[] args) 
		{
			person no1=new person(1,"Arun");
			person no2=new person(2,"Bala");
			person no3=new person(3,"chandru");
		
			no1.display();
			no2.display();
			no3.display();
		}
		public void display() 
		{
			System.out.println(id+" "+name);
		}

}
