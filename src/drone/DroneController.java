package drone;

public class DroneController {

	public static void main(String[] args) {		

		Drone dron = new Drone(30,0,30);
		System.out.println("Drone position: ("+dron.getX()+","+dron.getY()+","+dron.getZ()+")");
		dron.moveUp();
		dron.moveRight();
		dron.moveUp();
		dron.moveBack();
		dron.moveLeft();
		dron.moveUp();
		dron.moveForth();
		dron.moveLeft();
		dron.moveDown();
		dron.moveForth();
		if(dron.getX() == 0 && dron.getY() == 30 && dron.getZ() == 30){
			
			System.out.println("Target reached");
		}
		
	}
}
