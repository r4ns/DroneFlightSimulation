package drone;

public class DroneController {

	public static void main(String[] args) {		

		Drone nekiDrone = new Drone();
		
		for(int i = 0; i < 50; i++)
			System.out.println(nekiDrone.moveUp());
		
		for(int i = 0; i < 50; i++)
			System.out.println(nekiDrone.moveLeft());
		
		for(int i = 0; i < 50; i++)
			System.out.println(nekiDrone.moveUp());
		
		for(int i = 0; i < 50; i++)
			System.out.println(nekiDrone.moveRight());

		for(int i = 0; i < 50; i++)
			System.out.println(nekiDrone.moveDown());

		for(int i = 0; i < 50; i++)
			System.out.println(nekiDrone.moveForth());
		
	}
}
