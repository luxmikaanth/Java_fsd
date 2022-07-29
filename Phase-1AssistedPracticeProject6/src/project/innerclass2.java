package project;

public class innerclass2 
{
	public static void main(String[] args) 
	{
		innerclass2  ob=new innerclass2 ();  
		ob.display();  
	}
	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  

}
