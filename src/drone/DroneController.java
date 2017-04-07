package drone;

public class DroneController{

	public static void main(String[] args) {		
		Drone drone = new Drone(30,0,30);
		System.out.println("---------------moving UP------------------");
		for(int i=0; i<6; i++)
		{
			System.out.println(drone.moveUp());
		}
		System.out.println("---------------moving LEFT------------------");
		for(int i=0; i<25; i++)
		{
			System.out.println(drone.moveLeft());
		}
		System.out.println("---------------moving UP------------------");
		for(int i=0; i<6; i++)
		{
			System.out.println(drone.moveUp());
		}
		System.out.println("---------------moving BACK------------------");
		for(int i=0; i<15; i++)
		{
			System.out.println(drone.moveBack());
		}
		System.out.println("---------------moving RIGHT------------------");
		for(int i=0; i<16; i++)
		{
			System.out.println(drone.moveRight());
		}
		System.out.println("---------------moving UP------------------");
		for(int i=0; i<30; i++)
		{
			System.out.println(drone.moveUp());
		}
		System.out.println("---------------moving FORTH------------------");
		for(int i=0; i<42; i++)
		{
			System.out.println(drone.moveForth());
		}
		System.out.println("---------------moving DOWN------------------");
		for(int i=0; i<12; i++)
		{
			System.out.println(drone.moveDown());
		}
		System.out.println("---------------moving LEFT------------------");
		for(int i=0; i<20; i++)
		{
			System.out.println(drone.moveLeft());
		}
		System.out.println("---------------moving BACK------------------");
		for(int i=0; i<24; i++)
		{
			System.out.println(drone.moveBack());
		}
		System.out.println("---------------moving LEFT------------------");
		System.out.println(drone.moveLeft());
		
		System.out.println("---------------moving BACK------------------");
		System.out.println(drone.moveBack());
		System.out.println(drone.moveBack());
		System.out.println(drone.moveBack());
		
	}
}
