package Task12;

import java.util.ArrayList;

public class ArrayProgramList {
	
	ArrayList<String> employee=new ArrayList<String>();
	
	// Add the value in Array List
	public void createArayList(String value){
		employee.add(value);
	}
	
	
	// Remove the value in Array List
	public void removeArayList(String value) {
		employee.remove(value);
	}

	@Override
	public String toString() {
		return "[employee=" + employee + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayProgramList object=new ArrayProgramList();
		
		//Create the ArrayLIst
		
		object.createArayList("one");
		object.createArayList("two");
		object.createArayList("three");
		object.createArayList("Four");
		object.createArayList("Five");
		
		// Print the Updated Array
		System.out.println(object);
		
		//Remove the ArrayList
		
		object.removeArayList("one");
		object.removeArayList("two");
		
		// Print the Updated Array
		System.out.println("The Deleted arraylist"+object);
		object.removeArayList("three");
		object.removeArayList("Four");
		
		// Print the Updated Array
		System.out.println("The Deleted arraylist"+object);
		object.removeArayList("Five");
		
		// Print the Updated Array
		System.out.println("The Deleted arraylist"+object);
	}

}
