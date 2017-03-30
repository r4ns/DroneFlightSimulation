package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import drone.Drone;

public class DroneAdvancedTest {
	
	Drone drone;
		
	@Test
	public void testDroneRoute(){
		drone = new Drone();
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(0) + ", "
				+ Integer.toString(30) + ", "
				+ Integer.toString(30) + ")";
		
		String[] pathArray = {"Up", "12", "Right" , "21", "up" , "23" , "Forth" , "16", "Left" 
				, "12", "Forth" , "5", "Left" , "18", "Up" , "17", "Back" , "21", "Left" , "22", 
				"Down" , "20"};
		assertEquals(expectedCoordinates, pathMovement(pathArray));
	}
	
	public String pathMovement(String[] pathArray){
		drone = new Drone();
		System.out.println(drone.getFormatedCoordinates());
		for (int i = 0; i < pathArray.length; i += 2){
			switch (pathArray[i]){
				case "Up":
					for (int j = 0; j < Integer.parseInt(pathArray[i + 1]); j++)
						drone.moveUp();
					break;
				case "Down":
					for (int j = 0; j < Integer.parseInt(pathArray[i + 1]); j++)
						drone.moveDown();
					break;
				case "Right":
					for (int j = 0; j < Integer.parseInt(pathArray[i + 1]); j++)
						drone.moveRight();
					break;
				case "Left":
					for (int j = 0; j < Integer.parseInt(pathArray[i + 1]); j++)
						drone.moveLeft();
					break;
				case "Back":
					for (int j = 0; j < Integer.parseInt(pathArray[i + 1]); j++)
						drone.moveBack();
					break;
				case "Forth":
					for (int j = 0; j < Integer.parseInt(pathArray[i + 1]); j++)
						drone.moveForth();
					break;
			}
		}
		return drone.getFormatedCoordinates();
	}
}