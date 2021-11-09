package techno.java.collectin.asignA.Trainer;

public class Trainer implements Comparable<Trainer> {
int id;
String name;
String experience;
public Trainer(int id, String name, String experience) {
	super();
	this.id = id;
	this.name = name;
	this.experience = experience;
}
@Override
public String toString() {
	return "\n"+"Trainer [id=" + id + ", name=" + name + ", experience=" + experience + "]"+"\n";
}
@Override
public int compareTo(Trainer o) {
	// TODO Auto-generated method stub
	return 0;
}


}
