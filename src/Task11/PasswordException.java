package Task11;

public class PasswordException {

	public static void main(String[] args) {
		// validate the password
		  try {
	            validatePassword("wrongPassword");
	        } catch (IncorrectPasswordException e) {
	            System.out.println("The message is "+e.getMessage());
	        }
	}
	
	 public static void validatePassword(String password) throws IncorrectPasswordException {
	     //throw the password Exception 
		 if (!password.equals("Right Password")) {
	            throw new IncorrectPasswordException("Incorrect password provided.");
	        }
	        System.out.println("Password is correct.");
	    }

}
