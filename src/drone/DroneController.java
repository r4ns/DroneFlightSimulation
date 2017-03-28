package drone;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class DroneController {

	public static void main(String[] args) {	
		int i;
		Drone dron=new Drone(30,50,30);
		System.out.println("----------Dron krece gore--------------");
		System.out.println(dron.toString());
		for(i=0;i<20;i++){
			dron.moveDown();
			System.out.println(dron.toString());
		}
		
		
	}
}
