package TaskOne;

import java.util.Scanner;

public class SenoirCitizen {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the age of the person");
		Integer age=sc.nextInt();
		if(age>60) {
			System.out.println("The person is Senior citizen");
		}
		else {
			System.out.println("The person is not Senior Citizen");
		}
	}

}
