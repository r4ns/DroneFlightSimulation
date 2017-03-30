package drone;

public class DroneController{

	public static void main(String[] args) {
		Drone dron = new Drone();
		
		System.out.print("-----Pocetne koordinate drona-----");
		System.out.println(dron.getFormatedCoordinates());
		
		System.out.println("-----Dron se pomera gore-----");
		for(int i = 0; i < 12;i++)
			System.out.println(dron.moveUp());
		
		System.out.println("-----Dron se pomera desno-----");
		for(int i = 0; i < 23;i++)
			System.out.println(dron.moveRight());
		
		System.out.println("-----Dron se pomera gore-----");
		for(int i = 0; i < 45; i++)
			System.out.println(dron.moveUp());
		
		System.out.println("-----Dron se pomera levo-----");
		for(int i = 0; i < 30; i++)
			System.out.println(dron.moveLeft());
		
		System.out.println("-----Dron se pomera nazad-----");
		for(int i = 0; i < 23; i++)
			System.out.println(dron.moveBack());
		
		System.out.println("-----Dron se pomera dole-----");
		for(int i = 0; i < 43; i++)
			System.out.println(dron.moveDown());
		
		System.out.println("-----Dron se pomera napred-----");
		for(int i = 0; i < 20; i++)
			System.out.println(dron.moveForth());
		
		System.out.println("-----Dron se pomera levo-----");
		for(int i = 0; i < 22; i++)
			System.out.println(dron.moveLeft());
		
		System.out.println("-----Dron se pomera gore-----");
		for(int i = 0; i < 23; i++)
			System.out.println(dron.moveUp());
	}
}