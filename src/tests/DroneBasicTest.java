package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneBasicTest {
			
		private int[] boundaries = {50,50,50};
		private int[] startCoordinates = {30, 0, 30};
		Drone drone;
		
		@Test
		public void testInitialMoveUp(){
			drone = new Drone();
			drone.setX(startCoordinates[0]);
			drone.setY(startCoordinates[1]);
			drone.setZ(startCoordinates[2]);
			
			String expectedCoordinates = "Drone position: ("
									+ Integer.toString(startCoordinates[0]) + ","
									+ Integer.toString(startCoordinates[1]+1) + ","
									+ Integer.toString(startCoordinates[2]) + ")";
			 //ASERTACIJA
			assertEquals(expectedCoordinates, drone.moveUp());
		}
}
