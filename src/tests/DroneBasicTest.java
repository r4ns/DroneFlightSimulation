package tests;

import org.junit.Test;
import static org.junit.Assert.*;
import drone.Drone;

public class DroneBasicTest {
	
	private int[] boundaries = {50, 50, 50};
	private int[] startCoordinates = {30, 0, 30};
	
	Drone drone;
	
	@Test(timeout = 1000)
	public void testInitialMoveUp()
	{
		drone = new Drone();
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1] + 1) + "," + Integer.toString(startCoordinates[2]) + ").";
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	@Test(timeout = 1000)
	public void testInitialMoveDown()
	{
		drone = new Drone();
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) + "," + Integer.toString(startCoordinates[2]) + ").";
		assertEquals(expectedCoordinates, drone.moveDown());
	}
	
	@Test(timeout = 1000)
	public void testInitialMoveLeft()
	{
		drone = new Drone();
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(startCoordinates[0] - 1) + "," + Integer.toString(startCoordinates[1]) + "," + Integer.toString(startCoordinates[2]) + ").";
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	
	@Test(timeout = 1000)
	public void testInitialMoveRight()
	{
		drone = new Drone();
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(startCoordinates[0] + 1) + "," + Integer.toString(startCoordinates[1]) + "," + Integer.toString(startCoordinates[2]) + ").";
		assertEquals(expectedCoordinates, drone.moveRight());
	}
	
	@Test(timeout = 1000)
	public void testInitialMoveForth()
	{
		drone = new Drone();
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) + "," + Integer.toString(startCoordinates[2] - 1) + ").";
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	
	@Test(timeout = 1000)
	public void testInitialMoveBack()
	{
		drone = new Drone();
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) + "," + Integer.toString(startCoordinates[2] + 1) + ").";
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	@Test(timeout = 1000)
	public void testFrontBoundary()
	{
		int[] initCoordinates = {30, 40, 0};
		
		drone = new Drone(initCoordinates);
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(initCoordinates[0]) + "," + Integer.toString(initCoordinates[1]) + "," + Integer.toString(initCoordinates[2]) + ").";
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	
	@Test(timeout = 1000)
	public void testBackBoundary()
	{
		int[] initCoordinates = {30, 40, 50};
		
		drone = new Drone(initCoordinates);
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(initCoordinates[0]) + "," + Integer.toString(initCoordinates[1]) + "," + Integer.toString(initCoordinates[2]) + ").";
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	@Test(timeout = 1000)
	public void testLeftBoundary()
	{
		int[] initCoordinates = {0, 40, 50};
		
		drone = new Drone(initCoordinates);
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(initCoordinates[0]) + "," + Integer.toString(initCoordinates[1]) + "," + Integer.toString(initCoordinates[2]) + ").";
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	
	@Test(timeout = 1000)
	public void testRightBoundary()
	{
		int[] initCoordinates = {50, 40, 50};
		
		drone = new Drone(initCoordinates);
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(initCoordinates[0]) + "," + Integer.toString(initCoordinates[1]) + "," + Integer.toString(initCoordinates[2]) + ").";
		assertEquals(expectedCoordinates, drone.moveRight());
	}
	
	@Test(timeout = 1000)
	public void testBottomBoundary()
	{
		int[] initCoordinates = {30, 40, 30};
		
		drone = new Drone(initCoordinates);
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(initCoordinates[0]) + "," + Integer.toString(initCoordinates[1]) + "," + Integer.toString(initCoordinates[2]) + ").";
		assertEquals(expectedCoordinates, drone.moveDown());
	}
	
	@Test(timeout = 1000)
	public void testTopBoundary()
	{
		int[] initCoordinates = {30, 10, 25};
		
		drone = new Drone(initCoordinates);
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(initCoordinates[0]) + "," + Integer.toString(initCoordinates[1]) + "," + Integer.toString(initCoordinates[2]) + ").";
		assertEquals(expectedCoordinates, drone.moveUp());
	}
}
