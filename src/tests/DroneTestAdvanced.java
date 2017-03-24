package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneTestAdvanced {
	
	private int[] boundaries={50,50,50};
	private int[] startCoordinates={30,0,30};
	private String[] functions={"moveUp()-12","moveRight()-21","moveUp()-23","moveForth()-16","moveLeft()-12","moveForth()-5","moveLeft()-18","moveUp()-17","moveBack()-21","moveLeft()-22","moveDown()-20"};
	Drone drone;

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testMovingDrone() {
		drone=new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1]);
		drone.setZ(startCoordinates[2]);
		drone.setBoundaries(boundaries);
		
		String expectedCoordinates="(0,30,30)";
		
		assertEquals(expectedCoordinates, helperMovingDrone());
	}
	
	@Test
	public String helperMovingDrone(){
		for (int i=0; i<functions.length; i++) {
			String[] function=functions[i].split("-");
			
		}
		
		return "";
	}

}
