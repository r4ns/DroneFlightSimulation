package drone;

public class DroneController {

	public static void main(String[] args) {		
		Drone d1 = new Drone();
		
		System.out.println(d1.getFormatedCoordinates());
		System.out.println("Pomera se gore");
		for(int i=0;i<12;i++)
			System.out.println(d1.moveUp());
		System.out.println("Pomera se desno");
		for(int i=0;i<22;i++)
			System.out.println(d1.moveRight());
		System.out.println("Pomera se gore");
		for(int i=0;i<23;i++)
			System.out.println(d1.moveUp());
		System.out.println("Pomera se napred");
		for(int i=0;i<16;i++)
			System.out.println(d1.moveForth());
		System.out.println("Pomera se levo");
		for(int i=0;i<12;i++)
			System.out.println(d1.moveLeft());
		System.out.println("Pomera se napred");
		for(int i=0;i<5;i++)
			System.out.println(d1.moveForth());
		System.out.println("Pomera se levo");
		for(int i=0;i<18;i++)
			System.out.println(d1.moveLeft());
		System.out.println("Pomera se gore");
		for(int i=0;i<17;i++)
			System.out.println(d1.moveUp());
		System.out.println("Pomera se nazad");
		for(int i=0;i<21;i++)
			System.out.println(d1.moveBack());
		System.out.println("Pomera se levo");
		for(int i=0;i<22;i++)
			System.out.println(d1.moveLeft());
		System.out.println("Pomera se dole");
		for(int i=0;i<19;i++)
			System.out.println(d1.moveDown());
		System.out.println(d1.moveDown()+"Dron je stigao na cilj");

	}
}
