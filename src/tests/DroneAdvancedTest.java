package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneAdvancedTest {
	private int[] boundaries = {50, 50 ,50};
	private int[] startCoordinates = {30, 0, 30};
	Drone drone;
	
	@Test
	public void testDroneMovementToFinalPosition(){
		drone = new Drone();
		
		String expectedCoordinates = "Drone position: (" 
				 + Integer.toString(30) + ","
				 + Integer.toString(0) + ","
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
		
		droneMovement(commands);
		
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
	}
	
	public void droneMovement(String[] commands){
		for(int i = 0; i < commands.length; i++){
			String[] command = commands[i].split(" ");
			
			if(command[0] == "moveUp")
				for(int j = 0; j < Integer.parseInt(command[1]); j++)
					drone.moveUp();
			
			if(command[0] == "moveDown")
				for(int j = 0; j < Integer.parseInt(command[1]); j++)
					drone.moveDown();
			
			if(command[0] == "moveForth")
				for(int j = 0; j < Integer.parseInt(command[1]); j++)
					drone.moveForth();
			
			if(command[0] == "moveBack")
				for(int j = 0; j < Integer.parseInt(command[1]); j++)
					drone.moveBack();
			
			if(command[0] == "moveLeft")
				for(int j = 0; j < Integer.parseInt(command[1]); j++)
					drone.moveLeft();
			
			if(command[0] == "moveRight")
				for(int j = 0; j < Integer.parseInt(command[1]); j++)
					drone.moveRight();
		}
	}
}
