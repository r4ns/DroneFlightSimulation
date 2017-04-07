package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;
import drone.DroneOne;

public class DroneBasicTest {
	private int[] boundaries = {50, 50, 50};
	private int[] startCoordinates = {30, 0, 30};
	
	DroneOne drone;
	
	@Test
	public void testInitialMoveUp() {
		drone = new DroneOne(30, 0, 30);
		//drone.setX(startCoordinates[0]);
		
		String expectedCoordinates = "(" + Integer.toString(startCoordinates[0]) + 
				", " + Integer.toString(startCoordinates[1] + 1) +
				", " + Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	@Test
	public void testInitialMoveDown() {
		drone = new DroneOne(30, 10, 30);
		//drone.setX(startCoordinates[0]);
		
		String expectedCoordinates = "(" + Integer.toString(startCoordinates[0]) + 
				", " + Integer.toString(10 - 1) +
				", " + Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveDown());
	}
	
	@Test
	public void testInitialMoveLeft() {
		drone = new DroneOne(30, 0, 30);
		//drone.setX(startCoordinates[0]);
		
		String expectedCoordinates = "(" + Integer.toString(startCoordinates[0] - 1) + 
				", " + Integer.toString(startCoordinates[1]) +
				", " + Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	
	@Test
	public void testInitialMoveRight() {
		drone = new DroneOne(30, 0, 30);
		//drone.setX(startCoordinates[0]);
		
		String expectedCoordinates = "(" + Integer.toString(startCoordinates[0] + 1) + 
				", " + Integer.toString(startCoordinates[1]) +
				", " + Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveRight());
	}
	
	@Test
	public void testInitialMoveBack() {
		drone = new DroneOne(30, 0, 30);
		//drone.setX(startCoordinates[0]);
		
		String expectedCoordinates = "(" + Integer.toString(startCoordinates[0]) + 
				", " + Integer.toString(startCoordinates[1]) +
				", " + Integer.toString(startCoordinates[2] + 1) + ")";
		
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	@Test
	public void testInitialMoveForth() {
		drone = new DroneOne(30, 0, 30);
		//drone.setX(startCoordinates[0]);
		
		String expectedCoordinates = "(" + Integer.toString(startCoordinates[0]) + 
				", " + Integer.toString(startCoordinates[1]) +
				", " + Integer.toString(startCoordinates[2] - 1) + ")";
		
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	
	@Test
	public void testBoundariesMoveUpOne() {
		drone = new DroneOne(30, 10, 30);
		startCoordinates[1] = 10;
		//drone.setX(startCoordinates[0]);
		
		String expectedCoordinates = "(" + Integer.toString(startCoordinates[0]) + 
				", " + Integer.toString(startCoordinates[1]) +
				", " + Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	@Test
	public void testBoundariesMoveUpTwo() {
		drone = new DroneOne(30, 50, 30);
		startCoordinates[1] = 50;
		//drone.setX(startCoordinates[0]);
		
		String expectedCoordinates = "(" + Integer.toString(startCoordinates[0]) + 
				", " + Integer.toString(startCoordinates[1]) +
				", " + Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	@Test
	public void testBoundariesMoveDownOne() {
		drone = new DroneOne(30, 0, 30);
		//drone.setX(startCoordinates[0]);
		
		String expectedCoordinates = "(" + Integer.toString(startCoordinates[0]) + 
				", " + Integer.toString(startCoordinates[1]) +
				", " + Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveDown());
	}
	
	@Test
	public void testBoundariesMoveDownTwo() {
		drone = new DroneOne(30, 40, 30);
		startCoordinates[1] = 40;
		//drone.setX(startCoordinates[0]);
		
		String expectedCoordinates = "(" + Integer.toString(startCoordinates[0]) + 
				", " + Integer.toString(startCoordinates[1]) +
				", " + Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveDown());
	}
	
	@Test
	public void testBoundariesMoveLeftOne() {
		drone = new DroneOne(0, 0, 30);
		startCoordinates[0] = 0;
		//drone.setX(startCoordinates[0]);
		
		String expectedCoordinates = "(" + Integer.toString(startCoordinates[0]) + 
				", " + Integer.toString(startCoordinates[1]) +
				", " + Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	
	@Test
	public void testBoundariesMoveLeftTwo() {
		drone = new DroneOne(40, 30, 30);
		startCoordinates[0] = 40;
		startCoordinates[1] = 30;
		//drone.setX(startCoordinates[0]);
		
		String expectedCoordinates = "(" + Integer.toString(startCoordinates[0]) + 
				", " + Integer.toString(startCoordinates[1]) +
				", " + Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	
	@Test
	public void testBoundariesMoveRightOne() {
		drone = new DroneOne(10, 30, 30);
		startCoordinates[0] = 10;
		startCoordinates[1] = 30;
		//drone.setX(startCoordinates[0]);
		
		String expectedCoordinates = "(" + Integer.toString(startCoordinates[0]) + 
				", " + Integer.toString(startCoordinates[1]) +
				", " + Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveRight());
	}
	
	@Test
	public void testBoundariesMoveRightTwo() {
		drone = new DroneOne(50, 30, 30);
		startCoordinates[0] = 50;
		startCoordinates[1] = 30;
		//drone.setX(startCoordinates[0]);
		
		String expectedCoordinates = "(" + Integer.toString(startCoordinates[0]) + 
				", " + Integer.toString(startCoordinates[1]) +
				", " + Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveRight());
	}
	
	@Test
	public void testBoundariesMoveBackOne() {
		drone = new DroneOne(30, 30, 10);
		startCoordinates[2] = 10;
		startCoordinates[1] = 30;
		//drone.setX(startCoordinates[0]);
		
		String expectedCoordinates = "(" + Integer.toString(startCoordinates[0]) + 
				", " + Integer.toString(startCoordinates[1]) +
				", " + Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	@Test
	public void testBoundariesMoveBackTwo() {
		drone = new DroneOne(30, 30, 50);
		startCoordinates[2] = 50;
		startCoordinates[1] = 30;
		//drone.setX(startCoordinates[0]);
		
		String expectedCoordinates = "(" + Integer.toString(startCoordinates[0]) + 
				", " + Integer.toString(startCoordinates[1]) +
				", " + Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	@Test
	public void testBoundariesMoveForthOne() {
		drone = new DroneOne(30, 0, 0);
		startCoordinates[2] = 0;
		//drone.setX(startCoordinates[0]);
		
		String expectedCoordinates = "(" + Integer.toString(startCoordinates[0]) + 
				", " + Integer.toString(startCoordinates[1]) +
				", " + Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	
	@Test
	public void testBoundariesMoveForthTwo() {
		drone = new DroneOne(30, 30, 40);
		startCoordinates[2] = 40;
		startCoordinates[1] = 30;
		//drone.setX(startCoordinates[0]);
		
		String expectedCoordinates = "(" + Integer.toString(startCoordinates[0]) + 
				", " + Integer.toString(startCoordinates[1]) +
				", " + Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveForth());
	}
}
