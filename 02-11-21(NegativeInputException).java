package techno.java.assign.calculator;

public class NegativeInputException extends Exception {
String meg;

public NegativeInputException(String mag) {
	super();
	this.meg = meg;
}
@Override
public String getMessage() {
	return meg;
}
}
