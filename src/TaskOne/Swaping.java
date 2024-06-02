package TaskOne;

import java.util.Scanner;

public class Swaping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ValueOne,ValueTwo;
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.print("Enter the A value");
		ValueOne=sc.nextInt();
		System.out.print("Enter the B value");
		ValueTwo=sc.nextInt();
		
		ValueTwo=ValueOne+ValueTwo;
		ValueOne=ValueTwo-ValueOne;
		ValueTwo=ValueTwo-ValueOne;
		System.out.println(" the A is"+ValueOne);
		System.out.println("the B is"+ValueTwo);
		System.out.print(" enter press y or n");
		String con=sc.next();
		if(!con.equals("y"))
	    	break;
		
		}
	}

}
