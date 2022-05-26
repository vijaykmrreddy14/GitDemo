package testing;

public class PractiseCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y;
		x = 20 ;
		y =30 ;
		
		Calculator cal = new Calculator();
		
		int res = cal.Add(x, y);
		
		System.out.println("Addition of two numbers "+ res);
		
		res = cal.sub(x, y);
		
		System.out.println("Subtraction of two numbers "+res);
		
		res = cal.multiplicaiton(x, y);
		System.out.println("Multiplicaiton of two numbers "+res);
		
		x = 300;
		y = 30;
		
	double res1 = cal.Division(x, y);
	
	System.out.println("Division "+res1);
	
	x = 35;
	y = 3;
	
	res1 = Calculator.Division(x, y);
	
	System.out.println("Division "+res1);
	
	res = cal.Add(x, y);
	
	System.out.println("Addition of two numbers second time "+ res);
	
	
	//Advantage of declaring a method/variable as static is we can call it using class name.No need to create an object for calling
	
	
		

	}

}
