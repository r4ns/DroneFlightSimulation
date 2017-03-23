package drone;

public class DroneController {

	public static void main(String[] args) {
		Drone mojDron = new Drone();
		System.out.println("MOVING UP!");
		for (int i = 0; i < 12; i++)
			System.out.println(mojDron.moveUp());
		System.out.println("MOVING RIGHT!");
		for (int i = 0; i < 22; i++)
			System.out.println(mojDron.moveRight());
		System.out.println("MOVING UP!");
		for (int i = 0; i < 23; i++)
			System.out.println(mojDron.moveUp());
		System.out.println("MOVING FORTH!");
		for (int i = 0; i < 16; i++)
			System.out.println(mojDron.moveForth());
		System.out.println("MOVING LEFT!");
		for (int i = 0; i < 12; i++)
			System.out.println(mojDron.moveLeft());
		System.out.println("MOVING FORTH!");
		for (int i = 0; i < 6; i++)
			System.out.println(mojDron.moveForth());
		System.out.println("MOVING LEFT!");
		for (int i = 0; i < 18; i++)
			System.out.println(mojDron.moveLeft());
		System.out.println("MOVING UP!");
		for (int i = 0; i < 20; i++)
			System.out.println(mojDron.moveUp());
		System.out.println("MOVING BACK!");
		for (int i = 0; i < 22; i++)
			System.out.println(mojDron.moveBack());
		System.out.println("MOVING LEFT!");
		for (int i = 0; i < 25; i++)
			System.out.println(mojDron.moveLeft());
		System.out.println("MOVING DOWN!");
		for (int i = 0; i < 20; i++)
			System.out.println(mojDron.moveDown());
	}
}
