package Task11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExceptions {

	public static void main(String[] args) {
		 // Change this to the path of your file
    	String filePath = "Task\\src\\Task11";
		try {
			
            // Attempt to open the file
            FileReader fileReader = new FileReader(filePath);
            System.out.println("File opened successfully.");
            fileReader.close();
        } 
		catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
            e.printStackTrace();
        }
		catch (IOException e) {
            System.err.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

	}

}
