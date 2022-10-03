package OOPConceptPart1;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetConcept {

	public static void main(String[] args) {
	

		Set <String> hs = new HashSet <String>();
		
		hs.add("Alpha");
		hs.add("Testing");
		hs.add("Beta");
		hs.add("Alpha");
		hs.add("null");
		
	System.out.println(hs);
	System.out.println("*******");
	
	System.out.println(hs.contains("Alpha")); // .contains shows if the index has the value ex:True or False
	System.out.println("*******");
	
	for (String n : hs) {
		System.out.println(n);                // for loop
	}
	System.out.println("*******");
	
	hs.remove("null");                         //  .remove has removed the null index
	System.out.println(hs); 
	System.out.println("*******");
	
		Set <Integer> first = new HashSet <Integer>();
	first.addAll(Arrays.asList (new Integer []  {1,2,3,5,7,9}  ) );
		Set <Integer> second = new HashSet <Integer>();
	second.addAll(Arrays.asList(new Integer [] {0,1,2,3,4,6,8,9,10} ));
	
	// Get the union: = All together WITHOUT REPpetition
	
	Set <Integer> union = new HashSet <Integer> (first);
	union.addAll(second);                       //.addAll adds everything without repetition
	System.out.println(union);  
	
	System.out.println("*******");
	
	// Get the intersection = Get the common value 
	
	Set <Integer> intersection = new HashSet <Integer> (first);
	intersection.retainAll(second);             // .retainAll shows the common value 
	System.out.println(intersection);
	
	System.out.println("*******");
	
	// Get the Differences: Get the differences from the first set 
	Set <Integer> diff = new HashSet <Integer> (first);
	diff.removeAll(second);                // .removeAll shows first set only has 5,7 value different from second set
	System.out.println(diff);
			
	System.out.println("*******");
	
	Set <Integer> differ = new HashSet <Integer> (second);
	differ.removeAll(first);                // .removeAll shows second set different value from first set
	System.out.println(differ);
	
	
	}

}
