package space;
public class DroneControler {

public static void main(String[] args) {
	FlySpace space = new FlySpace(50, 50, 50, 10, 10, 10);
 	DroneCube drone = new DroneCube(30, 0, 30, space);
 		
 		for (int i = 0; i < 32; i++){
 			System.out.println(drone.moveBack());
 		}
 	}
 
}
