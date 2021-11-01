package techno.java.assign.hasarelationcamputer;

public class Computer {
Desktop desktop;
HardDrive drive;
Speaker speaker;
KeyBoard board;
MotherBoard motherboard;
Cooler cooler;
public Computer(Desktop desktop, HardDrive drive, Speaker speaker, KeyBoard board, MotherBoard motherboard,
		Cooler cooler) {
	super();
	this.desktop = desktop;
	this.drive = drive;
	this.speaker = speaker;
	this.board = board;
	this.motherboard = motherboard;
	this.cooler = cooler;
}

public void start() {
	System.out.println(this.desktop+" "+this.drive+" "+this.speaker+" "+this.board+" "+this.motherboard+" "+this.cooler);
	System.out.println("Computer Started");
}


}
