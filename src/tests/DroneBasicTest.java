package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneBasicTest {
	
	Drone drone;
	//private int[] boundariers = {50,50,50};
	private int[] startCoordinates = {30,0,30};
	
	
	@Test
	public void testInitialMoveDown(){
		
		int[] startCoordinates = this.startCoordinates;
		startCoordinates[1] = 10;
		
		drone = new Drone(startCoordinates);
		
		String expectedCoordinates = "My position is: (" + Integer.toString(startCoordinates[0]) + ","
		+ Integer.toString(startCoordinates[1] - 1) + ","  
		+ Integer.toString(startCoordinates[2]) + ") ";
		
		assertEquals(expectedCoordinates, drone.moveDown());
	}
	
	
	@Test
	public void testInitialMoveUp(){
		
		
		drone = new Drone(startCoordinates);
		
		String expectedCoordinates = "My position is: (" + Integer.toString(startCoordinates[0]) + ","
		+ Integer.toString(startCoordinates[1] + 1) + ","  
		+ Integer.toString(startCoordinates[2]) + ") ";
		
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	@Test
	public void testInitialMoveRight(){
	
		
		drone = new Drone(startCoordinates);
		
		String expectedCoordinates = "My position is: (" + Integer.toString(startCoordinates[0] + 1) + ","
		+ Integer.toString(startCoordinates[1]) + ","  
		+ Integer.toString(startCoordinates[2]) + ") ";
		
		assertEquals(expectedCoordinates, drone.moveRight());
	}
	
	@Test
	public void testInitialMoveLeft(){
	
		
		drone = new Drone(startCoordinates);
		
		String expectedCoordinates = "My position is: (" + Integer.toString(startCoordinates[0] - 1) + ","
		+ Integer.toString(startCoordinates[1]) + ","  
		+ Integer.toString(startCoordinates[2]) + ") ";
		
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	
	@Test
	public void testInitialMoveForth(){
	
		
		drone = new Drone(startCoordinates);
		
		String expectedCoordinates = "My position is: (" + Integer.toString(startCoordinates[0]) + ","
		+ Integer.toString(startCoordinates[1]) + ","  
		+ Integer.toString(startCoordinates[2] - 1) + ") ";
		
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	
	@Test
	public void testInitialMoveBack(){
	
		
		drone = new Drone(startCoordinates);
		
		String expectedCoordinates = "My position is: (" + Integer.toString(startCoordinates[0]) + ","
		+ Integer.toString(startCoordinates[1]) + ","  
		+ Integer.toString(startCoordinates[2] + 1) + ") ";
		
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	
	@Test
	public void testInitialBounds(){
		
		int[] startCoordinates = this.startCoordinates;
		startCoordinates[1] = 10;
		
		drone = new Drone(startCoordinates);
		
		String expectedCoordinates = "My position is: (" + Integer.toString(startCoordinates[0]) + ","
		+ Integer.toString(startCoordinates[1]) + ","  
		+ Integer.toString(startCoordinates[2]) + ") ";
		
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	
}
