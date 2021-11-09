package techno.java.collectin.asignA.HashtoTree;


public class Hash1 implements Comparable<Hash1>{
    int id;
    
	public Hash1(int id) {
		super();
		this.id = id;
	}
    
	@Override
	public int compareTo(Hash1 o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
    
	@Override
	public String toString() {
		return "["+id+"]";
	}
    
}