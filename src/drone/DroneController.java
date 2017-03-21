package drone;

public class DroneController {

	public static void main(String[] args) {		

		Drone drone = new Drone();
		int i;
		
		System.out.println("Penjes se gore");
		
		for (i=drone.y; i<10; i++)
		{
			drone.moveUp();
		}
		System.out.println("Ides skroz desno");
		for (i=drone.x; i<50; i++)
		{
			drone.moveRight();
		}
		System.out.println("Ides skroz gore");
		for(i=drone.y; i<50; i++)
		{
			drone.moveUp();
		}
		System.out.println("Ides skroz napred");
		for(i=drone.z; i<50; i++)
		{
			drone.moveForth();
		}
		System.out.println("Ides levo");
		for(i=drone.x; i>30;i--)
		{
			drone.moveLeft();
		}
		System.out.println("Na kocki si");
		for(i=drone.z; i>30; i--)
		{
			drone.moveBack();
		}
		System.out.println("Ides levo do 0");
		for(i=drone.x; i>0; i--)
		{
			drone.moveLeft();
		}
		System.out.println("Spusta se");
		for(i=drone.y; i>30; i--)
		{
			drone.moveDown();
		}
		
}
}
