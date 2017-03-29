package drone;

public class DroneController {

	public static void main(String[] args) {		

		Drone nekiDrone = new Drone();
		
		System.out.println("---------------Move Up--------------");
		for(int i = 0; i < 50; i++)
			System.out.println(nekiDrone.moveUp());
		
		System.out.println("---------------Move Left--------------");
		for(int i = 0; i < 50; i++)
			System.out.println(nekiDrone.moveLeft());
		
		System.out.println("---------------Move Up--------------");
		for(int i = 0; i < 50; i++)
			System.out.println(nekiDrone.moveUp());
		
		System.out.println("---------------Move Right--------------");
		for(int i = 0; i < 50; i++)
			System.out.println(nekiDrone.moveRight());
		
		System.out.println("---------------Move Down--------------");
		for(int i = 0; i < 50; i++)
			System.out.println(nekiDrone.moveDown());

		System.out.println("---------------Move Forth--------------");
		for(int i = 0; i < 50; i++)
			System.out.println(nekiDrone.moveForth());
		
	}
}
