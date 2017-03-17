package drone;

public class DroneController {

	public static void main(String[] args) {	
		Drone MojDron = new Drone(30,0,30);
		while (MojDron.y < 10) {
			System.out.println(MojDron.moveUp());
			MojDron.y++;
		}
		while (MojDron.x < 50) {
			System.out.println(MojDron.moveUp());
			MojDron.x++;
		}
		while (MojDron.y < 50) {
			System.out.println(MojDron.moveUp());
			MojDron.y++;
		}
		while (MojDron.x > 30) {
			System.out.println(MojDron.moveUp());
			MojDron.x--;
		}
		while (MojDron.z > 0) {
			System.out.println(MojDron.moveUp());
			MojDron.z--;
		}
		while (MojDron.y > 30) {
			System.out.println(MojDron.moveUp());
			MojDron.y--;
		}
		while (MojDron.x > 0) {
			System.out.println(MojDron.moveUp());
			MojDron.x--;
		}
		while (MojDron.z <= 30) {
			System.out.println(MojDron.moveUp());
			MojDron.z++;
		}
	}
}
