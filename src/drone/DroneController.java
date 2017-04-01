package drone;

public class DroneController {

	public static void main(String[] args) {
Drone drone = new Drone(30,0,30);
		
		drone.getFormatedCoordinates();
		System.out.println("------Moving up----");
		for(int i=0;i<15;i++)
		{
			drone.moveUp();
		}
		System.out.println("------Moving right----");
		for(int i=0;i<22;i++)
		{
			drone.moveRight();
		}
		System.out.println("------Moving up----");
		for(int i=0;i<22;i++)
		{
			drone.moveUp();
		}
		System.out.println("------Moving forth----");
		for(int i=0;i<16;i++)
		{
			drone.moveForth();
		}
		System.out.println("------Moving left----");
		for(int i=0;i<17;i++)
		{
			drone.moveLeft();
		}
		System.out.println("------Moving up----");
		for(int i=0;i<20;i++)
		{
			drone.moveUp();
		}
		System.out.println("------Moving back----");
		for(int i=0;i<20;i++)
		{
			drone.moveBack();
		}
		System.out.println("------Moving forth----");
		for(int i=0;i<10;i++)
		{
			drone.moveForth();
		}
		System.out.println("------Moving left----");
		for(int i=0;i<13;i++)
		{
			drone.moveLeft();
		}
		System.out.println("------Moving left----");
		for(int i=0;i<30;i++)
		{
			drone.moveLeft();
		}
		System.out.println("------Moving down----");
		for(int i=0;i<20;i++)
		{
			drone.moveDown();
		}System.out.println("------Moving back----");
		for(int i=0;i<6;i++)
		{
			drone.moveBack();
		}
		if(drone.getX()==0 &&
				drone.getY()==30
				&& drone.getZ()==30)
			System.out.println("Target reached!");


	


	}
}
