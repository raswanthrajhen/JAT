package Task11;

import java.util.Scanner;

public class ArthmeticExceptin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer numOne,numTwo,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Two integers");
		numOne=sc.nextInt();
		numTwo=sc.nextInt();
		
		//Arithmetic Exception
		try {
		result=numOne/numTwo;
		}
		catch(Exception ex){
			System.out.println("Arthmetic Exception");
		}
	}

}
