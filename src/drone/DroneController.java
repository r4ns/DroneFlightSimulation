package drone;

public class DroneController {

	public static void main(String[] args) {		
		Drone MojDron = new Drone(30,0,30);
		System.out.println("----- pocetne ko0rdinate -----");
		System.out.println(MojDron.getFormatedCoordinates());
		System.out.println("----- let pocinje -----");
		
		System.out.println("----- pomeri gore -----");
		while (MojDron.getY() < 10) {
			System.out.println(MojDron.moveUp());
		}
		
		System.out.println("----- pomeri desno -----");
		while (MojDron.getX() < 50) {
			System.out.println(MojDron.moveRight());
		}
		
		System.out.println("----- pomeri gore -----");
		while (MojDron.getY() < 50) {
			System.out.println(MojDron.moveUp());
		}
		
		System.out.println("----- pomeri levo -----");
		while (MojDron.getX() > 30) {
			System.out.println(MojDron.moveLeft());
		}
		
		System.out.println("----- pomeri napred -----");
		while (MojDron.getZ() > 0) {
			System.out.println(MojDron.moveForth());
		}
		
		System.out.println("----- pomeri dole -----");
		while (MojDron.getY() > 30) {
			System.out.println(MojDron.moveDown());
		}
		
		System.out.println("----- pomeri levo -----");
		while (MojDron.getX() > 0) {
			System.out.println(MojDron.moveLeft());
		}
		
		System.out.println("----- pomeri nazad -----");
		while (MojDron.getZ() < 30) {
			System.out.println(MojDron.moveBack());
		}
		
		System.out.println("----- krajnje koordinate -----");
		System.out.println(MojDron.getFormatedCoordinates());
	}
}
