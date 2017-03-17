package drone;

public class DroneController {

	public static void main(String[] args) {
		
		Drone dron = new Drone();
		for(int i=0;i<=25;i++){
			System.out.println(dron.moveRight());
		}


	}
}
