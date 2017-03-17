package drone;

public class DroneController{

	public static void main(String[] args) {		
		Drone drone = new Drone(30,0,30);
		System.out.println("---------------moving UP------------------");
		for(int i=0; i<6; i++)
		{
			drone.moveUp();
		}
		System.out.println("---------------moving LEFT------------------");
		for(int i=0; i<25; i++)
		{
			drone.moveLeft();
		}
		System.out.println("---------------moving UP------------------");
		for(int i=0; i<6; i++)
		{
			drone.moveUp();
		}
		System.out.println("---------------moving BACK------------------");
		for(int i=0; i<15; i++)
		{
			drone.moveBack();
		}
		System.out.println("---------------moving RIGHT------------------");
		for(int i=0; i<16; i++)
		{
			drone.moveRight();
		}
		System.out.println("---------------moving UP------------------");
		for(int i=0; i<30; i++)
		{
			drone.moveUp();
		}
		System.out.println("---------------moving FORTH------------------");
		for(int i=0; i<42; i++)
		{
			drone.moveForth();
		}
		System.out.println("---------------moving DOWN------------------");
		for(int i=0; i<12; i++)
		{
			drone.moveDown();
		}
		System.out.println("---------------moving LEFT------------------");
		for(int i=0; i<20; i++)
		{
			drone.moveLeft();
		}
		System.out.println("---------------moving BACK------------------");
		for(int i=0; i<24; i++)
		{
			drone.moveBack();
		}
		System.out.println("---------------moving LEFT------------------");
		drone.moveLeft();
		
		System.out.println("---------------moving BACK------------------");
		drone.moveBack();
		drone.moveBack();
		drone.moveBack();
		
	}
}
