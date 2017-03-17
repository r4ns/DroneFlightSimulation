package drone;

public class DroneController {

	public static void main(String[] args) {		
		//DRON OBAVESTAVA NA KOJOJ JE STRANI SAMO KADA JE PROMENI
		Drone drone = new Drone(30,0,30);
		System.out.println(drone.getFormatedCoordinates()); //Pocetne koordinate
		System.out.println("------------------------------");
		System.out.println("Drone is flying");
		System.out.println("------------------------------");
		drone.moveUp(); //Dron polece
		System.out.println(drone.getFormatedCoordinates()); 
		
		System.out.println(drone.sides()); //Trebalo bi da izbaci dole
		
		System.out.println("------------------------------");
		System.out.println("Drone is moving back");
		System.out.println("------------------------------");
		for (int i=0; i<25; i++){
			drone.moveBack();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("------------------------------");
		System.out.println(drone.sides()); //Trebalo bi da izbaci napred
		System.out.println("------------------------------");
		
		System.out.println("------------------------------");
		System.out.println("Drone is moving right");
		System.out.println("------------------------------");
		for (int i=0; i<15; i++){
			drone.moveRight();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("------------------------------");
		System.out.println(drone.sides()); //Trebalo bi da izbaci desno
		System.out.println("------------------------------");
		
		System.out.println("------------------------------");
		System.out.println("Drone is moving up");
		System.out.println("------------------------------");
		for (int i=0; i<29; i++){
			drone.moveUp();
			System.out.println(drone.getFormatedCoordinates());
		}
		
		System.out.println("------------------------------");
		System.out.println("Drone is moving forward");
		System.out.println("------------------------------");
		for(int i=0; i<40; i++){
			drone.moveForth();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("------------------------------");
		System.out.println(drone.sides()); // Trebalo bi da izbaci nazad
		System.out.println("------------------------------");
		
		System.out.println("------------------------------");
		System.out.println("Drone is moving left");
		System.out.println("------------------------------");
		for(int i=0; i<45; i++){
			drone.moveLeft();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("------------------------------");
		System.out.println("Drone is moving back");
		System.out.println("------------------------------");
		for(int i=0; i<15; i++){
			drone.moveBack();
			System.out.println(drone.getFormatedCoordinates());
		}
		System.out.println("------------------------------");
		System.out.println(drone.sides()); // Trebalo bi da izbaci levo
		System.out.println("Target reached");
		System.out.println("------------------------------");

	}
}
