package techno.java.assign.hasarelationcamputer;

public class hasAMain {
	public static void main(String[] args) {
		Desktop desktop=new Desktop(32, "1080p");
		MotherBoard mboard=new MotherBoard("msi","i9");
		HardDrive hdrive=new HardDrive("512GB", "SDD");
		KeyBoard keyBoard=new KeyBoard("k-12");
		Speaker speaker=new Speaker(12);
		Cooler cooler=new Cooler(3);
		Computer computer=new Computer(desktop, hdrive, speaker, keyBoard, mboard, cooler);
		computer.start();
		
	}

}
