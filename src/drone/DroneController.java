package drone;

public class DroneController {

	public static void main(String[] args) {		
		
		Drone dronic = new Drone();
		
		System.out.println("Krecemo");
		dronic.getFormatedCoordinates();
		System.out.println("Polecemo");
		while(dronic.getY() < 5)
			dronic.moveUp();
		System.out.println("Idemo nazad");
		while(dronic.getZ() < 40)
			dronic.moveBack();
		System.out.println("Idemo gore");
		while(dronic.getY() < 40)
			dronic.moveUp();
		System.out.println("Idemo napred");
		while(dronic.getZ() > 10)
			dronic.moveForth();
		System.out.println("Idemo dole");
		while(dronic.getY() > 30)
			dronic.moveDown();
		System.out.println("Idemo levo");
		while(dronic.getX() > 0)
			dronic.moveLeft();
		System.out.println("Idemo nazad");
		while(dronic.getZ() < 30)
			dronic.moveBack();
		System.out.println("Stigli smo");
		
	}
}
