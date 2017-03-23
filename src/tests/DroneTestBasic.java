package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneTestBasic {
	Drone drone;
	private int[] boundaries={50,50,50};
	private int[] startCoordinates={30,0,30};
	
	@Test
	public void testInitialMoveUp(){
		
		drone= new Drone(boundaries, startCoordinates);
		String expectedCoordinates="("
				+Integer.toString(startCoordinates[0])+","
		+Integer.toString(startCoordinates[1]+1)+","
		+Integer.toString(startCoordinates[2]) + ")";
		assertEquals(expectedCoordinates,drone.moveUp());
		
	}
	
	@Test
	public void testInitialElevenMoveUp(){
		startCoordinates[1] = 10;
		drone= new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates="("
				+Integer.toString(startCoordinates[0])+","
		+Integer.toString(startCoordinates[1])+","
		+Integer.toString(startCoordinates[2]) + ")";
		assertEquals(expectedCoordinates,drone.moveUp());
		
	}
	

}
