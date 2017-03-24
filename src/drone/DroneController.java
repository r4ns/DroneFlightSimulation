package drone;

public class DroneController {

	public static void main(String[] args) {	
		Drone MojDron = new Drone(30,0,30);
		System.out.println("----- START COORDINATES -----");
		System.out.println(MojDron.getFormatedCoordinates());
		System.out.println("----- FLIGHT STARTED -----");
		
		System.out.println("----- MOVE UP -----");
		while (MojDron.y < 10) {
			System.out.println(MojDron.moveUp());
		}
		
		System.out.println("----- MOVE RIGHT -----");
		while (MojDron.x < 50) {
			System.out.println(MojDron.moveRight());
		}
		
		System.out.println("----- MOVE UP -----");
		while (MojDron.y < 50) {
			System.out.println(MojDron.moveUp());
		}
		
		System.out.println("----- MOVE LEFT -----");
		while (MojDron.x > 30) {
			System.out.println(MojDron.moveLeft());
		}
		
		System.out.println("----- MOVE FORTH -----");
		while (MojDron.z > 0) {
			System.out.println(MojDron.moveForth());
		}
		
		System.out.println("----- MOVE DOWN -----");
		while (MojDron.y > 30) {
			System.out.println(MojDron.moveDown());
		}
		
		System.out.println("----- MOVE LEFT -----");
		while (MojDron.x > 0) {
			System.out.println(MojDron.moveLeft());
		}
		
		System.out.println("----- MOVE BACK -----");
		while (MojDron.z < 30) {
			System.out.println(MojDron.moveBack());
		}
		
		System.out.println("----- END COORDINATES -----");
		System.out.println(MojDron.getFormatedCoordinates());
		
	}
}
