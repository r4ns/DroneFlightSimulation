package drone;

import space.DoubleCubeDrone;

public class DroneController {

	public static void main(String[] args) {		
		/*Drone dron = new Drone();
		for (int i = 0; i < 12; i++)
			System.out.println(dron.moveUp());
		for (int i = 0; i < 25; i++)
			System.out.println(dron.moveRight());
		for (int i = 0; i < 25; i++)
			System.out.println(dron.moveForth());
		for (int i = 0; i < 53; i++)
			System.out.println(dron.moveLeft());
		for (int i = 0; i < 40; i++)
			System.out.println(dron.moveUp());
		for (int i = 0; i < 30; i++)
			System.out.println(dron.moveRight());
		for (int i = 0; i < 20; i++)
			System.out.println(dron.moveDown());
		for (int i = 0; i < 15; i++)
			System.out.println(dron.moveBack());
		for (int i = 0; i < 33; i++)
			System.out.println(dron.moveLeft());
		for (int i = 0; i < 10; i++)
			System.out.println(dron.moveBack());*/
		
		//DoubleCubeDrone dron = new DoubleCubeDrone(new DroneOne(30, 0, 31), new DroneOne(31, 1, 31), new DroneOne(31, 1, 30), new DroneOne(32, 2, 30));
		
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
		
		/*Cube cube = new Cube(new int[] {0, 0, 0}, 10);
		Cube cube1 = new Cube(new int[] {15, 15, 15}, 5);
		cube.checkIfCubesAreTouching(cube1);*/
		
		
		
	}
}
