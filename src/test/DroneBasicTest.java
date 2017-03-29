package test;

import org.junit.Test;

import drone.Drone;

import static org.junit.Assert.*;

public class DroneBasicTest {
	private int[]boundaries = {50,50,50};
	private int[] startCoordinates = {30, 0, 30};
	Drone dron;
	
	@Test
	public void testInitialMoveUp(){
		dron = new Drone();
		//drone.setBoundries(boundries);
		
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(startCoordinates[0]) + ", "
				+ Integer.toString(startCoordinates[1] + 1) + ", "
				+ Integer.toString(startCoordinates[2]) + ")";
		
		
		assertEquals(expectedCoordinates, dron.moveUp());
	}
	
	
}
