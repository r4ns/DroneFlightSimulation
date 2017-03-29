package drone;

public class DroneController {

	
	public static void main(String[] args) {		
	
		Drone dron = new Drone();
		
		System.out.println("Move up:");
		
		for(int i=0; i<10; i++)
		{
			System.out.println(dron.moveUp());
		
		}
		
		
		System.out.println("Move right");
		
		for(int i=30; i<50; i++)
		{
			System.out.println(dron.moveRight());
			
		}
		System.out.println("Move up:");
		
		for(int i=0; i<30; i++)
		{
			System.out.println(dron.moveUp());
			
		}
		System.out.println("Move forth:");
		
		for(int i=30; i<50; i++)
		{
			System.out.println(dron.moveForth());
			
		}
		System.out.println("Move left:");
		
		for(int i=0; i<50; i++)
		{
			System.out.println(dron.moveLeft());
			
		}
		
		System.out.println("Move back:");
		
		for(int i=0; i<20; i++)
		{
			System.out.println(dron.moveBack());
		}
		
		System.out.println("Move down:");
		
		for(int i=30; i<40; i++)
		{
			System.out.println(dron.moveDown());
			
		}
		
	}
}
