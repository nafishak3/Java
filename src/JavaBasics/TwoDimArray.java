package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
		
		String x [][] = new String[3][5]; // called Declaration 
		
		System.out.println(x.length);// Total number of rows = 3
		System.out.println(x[0].length);// Total number of columns= 5
		
		//1st Row
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		x[0][4] = "E";
		
		//2nd Row
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";
		x[1][4] = "E1";
		
		//3rd Row
		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C2";
		x[2][3] = "D2";
		x[2][4] = "E2";
			
		System.out.println(x[1][2]);
		System.out.println(x[2][2]);
		
		System.out.println("*******");
		System.out.println(x[0].length);
		System.out.println("*******");
		
		// print all the values of 2d array:use For Loop
				// row = 0, col = 0 to 4
				// row = 1, col = 0 to 4
				// row = 2, col = 0 to 4 
		 for (int row=0;row<x.length; row++) {
			 for (int col=0; col<x[0].length;col++) {
				 System.out.println(x[row][col]);
			 }
		 }
		 System.out.println("*******");
		 
		String y [] [] = new String [4]	[4];
		y [0] [0] = "N";
		y [0] [1] = "A";
		y [0] [2] = "F";
		y [0] [3] = "I";
		
		y [1] [0] = "N1";
		y [1] [1] = "A1";
		y [1] [2] = "F1";
		y [1] [3] = "I1";
		
		y [2] [0] = "N2";
		y [2] [1] = "A2";
		y [2] [2] = "F2";
		y [2] [3] = "I2";
		
		y [3] [0] = "N3";
		y [3] [1] = "A3";
		y [3] [2] = "F3";
		y [3] [3] = "I3";
		
		System.out.println(y [3] [1]);
		
		 System.out.println("*******");
		
		 for (int row=0; row<y.length; row++) {
			 for (int col=0; col<y[0].length; col++) {
				 System.out.println(y [row] [col]);
			 }
		 }

		 System.out.println("*******");
		 
		 String k [] [] = new String [4] [3];
		 k [0] [0] = "P";
		 k [0] [1] = "O";
		 k [0] [2] = "L";
		 
		 k [1] [0] = "P1";
		 k [1] [1] = "P2";
		 k [1] [2] = "P3";
		 
		 k [2] [0] = "O1";
		 k [2] [1] = "O2";
		 k [2] [2] = "O3";
		 
		 k [3] [0] = "L1";
		 k [3] [1] = "L2";
		 k [3] [2] = "L3";
		 
	
		 
		 for (int row=0; row <k.length; row++ ) {
			 for (int col=0; col<k[0].length; col++) {
				 System.out.println(k [row] [col]);
			 }
		 }
		 
				 
		 
		
				

			
		
				
		
		 
				 
				 

	
		
		
		
		
		
		
		
		
	}

}
