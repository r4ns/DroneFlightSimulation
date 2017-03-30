package tests;

import org.junit.Test;

import drone.Drone;
import static org.junit.Assert.*;


public class DroneBasicTest {
	
	private int[] startcoordinates= {30,50,30};
	Drone drone;
	
	@Test
	public void testInitialMove() {
		drone = new Drone(30,50,30);
		
		String expectedCoordinates = "Trenutna pozicija drona: "
				+ "("+Integer.toString(startcoordinates[0])+","
				+Integer.toString(startcoordinates[1])+","
				+Integer.toString(startcoordinates[2])+")";
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	
	
	
}
