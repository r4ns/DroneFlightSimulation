package tests;
import static org.junit.Assert.*;


import org.junit.Test;

import drone.Drone;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;




public class DroneTestBasic {
	private int[] boundaries = {50,50,50};
	private int[] startCoordinates = {30,0,30};
	Drone drone;
	
	
	@Test
	public void testInitalMoveUp()
	{
			drone = new Drone(startCoordinates[0],
							  startCoordinates[1],
					          startCoordinates[2]);
			
			String expectedCoordinates = "Drone position: ("+Integer.toString(startCoordinates[0])+","+
															 Integer.toString(startCoordinates[1]+1)+","+
															 Integer.toString(startCoordinates[2])+")";
			
			assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	
	@Test
	public void testInitalMoveDown()
	{
			drone = new Drone(startCoordinates[0],
							  startCoordinates[1],
					          startCoordinates[2]);
			
			String expectedCoordinates = "Drone position: ("+Integer.toString(startCoordinates[0])+","+
															 Integer.toString(startCoordinates[1]-1)+","+
															 Integer.toString(startCoordinates[2])+")";
			
			assertEquals(expectedCoordinates, drone.moveDown());
	}
	
	@Test
	public void testInitalMoveLeft()
	{
			drone = new Drone(startCoordinates[0],
							  startCoordinates[1],
					          startCoordinates[2]);
			
			String expectedCoordinates = "Drone position: ("+Integer.toString(startCoordinates[0]-1)+","+
															 Integer.toString(startCoordinates[1])+","+
															 Integer.toString(startCoordinates[2])+")";
			
			assertEquals(expectedCoordinates, drone.moveLeft());
	}
	
	@Test
	public void testInitalMoveRight()
	{
			drone = new Drone(startCoordinates[0],
							  startCoordinates[1],
					          startCoordinates[2]);
			
			String expectedCoordinates = "Drone position: ("+Integer.toString(startCoordinates[0]+1)+","+
															 Integer.toString(startCoordinates[1])+","+
															 Integer.toString(startCoordinates[2])+")";
			
			assertEquals(expectedCoordinates, drone.moveRight());
	}
	
	@Test
	public void testInitalMoveBack()
	{
			drone = new Drone(startCoordinates[0],
							  startCoordinates[1],
					          startCoordinates[2]);
			
			String expectedCoordinates = "Drone position: ("+Integer.toString(startCoordinates[0])+","+
															 Integer.toString(startCoordinates[1])+","+
															 Integer.toString(startCoordinates[2]+1)+")";
			
			assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	@Test
	public void testInitalMoveForth()
	{
			drone = new Drone(startCoordinates[0],
							  startCoordinates[1],
					          startCoordinates[2]);
			
			String expectedCoordinates = "Drone position: ("+Integer.toString(startCoordinates[0])+","+
															 Integer.toString(startCoordinates[1])+","+
															 Integer.toString(startCoordinates[2]-1)+")";
			
			assertEquals(expectedCoordinates, drone.moveForth());
	}
}
