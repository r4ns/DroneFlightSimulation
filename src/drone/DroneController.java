package drone;

public class DroneController {

	public static void main(String[] args) {
		
		Drone drone= new Drone();
		drone.getFormatedCoordinates();
		
		while(drone.coordinates[1]<7){
			drone.moveUp();
			
		}
		
		while(drone.coordinates[0]<45){
			drone.moveRight();
			
		}
		while(drone.coordinates[2]>5)
		{
			drone.moveForth();
			
			
		}
		
		while(drone.coordinates[1]<45){
			drone.moveUp();
			
		}
	
		while(drone.coordinates[0]>30)
		{
			drone.moveLeft();
			
			
		}
		
		while(drone.coordinates[2]<30)
		{
			drone.moveBack();
			
		}
	
		while(drone.coordinates[0]>0)
		{
			drone.moveLeft();
			
			
		}
		
		while(drone.coordinates[1]>30)
		{
			drone.moveDown();
			
			
		}
		System.out.println("You arrived!");
		
	}
}