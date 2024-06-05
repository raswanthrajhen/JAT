package Task9;

import java.util.Scanner;

public class RoomBooking {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		// Get the Detail from User
		System.out.println("please enter the details");
		int month,Rent,noOfDays;
		month=sc.nextInt();
		Rent=sc.nextInt();
		noOfDays=sc.nextInt();
		
		// 20 % Rent increase in season time
		if(month==4||month==5||month==6||month==11||month==12) {
			float flag=(float)(Rent*20/100);
			double rentResult=noOfDays* (Rent+flag);
			System.out.print("the Rent is"+rentResult);
		}
		
		//Result will be printed
		else {
			double rentResult=noOfDays*Rent;
			System.out.print(rentResult);
        	}
	}
}
