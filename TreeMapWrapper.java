package techno.JavaAssignment.TreeMapAssignment;
import java.util.Comparator;


public class TreeMapWrapper implements Comparator<MainTree>{

	@Override
	public int compare(MainTree o1, MainTree o2) {
		// TODO Auto-generated method stub
		return o2.rollNum-o1.rollNum;
	}






}
