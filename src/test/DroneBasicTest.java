package test;

import org.junit.Test;

import drone.Drone;

import static org.junit.Assert.*;

public class DroneBasicTest {
	//private int[]boundaries = {50,50,50};
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
	@Test
	public void testInitialMoveDown(){
		dron = new Drone();
		
		String expectedCoordinatesD = "Drone position: ("
				+ Integer.toString(startCoordinates[0]) + ", "
				+ Integer.toString(startCoordinates[1]) + ", "
				+ Integer.toString(startCoordinates[2]) + ")";
		assertEquals(expectedCoordinatesD, dron.moveDown());
	}
	@Test
	public void testInitialMoveRight(){
		dron = new Drone();
		
		String expectedCoordinatesR = "Drone position: ("
				+ Integer.toString(startCoordinates[0] + 1) + ", "
				+ Integer.toString(startCoordinates[1]) + ", "
				+ Integer.toString(startCoordinates[2]) + ")";
		assertEquals(expectedCoordinatesR, dron.moveRight());
	}
	public void testInitialMoveLeft(){
		dron = new Drone();
		
		String expectedCoordinatesL = "Drone position: ("
				+ Integer.toString(startCoordinates[0] - 1) + ", "
				+ Integer.toString(startCoordinates[1]) + ", "
				+ Integer.toString(startCoordinates[2]) + ")";
		assertEquals(expectedCoordinatesL, dron.moveLeft());
	}
	public void testInitialMoveForth(){
		dron = new Drone();
		
		String expectedCoordinatesF = "Drone position: ("
				+ Integer.toString(startCoordinates[0]) + ", "
				+ Integer.toString(startCoordinates[1]) + ", "
				+ Integer.toString(startCoordinates[2] - 1) + ")";
		assertEquals(expectedCoordinatesF, dron.moveForth());
	}
	public void testInitialMoveBack(){
		dron = new Drone();
		
		String expectedCoordinatesB = "Drone position: ("
				+ Integer.toString(startCoordinates[0]) + ", "
				+ Integer.toString(startCoordinates[1]) + ", "
				+ Integer.toString(startCoordinates[2] + 1) + ")";
		assertEquals(expectedCoordinatesB, dron.moveBack());
	}
}
