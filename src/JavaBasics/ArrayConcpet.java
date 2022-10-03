package JavaBasics;

public class ArrayConcpet {

	public static void main(String[] args) {
		 
		// Array concept: to store similar data type in a array variable
		 // 1. int array:
		// upper bound/index = n-1 (n is size of array)
		
		// dis-advantages of array:
		//1. sizes are fixed -- Static array means size is fixed  -- to overcome we use collections (ArrayList, HasTable) ->use dynamic array.
		//2. Stores only similar data types (example: int with only int)
		// -- to overcome this problem, we use object array
		
		
		   int i[] = new int [4];
		   i[0] = 10;
		   i[1] = 20;
		   i[2] = 30;
		   i[3] = 40;
		
		   System.out.println(i[2]);
		   System.out.println(i[3]);
		
		  // System.out.println(i[4]); // array index out of bounds exception (doesn't exist)
		   
		   System.out.println(i.length); // the size/length of the array.
		   
		   System.out.println("******");
		   
		   // print all values of array: use for loop
		   
		   for (int j= 0; j<i.length; j++) {
			   System.out.println(i[j]);
		   }
		   
		   System.out.println("******");
		   
		   //2. double array
		   double d[] = new double [3];
		   d [0] = 11.11;
		   d [1] = 22.22;
		   d [2] = 33.33;
		 
		   System.out.println(d[2]);
		   System.out.println(d.length);
		  
		   
		   System.out.println("******");
		  
		   // print all values of array using For loop;
		   for (int s=0; s<d.length; s++) {
			  System.out.println(d[s]);
		   }
		
		   System.out.println("******");
		   
		   int k[] = new int [5];
		   k [0] = 2;
		   k [1] = 3;
		   k [2] = 4;
		   k [3] = 4;
		   k [4] = 5;
		   System.out.println(k[1]);
		   System.out.println(k.length);
		   for (int s=0; s<k.length; s++) {
			   System.out.println(s);
		   }
		   
		   System.out.println("******");
		   //3. char array:
		   char c[] = new char [4];
		   c[0] = 'f';
		   c[1] = '5';
		   c[2] = '#';
		   c[3] = '@';
		   for (int d1=0; d1<c.length; d1++) {
			   System.out.println(c [d1]);
		   }
		   
		   System.out.println("******");
		   
		   //43. boolean array:
		   boolean b[] = new boolean [2];
		   b[0] = true;
		   b [1] = false;
		   for (int f=0; f<b.length; f++) {
			   System.out.println(b[f]);
		   }
		   System.out.println("******");
		   
		   // String array;
		   String s[] = new String [3];
		   s[0] = "Hello";
		   s[1] = "Beautiful";
		   s[2] = "World";
		   System.out.println(s.length);
		   
		   System.out.println("******");
		   
		   //6. Object array: =stores different value: Superclass (Object is a class)
		   Object ob []= new Object [6];
		   ob[0] = "Nafisha";
		   ob[1] = 23;
		   ob[2] = 01.31;
		   ob[3] = "female";
		   ob[4] = "01/31/1900";
		   ob[5] = "NY";
		   
		   for (int k1=0; k1<ob.length; k1++) {  // For Loop always has int
			   System.out.println(ob[k1]);
		   }
	
		   System.out.println("******");
		    
		   Object ob1 [] = new Object [4];
		   ob1[0] = "JobLess";
		   ob1[1] = "Life";
		   ob1[2] = "08/23";
		   ob1[3] = "2022";
		   
		   System.out.println(ob1[2]);
		   for (int s1=0; s1<ob1.length;s1++) {
			   System.out.println(ob1[s1]);
		   }
		   
		   
		   
		 
				   
				 
		   
		   
		  
		   
		   
		   
		   
		   
		   
		   
		
		
		
	}

}
