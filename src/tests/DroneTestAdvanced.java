package tests;
 
 import org.junit.Test;
 import static org.junit.Assert.*;
 
  import drone.Drone;
public class DroneTestAdvanced {
	
	
	private int[] boundaries={50,50,50};
  	private int[] startCoordinates={30,0,30};
 	private int[] endCoordinates={0,30,30};
  	Drone drone;
  	
  	@Test
  	 public void testDronePathToDestination(){
  		
  		drone = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
  		 		String expectedCoordinates = "Drone position: (" 
  		 				+ Integer.toString(endCoordinates[0])+ ", " 
  		 				+ Integer.toString(endCoordinates[1]) + ", " 
  		 				+ Integer.toString(endCoordinates[2]) + ")";
  		 
  		String[] dronePath = {"moveup-12", "moveright-21", "moveup-23", "moveforth-16", "moveleft-12", "moveforth-5",
  		 				"moveleft-18", "moveup-17", "moveback-21", "moveleft-22", "movedown-20"};
  		 
  		 		assertEquals(expectedCoordinates, helper(dronePath, drone));
  		 
}
  	
  	public String helper(String[] dronePath, Drone drone) {
  		 	for (String move : dronePath){
  		 		String[] privremeni = move.split("-");
  		 			if (privremeni[0].equals("moveup")){
  		 			for (int i = 0; i < Integer.parseInt(privremeni[1]); i++)
  		 				drone.moveUp();
  		 			}
  		 			else if (privremeni[0].equals("movedown")){
  		 				for (int i = 0; i < Integer.parseInt(privremeni[1]); i++)
  		 					drone.moveDown();
  		 			}
  		 			else if (privremeni[0].equals("moveleft")){
  		 				for (int i = 0; i < Integer.parseInt(privremeni[1]); i++)
  		 					drone.moveLeft();
  		 			}
  		 			else if (privremeni[0].equals("moveright")){
  		 				for (int i = 0; i < Integer.parseInt(privremeni[1]); i++)
  		 					drone.moveRight();
  		 			}
  		 			else if (privremeni[0].equals("moveforth")){
  		 				for (int i = 0; i < Integer.parseInt(privremeni[1]); i++)
  		 					drone.moveForth();
  		 			}
  		 			else if (privremeni[0].equals("moveback")){
  		 				for (int i = 0; i < Integer.parseInt(privremeni[1]); i++)
  		 					drone.moveBack();
  		 			}
  		 		}
  		 		System.out.println("Drone final position: "+ drone.getFormatedCoordinates());
  		 		return drone.getFormatedCoordinates();
  		 	}
}