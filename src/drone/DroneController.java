package drone;

public class DroneController {

	public static void main(String[] args) {		
		Drone dron = new Drone(30, 0, 30);
		System.out.println("Pocetna pozicija!");
		System.out.println(dron.getFormatedCoordinates());
	
		System.out.println("*****Pomeram se gore!*****");
		
		for (int i = 0; i <10; i++){
			System.out.println(dron.moveUp());
		}
		
		System.out.println("*****Pomeram se desno!*****");
		
		for (int i = 0; i <20; i++){
		System.out.println(dron.moveRight());
		}
		
		System.out.println("*****Pomeram se napred!*****");
		for (int i = 0; i <30; i++){
			System.out.println(dron.moveForth());
		}
		
		System.out.println("*****Pomeram se gore!*****");
		for (int i = 0; i <40; i++){
			System.out.println(dron.moveUp());
		}
		
		System.out.println("*****Pomeram se levo!*****");
		for (int i = 0; i <50; i++){
			System.out.println(dron.moveLeft());
		}
		
		System.out.println("*****Pomeram se dole!*****");
		for (int i = 0; i <20; i++){
			System.out.println(dron.moveDown());
		}
		
		System.out.println("*****Pomeram se nazad!*****");
		for (int i = 0; i <30; i++){
			System.out.println(dron.moveBack());
		}
	}
}
