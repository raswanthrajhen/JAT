package TaskOne;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		Scanner sc=new Scanner (System.in);
		System.out.println("enert the factorial number");
		Integer FactNumber=sc.nextInt();
		for(i=1,j=1;i<=FactNumber;i++)
		{
		 j=i*j;
		}
		System.out.println("The Factorials is"+j);
	}

}
