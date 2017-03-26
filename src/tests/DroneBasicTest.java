package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneBasicTest {
	
	private int[] boundries = {50, 50, 50};
	private int[] startCoordinates = {30,0,30};
	
	Drone drone;
	
	@Test
	public void testInitialMoveUp(){
		drone = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		
		String expectedCoordinates ="Drone position: (" +Integer.toString(startCoordinates[0])
		+ ", "+Integer.toString(startCoordinates[1] + 1)+", "+Integer.toString(startCoordinates[2])+ ")";
		 
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	@Test 
	public void testBoundryForMoveDownCase1()
	{
		drone = new Drone(30,0,30);
		
		String expectedCoordinates = "Drone position: ("+Integer.toString(30)+", "
		+Integer.toString(0)+", "+Integer.toString(30)+")";
		
		assertEquals(expectedCoordinates, drone.moveDown());
		
		
	}
	@Test 
	public void testBoundryForMoveDownCase2()
	{
		drone = new Drone(30,40,30);
		
		String expectedCoordinates = "Drone position: ("+Integer.toString(30)+", "
		+Integer.toString(40)+", "+Integer.toString(30)+")";
		
		assertEquals(expectedCoordinates, drone.moveDown());
		
		
	}
	
	@Test 
	public void testBoundryForMoveUpCase1()
	{
		drone = new Drone(30,10,30);
		
		String expectedCoordinates = "Drone position: ("+Integer.toString(30)+", "
		+Integer.toString(10)+", "+Integer.toString(30)+")";
		
		assertEquals(expectedCoordinates, drone.moveUp());
		
		
	}
	@Test
	public void testBoundryForMoveUpCase2()
	{
		drone = new Drone(30,50,30);
		
		String expectedCoordinates = "Drone position: ("+Integer.toString(30)+", "
		+Integer.toString(50)+", "+Integer.toString(30)+")";
		
		assertEquals(expectedCoordinates, drone.moveUp());
			
	}
	
	@Test
	public void testBoundryForMoveLeftCase1()
	{
		drone = new Drone(0,30,30);
		
		String expectedCoordinates = "Drone position: ("+Integer.toString(0)+", "
		+Integer.toString(30)+", "+Integer.toString(30)+")";
		
		assertEquals(expectedCoordinates, drone.moveLeft());
			
	}
	@Test
	public void testBoundryForMoveLeftCase2()
	{
		drone = new Drone(40,30,30);
		
		String expectedCoordinates = "Drone position: ("+Integer.toString(40)+", "
		+Integer.toString(30)+", "+Integer.toString(30)+")";
		
		assertEquals(expectedCoordinates, drone.moveLeft());
			
	}
	@Test
	public void testBoundryForMoveRightCase1()
	{
		drone = new Drone(10,30,30);
		
		String expectedCoordinates = "Drone position: ("+Integer.toString(10)+", "
		+Integer.toString(30)+", "+Integer.toString(30)+")";
		
		assertEquals(expectedCoordinates, drone.moveRight());
			
	}
	@Test
	public void testBoundryForMoveRightCase2()
	{
		drone = new Drone(50,30,30);
		
		String expectedCoordinates = "Drone position: ("+Integer.toString(50)+", "
		+Integer.toString(30)+", "+Integer.toString(30)+")";
		
		assertEquals(expectedCoordinates, drone.moveRight());
			
	}
	@Test
	public void testBoundryForMoveBackCase1()
	{
		drone = new Drone(30,30,10);
		
		String expectedCoordinates = "Drone position: ("+Integer.toString(30)+", "
		+Integer.toString(30)+", "+Integer.toString(10)+")";
		
		assertEquals(expectedCoordinates, drone.moveBack());
			
	}
	@Test
	public void testBoundryForMoveBackCase2()
	{
		drone = new Drone(30,30,50);
		
		String expectedCoordinates = "Drone position: ("+Integer.toString(30)+", "
		+Integer.toString(30)+", "+Integer.toString(50)+")";
		
		assertEquals(expectedCoordinates, drone.moveBack());
			
	}
	@Test
	public void testBoundryForMoveForthCase1()
	{
		drone = new Drone(30,30,0);
		
		String expectedCoordinates = "Drone position: ("+Integer.toString(30)+", "
		+Integer.toString(30)+", "+Integer.toString(0)+")";
		
		assertEquals(expectedCoordinates, drone.moveForth());
			
	}
	@Test
	public void testBoundryForMoveForthCase2()
	{
		drone = new Drone(30,30,40);
		
		String expectedCoordinates = "Drone position: ("+Integer.toString(30)+", "
		+Integer.toString(30)+", "+Integer.toString(40)+")";
		
		assertEquals(expectedCoordinates, drone.moveForth());
			
	}

}
