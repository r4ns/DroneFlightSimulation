package drone;

public class DroneController {

	public static void main(String[] args) {		

		Drone dron = new Drone(30,0,30);
		
		for (int i = 0; i < 15; i++)
		{
			System.out.println(dron.moveRight());
			System.out.println(dron.getFormatedCoordinates()); //0,45,30
		}
		
		for (int i = 0; i < 45; i++)
		{
			System.out.println(dron.moveUp());
			System.out.println(dron.getFormatedCoordinates()); //45,45,30
		}
		
		for (int i = 0; i < 15; i++)
		{
			System.out.println(dron.moveLeft());
			System.out.println(dron.getFormatedCoordinates()); //30,45,30
		}
		
		for (int i = 0; i < 25; i++)
		{
			System.out.println(dron.moveForth());
			System.out.println(dron.getFormatedCoordinates()); //30,45,5
		}
		
		for (int i = 0; i < 15; i++)
		{
			System.out.println(dron.moveLeft());
			System.out.println(dron.getFormatedCoordinates()); //15,45,5
		}
		
		for (int i = 0; i < 40; i++)
		{
			System.out.println(dron.moveDown());
			System.out.println(dron.getFormatedCoordinates()); //15,5,5
		}
		
		for (int i = 0; i < 15; i++)
		{
			System.out.println(dron.moveLeft());
			System.out.println(dron.getFormatedCoordinates()); //0,5,5
		}
		
		for (int i = 0; i < 25; i++)
		{
			System.out.println(dron.moveBack());
			System.out.println(dron.getFormatedCoordinates()); //0,5,30
		}
		
		for (int i = 0; i < 25; i++)
		{
			System.out.println(dron.moveUp());
			System.out.println(dron.getFormatedCoordinates()); //0,30,30
		}				
	}
}
