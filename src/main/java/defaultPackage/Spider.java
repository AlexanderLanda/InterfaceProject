package defaultPackage;

import javax.sound.midi.SysexMessage;

public class Spider extends Animal{

	public Spider() {
		super(8);
		
	}

	@Override
	public void eat() {

		System.out.println("Las arañas comen de todo.");
	}

}
