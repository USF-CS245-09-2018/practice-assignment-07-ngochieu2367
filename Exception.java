public class Exception extends RuntimeException{

	public Exception(String message){
		super(message);
	}
}

//Usage: .... throw new ValueNotSetException("Value is not set");  in source code