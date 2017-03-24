package tests;

import org.junit.Test;

import drone.Drone;
import static org.junit.Assert.*;


public class DroneBasicTest {
	private int[] boundaries = {50,50,50};
	private int[] startcoordinates= {30,0,30};
	Drone drone;
	
	@Test
	public void testInitialMoveUp() {
		drone = new Drone(30,0,30);
		
		String expectedCoordinates = "Trenutna pozicija drona: "
				+ "("+Integer.toString(startcoordinates[0])+","
				+Integer.toString(startcoordinates[1])+","
				+Integer.toString(startcoordinates[2])+")";
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
}
