package techno.java.collectin;
import java.util.Comparator;
public class CmapareFrndD implements Comparator<Friendship>{

	@Override
	public int compare(Friendship o1, Friendship o2) {
		
		return o1.Relation.compareTo(o2.Relation);
	}



	}

