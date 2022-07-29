package project;

public class thread implements Runnable  
{      
	public static void main(String args[])  
	{     
		Runnable r1 = new thread();   
		Thread th1 = new Thread(r1, "New Value");    
		th1.start();   
		String str = th1.getName();  
		System.out.println(str);  
	}   
	public void run()  
	{    
		System.out.println("Threading is runnning successfully");    
	}  
}    