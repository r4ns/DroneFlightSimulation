package drone;

public class DroneController{

	public static void main(String[] args) {
		Drone d = new Drone();
		
		System.out.println("-----Dron se pomera gore-----");
		for(int i = 0; i < 12;i++)
		{
			d.moveUp();
			System.out.println(d.getFormatedCoordinates());
		}
		
		System.out.println("-----Dron se pomera desno-----");
		for(int i = 0; i < 23;i++)
		{
			d.moveRight();
			System.out.println(d.getFormatedCoordinates());
		}
		
		System.out.println("-----Dron se pomera gore-----");
		for(int i = 0; i < 45; i++)
		{
			d.moveUp();
			System.out.println(d.getFormatedCoordinates());
		}
		
		System.out.println("-----Dron se pomera levo-----");
		for(int i = 0; i < 30; i++)
		{
			d.moveLeft();
			System.out.println(d.getFormatedCoordinates());
		}
		
		System.out.println("-----Dron se pomera nazad-----");
		for(int i = 0; i < 23; i++)
		{
			d.moveBack();
			System.out.println(d.getFormatedCoordinates());
		}
		
		System.out.println("-----Dron se pomera dole-----");
		for(int i = 0; i < 43; i++)
		{
			d.moveDown();
			System.out.println(d.getFormatedCoordinates());
		}
		
		System.out.println("-----Dron se pomera napred-----");
		for(int i = 0; i < 20; i++)
		{
			d.moveForth();
			System.out.println(d.getFormatedCoordinates());
		}
		
		System.out.println("-----Dron se pomera levo-----");
		for(int i = 0; i < 22; i++)
		{
			d.moveLeft();
			System.out.println(d.getFormatedCoordinates());
		}
		
		System.out.println("-----Dron se pomera gore-----");
		for(int i = 0; i < 23; i++)
		{
			d.moveUp();
			System.out.println(d.getFormatedCoordinates());
		}
	}
}