package drone;

public class DroneController {

	public static void main(String[] args) {		

		Drone mojDron = new Drone(30 ,0, 30);
		System.out.println(mojDron.getFormatedCoordinates());
		mojDron.moveUp(12);
		mojDron.moveRight(21);
		mojDron.moveUp(23);
		mojDron.moveForth(16);
		mojDron.moveLeft(12);
		mojDron.moveForth(5);
		mojDron.moveLeft(18);
		mojDron.moveUp(17);
		mojDron.moveBack(21);
		mojDron.moveLeft(22);
		mojDron.moveDown(20);
		
		
		
		
	}
}
