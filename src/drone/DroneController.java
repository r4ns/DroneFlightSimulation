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
		
		System.out.println("Ides desno");
		
		for(i=drone.x; i<50; i++)
		{
			drone.moveRight();
		}
		
		System.out.println("Penjes se gore");
		
		for (i=drone.y; i<50; i++)
		{
			drone.moveUp();
		}
		
		System.out.println("Ides napred i oblilazis drugu stranu kocke");
		
		for(i=drone.z; i<50; i++)
		{
			drone.moveForth();
		}
		
		System.out.println("Ides levo");
		
		for(i=drone.x; i>25; i--)
		{
			drone.moveLeft();
		}
		
		System.out.println("Na kocki si");
		
		for(i=drone.z; i<30; i++)
		{
			drone.moveBack();
		}
		
		System.out.println("Ides levo do kraja kocke");
		
		for(i=drone.x; i>0; i--)
		{
			drone.moveLeft();
		}
		
		System.out.println("Spusta se na cilj");
		
		for(i=drone.y; i>30; i--)
		{
			drone.moveDown();
		}
		
}
}
