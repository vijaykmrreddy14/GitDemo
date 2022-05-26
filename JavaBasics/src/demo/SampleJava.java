package demo;

import java.util.ArrayList;

public class SampleJava {
	
	int num = 20;
	String s = "variableType";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///executable code
		
		int a;
					
		a = 10;
		
		char let = 'V';
		
		double f = 3.5;
		
		boolean b = true;
		
		String str = "Vijay";
		
		System.out.println("Sample program");
		
		
		int[] arr = {2,3,4,9,12};
		
		char[] ch1 = {'m','t','y'};
		
		
		String[] str1 = new String[5];
		
		str1[0] = "Vjay451";
		str1[1]= "Kumar";
		str1[2] = "email@gmail.com";
		str1[3] = "kumar@gmail.com";
		str1[4] = "vijay@gmail.com";
		
		
		System.out.println(str1.length);
	
		
		
		for (int i=0;i <str1.length;i++)
		{
			System.out.println(str1[i]);
			
		}
		
		String[] str2 = {"Vijay","Murali","Nihanth"};
		
		for(String s :str2)
		{
			System.out.println(s);
		}
		
		
		ArrayList arlst = new ArrayList();
		
		arlst.add(34);
		arlst.add(45);
		arlst.add(67);
		
		
		//System.out.println(arlst.get(0));
		
		for (int i=0;i <arlst.size();i++)
		{
			System.out.println(arlst.get(i));
			
		}
		
		
		ArrayList<String> strlst = new ArrayList<String>();
		
		strlst.add("Kumar");
		strlst.add("Reddy");
		
		
		MethodsDemo democlass = new MethodsDemo();
		
		democlass.data();
		
		
		

	}//main ending braces
	
	public void printsometing()
	{
		System.out.println("Sample statement");
		System.out.println(num);
	}

	
	
	

}
