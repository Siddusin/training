package techno.java.corejava.exception.assignmentex;

public class UserMinorException extends Exception {
String msg;

public UserMinorException(String msg) {
	super();
	this.msg = msg;
}
@Override
public String getMessage() {
	return msg;
}
}
