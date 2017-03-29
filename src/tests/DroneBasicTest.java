package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneBasicTest {
	
	private int[] boundaries = {50, 50,50};
	private int[] startCoordinates={30,0,30};
	Drone drone;
	Drone droneTwo;

	@Test
	public void testInitialMoveUp()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1]);
		drone.setZ(startCoordinates[2]);
		
		String expectedCoordinates = "Pozicija drona: ("
									+ Integer.toString(startCoordinates[0]) + ","
									+ Integer.toString(startCoordinates[1] + 1) + ","
									+ Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveUp());
		 
	}
	
	@Test
	public void testInitialMoveDown()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1] + 10);
		drone.setZ(startCoordinates[2]);
		
		String expectedCoordinates = "Pozicija drona: ("
									+ Integer.toString(startCoordinates[0]) + ","
									+ Integer.toString(9) + ","
									+ Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveDown());
			 
	}	
	
	@Test
	public void testInitialMoveLeft()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1]);
		drone.setZ(startCoordinates[2]);
		
		String expectedCoordinates = "Pozicija drona: ("
									+ Integer.toString(startCoordinates[0] - 1) + ","
									+ Integer.toString(startCoordinates[1]) + ","
									+ Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveLeft());
		
	}
	
	@Test
	public void testInitialMoveRight()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1]);
		drone.setZ(startCoordinates[2]);
		
		String expectedCoordinates = "Pozicija drona: ("
									+ Integer.toString(startCoordinates[0] + 1) + ","
									+ Integer.toString(startCoordinates[1]) + ","
									+ Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveRight());
		 
	}
	
	@Test
	public void testInitialMoveForth()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1]);
		drone.setZ(startCoordinates[2]);
		
		String expectedCoordinates = "Pozicija drona: ("
									+ Integer.toString(startCoordinates[0]) + ","
									+ Integer.toString(startCoordinates[1]) + ","
									+ Integer.toString(startCoordinates[2] - 1) + ")";
		
		assertEquals(expectedCoordinates, drone.moveForth());
			 
	}
	
	@Test
	public void testInitialMoveBack()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1]);
		drone.setZ(startCoordinates[2]);
		
		String expectedCoordinates = "Pozicija drona: ("
									+ Integer.toString(startCoordinates[0]) + ","
									+ Integer.toString(startCoordinates[1]) + ","
									+ Integer.toString(startCoordinates[2] + 1) + ")";
		
		assertEquals(expectedCoordinates, drone.moveBack());
		
	}

	@Test
	public void testMoveUpHitBorder()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1] + 10);
		drone.setZ(startCoordinates[2]);
		
		String expectedCoordinates = "Pozicija drona: ("
									+ Integer.toString(startCoordinates[0]) + ","
									+ Integer.toString(10) + ","
									+ Integer.toString(startCoordinates[2]) + ")";
		
		droneTwo = new Drone();
		droneTwo.setX(startCoordinates[0]);
		droneTwo.setY(startCoordinates[1] + 50);
		droneTwo.setZ(startCoordinates[2]);
		
		String expectedCoordinatesTwo = "Pozicija drona: ("
									+ Integer.toString(startCoordinates[0]) + ","
									+ Integer.toString(50) + ","
									+ Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveUp());
		assertEquals(expectedCoordinatesTwo, droneTwo.moveUp());
		 
	}
	
	@Test
	public void testMoveDownHitBorder()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1]);
		drone.setZ(startCoordinates[2]);
		
		String expectedCoordinates = "Pozicija drona: ("
									+ Integer.toString(startCoordinates[0]) + ","
									+ Integer.toString(startCoordinates[1]) + ","
									+ Integer.toString(startCoordinates[2]) + ")";
		
		droneTwo = new Drone();
		droneTwo.setX(startCoordinates[0]);
		droneTwo.setY(startCoordinates[1] + 40);
		droneTwo.setZ(startCoordinates[2]);
		
		String expectedCoordinatesTwo = "Pozicija drona: ("
									+ Integer.toString(startCoordinates[0]) + ","
									+ Integer.toString(40) + ","
									+ Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveDown());
		assertEquals(expectedCoordinatesTwo, droneTwo.moveDown());
		 
	}
	
	public void testMoveLeftHitBorder()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0] - 30);
		drone.setY(startCoordinates[1]);
		drone.setZ(startCoordinates[2]);
		
		String expectedCoordinates = "Pozicija drona: ("
									+ Integer.toString(0) + ","
									+ Integer.toString(startCoordinates[1]) + ","
									+ Integer.toString(startCoordinates[2]) + ")";
		
		droneTwo = new Drone();
		droneTwo.setX(startCoordinates[0] + 10);
		droneTwo.setY(startCoordinates[1]);
		droneTwo.setZ(startCoordinates[2]);
		
		String expectedCoordinatesTwo = "Pozicija drona: ("
									+ Integer.toString(40) + ","
									+ Integer.toString(startCoordinates[1]) + ","
									+ Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveRight());
		assertEquals(expectedCoordinatesTwo, drone.moveRight());
		 
	}	
	
	@Test
	public void testMoveRightHitBorder()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0] - 20);
		drone.setY(startCoordinates[1] + 25);
		drone.setZ(startCoordinates[2]);
		
		String expectedCoordinates = "Pozicija drona: ("
									+ Integer.toString(10) + ","
									+ Integer.toString(startCoordinates[1] + 25) + ","
									+ Integer.toString(startCoordinates[2]) + ")";
		
		droneTwo = new Drone();
		droneTwo.setX(startCoordinates[0] + 20);
		droneTwo.setY(startCoordinates[1]);
		droneTwo.setZ(startCoordinates[2]);
		
		String expectedCoordinatesTwo = "Pozicija drona: ("
									+ Integer.toString(50) + ","
									+ Integer.toString(startCoordinates[1]) + ","
									+ Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveRight());
		assertEquals(expectedCoordinatesTwo, droneTwo.moveRight());
		 
	}

	public void testMoveForthHitBorder()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1] + 15);
		drone.setZ(startCoordinates[2] - 20);
		
		String expectedCoordinates = "Pozicija drona: ("
									+ Integer.toString(startCoordinates[0]) + ","
									+ Integer.toString(startCoordinates[1] + 15) + ","
									+ Integer.toString(10) + ")";
		
		droneTwo = new Drone();
		droneTwo.setX(startCoordinates[0]);
		droneTwo.setY(startCoordinates[1]);
		droneTwo.setZ(startCoordinates[2] + 20);
		
		String expectedCoordinatesTwo = "Pozicija drona: ("
									+ Integer.toString(startCoordinates[0]) + ","
									+ Integer.toString(startCoordinates[1]) + ","
									+ Integer.toString(50) + ")";
		
		assertEquals(expectedCoordinates, drone.moveForth());
		assertEquals(expectedCoordinatesTwo, droneTwo.moveForth());
		
	}
	
	public void testMoveBackHitBorder()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1]);
		drone.setZ(startCoordinates[2] - 30);
		
		String expectedCoordinates = "Pozicija drona: ("
									+ Integer.toString(startCoordinates[0]) + ","
									+ Integer.toString(startCoordinates[1]) + ","
									+ Integer.toString(0) + ")";
		
		droneTwo = new Drone();
		droneTwo.setX(startCoordinates[0]);
		droneTwo.setY(startCoordinates[1]);
		droneTwo.setZ(startCoordinates[2] + 20);
		
		String expectedCoordinatesTwo = "Pozicija drona: ("
									+ Integer.toString(startCoordinates[0]) + ","
									+ Integer.toString(startCoordinates[1]) + ","
									+ Integer.toString(50) + ")";
		
		assertEquals(expectedCoordinates, drone.moveBack());
		assertEquals(expectedCoordinatesTwo, droneTwo.moveBack());
		
	}
	
}
