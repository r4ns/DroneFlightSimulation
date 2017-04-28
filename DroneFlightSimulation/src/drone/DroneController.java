package drone;
 
public class DroneController {
	 
	private int [] start= new int[] {30,0,30};
	private int [] boundaries={50,50,50};
	private int distanceFromBoundaris=10;

	public static void main(String[] args) {		
		Drone dron = new Drone(new int[] {30,0,30},new int[]{50,50,50}, 10);
		
		for (int i = 0; i < 12; i++) {
			System.out.println(dron.moveUp());
		}
		
		for (int i = 0; i < 21; i++) {
			System.out.println(dron.moveRight());
		}
		
		for (int i = 0; i < 23; i++) {
			System.out.println(dron.moveUp());
		}
		
		for (int i = 0; i < 16; i++) {
			System.out.println(dron.moveForth());
		}
		
		for (int i = 0; i < 12; i++) {
			System.out.println(dron.moveLeft());
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(dron.moveForth());
		}
		
		for (int i = 0; i < 18; i++) {
			System.out.println(dron.moveLeft());
		}
		
		for (int i = 0; i < 17; i++) {
			System.out.println(dron.moveUp());
		}
		
		for (int i = 0; i < 21; i++) {
			System.out.println(dron.moveBack());
		}
		
		for (int i = 0; i < 22; i++) {
			System.out.println(dron.moveLeft());
		}
		
		for (int i = 0; i < 20; i++) {
			System.out.println(dron.moveDown());
		}
	}
}
