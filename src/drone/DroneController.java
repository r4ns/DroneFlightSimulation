package drone;

import space.DoubleCubeDrone;

public class DroneController {

	public static void main(String[] args) {		
		
		
		DoubleCubeDrone dron = new DoubleCubeDrone(new int[] {33, 22, 4}, 1);
		
		for (int i = 0; i < 2; i++)
			System.out.println(dron.moveUp());
		for (int i = 0; i < 2; i++)
			System.out.println(dron.moveRight());
		for (int i = 0; i < 2; i++)
			System.out.println(dron.moveForth());
		for (int i = 0; i < 2; i++)
			System.out.println(dron.moveLeft());
		for (int i = 0; i < 2; i++)
			System.out.println(dron.moveDown());
		for (int i = 0; i < 2; i++)
			System.out.println(dron.moveBack());
		
		
		
		
		
	}
}
