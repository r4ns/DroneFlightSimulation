package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import drone.Drone;

public class DroneTestAdvanced {
	private int[] boundaries = {50,50,50};
	private int[] startCoordinates = {30,0,30};
	Drone drone;
	
	
	@Test
	public void testTravelingDroneToFinalPosition()
	{
		
		String expectedCoordinates = "(30,0,30)";
		
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
		System.out.println(expectedCoordinates);
	}
}
