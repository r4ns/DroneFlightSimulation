package drone;

public class DroneController {

	public static void main(String[] args) {		

		Drone myDrone = new Drone();
		myDrone.takeAFlight();
		while (myDrone.getZ() <50){
			
			System.out.println(myDrone.moveBack());
			System.out.println(myDrone.getFormatedCoordinates());
			myDrone.CheckSides();
		}
		while (myDrone.getY() < 50){
			System.out.println(myDrone.moveUp());
			System.out.println(myDrone.getFormatedCoordinates());
			myDrone.CheckSides();
		}
		while (myDrone.getZ() > 0){
			System.out.println(myDrone.moveForth());
			System.out.println(myDrone.getFormatedCoordinates());
			myDrone.CheckSides();
		}
		while(myDrone.getX() > 0){
			System.out.println(myDrone.moveLeft());
			System.out.println(myDrone.getFormatedCoordinates());
			myDrone.CheckSides();
		}
		while (myDrone.getY() > 30)
		{
			while(myDrone.getZ() < 30){
				System.out.println(myDrone.moveBack());
				System.out.println(myDrone.getFormatedCoordinates());
				myDrone.CheckSides();
			}
			System.out.println(myDrone.moveDown());
			System.out.println(myDrone.getFormatedCoordinates());
			myDrone.CheckSides();
		}
		System.out.println("Sides visited: " + myDrone.getSidesVisited());
	}
}
