package drone;

import drone.Drone;

public class DroneController {

	public static void main(String[] args) {		
		Drone dr1 = new Drone();
		System.out.println("Dole");
		for(int i = 0; i < 50; i++)
		{
			System.out.println(dr1.moveDown());
		}
		System.out.println("Levo");
		for(int i = 0; i < 50; i++)
		{
			System.out.println(dr1.moveLeft());
		}
		System.out.println("Gore");
		for(int i = 0; i < 50; i++)
		{
			System.out.println(dr1.moveUp());
		}
		System.out.println("Desno");
		for(int i = 0; i < 50; i++)
		{
			System.out.println(dr1.moveRight());
		}
		System.out.println("Nazad");
		for(int i = 0; i < 50; i++)
		{
			System.out.println(dr1.moveBack());
		}
		System.out.println("Levo");
		for(int i = 0; i < 50; i++)
		{
			System.out.println(dr1.moveLeft());
		}
		
	}
}
