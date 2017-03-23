package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneBasicTest {
	
	Drone drone;
	//private int[] boundariers = {50,50,50};
	private int[] startCoordinates = {30,0,30};
	
	
	@Test
	public void testInitialMoveUp(){
		
		
		drone = new Drone(startCoordinates);
		
		String expectedCoordinates = "My position is: (" + Integer.toString(startCoordinates[0]) + ","
		+ Integer.toString(startCoordinates[1] + 1) + ","  
		+ Integer.toString(startCoordinates[2]) + ") ";
		
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	
	@Test
	public void testInitialBounds(){
		
		startCoordinates[1] = 10;
		
		drone = new Drone(startCoordinates);
		
		String expectedCoordinates = "My position is: (" + Integer.toString(startCoordinates[0]) + ","
		+ Integer.toString(startCoordinates[1]) + ","  
		+ Integer.toString(startCoordinates[2]) + ") ";
		
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	
}
