package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneBasicTest {
	
	private int[] boundaries = {50, 50 ,50};
	private int[] startCoordinates = {30, 0, 30};
	Drone drone;
	Drone drone2;
	
	@Test
	public void testInitialMoveUp()
	{
		drone = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		String expectedCoordinates = "Drone position: (" 
							+ Integer.toString(startCoordinates[0]) + ","
							+ Integer.toString(startCoordinates[1]  + 1) + ","
							+ Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	@Test
	public void testInitialMoveDown()
	{
		drone = new Drone(startCoordinates[0], startCoordinates[1] + 5, startCoordinates[2]);
		String expectedCoordinates = "Drone position: (" 
							+ Integer.toString(startCoordinates[0]) + ","
							+ Integer.toString(4) + ","
							+ Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveDown());
	}
	
	@Test
	public void testInitialMoveLeft()
	{
		drone = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		String expectedCoordinates = "Drone position: (" 
							+ Integer.toString(startCoordinates[0] - 1) + ","
							+ Integer.toString(startCoordinates[1]) + ","
							+ Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	
	@Test
	public void testInitialMoveRight()
	{
		drone = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		String expectedCoordinates = "Drone position: (" 
							+ Integer.toString(startCoordinates[0] + 1) + ","
							+ Integer.toString(startCoordinates[1]) + ","
							+ Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveRight());
	}
	
	@Test
	public void testInitialMoveForth()
	{
		drone = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		String expectedCoordinates = "Drone position: (" 
							+ Integer.toString(startCoordinates[0]) + ","
							+ Integer.toString(startCoordinates[1]) + ","
							+ Integer.toString(startCoordinates[2] - 1) + ")";
		
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	
	@Test
	public void testInitialMoveBack()
	{
		drone = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		String expectedCoordinates = "Drone position: (" 
							+ Integer.toString(startCoordinates[0]) + ","
							+ Integer.toString(startCoordinates[1]) + ","
							+ Integer.toString(startCoordinates[2] + 1) + ")";
		
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	@Test
	public void testUpBoundaries()
	{
		drone = new Drone(startCoordinates[0], startCoordinates[1] + 10, startCoordinates[2]);
		drone2 = new Drone(startCoordinates[0], startCoordinates[1] + 50, startCoordinates[2]);
		
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(startCoordinates[0]) + ","
				+ Integer.toString(10) + ","
				+ Integer.toString(startCoordinates[2]) + ")";

		assertEquals(expectedCoordinates, drone.moveUp());
		
		String expectedCoordinates2 = "Drone position: (" 
				+ Integer.toString(startCoordinates[0]) + ","
				+ Integer.toString(50) + ","
				+ Integer.toString(startCoordinates[2]) + ")";

		assertEquals(expectedCoordinates2, drone2.moveUp());
	}
	
	@Test
	public void testDownBoundaries()
	{
		drone = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		drone2 = new Drone(startCoordinates[0], startCoordinates[1] + 40, startCoordinates[2]);
		
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(startCoordinates[0]) + ","
				+ Integer.toString(startCoordinates[1]) + ","
				+ Integer.toString(startCoordinates[2]) + ")";

		assertEquals(expectedCoordinates, drone.moveDown());
		
		String expectedCoordinates2 = "Drone position: (" 
				+ Integer.toString(startCoordinates[0]) + ","
				+ Integer.toString(40) + ","
				+ Integer.toString(startCoordinates[2]) + ")";

		assertEquals(expectedCoordinates2, drone2.moveDown());
	}
	
	@Test
	public void testLeftBoundaries()
	{
		drone = new Drone(startCoordinates[0] - 30, startCoordinates[1] + 25, startCoordinates[2]);
		drone2 = new Drone(startCoordinates[0] + 10, startCoordinates[1] + 25, startCoordinates[2]);
		
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(0) + ","
				+ Integer.toString(startCoordinates[1] + 25) + ","
				+ Integer.toString(startCoordinates[2]) + ")";

		assertEquals(expectedCoordinates, drone.moveLeft());
		
		String expectedCoordinates2 = "Drone position: (" 
				+ Integer.toString(40) + ","
				+ Integer.toString(startCoordinates[1] + 25) + ","
				+ Integer.toString(startCoordinates[2]) + ")";

		assertEquals(expectedCoordinates2, drone2.moveLeft());
	}
	
	@Test
	public void testRightBoundaries()
	{
		drone = new Drone(startCoordinates[0] - 20, startCoordinates[1] + 30, startCoordinates[2]);
		drone2 = new Drone(startCoordinates[0] + 20, startCoordinates[1] + 30, startCoordinates[2]);
		
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(10) + ","
				+ Integer.toString(startCoordinates[1] + 30) + ","
				+ Integer.toString(startCoordinates[2]) + ")";

		assertEquals(expectedCoordinates, drone.moveRight());
		
		String expectedCoordinates2 = "Drone position: (" 
				+ Integer.toString(50) + ","
				+ Integer.toString(startCoordinates[1] + 30) + ","
				+ Integer.toString(startCoordinates[2]) + ")";

		assertEquals(expectedCoordinates2, drone2.moveRight());
	}
	
	@Test
	public void testForthBoundaries()
	{
		drone = new Drone(startCoordinates[0], startCoordinates[1] + 30, startCoordinates[2] - 30);
		drone2 = new Drone(startCoordinates[0], startCoordinates[1] + 30, startCoordinates[2] + 10);
		
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(startCoordinates[0]) + ","
				+ Integer.toString(startCoordinates[1] + 30) + ","
				+ Integer.toString(0) + ")";

		assertEquals(expectedCoordinates, drone.moveForth());
		
		String expectedCoordinates2 = "Drone position: (" 
				+ Integer.toString(startCoordinates[0]) + ","
				+ Integer.toString(startCoordinates[1] + 30) + ","
				+ Integer.toString(40) + ")";

		assertEquals(expectedCoordinates2, drone2.moveForth());
	}
	
	@Test
	public void testBackBoundaries()
	{
		drone = new Drone(startCoordinates[0], startCoordinates[1] + 30, startCoordinates[2] - 20);
		drone2 = new Drone(startCoordinates[0], startCoordinates[1] + 30, startCoordinates[2] + 20);
		
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(startCoordinates[0]) + ","
				+ Integer.toString(startCoordinates[1] + 30) + ","
				+ Integer.toString(10) + ")";

		assertEquals(expectedCoordinates, drone.moveBack());
		
		String expectedCoordinates2 = "Drone position: (" 
				+ Integer.toString(startCoordinates[0]) + ","
				+ Integer.toString(startCoordinates[1] + 30) + ","
				+ Integer.toString(50) + ")";

		assertEquals(expectedCoordinates2, drone2.moveBack());
	}
}
