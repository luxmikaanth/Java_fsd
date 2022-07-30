package project;

public class objectofclass 
{
	public static void main(String[] args) 
	{
		Mobile abhishek = new Mobile("iPhone","Gold",8);
        Mobile rahul = new Mobile("Pixel","White",13);
        Mobile ravi = new Mobile("Nothing","Black",8);
        System.out.println("Abhishek own " + abhishek.brand +" "+ abhishek.color + " color smartphone having "+ abhishek.camera+ "MP"+ " camera");
        System.out.println("Rahul own " + rahul.brand +" "+ rahul.color + " color smartphone having "+ rahul.camera+ "MP"+ " camera");
        System.out.println("Ravi own " + ravi.brand +" "+ ravi.color + " color smartphone having "+ ravi.camera+ "MP"+ " camera");
	}
	
}
	class Mobile
	{
		String brand, color;
		int camera;
		public Mobile(String brand, String color, int camera){
			this.brand = brand;
			this.color = color;
			this.camera = camera;

    }
} 

