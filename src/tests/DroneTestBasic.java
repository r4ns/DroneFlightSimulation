package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneTestBasic {
	
	private int[] boundaries = {50,50,50,50};
	private int[] startCoordinates = {30,0,30};
	Drone drone;
	
	@Test
	public void testInitialMoveUp(){
		drone = new Drone();
		String expectedCoordinates = "Drone position : (" + startCoordinates[0] + "," + 
		Integer.toString((startCoordinates[1]+1)) + "," 
		+ startCoordinates[2] + ")";
		
		assertEquals( expectedCoordinates, drone.moveUp());
	}

}
