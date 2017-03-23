package drone;

public class DroneController {

	public static void main(String[] args) {		
		
Drone dron = new Drone(30,0,30);
		
		for (int i = 1; i<6; i++)
		{
			dron.moveUp();
		}
		System.out.println();
		for (int i = 1; i<16; i++)
		{
			dron.moveForth();
		}
		System.out.println();
		
		for (int i = 1; i<42; i++)
		{
			dron.moveUp();
		}
		System.out.println();
		
		for(int i = 1; i<40; i++)
		{
			dron.moveBack();
		}
		System.out.println();
		for(int i = 1; i<17;i++)
		{
			dron.moveDown();
		}
		System.out.println();
		for(int i = 1;i<25; i++)
		{
			dron.moveLeft();
		}
		for(int i=1; i<25;i++){
			dron.moveForth();
		}
		System.out.println();
		for(int i=1;i<7;i++){
			dron.moveLeft();
		}
	}
}
