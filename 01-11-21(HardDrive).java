package techno.java.assign.hasarelationcamputer;

public class HardDrive {
	String Storage;
	String type;
	public HardDrive(String storage, String type) {
		super();
		Storage = storage;
		this.type = type;
	}
	@Override
	public String toString() {
		return "HardDrive [Storage=" + Storage + ", type=" + type + "]";
	}
	

}
