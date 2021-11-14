package techno.JavaAssignment.TreeMapAssignment;

import java.util.Comparator;

public class MainTree implements Comparable<MainTree>{
	int rollNum;
	String name;
	public MainTree(int rollNum, String name) {
		super();
		this.rollNum = rollNum;
		this.name = name;
	}
	@Override
	public String toString() {
		return "MainTree [rollNum=" + rollNum + ", name=" + name + "]";
	}

	@Override
	public int compareTo(MainTree o) {
		// TODO Auto-generated method stub
		return this.rollNum-o.rollNum;
	}
	



	

}
