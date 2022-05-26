package demo;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//literal
		String s = "Vijay Kumar Reddy";
		String s1 = "Vijay Kumar";
		
		String  cust = "(24/7 Customer Support)0866 2570005 ";
		
		String exp = "0866 2570005";
		
		String[] arrcus = cust.split("Support");
		
		for(String c :arrcus )
			System.out.println(c);
	
		
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		
		System.out.println(s);
		
	int slength = s.length();
	
	System.out.println(slength);
	
	
	  s = s.toUpperCase();
	  
		System.out.println(s);
	  
	String[] strarr = s.split(" ");
	
	
	for (String str : strarr)
		System.out.println(str);
	
//	for(initi;conditino;increment)
	
	// length - 17 0 -16 
	
	//   16 15 14 13 12
	// ydd
	for (int i = slength-1 ; i>=0  ;i--)
	{
		System.out.print(s.charAt(i));
	}
	
	
		

	}

}
