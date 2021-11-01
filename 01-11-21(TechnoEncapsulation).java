package techno.java.assign.EncapsulationProgram;

public class TechnoEncapsulation {
private String company;
private int empid;
private String name;
private double logintime;
private double logouttime;
String topicLearnt;
public TechnoEncapsulation(String company, int empid, String name, double timein, double timeout,
		String topicLearnt) {
	super();
	this.company = company;
	this.empid = empid;
	this.name = name;
	this.logintime = timein;
	this.logouttime = timeout;
	this.topicLearnt = topicLearnt;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getLogintime() {
	return logintime;
}
public void setLogintime(double logintime) {
	this.logintime = logintime;
}
public double getLogouttime() {
	return logouttime;
}
public void setLogouttime(double logouttime) {
	this.logouttime = logouttime;
}
public String getTopicLearnt() {
	return topicLearnt;
}
public void setTopicLearnt(String topicLearnt) {
	this.topicLearnt = topicLearnt;
}





}
