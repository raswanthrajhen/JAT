package TaskOne;

import java.math.BigInteger;
import java.util.Scanner;

public class NoDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the interger value");
		//intValue=sc.nextInt();
		Long values=sc.nextLong();
		while(values>0) {
			 values=values/10;
			 count++;
		 }
		System.out.println("the number of digit in Integer is"+count);
		}
}
