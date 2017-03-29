package drone;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class DroneController {

	public static void main(String[] args) {	
		int i;
		Drone dron=new Drone(5,0,30);
		System.out.println("----------Dron krece gore--------------");
		System.out.println(dron.toString());
		for(i=0;i<10;i++){
			dron.moveUp();
			System.out.println(dron.toString());
		}
		for(i=0;i<20;i++){
			dron.moveBack();
			System.out.println(dron.toString());
		}
		for(i=0;i<40;i++){
			dron.moveUp();
			System.out.println(dron.toString());
		}
		for(i=0;i<20;i++){
			dron.moveForth();
			System.out.println(dron.toString());
		}
		for(i=0;i<10;i++){
			dron.moveDown();
			System.out.println(dron.toString());
		}
		for(i=0;i<30;i++){
			dron.moveLeft();
			System.out.println(dron.toString());
		}
		for(i=0;i<10;i++){
			dron.moveDown();
			System.out.println(dron.toString());
		}
		
		
	}
}
