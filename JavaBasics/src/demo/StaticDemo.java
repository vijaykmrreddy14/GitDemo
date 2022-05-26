package demo;

import testing.Calculator;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Studentcls rethu = new Studentcls();
		
		rethu.sid = 1;
		rethu.saddress = "Kavali";
		
		Studentcls.principal = "Kavitha";
		Studentcls mahendra = new Studentcls();
		mahendra.sid = 2;
		mahendra.saddress = "Tirupathi";
		
		Studentcls.principal = "Swathi";
		
		rethu.show();
		mahendra.show();
				
		Calculator calci = new Calculator();
		
		int result = calci.Add(55,11);
		
		System.out.println(result);
		
		

	}

}
