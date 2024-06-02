package TaskOne;

import java.util.Scanner;

public class SumProgram {
	public static void main(String Args[]) {
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the A value");
		a=sc.nextInt();
		System.out.println("Please enter the B value");
		b=sc.nextInt();
		System.out.println("Please enter the C value");
		c=sc.nextInt();
		System.out.println("Please enter the D value");
		d=sc.nextInt();
		if(a+b>c+d)
			System.out.print("The sum of a and b is greater than the sum of c and d");
		else
			System.out.println("sum od c and is  grater or equal");
		
			
	} 

}
