package Task8;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.print("Please Enter the value");
		value=sc.nextInt();
		if(value%2==0)
		{
			System.out.println("it is the even number");
		}
		System.out.println("To continue press y or press n");
		String con=sc.next();
		if(!con.equals("y")) {
			System.out.println(con);
			break;
		}
		}
		System.out.println("out of loop");
	}

}
