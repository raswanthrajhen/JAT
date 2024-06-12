package Task12;

import java.util.Map;
import java.util.TreeMap;

public class MapProgram {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String ,Integer> object=new TreeMap<>();
		
		object.put("Raswanth", 101);
		object.put("Rajhen", 102);
		object.put("Shernika", 103);
		object.put("Ritikka", 104);
		object.put("maruthamuthu", 105);
		
		for(Map.Entry<String, Integer> entry : object.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}

		/*output of program
		  
		Rajhen 102
		Raswanth 101
		Ritikka 104
		Shernika 103
		maruthamuthu 105
		*/

