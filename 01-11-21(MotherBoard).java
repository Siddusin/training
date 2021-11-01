package techno.java.assign.hasarelationcamputer;

public class MotherBoard {
String Procceser;
String Generation;
public MotherBoard(String procceser, String generation) {
	super();
	Procceser = procceser;
	Generation = generation;
}
@Override
public String toString() {
	return "MotherBoard [Procceser=" + Procceser + ", Generation=" + Generation + "]";
}

}
