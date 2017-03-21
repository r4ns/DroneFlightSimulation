package drone;

public class DroneController {

	public static void main(String[] args) {		
		Drone dron = new Drone();
		
		for (int i = 0; i < 12; i++) {
			System.out.println(dron.moveUp());
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(dron.moveForth());
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(dron.moveRight());
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(dron.moveBack());
		}
		
		for (int i = 0; i < 30; i++) {
			System.out.println(dron.moveUp());
		}
		
		for (int i = 0; i < 43; i++) {
			System.out.println(dron.moveLeft());
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(dron.moveDown());
		}
		
	}
}
