package techno.java.collectin.asignA.Trainer;

import java.util.Comparator;

public class TrainerDec implements Comparator<Trainer>{

	@Override
	public int compare(Trainer o1, Trainer o2) {
		
		return o2.experience.compareTo(o1.experience);
	}

}
