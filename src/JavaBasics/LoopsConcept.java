package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		
		// 1. while loop:
		// dis- disadvantage of while loop: it will generate infinite loop of you don't give incremnetal/ decrimental part
	
		
		// print 1 to 10
		
		int i = 1; // Initialization
		while (i<=10) {//conditional
			System.out.println(i);
			i=i+1;//incremental/ decremental 
		}
		System.out.println("******");
		
		int k = 3;
		while (k<=10) {
			System.out.println(k);
			k=k+2; // 3,5,7,9,
			}
		System.out.println("******");
		
		for (int p=0; p>-10; p--) {
			System.out.println(p);
		}
		
	

		System.out.println("******");
		
		//2. for loop:
		
		 int J;
	   // J++ means j1= j+1	
	    // print 1 to 10
		for (int j =1; j<= 10; j++) {  // Initialization, Conditional, Incremental 
			System.out.println(j);
			
		}
		System.out.println("*******");
		
		
		
		// -1> -10 true
		//   1>10  false
		
		// print 10 to 1
		// d-- means d = d-1
		
		for (int d=10; d>=-10; d--) { // Initialization, Conditional, decremental 
			System.out.println(d);
		}
		
		
		System.out.println("*****");
			
	  for (int n = 4; n>-4; n--) {
		  System.out.println(n); // decremental 
	  }
	  
			
		
		
		
	
		
	}

}
