package Task12;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      List<String> list = new ArrayList<>();
	        list.add("Guvi");
	        list.add("GenLass");
	        list.add("Task");
	        list.add("Class");

	        
	        // Convert List to Array
	        String[] array = list.toArray(new String[0]);

	        // Print the array
	        for (String element : array) {
	            System.out.println(element);
	        }
	        
	        
	}

}
