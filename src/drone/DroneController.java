package drone;

public class DroneController {

	public static void main(String[] args) {
		
		Drone dron = new Drone(30,0,30);
		
		System.out.println("Pocetna pozicija:");
		System.out.println(dron.getFormatedCoordinates());
		
		System.out.println("Pomeranje na gore:");
		for (int i=0; i<5; i++) {
			dron.moveUp();
			System.out.println(dron.getFormatedCoordinates());
		}
		
		System.out.println("Pomeranje nazad:");
		for (int i=0; i<15; i++) {
			dron.moveBack();
			System.out.println(dron.getFormatedCoordinates());
		}
		
		System.out.println("Pomeranje na gore:");
		for (int i=0; i<40; i++) {
			dron.moveUp();
			System.out.println(dron.getFormatedCoordinates());
		}
		
		System.out.println("Pomeranje napred:");
		for (int i=0; i<40; i++) {
			dron.moveForth();
			System.out.println(dron.getFormatedCoordinates());
		}
		
		System.out.println("Pomeranje na dole:");
		for (int i=0; i<40; i++) {
			dron.moveDown();
			System.out.println(dron.getFormatedCoordinates());
		}
		
		System.out.println("Pomeranje u levo:");
		for (int i=0; i<30; i++) {
			dron.moveLeft();
			System.out.println(dron.getFormatedCoordinates());
		}
		
		System.out.println("Pomeranje na krajnju poziciju:");
		for (int i=0; i<25; i++) {
			dron.moveUp();
			dron.moveBack();
			System.out.println(dron.getFormatedCoordinates());
		}

	}
}
