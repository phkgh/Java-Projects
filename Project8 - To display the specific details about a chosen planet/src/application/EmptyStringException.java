

package application;

public class EmptyStringException extends Exception{									//user defined empty string exception is created

	public EmptyStringException() {
		super("The input field is empty");												//super class of the exception method is called
	}

}
