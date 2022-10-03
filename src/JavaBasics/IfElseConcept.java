package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
	
		int a = 30;
		int b = 20;
		
		if (b>a){
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("a is greater than b");
		}
		
		System.out.println("****");
		
		int as = 90;
		int ss = 60;
		
		if (as<ss) {
			System.out.println("as is less than ss ");
		}
		else {
			System.out.println("ss is greater than as");
		}
		System.out.println("****");
		
		// comparison operators:
		// < > <= >= == !=
		
		int c = 40;
		int d = 50;
		if (c==d) {
			System.out.println("c and d are equal");
		}
		else {
			System.out.println("c and d are not equal");
		}
		System.out.println("****");
		
		
		// write a logic to find out the highest number
		
		int a1 = 400;
		int b1 = 500;
		int c1 = 300;
		
		//nested if-else
		
		if(a1>b1 & a1>c1){ // false and True = false 
			System.out.println("a1 is the greatest");
		}
		else if (b1>c1) { // condition is not satisfied
			System.out.println("b1 is the greatest");
		}
		else {
			System.out.println("c1 is the greatest");
		}
		
		System.out.println("********");
		
		int i = 200;
		int k = 300;
		int n = 400;
		if (i>k & i>n) {
			System.out.println("i is the greatest"); // False
		}
		else if (k>=1 & k!=n) {
			System.out.println("K is biggger than equal to 1 and not equal to n"); //True and true 
		}
		else {
			System.out.println("n is the greatest"); //True
		}
		
		System.out.println("********");
		
		double o1 = 22.0;
		double d1 = 33.0;
		double l1 = 11.0;
		
		if (o1>d1 & o1>l1) {
			System.out.println("o1 is the greatest");
		}
		else if (l1>01 & l1>d1){
			System.out.println("l1 is the greatest");
		}
		else {
			System.out.println("d1 is the greatest of all");
		}
				
		
	

		
		
		

	}

}
