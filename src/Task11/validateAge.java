package Task11;

import java.util.Scanner;

public class validateAge {

	public static void main(String[] args) throws InvalidAgeException {
		// Get the age from the User
		Scanner sc=new Scanner (System.in);
		System.out.println("The age of the person");
		int age=sc.nextInt();
		validateAge object=new validateAge();
		try {
			object.validatedAge(age);
			}	
		catch(InvalidAgeException ex) {
			System.out.println(ex.getMessage());
		}

	}
	
	public  static void validatedAge(int age) throws InvalidAgeException{
		
		//throw the InvalidAgeException Exception
		if(age<0 ||age>150) {
			throw new InvalidAgeException("invalid age exception");
		}
		else
			System.out.println("The Age is valid");
		}

}
