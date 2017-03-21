package drone;

public class DroneController {

	public static void main(String[] args) {	
		
		Drone dr = new Drone();
		
		dr.moveUp();
		while(dr.getX()!=45) dr.moveRight();
		while(dr.getY()!=25) dr.moveUp(); 
		while(dr.getZ()!=45) dr.moveForth();
		while(dr.getX()!=25) dr.moveLeft();
		while(dr.getY()!=45) dr.moveUp();
		while(dr.getZ()!=25) dr.moveBack();
		while(dr.getX()!=5) dr.moveLeft();
		dr.moveForth();
		while(dr.getY()!=30) dr.moveDown();
		dr.moveLeft();
		
		
		
		


	}
}
