package Task11;

public class StringIndexOutException {

	public static void main(String[] args) {
		// StringIndexOut  Exception
				String str = "Hello World!";
		        try {
		            // Attempt to get a substring with an invalid range
		            String substr = str.substring(7, 20);
		        } catch (StringIndexOutOfBoundsException e) {
		            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
		            System.out.println("StringIndexOutOfBoundsException: ");
		        }
	}

}
