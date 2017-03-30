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
		
		String[] commandArray = {"gore", "12" 
				, "desno" , "21" 
				, "gore" , "23" 
				, "napred" , "16"
				, "levo" , "12"
				, "napred" , "5"
				, "levo" , "18"
				, "gore" , "17"
				, "nazad" , "21"
				, "levo" , "22"
				, "dole" , "20"};
		
		assertEquals(expectedCoordinates, droneMove(commandArray));
	}
	
	public String droneMove(String[] commandArray){
		drone = new Drone();
		System.out.println(drone.getFormatedCoordinates());
		for (int i = 0; i < commandArray.length; i += 2){
			switch (commandArray[i]){
				case "desno":
					for (int j = 0; j < Integer.parseInt(commandArray[i + 1]); j++)
						drone.moveRight();
					break;
				case "levo":
					for (int j = 0; j < Integer.parseInt(commandArray[i + 1]); j++)
						drone.moveLeft();
					break;
				case "gore":
					for (int j = 0; j < Integer.parseInt(commandArray[i + 1]); j++)
						drone.moveUp();
					break;
				case "dole":
					for (int j = 0; j < Integer.parseInt(commandArray[i + 1]); j++)
						drone.moveDown();
					break;
				case "napred":
					for (int j = 0; j < Integer.parseInt(commandArray[i + 1]); j++)
						drone.moveForth();
					break;
				case "nazad":
					for (int j = 0; j < Integer.parseInt(commandArray[i + 1]); j++)
						drone.moveBack();
					break;
			}
		}
		return drone.getFormatedCoordinates();
	}
}
