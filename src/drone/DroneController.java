package drone;

public class DroneController {

	public static void main(String[] args) {		
			
			Drone drone=new Drone(30,0,30);
			System.out.println("------START COORDINATES------");
			System.out.println(drone.getFormatedCoordinates());
			System.out.println("------START------");
			System.out.println("------MOVING UP------");
			for(int i=0;i<10;i++){
			System.out.println(drone.moveUp());
			}
			
			System.out.println("------MOVING RIGHT------");
			for(int i=0;i<20;i++){
				System.out.println(drone.moveRight());
			}
			
			System.out.println("------MOVING UP------");
			for(int i=0;i<40;i++){
				System.out.println(drone.moveUp());
			}
			
			System.out.println("------MOVING FORTH------");
			for(int i=0;i<30;i++){
				System.out.println(drone.moveForth());
			}
			
			System.out.println("------MOVING LEFT------");
			for(int i=0;i<20;i++){
				System.out.println(drone.moveLeft());
			}
			
			System.out.println("------MOVING DOWN------");
			for(int i=0;i<10;i++){
				System.out.println(drone.moveDown());
			}
			
			System.out.println("------MOVING BACK------");
			for(int i=0;i<30;i++){
				System.out.println(drone.moveBack());
			}
			
			System.out.println("------MOVING LEFT------");
			for(int i=0;i<30;i++){
				System.out.println(drone.moveLeft());
			}
			
			System.out.println("------MOVING DOWN------");
			for(int i=0;i<10;i++){
				System.out.println(drone.moveDown());
			}	
			System.out.println("------END COORDINATES------");
			System.out.println(drone.getFormatedCoordinates());
			System.out.println("------END------");
			
	}
}