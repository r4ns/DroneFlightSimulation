package space;

import drone.DroneOne;

public class DroneController {

	public static void main(String[] args) {
		DoubleCubeDrone dron = new DoubleCubeDrone(new DroneOne(5, 5,5), new DroneOne(6, 6, 5), new DroneOne(6, 6, 4), new DroneOne(7, 7, 4));
		
		System.out.println(dron.getFormatedCoordinates());
		System.out.println(dron.moveUp());
		System.out.println(dron.moveDown());
		System.out.println(dron.moveBack());
		System.out.println(dron.moveForth());
		System.out.println(dron.moveRight());
		System.out.println(dron.moveLeft());
		}

}
