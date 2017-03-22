package drone;

public class DroneController {

	public static void main(String[] args) {		
		Drone drone = new Drone(30,0,30);
		drone.getFormatedCoordinates();
		while(drone.getY()<10){
			drone.moveUp();
		}
		while(drone.getX()<45){
			drone.moveRight();		
		}
		while(drone.getZ()>5){
			drone.moveForth();
		}
		while(drone.getY()<50){
			drone.moveUp();
		}
		while(drone.getX()>30){
			drone.moveLeft();
		}
		while(drone.getZ()<30){
			drone.moveBack();
		}
		while(drone.getX()>0){
			drone.moveLeft();
		}
		while(drone.getY()>30){
			drone.moveDown();
		}
	}
}
