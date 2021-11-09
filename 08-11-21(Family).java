package techno.java.collectin.asignA.Family;

public class Family implements Comparable<Family> {
String relation;
String name;
int age;
public Family(String relation, String name, int age) {
	super();
	this.relation = relation;
	this.name = name;
	this.age = age;
}
@Override
public String toString() {
	return "Family [relation=" + relation + ", name=" + name + ", age=" + age + "]";
}
@Override
public int compareTo(Family o) {
	// TODO Auto-generated method stub
	return this.age-o.age;
}

}
