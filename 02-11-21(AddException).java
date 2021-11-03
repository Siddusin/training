package techno.java.assign.calculator;

public class AddException extends Exception {
	String meg;

	public AddException(String mag) {
		super();
		this.meg = meg;
	}
	@Override
	public String getMessage() {
		return meg;
	}
}
