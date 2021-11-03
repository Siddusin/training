package techno.java.corejava.exception;

public class MinorException extends Exception {

	String msg;

	public MinorException(String msg) {
		super();
		this.msg = msg;
	}
	@Override
	public String getMessage() {
		return msg;
	}
	}


