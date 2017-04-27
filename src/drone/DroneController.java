package drone;

public class DroneController {

	public static void main(String[] args) {
		
		Drone drone= new Drone();
		System.out.println("Drone position: "+drone.getFormatedCoordinates()+"\n\n");
		System.out.println("-------Moving up-------");
		while(drone.coordinates[1]<10){
			drone.moveUp();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("-------Moving right-------");
		while(drone.coordinates[0]<50){
			drone.moveRight();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("-------Moving up-------");
		while(drone.coordinates[1]<25){
			drone.moveUp();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("-------Moving back-------");
		while(drone.coordinates[2]<50){
			drone.moveBack();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("-------Moving left-------");
		while(drone.coordinates[0]>25){
			drone.moveLeft();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("-------Moving up-------");
		while(drone.coordinates[1]<50){
			drone.moveUp();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("-------Moving forth-------");
		while(drone.coordinates[2]>30){
			drone.moveForth();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("-------Moving left-------");
		while(drone.coordinates[0]>0){
			drone.moveLeft();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("-------Moving down-------");
		while(drone.coordinates[1]>30){
			drone.moveDown();
			System.out.println(drone.getFormatedCoordinates());
		}
	}
}
