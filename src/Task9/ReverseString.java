package Task9;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// Get the String from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String reverseString=sc.nextLine();
		int sizeOfString=reverseString.length();
		char[] stringArray=reverseString.toCharArray();
		
		
		//Reverse the String 
		for(int i=sizeOfString-1;i>=0;i--) {
			System.out.print(stringArray[i]);
		}

	}

}
