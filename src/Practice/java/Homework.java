package Practice.java;

public class Homework {

	public static void main(String[] args) {
		
		String s = "Bangladesh";
	    System.out.println(s.contains("a"));
		
	    System.out.println("______");
	    
	    
	    String a = "Bangladesh";
	    if (a.contains(a)) {
	    	System.out.println("a is contained in Bangladesh");
	    }
	    else {
	    	System.out.println("a is Not contained in Bangladesh");
	    }
	    System.out.println("--------");
	    
	    String b = "Bangladesh";
	    int count  = 0;
	    for (int i = 0; i<b.length(); i++) {
	    	if (b.charAt(i)== ('a')) {
	    		count++;
	    	}
	    	
	    	
	    }
	    System.out.println(count);
	    
	    System.out.println("--------");
	   
	    
	   
	    
	    		
	    
	    

	    
	    
	    
	
		
	}

}
