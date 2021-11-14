package techno.JavaAssignment.TreeMapAssignment2;

import java.util.Comparator;


public class TreeIntegerCom implements Comparator<MainTree2>{

	@Override
	public int compare(MainTree2 o1, MainTree2 o2) {
		// TODO Auto-generated method stub
		return o2.rollNum-o1.rollNum;
	}

}
