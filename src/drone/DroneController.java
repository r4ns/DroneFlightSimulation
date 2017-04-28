package drone;

public class DroneController {

	public static void main(String[] args) {
		
		Drone drone= new Drone();
		System.out.println("Podizanje gore!");
		while(drone.coordinates[1]<10){
			drone.moveUp();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("Pomeranje desno!");
		while(drone.coordinates[0]<50){
			drone.moveRight();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("Podizanje gore 2!");
		while(drone.coordinates[1]<25){
			drone.moveUp();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("Pomeranje nazad!");
		while(drone.coordinates[2]<50){
			drone.moveBack();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("Pomeranje levo!");
		while(drone.coordinates[0]>25){
			drone.moveLeft();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("Podizanje gore 3!");
		while(drone.coordinates[1]<50){
			drone.moveUp();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("Pomeranje napred!");
		while(drone.coordinates[2]>30){
			drone.moveForth();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("Pomeranje Levo!");
		while(drone.coordinates[0]>0){
			drone.moveLeft();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("Pomeranje dole !");
		while(drone.coordinates[1]>30){
			drone.moveDown();
			System.out.println(drone.getFormatedCoordinates());
		}
	}
}
