package drone;

public class DroneController {

	public static void main(String[] args) {		
		Drone drone=new Drone();
		System.out.println("Podizanje gore!");
		while(drone.y<10){
			drone.moveUp();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("Pomeranje desno!");
		while(drone.x<50){
			drone.moveRight();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("Podizanje gore 2!");
		while(drone.y<25){
			drone.moveUp();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("Pomeranje nazad!");
		while(drone.z<50){
			drone.moveBack();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("Pomeranje levo!");
		while(drone.x>25){
			drone.moveLeft();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("Podizanje gore 3!");
		while(drone.y<50){
			drone.moveUp();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("Pomeranje napred!");
		while(drone.z>30){
			drone.moveForth();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("Pomeranje Levo!");
		while(drone.x>0){
			drone.moveLeft();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("Pomeranje dole !");
		while(drone.y>30){
			drone.moveDown();
			System.out.println(drone.getFormatedCoordinates());
		}
	}
}
