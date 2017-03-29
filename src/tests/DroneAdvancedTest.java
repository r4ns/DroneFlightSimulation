package tests;

import org.junit.Test;

import drone.Drone;
import static org.junit.Assert.*;


public class DroneAdvancedTest {
//putanja
	
	private int[] startCoordinates = {30,0,30};
	private int[] boundaries = {50,50,50};
	@Test
	public void testDronePath(){
		Drone drone;
		drone = new Drone();
		
		String expectedCoordinates = "Drone position: (" 
				 				+ Integer.toString(0) + ", "
				 				+ Integer.toString(30) + ", "
				 				+ Integer.toString(30) + ")";
		
		String[] array = {
				 					"moveUp", "12", 
				 					"moveRight", "21",
				 					"moveUp", "23",
				 					"moveForth", "16",
				 					"moveLeft", "12",
				 					"moveForth", "5",
				 					"moveLeft", "18",
				 					"moveUp", "17",
				 					"moveBack", "21",
				 					"moveLeft", "22",
				 					"moveDown", "20"
				 		};
		
		assertEquals(expectedCoordinates, helperMove(array, drone));
		
	}
	 
	public String helperMove(String[] array,Drone drone){
		System.out.println(drone.getFormatedCoordinates());
		 		for (int i = 0; i < array.length; i += 2){
		 			switch (array[i]){
		 				case "moveRight":
		 					for (int j = 0; j < Integer.parseInt(array[i + 1]); j++)
		 						drone.moveRight();
		 					break;
		 				case "moveLeft":
		 					for (int j = 0; j < Integer.parseInt(array[i + 1]); j++)
		 						drone.moveLeft();
		 					break;
		 				case "moveUp":
		 					for (int j = 0; j < Integer.parseInt(array[i + 1]); j++)
		 						drone.moveUp();
		 					break;
		 				case "moveDown":
		 					for (int j = 0; j < Integer.parseInt(array[i + 1]); j++)
		 						drone.moveDown();
		 					break;
		 				case "moveForth":
		 					for (int j = 0; j < Integer.parseInt(array[i + 1]); j++)
		 						drone.moveForth();
		 					break;
		 				case "moveBack":
		 					for (int j = 0; j < Integer.parseInt(array[i + 1]); j++)
		 						drone.moveBack();
		 					break;
		 			}
		 		}
		 		return drone.getFormatedCoordinates();
		 	}
	
}
