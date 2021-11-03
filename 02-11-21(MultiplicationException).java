package techno.java.assign.calculator;

public class MultiplicationException extends Exception {
	String meg;

	public MultiplicationException(String mag) {
		super();
		this.meg = meg;
	}
	@Override
	public String getMessage() {
		return meg;
	}
}
