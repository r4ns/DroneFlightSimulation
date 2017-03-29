package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneAdvancedTest {
	private int[] boundaries = {50, 50 ,50};
	private int[] startCoordinates = {30, 0, 30};
	Drone drone;
	
	public void helperDroneMovement(String[] commands){
		for(int i = 0; i < commands.length; i++){
			String[] command = commands[i].split(" ");
			
			if(command[0].equals("moveUp")){
				System.out.println(command[0] + " " + command[1]);
				for(int j = 0; j < Integer.parseInt(command[1]); j++)
					System.out.println(drone.moveUp());
			}
			
			else if(command[0].equals("moveDown")){
				System.out.println(command[0] + " " + command[1]);
				for(int j = 0; j < Integer.parseInt(command[1]); j++)
					System.out.println(drone.moveDown());
			}
			
			else if(command[0].equals("moveForth")){
				System.out.println(command[0] + " " + command[1]);
				for(int j = 0; j < Integer.parseInt(command[1]); j++)
					System.out.println(drone.moveForth());
			}
			
			else if(command[0].equals("moveBack")){
				System.out.println(command[0] + " " + command[1]);
				for(int j = 0; j < Integer.parseInt(command[1]); j++)
					System.out.println(drone.moveBack());
			}
			
			else if(command[0].equals("moveLeft")){
				System.out.println(command[0] + " " + command[1]);
				for(int j = 0; j < Integer.parseInt(command[1]); j++)
					System.out.println(drone.moveLeft());
			}
			
			else if(command[0].equals("moveRight")){
				for(int j = 0; j < Integer.parseInt(command[1]); j++)
					System.out.println(drone.moveRight());
			}
		}
	}
	
	@Test
	public void testDroneMovementToFinalPosition(){
		drone = new Drone();
		
		String expectedCoordinates = "Drone position: (" 
				 + Integer.toString(0) + ","
				 + Integer.toString(30) + ","
				 + Integer.toString(30) + ")";
		
		String[] commands = {
				"moveUp 12",
				"moveRight 21",
				"moveUp 23",
				"moveForth 16",
				"moveLeft 12",
				"moveForth 5",
				"moveLeft 18",
				"moveUp 17",
				"moveBack 21",
				"moveLeft 22",
				"moveDown 20"
		};
		
		
		
		helperDroneMovement(commands);
		
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
	}
}
