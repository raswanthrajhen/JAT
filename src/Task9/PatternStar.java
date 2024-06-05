package Task9;

import java.util.Scanner;

public class PatternStar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Get the number from user
		System.out.println("enter the no");
		int no=sc.nextInt();
		
		//Top order will be print in given patter 
		for(int i=0;i<no/2;i++) {
			for(int j=0;j<=no;j++) {
			  if(i==j ||j==no-i ) {
				 System.out.print("*");
			     }	
			  else
				  System.out.print(" ");
			   }
			System.out.println();
			}
		
	
	//middle order will be printed in given patter
	for(int i=0;i<=no/2;i++)
	{
		//if(i+1==(no/2)+1&&((no%2)!=0))
			//System.out.print(" ");
		if(i+1==(no/2)+1) {
			System.out.print("*");
		}
		else
		System.out.print(" ");
		
	}
	 System.out.println("");
	 
	
	 
	 //bottom order will be printed in given patter
	for(int i=no/2;i>0;i--) {
		for(int j=1;j<=no+1;j++) {
			if(j==i||j==((no-i)+2))
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println("");
	}
	
	}
}

