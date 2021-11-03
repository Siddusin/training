package techno.java.assign.calculator;

public class DivisionException extends Exception {
	String meg;

	public DivisionException(String mag) {
		super();
		this.meg = meg;
	}
	@Override
	public String getMessage() {
		return meg;
	}
}
