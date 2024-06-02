package TaskOne;

import java.util.Scanner;

public class NoRepateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String StrValue=sc.nextLine();
		System.out.println("Enter the no of time to repet");
		int no=sc.nextInt();
		for(int i=0;i<no;i++) {
			System.out.println(StrValue);
		}
	}

}
