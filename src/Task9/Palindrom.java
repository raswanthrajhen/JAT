package Task9;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		// Get the String from the user
		System.out.println("Enter the String");
		String palindromString=sc.nextLine();
		int value=palindromString.length();
		value=value-1;
		char[] flagPalindrom=palindromString.toCharArray();
		int j=0,flag=0;
		
		//Validate the String as Palindrome or Not
		for(int i=value;i>=0;i--) {
			if(flagPalindrom[i]==flagPalindrom[j]) {
				j++;
			}
			else
				flag=1;
			
		}
		if(flag==0)
		System.out.println("The given string is palindrom");
		else
			System.out.println("The given string is  not palindrom");
	}

}
