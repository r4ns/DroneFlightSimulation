package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneBasicTest {
	
		Drone drone;
		private int[] boundaries = {50,50,50}; 
		private int[] StartCoordinates = {30,0,30};
		
		@Test
		public void testInitialMoveUp()
		{
			drone = new Drone(boundaries, StartCoordinates);
			String expectedCoordinates = "(" + Integer.toString(StartCoordinates[0]) + ","
					+ Integer.toString(StartCoordinates[1] + 1) + ","
					+ Integer.toString(StartCoordinates[2]) + ")";
			
			
			assertEquals(expectedCoordinates, drone.moveUp());			
			
		}
		
		@Test
		public void testMoveUp()
		{
			StartCoordinates[1] = 10;
			
			drone = new Drone(boundaries, StartCoordinates);
			String expectedCoordinates = "(" + Integer.toString(StartCoordinates[0]) + ","
					+ Integer.toString(10) + ","
					+ Integer.toString(StartCoordinates[2]) + ")";
			
			
			assertEquals(expectedCoordinates, drone.moveUp());	
			
			
		}
		
		
}
