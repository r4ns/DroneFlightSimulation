package drone;

public class DroneController {

	public static void main(String[] args) {		
		Drone dron = new Drone();
		
		for (int i = 0; i < 12; i++) {
			System.out.println(dron.moveUp());
		}
		
		for (int i = 0; i < 21; i++) {
			System.out.println(dron.moveRight());
		}
		
		for (int i = 0; i < 23; i++) {
			System.out.println(dron.moveUp());
		}
		
		for (int i = 0; i < 16; i++) {
			System.out.println(dron.moveForth());
		}
		
		for (int i = 0; i < 12; i++) {
			System.out.println(dron.moveLeft());
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(dron.moveForth());
		}
		
		for (int i = 0; i < 18; i++) {
			System.out.println(dron.moveLeft());
		}
		
		for (int i = 0; i < 17; i++) {
			System.out.println(dron.moveUp());
		}
		for (int i = 0; i < 21; i++) {
			System.out.println(dron.moveBack());
		}
		for (int i = 0; i < 22; i++) {
			System.out.println(dron.moveLeft());
		}
		for (int i = 0; i < 20; i++) {
			System.out.println(dron.moveDown());
		}
		
		
	}
}
