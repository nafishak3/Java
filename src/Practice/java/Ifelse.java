package Practice.java;

public class Ifelse {

	public static void main(String[] args) {
		
		int i = 20;
		int k = 10;
		
		if (k>i) {
			System.out.println("k is greater than i");
		}
		else {
			System.out.println("i is greater then k");
		}
		System.out.println("________");
		
		int a = 5;
		int b = 10;
		int c = 15;
		int d = 8;
	
		if (a>b && a>c && a>d) {
			System.out.println("a is the largest");
		}
		else if (b>c && b>d) {
			System.out.println("b is the largest");
		}
		else if (c>d) {
			System.out.println("c is the largest");
		}
		else {
			System.out.println("d is the largest");
		}
		
		

	}

}
