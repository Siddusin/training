package techno.java.assign.calculator;

public class SubtractException extends Exception {
	String meg;

	public SubtractException(String mag) {
		super();
		this.meg = meg;
	}
	@Override
	public String getMessage() {
		return meg;
	}
}
