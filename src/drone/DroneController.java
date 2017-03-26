package drone;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class DroneController {

	public static void main(String[] args) {	
		int i;
		Drone dron=new Drone(30,0,30);
		System.out.println("----------Dron krece gore--------------");
		System.out.println(dron.toString());
		for(i=0;i<12;i++){
			dron.moveUp();
			System.out.println(dron.toString());
		}
		System.out.println("----------Dron krece unazad--------------");
		for(i=0;i<22;i++){
			dron.moveBack();
			System.out.println(dron.toString());
		}
		System.out.println("----------Dron krece gore--------------");
		for(i=0;i<22;i++){
			dron.moveUp();
			System.out.println(dron.toString());
		}
		System.out.println("----------Dron krece napred--------------");
		for(i=0;i<22;i++){
			dron.moveForth();
			System.out.println(dron.toString());
		}
		System.out.println("----------Dron krece desno--------------");
		for(i=0;i<23;i++){
			dron.moveRight();
			System.out.println(dron.toString());
		}
		System.out.println("----------Dron krece napred--------------");
		for(i=0;i<10;i++){
			dron.moveForth();
			System.out.println(dron.toString());
		}
		
		System.out.println("----------Dron krece levo--------------");
		for(i=0;i<12;i++){
			dron.moveLeft();
			System.out.println(dron.toString());
		}
		System.out.println("----------Dron krece nazad--------------");
		for(i=0;i<42;i++){
			dron.moveForth();
			System.out.println(dron.toString());
		}
		System.out.println("----------Dron krece levo--------------");
		for(i=0;i<10;i++){
			dron.moveLeft();
			System.out.println(dron.toString());
		}
		System.out.println("----------Dron krece nazad--------------");
		for(i=0;i<12;i++){
			dron.moveBack();
			System.out.println(dron.toString());
		}
		System.out.println("----------Dron krece gore--------------");
		for(i=0;i<20;i++){
			dron.moveUp();
			System.out.println(dron.toString());
		}
		System.out.println("----------Dron krece gore--------------");
		for(i=0;i<20;i++){
			dron.moveBack();
			System.out.println(dron.toString());
		}
		System.out.println("----------Dron krece dole--------------");
		for(i=0;i<12;i++){
			dron.moveDown();
			System.out.println(dron.toString());
		}
		System.out.println("----------Dron krece levo--------------");
		for(i=0;i<32;i++){
			dron.moveLeft();
			System.out.println(dron.toString());
		}
		System.out.println("----------Dron krece na poziciju--------------");
		for(i=0;i<10;i++){
			dron.moveDown();
			System.out.println(dron.toString());
		}
		System.out.println("Dron je stigao na poziciju: "+dron.toString());
		System.out.println("hej");
	}
}
