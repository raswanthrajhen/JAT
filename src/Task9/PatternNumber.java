package Task9;

import java.util.Scanner;

public class PatternNumber {

	public static void main(String[] args) {
		// Get the number it denote number of lines 
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the no");
		int value=sc.nextInt();
		int flag=1;
		
		//Number will be print in given Pattern 
		
		for(int i=1;i<=value;i++) {
			
			for(int j=1;j<=i;j++) {	
			 System.out.print(flag+" ");
			 flag++;
			 }
			
		System.out.println();
		}
	}

}
