package Task11;
public class IncorrectPasswordException extends Exception {
   //IncorrectPasswordException Exception
	private static final long serialVersionUID = 1L;

	public IncorrectPasswordException(String message) {
        super(message);
    }
}