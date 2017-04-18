package tests;
import static org.junit.Assert.*;


import org.junit.Test;

import drone.*;
import space.*;

/*
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
}*/

public class DoubleCubeDroneTestBasic {

	private FlySpace flyspace = new FlySpace(new int[] {50,50,50} , new int[] {30,30,30});
	private int[] coordinates = {30,0,30};
	DoubleCubeDrone drone;
	
	private void helperSetCoordinates(int x, int y, int z) {
		// TODO Auto-generated method stub
		this.coordinates[0] = x;
		this.coordinates[1] = y;
		this.coordinates[2] = z;

	}
	@Test
	public void testInitialMoveUp()
	{
		this.helperSetCoordinates(9, 7, 35);
		drone = new DoubleCubeDrone(coordinates, flyspace);
		String expectedCoordinates = "Position: ( "
				+Integer.toString(coordinates[0])+", "
				+Integer.toString(coordinates[1]+1)+", "
				+Integer.toString(coordinates[2])+" )";
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	@Test
	public void testBoundaryMoveUp2()
	{
		this.helperSetCoordinates(39, 8, 39);
		drone = new DoubleCubeDrone(coordinates, flyspace);
		String expectedCoordinates = "Position: ( "
				+Integer.toString(coordinates[0])+", "
				+Integer.toString(coordinates[1])+", "
				+Integer.toString(coordinates[2])+" )";
		assertEquals(expectedCoordinates, drone.moveUp());
	}

	@Test
	public void testBoundaryMoveDown()
	{
		this.helperSetCoordinates(25,40,25);
		drone = new DoubleCubeDrone(coordinates, flyspace);
		String expectedCoordinates = "Position: ( "
				+Integer.toString(coordinates[0])+", "
				+Integer.toString(coordinates[1])+", "
				+Integer.toString(coordinates[2])+" )";
		assertEquals(expectedCoordinates, drone.moveDown());
	}	
	
	@Test
	public void testBoundaryMoveLeft()
	{
		this.helperSetCoordinates(40,25,25);
		drone = new DoubleCubeDrone(coordinates, flyspace);
		String expectedCoordinates = "Position: ( "
				+Integer.toString(coordinates[0])+", "
				+Integer.toString(coordinates[1])+", "
				+Integer.toString(coordinates[2])+" )";
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	
	@Test
	public void testBoundaryMoveBack()
	{
		this.helperSetCoordinates(25,25,9);
		drone = new DoubleCubeDrone(coordinates, flyspace);
		String expectedCoordinates = "Position: ( "
				+Integer.toString(coordinates[0])+", "
				+Integer.toString(coordinates[1])+", "
				+Integer.toString(coordinates[2])+" )";
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	@Test
	public void testBoundaryMoveForth()
	{
		this.helperSetCoordinates(25,25,40);
		drone = new DoubleCubeDrone(coordinates, flyspace);
		String expectedCoordinates = "Position: ( "
				+Integer.toString(coordinates[0])+", "
				+Integer.toString(coordinates[1])+", "
				+Integer.toString(coordinates[2])+" )";
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	
	@Test
	public void testBoundaryMoveRight()
	{
		this.helperSetCoordinates(9,25,25);
		drone = new DoubleCubeDrone(coordinates, flyspace);
		String expectedCoordinates = "Position: ( "
				+Integer.toString(coordinates[0])+", "
				+Integer.toString(coordinates[1])+", "
				+Integer.toString(coordinates[2])+" )";
		assertEquals(expectedCoordinates, drone.moveRight());
	}
}
