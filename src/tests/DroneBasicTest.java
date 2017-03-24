package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneBasicTest {
	
	private int[] boundaries = {50,50,50};
	private int [] startCoordinates = {30,0,30};
	Drone drone;
	
	@Test
	public void testInitialMoveUp(){
		drone = new Drone();
		
		String expectedCoordinates = "Drone position: "+"("
				+ Integer.toString(30)+","
				+ Integer.toString(0+1)+","
				+ Integer.toString(30)+")";
		
		assertEquals(expectedCoordinates, drone.moveUp()); 
	}
	
}
