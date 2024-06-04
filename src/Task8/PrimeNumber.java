package Task8;

import java.util.Scanner;

public class PrimeNumber {
	
	static void prime(Integer pnumber){
		int flag=0;
		if(pnumber==0 ||pnumber==1) {
			System.out.println("The given number is not prime number");
		}
		else {
			for(int i=2;i<pnumber/2;i++) {
				if(pnumber%i==0) {
					flag=1;
					System.out.println("The given number is not prime number");
				}
			}
		}
		if(flag==0)
			System.out.println("The given number is  prime number");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the prime number");
		Integer pnumber=sc.nextInt();
		prime(pnumber);
		System.out.println("please enter the y to continue");
		String con=sc.next();
		if(!con.equals("y"))
			break;
		}
	}

}
