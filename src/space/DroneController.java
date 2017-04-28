package space;

import drone.DroneOne;

public class DroneController {

	public static void main(String[] args) {
		DoubleCubeDrone dron = new DoubleCubeDrone(new DroneOne(0, 0,1), new DroneOne(1, 1, 1), new DroneOne(1, 1, 0), new DroneOne(2, 2, 0));
		
		
		
		for (int i = 0; i < 12; i++)
			System.out.println(dron.moveUp());
		
		for (int i = 0; i < 15; i++)
			System.out.println(dron.moveBack());

		for (int i = 0; i < 13; i++)
			System.out.println(dron.moveDown());

		for (int i = 0; i < 24; i++)
			System.out.println(dron.moveRight());

		for (int i = 0; i < 33; i++)
			System.out.println(dron.moveLeft());

		for (int i = 0; i < 36; i++)
			System.out.println(dron.moveForth());
		
		}

}
