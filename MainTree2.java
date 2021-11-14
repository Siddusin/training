package techno.JavaAssignment.TreeMapAssignment2;


public class MainTree2 implements Comparable<MainTree2>{
	int rollNum;
	String name;
	

	public MainTree2(int rollNum, String name) {
		super();
		this.rollNum = rollNum;
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "MainTree2 [rollNum=" + rollNum + ", name=" + name + "]";
	}


	@Override
	public int compareTo(MainTree2 o) {
		// TODO Auto-generated method stub
		return this.rollNum-o.rollNum;
	}

}
