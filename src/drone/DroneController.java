package drone;

public class DroneController {

	public static void main(String[] args) {		

		Drone drone = new Drone(45,0,30);
		
		for (int i = 0; i < 56; i++)
		{
			System.out.println(drone.moveUp());
		}
		
		for (int i = 0; i < 56; i++)
		{
			System.out.println(drone.moveLeft());
		}
		
		for (int i = 0; i < 56; i++)
		{
			System.out.println(drone.moveDown());
		}
		
		for (int i = 0; i < 56; i++)
		{
			System.out.println(drone.moveBack());
		}
		
		for (int i = 0; i < 56; i++)
		{
			System.out.println(drone.moveRight());
		}
		
		for (int i = 0; i < 56; i++)
		{
			System.out.println(drone.moveUp());
		}
	}
}
