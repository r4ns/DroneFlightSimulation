package drone;

public class DroneController {
	  

	public static void main(String[] args) {
		Drone dron = new Drone();
		for(int i =0;i<15;i++){
			System.out.println(dron.moveRight());
		}
		for(int i =0;i<45;i++){
			System.out.println(dron.moveUp());
		}
		for(int i =0;i<15;i++){
			System.out.println(dron.moveLeft());
		}
		for(int i =0;i<15;i++){
			System.out.println(dron.moveForth());
		}
		for(int i =0;i<15;i++){
			System.out.println(dron.moveDown());
		}
		for(int i =0;i<30;i++){
			System.out.println(dron.moveLeft());
		}
		for(int i =0;i<15;i++){
			System.out.println(dron.moveBack());
		}
		


	}
}
