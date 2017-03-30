package drone;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class DroneController {

	public static void main(String[] args) {	
		int i;
		Drone dron=new Drone(5,0,30);
		System.out.println(dron.toString());
		for(i=0;i<12;i++){
			dron.moveUp();
		
		}
		System.out.println("-----------------------------");
		for(i=0;i<21;i++){
			dron.moveRight();
			
		}
		System.out.println("-----------------------------");
		for(i=0;i<23;i++){
			dron.moveUp();
			
		}
		System.out.println("-----------------------------");
		for(i=0;i<16;i++){
			dron.moveForth();
			
		}
		System.out.println("-----------------------------");
		for(i=0;i<12;i++){
			dron.moveLeft();
		
		}
		System.out.println("-----------------------------");
		for(i=0;i<5;i++){
			dron.moveForth();
			
		}
		System.out.println("-----------------------------");
		for(i=0;i<18;i++){
			dron.moveLeft();
			
		}
		System.out.println("-----------------------------");
		for(i=0;i<17;i++){
			dron.moveUp();
			
		}
		System.out.println("-----------------------------");
		for(i=0;i<21;i++){
			dron.moveBack();
			
		}
		System.out.println("-----------------------------");
		for(i=0;i<22;i++){
			dron.moveLeft();
			
		}
		System.out.println("-----------------------------");
		for(i=0;i<20;i++){
			dron.moveDown();
			
		}
		
		
	}
}
