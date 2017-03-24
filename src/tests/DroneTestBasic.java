package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;
public class DroneTestBasic {
	private int[] boundaries = {50,50,50};
	private int[] startCoordinates = {30,0,30};
	Drone drone;
	
	
	@Test
	public void testInitalMoveUp()
	{
		drone = new Drone(startCoordinates[0],startCoordinates[1],startCoordinates[2]);
		String expectedCoordinates ="("+
									 Integer.toString(startCoordinates[0])+","+
									 Integer.toString(startCoordinates[1]+1)+","+
									 Integer.toString(startCoordinates[2])+")";
		
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	

}
