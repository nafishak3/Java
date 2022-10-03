package OOPConceptPart1;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		//ArrayList
		// 1. Contain duplicate value 
		// 2. maintain insertion order
		// 3. Synchronized -- array list is slow
		// 4. allows random access to fetch any elements because it stores the values on the bases of indexes (0-6). 
		ArrayList ar = new ArrayList();   // --- non- Generic array list 
		
		ar.add(10);//0
		ar.add(20);//1
		ar.add(20);//2
		ar.add(30);//3
		System.out.println(ar.size()); // size of array
		
		System.out.println("******");
		
		System.out.println(ar.get(1)); // value from the index
		
		System.out.println("******");
		
		ar.add(50);//4
		ar.add (60);//5
		ar.add("Test");//6
		ar.add(2.2);//7
		ar.add(1);//8
					
		System.out.println(ar.size ());// Size of Array
		System.out.println("******");
		
		//print ALL the values from array list : use for Loop
		for (int k=0; k<ar.size(); k++) { //GET ALL the value 
			System.out.println(ar.get(k));
		}
		
		// none generic vs generic----- This is generic
		
		ArrayList <Integer> ar1 = new ArrayList <Integer>();
		ar1.add(2);
		ar1.add(3);
		
		ArrayList <String> ar2 = new ArrayList <String>();
		ar2.add("nafisha");
		ar2.add("Khanom");
		
		ArrayList <Double> ar3 = new ArrayList <Double>();
		ar3.add(2.2);
		ar3.add(4.4);
		
		ArrayList <Boolean> ar4 = new ArrayList <Boolean>();
		ar4.add (true);
		ar4.add(false);
		
		
		
				
	}

}
