package TaskOne;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the String to find the length");
		String StringValue=sc.nextLine();
		//String StringValueTwo=sc.next();
		char ch[]=StringValue.toCharArray();
		int i=0;
		for(char chr:ch) {
			i++;
		}
		System.out.println("The length of string is"+ +i);
	}

}
