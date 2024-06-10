package Task11;

public class ArrayAndIndexOutExceptions {

	public static void main(String[] args) {
		int arrayOne[]=new int[5];
		arrayOne[0]=1;
		arrayOne[1]=2;
		arrayOne[2]=3;
		arrayOne[3]=4;
		arrayOne[4]=5;
		try {
			for(int i=0;i<10;i++) {
				System.out.println(arrayOne[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException ex){
			//ArrayAndIndexOut Exceptions
			  System.out.println("Caught ArrayIndexOutOfBoundsException: " + ex.getMessage());
			  System.out.println("The Exception is ArrayIndexOutOfBoundsException ");
		}
		
		

	}

}
