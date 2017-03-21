package drone;

public class DroneController {

	public static void main(String[] args) {		

		Drone drone = new Drone();
		int i;
		
		for(i=drone.y; i<10;i++)
		{
			drone.moveUp();
			
		}
		for(i=drone.x; i<=49; i++)
		{
			drone.moveRight();
		}
		
		for(i=drone.y; i<50; i++)
		{
			drone.moveUp();
		}
		
		for (i=drone.z; i>10; i--)
		{
			drone.moveForth();
		}
		
		for (i=drone.x; i>10; i--)
		{
			drone.moveLeft();
		}
		
		for (i=drone.z; i<30; i++)
		{
			drone.moveBack();
		}
		
		for (i=drone.y; i>30; i--)
		{
			drone.moveDown();
		}
		
		for (i=drone.x; i>0; i--)
		{
			drone.moveLeft();
		}
	}
}
