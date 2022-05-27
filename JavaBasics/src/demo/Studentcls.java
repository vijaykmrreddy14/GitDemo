package demo;

public class Studentcls {
	
	int sid;
	String saddress;
	
	static String principal;
	
	public void show()
	{
		System.out.println(sid + " : " + saddress + " : " + principal);
		
		
	}
	//Abstract methods
	public static void read()
	{
		System.out.println("Reading")
	}
	
	public void play()
	{
		System.out.println("Playing")
	}
	
	
	
	public void get()
	{
		System.out.println("Testing")
	}

}
