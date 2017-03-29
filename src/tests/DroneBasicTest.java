package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneBasicTest {

	private int[] startCoordinates = {30,0,30};
	Drone dron;	
	
	@Test
	public void testInitialMoveUp(){
		dron = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);

		String expectedCoordinates ="Pozicija drona: (" + Integer.toString(startCoordinates[0]) + "," 
														+ Integer.toString(startCoordinates[1] + 1) + "," 
														+ Integer.toString(startCoordinates[2]) + ")";

		assertEquals(expectedCoordinates, dron.moveUp());
	}
	
	@Test
	public void testInitialMoveDown(){
		dron = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);

		String expectedCoordinates ="Pozicija drona: (" + Integer.toString(startCoordinates[0]) + "," 
														+ Integer.toString(startCoordinates[1]) + "," 
														+ Integer.toString(startCoordinates[2]) + ")";

		assertEquals(expectedCoordinates, dron.moveDown());
	}
	
	@Test
	public void testInitialMoveRight(){
		dron = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);

		String expectedCoordinates ="Pozicija drona: (" + Integer.toString(startCoordinates[0]+1) + "," 
														+ Integer.toString(startCoordinates[1]) + "," 
														+ Integer.toString(startCoordinates[2]) + ")";

		assertEquals(expectedCoordinates, dron.moveRight());
	}
	
	@Test
	public void testInitialMoveLeft(){
		dron = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);

		String expectedCoordinates ="Pozicija drona: (" + Integer.toString(startCoordinates[0]-1) + "," 
														+ Integer.toString(startCoordinates[1]) + "," 
														+ Integer.toString(startCoordinates[2]) + ")";

		assertEquals(expectedCoordinates, dron.moveLeft());
	}
	
	@Test
	public void testInitialMoveBack(){
		dron = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);

		String expectedCoordinates ="Pozicija drona: (" + Integer.toString(startCoordinates[0]) + "," 
														+ Integer.toString(startCoordinates[1]) + "," 
														+ Integer.toString(startCoordinates[2]+1) + ")";

		assertEquals(expectedCoordinates, dron.moveBack());
	}
	
	@Test
	public void testInitialMoveForth(){
		dron = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);

		String expectedCoordinates ="Pozicija drona: (" + Integer.toString(startCoordinates[0]) + "," 
														+ Integer.toString(startCoordinates[1]) + "," 
														+ Integer.toString(startCoordinates[2]-1) + ")";

		assertEquals(expectedCoordinates, dron.moveForth());
	}
	
	@Test 
	public void testBoundryMoveUpCase1()
	{
		dron = new Drone(30,10,30);

		String expectedCoordinates ="Pozicija drona: (" + Integer.toString(30) + "," 
														+ Integer.toString(10) + "," 
														+ Integer.toString(30) + ")";

		assertEquals(expectedCoordinates, dron.moveUp());
	}
	
	@Test 
	public void testBoundryMoveUpCase2()
	{
		dron = new Drone(30,50,30);

		String expectedCoordinates ="Pozicija drona: (" + Integer.toString(30) + "," 
														+ Integer.toString(50) + "," 
														+ Integer.toString(30) + ")";

		assertEquals(expectedCoordinates, dron.moveUp());
	}
	
	@Test 
	public void testBoundryMoveDownCase1()
	{
		dron = new Drone(30,0,30);

		String expectedCoordinates ="Pozicija drona: (" + Integer.toString(30) + "," 
														+ Integer.toString(0) + "," 
														+ Integer.toString(30) + ")";

		assertEquals(expectedCoordinates, dron.moveDown());
	}
	
	@Test 
	public void testBoundryMoveDownCase2()
	{
		dron = new Drone(30,40,30);

		String expectedCoordinates ="Pozicija drona: (" + Integer.toString(30) + "," 
														+ Integer.toString(40) + "," 
														+ Integer.toString(30) + ")";

		assertEquals(expectedCoordinates, dron.moveDown());
	}
	
	@Test 
	public void testBoundryMoveRightCase1()
	{
		dron = new Drone(10,30,30);

		String expectedCoordinates ="Pozicija drona: (" + Integer.toString(10) + "," 
														+ Integer.toString(30) + "," 
														+ Integer.toString(30) + ")";

		assertEquals(expectedCoordinates, dron.moveRight());
	}
	
	@Test 
	public void testBoundryMoveRightCase2()
	{
		dron = new Drone(50,30,30);

		String expectedCoordinates ="Pozicija drona: (" + Integer.toString(50) + "," 
														+ Integer.toString(30) + "," 
														+ Integer.toString(30) + ")";

		assertEquals(expectedCoordinates, dron.moveRight());
	}
	
	@Test 
	public void testBoundryMoveLeftCase1()
	{
		dron = new Drone(0,30,30);

		String expectedCoordinates ="Pozicija drona: (" + Integer.toString(0) + "," 
														+ Integer.toString(30) + "," 
														+ Integer.toString(30) + ")";

		assertEquals(expectedCoordinates, dron.moveLeft());
	}
	
	@Test 
	public void testBoundryMoveLeftCase2()
	{
		dron = new Drone(40,30,30);

		String expectedCoordinates ="Pozicija drona: (" + Integer.toString(40) + "," 
														+ Integer.toString(30) + "," 
														+ Integer.toString(30) + ")";

		assertEquals(expectedCoordinates, dron.moveLeft());
	}
	
	@Test 
	public void testBoundryMoveBackCase1()
	{
		dron = new Drone(30,30,10);

		String expectedCoordinates ="Pozicija drona: (" + Integer.toString(30) + "," 
														+ Integer.toString(30) + "," 
														+ Integer.toString(10) + ")";

		assertEquals(expectedCoordinates, dron.moveBack());
	}
	
	@Test 
	public void testBoundryMoveBackCase2()
	{
		dron = new Drone(30,30,50);

		String expectedCoordinates ="Pozicija drona: (" + Integer.toString(30) + "," 
														+ Integer.toString(30) + "," 
														+ Integer.toString(50) + ")";

		assertEquals(expectedCoordinates, dron.moveBack());
	}
	
	@Test 
	public void testBoundryMoveForthCase1()
	{
		dron = new Drone(30,30,0);

		String expectedCoordinates ="Pozicija drona: (" + Integer.toString(30) + "," 
														+ Integer.toString(30) + "," 
														+ Integer.toString(0) + ")";

		assertEquals(expectedCoordinates, dron.moveForth());
	}
	
	@Test 
	public void testBoundryMoveForthCase2()
	{
		dron = new Drone(30,30,40);

		String expectedCoordinates ="Pozicija drona: (" + Integer.toString(30) + "," 
														+ Integer.toString(30) + "," 
														+ Integer.toString(40) + ")";

		assertEquals(expectedCoordinates, dron.moveForth());
	}
	
}
