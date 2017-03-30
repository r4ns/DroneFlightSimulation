package drone;

public class DroneController {

	
	public static void main(String[] args) {		
		 Drone dron= new Drone();
		 System.out.println(dron.getFormatedCoordinates());
		 System.out.println("Moving forth...");
		 for(int i=0;i<29;i++){
			 System.out.println(dron.moveForth());
		 }
		 System.out.println("Moving right...");
		 for(int i=0;i<15;i++){
			 System.out.println(dron.moveRight());
		 }
		 System.out.println("Moving back...");
		 for(int i=0;i<42;i++){
			 System.out.println(dron.moveBack());
		 }
		 System.out.println("Moving left...");
		 for(int i=0;i<13;i++){
			 System.out.println(dron.moveLeft());
		 }
		 System.out.println("Moving up...");
		 for(int i=0;i<45;i++){
			 System.out.println(dron.moveUp());
		 }
		 System.out.println("Moving forth...");
		 for(int i=0;i<13;i++){
			 System.out.println(dron.moveForth());
		 }
		 System.out.println("Moving left...");
		 for(int i=0;i<32;i++){
			 System.out.println(dron.moveLeft());
		 }
		 System.out.println("Moving down...");
		 for(int i=0;i<15;i++){
			 System.out.println(dron.moveDown());
		 }
		 
	}
}
