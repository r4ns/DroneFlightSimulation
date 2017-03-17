package drone;

public class DroneController {

	public static void main(String[] args) {		
		Drone dron = new Drone(30, 0, 30);
		System.out.println("Pocetna pozicija!");
		System.out.println(dron);
		
		System.out.println("*****Pomeram se gore!*****");
		
		for (int i = 0; i <10; i++){
			dron.moveUp();
			System.out.println(dron);
		}
		System.out.println("*****Pomeram se desno!*****");
		for (int i = 0; i <10; i++){
		dron.moveRight();
		System.out.println(dron);
		}
		
		System.out.println("*****Pomeram se gore!*****");
		for (int i = 0; i <30; i++){
			dron.moveUp();
			System.out.println(dron);
		}
		dron.moveForth();
		System.out.println(dron);
	}
}
