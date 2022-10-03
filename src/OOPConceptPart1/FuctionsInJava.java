package OOPConceptPart1;

public class FuctionsInJava {

	// Main method is starting point of EXECUTION	
	public static void main(String[] args) {
		
		FuctionsInJava obj = new FuctionsInJava ();
		//one object will be created, and OBJ is the reference variable, referring to this object
		// after creating the object, the copy of all non - static methods will be given to this object 
		
		obj.test();
		
		int l = obj.pqr();
		System.out.println(l);
		System.out.println("*******");
		
		String s1 = obj.qa();
		System.out.println(s1);
		System.out.println("*******");
		
		
		int div = obj.division(30,10);
		System.out.println(div);
		System.out.println("*******");
		
		
		int music = obj.music();
		System.out.println(music);
		System.out.println("*******");
		
		
		// ***  Main method is void because we NEVER WRITE return method in void ***
			
		
		
	}
	
	// *****   non static methods  *******
	
	// void means DOESN'T return any value
	//return type is void
	public void test() {  // no input, no output
		System.out.println("test method");
	
	}
	
	
	// return type is int
	public int pqr() {  // no input, some output
		System.out.println("PQR method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;		
	}
	
	// return type is String 
	public String qa() { // no input, some output
		System.out.println("qa method");
		String s = "Selenium";
		
		return s;
	}
	
	
	// return type is int 
	// x.y are INput parameters/ arguments 
	public int division(int x, int y) {
		System.out.println("division method");
		int d = x/y;
		return d;
		
	}
	public int music () {
		System.out.println("music");
		int a1 = 3;
		int a2 = 3;
		int k = a1 + a2;
		 return k;
				
	}
}
