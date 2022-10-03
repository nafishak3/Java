package OOPConceptPart1;

public class Car {
	
	// class variables:
	int mod;
	int wheel;
	

	public static void main(String[] args) {
		
		//      new car()---- this is the object for Car class
		//      new (Word) keyword is used to create a object
		//      a,b,c --> object reference variables
		Car a = new Car ();
		Car b = new Car ();
		Car c = new Car ();
		
		a.mod = 2015;
		a.wheel = 4;
		
		b.mod = 2014;
		b.wheel = 4;
		
		c.mod = 2013;
		c.wheel = 4;
		
		System.out.println("Before assigining the referneces");
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
	
		System.out.println(b.mod);
		System.out.println(c.wheel);
		
		System.out.println("*******");
		
		System.out.println("After shiftinhg the referneces ");
		a=b;
		b=c;
		c=a;
		
		a.mod = 10;
		System.out.println(a.mod); //10
		
		c.mod = 20;
		System.out.println(a.mod);//20
		System.out.println(c.mod); //20
		
	
				

		
	
	}

}
