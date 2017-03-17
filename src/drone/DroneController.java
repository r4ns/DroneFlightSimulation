package drone;

public class DroneController {

	public static void main(String[] args) {		
			
		Drone drone=new Drone(30,0,30);
		
			System.out.println(drone);
			
			System.out.println("Gore: ");
			for(int i=0;i<10;i++){
			drone.moveUp();
			System.out.println(drone);
			}
			System.out.println("Desno: ");
			for(int i=0;i<10;i++){
			drone.moveRight();
			System.out.println(drone);
			}
			System.out.println("Gore: ");
			for(int i=0;i<30;i++){
			drone.moveUp();
			System.out.println(drone);
			}
			
			
			
	}
}
