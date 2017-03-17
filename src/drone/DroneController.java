package drone;

public class DroneController {

	public static void main(String[] args) {		
		
		//int[] spoljasnja_granica = {50, 50, 50};
		//int[] unutrasnja_granica = {40, 40, 40};
		
		Drone dronic = new Drone();
		
		System.out.println(dronic.getFormatedCoordinates());
		
	}
}
