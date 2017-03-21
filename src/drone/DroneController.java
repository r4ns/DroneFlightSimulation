package drone;

public class DroneController {

	public static void main(String[] args) {	
		
		Drone dron = new Drone(30,0,30);
		
		for (int i = 1; i<5; i++)
		{
			dron.moveUp();
		}
		System.out.println();
		
		for (int i = 1; i<13; i++)
		{
			dron.moveRight();
		}
		System.out.println();
		
		for (int i = 1; i<42; i++)
		{
			dron.moveUp();
		}
		System.out.println();
		
		for(int i = 1; i<18; i++)
		{
			dron.moveLeft();
		}
		System.out.println();
		for(int i = 1; i<13;i++)
		{
			dron.moveForth();
		}
		System.out.println();
		for(int i = 1;i<16; i++)
		{
			dron.moveDown();
		}
		System.out.println();
		for(int i =1; i <23; i++)
		{
			dron.moveLeft();
		}
		System.out.println();
		for (int i = 1; i<13; i++)
		{
			dron.moveBack();
		}
		System.out.println();
		for(int i = 1; i<4;i++)
		{
			dron.moveLeft();
		}
		


	}
}
