package drone;

public class DroneController {

	public static void main(String[] args) {	
		
		Drone dron = new Drone();
		
		System.out.println(">>>Moving up<<<");
		for (int i = 1; i<5; i++)
		{
			dron.moveUp();
		}
		System.out.println();
		
		System.out.println(">>>Moving right<<<");
		for (int i = 1; i<13; i++)
		{
			dron.moveRight();
		}
		System.out.println();
		
		System.out.println(">>>Moving up<<<");
		for (int i = 1; i<42; i++)
		{
			dron.moveUp();
		}
		System.out.println();
		
		System.out.println(">>>Moving left<<<");		
		for(int i = 1; i<18; i++)
		{
			dron.moveLeft();
		}
		System.out.println();
		
		System.out.println(">>>Moving forth<<<");
		for(int i = 1; i<23;i++)
		{
			dron.moveForth();
		}
		System.out.println();
		
		System.out.println(">>>Moving down<<<");
		for(int i =1; i <16; i++)
		{
			dron.moveDown();
		}
		System.out.println();
		
		System.out.println(">>>Moving left<<<");
		for (int i = 1; i<20; i++)
		{
			dron.moveLeft();
		}
		System.out.println();
		
		System.out.println(">>>Moving back<<<");		
		for (int i=1; i<23; i++)
		{
			dron.moveBack();
		}
		System.out.println();
		
		System.out.println(">>>Moving left<<<");
		for(int i = 1; i<7;i++)
		{
			dron.moveLeft();
		}
		
		


	}
}
