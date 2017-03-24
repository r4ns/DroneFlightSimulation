package drone;

import java.io.ObjectInputStream.GetField;

public class DroneController {

	public static void main(String[] args) {	
		
		Drone dron=new Drone();
		dron.setX(30);
		dron.setY(0);
		dron.setZ(30);
		System.out.println(dron.getFormatedCoordinates());
		System.out.println("Dron se pokrece!");
		
		System.out.println("Dron ide gore!");
		for (int i=0; i<10; i++) {
			dron.moveUp();
			System.out.println(dron.getFormatedCoordinates());
		}
		
		System.out.println("Dron ide desno!");
		for (int i=0; i<10; i++) {
			dron.moveRight();
			System.out.println(dron.getFormatedCoordinates());
		}
		
		System.out.println("Dron ide gore!");
		for (int i=0; i<20; i++) {
			dron.moveUp();
			System.out.println(dron.getFormatedCoordinates());
		}
		
		System.out.println("Dron ide napred!");
		for (int i=0; i<20; i++) {
			dron.moveForth();
			System.out.println(dron.getFormatedCoordinates());
		}
		
		System.out.println("Dron ide levo!");
		for (int i=0; i<20; i++) {
			dron.moveLeft();
			System.out.println(dron.getFormatedCoordinates());
		}
		
		System.out.println("Dron ide gore!");
		for (int i=0; i<10; i++) {
			dron.moveUp();
			System.out.println(dron.getFormatedCoordinates());
		}
		
		System.out.println("Dron ide nazad!");
		for (int i=0; i<20; i++) {
			dron.moveBack();
			System.out.println(dron.getFormatedCoordinates());
		}
		
		System.out.println("Dron ide levo!");
		for (int i=0; i<20; i++) {
			dron.moveLeft();
			System.out.println(dron.getFormatedCoordinates());
		}
		
		System.out.println("Dron ide dole!");
		for (int i=0; i<10; i++) {
			dron.moveDown();
			System.out.println(dron.getFormatedCoordinates());
		}
		
		System.out.println("Dron je stigao na cilj!");
                                    
	}   
}
