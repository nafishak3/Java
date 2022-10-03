package FileHandling;

import java.io.File;
import java.io.IOException;

public class OpenFileUsingDesktop {

	public static void main(String[] args) {
	
		String path = "/Users/NafishaKhanom/Downloads/FileHandling/sample.text";
		
		File file = new File (path);
		try {
			boolean flag = file.createNewFile();
			if (flag) {
				System.out.println("File is created");
			}
			else {
				System.out.println("file is already present...");
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
  
		System.out.println ("hello bitch");
		
		
		
		
		
	}

}
