package OOPConceptPart1;

public class LocalVsGlobalVariable {
	
	// Global variables are Class variable 
	String name = "Tom";
	int age = 25;

	public static void main(String[] args) {
		
		LocalVsGlobalVariable obj = new LocalVsGlobalVariable(); // object for Global var
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		System.out.println("**************");
		
		int i = 10;// Local variable for (Main Method)
		System.out.println(i);
			
		

	}

	public void sum() { // Local variable for (sum method)
		int i = 10;
		int j = 20;
		int c = i+j;
	
	}
	
	
}
