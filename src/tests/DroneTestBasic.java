package tests;
import static org.junit.Assert.*;

import org.junit.Test;

import drone.*;

public class DroneTestBasic {
	
	private int[] boundaries = {50,50,50};
	private int[] coordinates = {30,0,30};
	Drone drone;
	
	@Test
	public void testInitialMoveUp()
	{
		drone = new Drone(coordinates, boundaries);
		String expectedCoordinates = "Position: ( "
				+Integer.toString(coordinates[0])+", "
				+Integer.toString(coordinates[1]+1)+", "
				+Integer.toString(coordinates[2])+" )";
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	@Test
	public void testBoundaryMoveUp()
	{
		coordinates[1]=10;
		drone = new Drone(coordinates, boundaries);
		String expectedCoordinates = "Position: ( "
				+Integer.toString(coordinates[0])+", "
				+Integer.toString(coordinates[1])+", "
				+Integer.toString(coordinates[2])+" )";
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	@Test
	public void testInitialMoveDown()
	{
		coordinates[1]=10;
		drone = new Drone(coordinates, boundaries);
		String expectedCoordinates = "Position: ( "
				+Integer.toString(coordinates[0])+", "
				+Integer.toString(coordinates[1]-1)+", "
				+Integer.toString(coordinates[2])+" )";
		assertEquals(expectedCoordinates, drone.moveDown());
	}
	
	@Test
	public void testBoundaryMoveDown()
	{
		coordinates[1]=40;
		drone = new Drone(coordinates, boundaries);
		String expectedCoordinates = "Position: ( "
				+Integer.toString(coordinates[0])+", "
				+Integer.toString(coordinates[1])+", "
				+Integer.toString(coordinates[2])+" )";
		assertEquals(expectedCoordinates, drone.moveDown());
	}
	
	@Test
	public void testInitialMoveLeft()
	{
		coordinates[0]=10;
		drone = new Drone(coordinates, boundaries);
		String expectedCoordinates = "Position: ( "
				+Integer.toString(coordinates[0]-1)+", "
				+Integer.toString(coordinates[1])+", "
				+Integer.toString(coordinates[2])+" )";
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	
	@Test
	public void testBoundaryMoveLeft()
	{
		coordinates[1]=0;
		drone = new Drone(coordinates, boundaries);
		String expectedCoordinates = "Position: ( "
				+Integer.toString(coordinates[0])+", "
				+Integer.toString(coordinates[1])+", "
				+Integer.toString(coordinates[2])+" )";
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	
	@Test
	public void testInitialMoveRight()
	{
		coordinates[0]=0;
		drone = new Drone(coordinates, boundaries);
		String expectedCoordinates = "Position: ( "
				+Integer.toString(coordinates[0]+1)+", "
				+Integer.toString(coordinates[1])+", "
				+Integer.toString(coordinates[2])+" )";
		assertEquals(expectedCoordinates, drone.moveRight());
	}
	
	@Test
	public void testBoundaryMoveRight()
	{
		coordinates[0]=10;
		drone = new Drone(coordinates, boundaries);
		String expectedCoordinates = "Position: ( "
				+Integer.toString(coordinates[0])+", "
				+Integer.toString(coordinates[1])+", "
				+Integer.toString(coordinates[2])+" )";
		assertEquals(expectedCoordinates, drone.moveRight());
	}
	
	@Test
	public void testInitialMoveBack()
	{
		coordinates[2]=0;
		drone = new Drone(coordinates, boundaries);
		String expectedCoordinates = "Position: ( "
				+Integer.toString(coordinates[0])+", "
				+Integer.toString(coordinates[1])+", "
				+Integer.toString(coordinates[2]+1)+" )";
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	@Test
	public void testBoundaryMoveBack()
	{
		coordinates[2]=10;
		drone = new Drone(coordinates, boundaries);
		String expectedCoordinates = "Position: ( "
				+Integer.toString(coordinates[0])+", "
				+Integer.toString(coordinates[1])+", "
				+Integer.toString(coordinates[2])+" )";
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	@Test
	public void testInitialMoveForth()
	{
		coordinates[2]=10;
		drone = new Drone(coordinates, boundaries);
		String expectedCoordinates = "Position: ( "
				+Integer.toString(coordinates[0])+", "
				+Integer.toString(coordinates[1])+", "
				+Integer.toString(coordinates[2]-1)+" )";
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	
	@Test
	public void testBoundaryMoveForth()
	{
		coordinates[2]=40;
		drone = new Drone(coordinates, boundaries);
		String expectedCoordinates = "Position: ( "
				+Integer.toString(coordinates[0])+", "
				+Integer.toString(coordinates[1])+", "
				+Integer.toString(coordinates[2])+" )";
		assertEquals(expectedCoordinates, drone.moveForth());
	}
}
