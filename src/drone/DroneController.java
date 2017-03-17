package drone;

public class DroneController {

	public static void main(String[] args) {		
		Drone mojDron = new Drone();
		for(int i = 0;i<10;i++)
		System.out.println(mojDron.moveUp());
		for(int i = 0;i<45;i++)
			System.out.println(mojDron.moveRight());
		for(int i = 0;i<45;i++)
			System.out.println(mojDron.moveUp());

	}
}
