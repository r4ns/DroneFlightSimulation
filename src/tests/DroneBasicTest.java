package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneBasicTest {
	
	private int[] boundariesOne = { 50,50,50};
	private int[] boundariesTwo = { 0,0,0};
	private int[] boundariesThree={20, 10, 20};
	private int [] startCoordinates = {30,0,30};
	Drone drone;
	
	@Test
	public void testInitialMoveUp()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1]);
		drone.setZ(startCoordinates[2]);
		
		String expectedCoordinates =  "("+Integer.toString(startCoordinates[0] )+","+Integer.toString(startCoordinates[1]+1) +","+Integer.toString(startCoordinates[2]) +")";
				
		assertEquals( expectedCoordinates, drone.moveUp());
		
		
	}
	@Test
	public void testInitialMoveDown()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1]);
		drone.setZ(startCoordinates[2]);
		
		String expectedCoordinates =  "("+Integer.toString(startCoordinates[0] )+","+Integer.toString(startCoordinates[1]) +","+Integer.toString(startCoordinates[2]) +")";
				
		assertEquals( expectedCoordinates, drone.moveDown());
		
		
	}
	@Test
	public void testInitialMoveRight()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1]);
		drone.setZ(startCoordinates[2]);

		
		String expectedCoordinates =  "("+Integer.toString(startCoordinates[0] +1)+","+Integer.toString(startCoordinates[1]) +","+Integer.toString(startCoordinates[2]) +")";
				
		assertEquals( expectedCoordinates, drone.moveRight());
		
		
	}
	@Test
	public void testInitialMoveLeft()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1]);
		drone.setZ(startCoordinates[2]);
		
		String expectedCoordinates =  "("+Integer.toString(startCoordinates[0]-1 )+","+Integer.toString(startCoordinates[1]) +","+Integer.toString(startCoordinates[2]) +")";
				
		assertEquals( expectedCoordinates, drone.moveLeft());
		
		
	}
	@Test
	public void testInitialMoveForth()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1]);
		drone.setZ(startCoordinates[2]);

		
		String expectedCoordinates =  "("+Integer.toString(startCoordinates[0] )+","+Integer.toString(startCoordinates[1]) +","+Integer.toString(startCoordinates[2]-1) +")";
				
		assertEquals( expectedCoordinates, drone.moveForth());
		
		
	}
	@Test
	public void testInitialMoveBack()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1]);
		drone.setZ(startCoordinates[2]);
		
		String expectedCoordinates =  "("+Integer.toString(startCoordinates[0] )+","+Integer.toString(startCoordinates[1]) +","+Integer.toString(startCoordinates[2]+1) +")";
				
		assertEquals( expectedCoordinates, drone.moveBack());
		
		
	}
	
	@Test
	public void testInitialMoveUpForBoundriesOne()
	{
		drone = new Drone();
		drone.setX(boundariesOne[0]);
		drone.setY(boundariesOne[1]);
		drone.setZ(boundariesOne[2]);
		
		String expectedCoordinates =  "("+Integer.toString(boundariesOne[0] )+","+Integer.toString(boundariesOne[1]) +","+Integer.toString(boundariesOne[2]) +")";
				
		assertEquals( expectedCoordinates, drone.moveUp());
		
		
	}
	@Test
	public void testInitialMoveDownForBoundriesOne()
	{
		drone = new Drone();
		drone.setX(boundariesOne[0]);
		drone.setY(boundariesOne[1]);
		drone.setZ(boundariesOne[2]);
		
		String expectedCoordinates =  "("+Integer.toString(boundariesOne[0] )+","+Integer.toString(boundariesOne[1]-1) +","+Integer.toString(boundariesOne[2]) +")";
				
		assertEquals( expectedCoordinates, drone.moveDown());
		
		
	}
	@Test
	public void testInitialMoveRightForBoundriesOne()
	{drone = new Drone();
	drone.setX(boundariesOne[0]);
	drone.setY(boundariesOne[1]);
	drone.setZ(boundariesOne[2]);
	
	String expectedCoordinates =  "("+Integer.toString(boundariesOne[0] )+","+Integer.toString(boundariesOne[1]) +","+Integer.toString(boundariesOne[2]) +")";
			
		assertEquals( expectedCoordinates, drone.moveRight());
		
		
	}
	@Test
	public void testInitialMoveLeftForBoundriesOne()
	{
		drone = new Drone();
		drone.setX(boundariesOne[0]);
		drone.setY(boundariesOne[1]);
		drone.setZ(boundariesOne[2]);
		
		String expectedCoordinates =  "("+Integer.toString(boundariesOne[0]-1 )+","+Integer.toString(boundariesOne[1]) +","+Integer.toString(boundariesOne[2]) +")";
					
		assertEquals( expectedCoordinates, drone.moveLeft());
		
		
	}
	@Test
	public void testInitialMoveForthForBoundriesOne()
	{
		drone = new Drone();
		drone.setX(boundariesOne[0]);
		drone.setY(boundariesOne[1]);
		drone.setZ(boundariesOne[2]);
		
		String expectedCoordinates =  "("+Integer.toString(boundariesOne[0] )+","+Integer.toString(boundariesOne[1]) +","+Integer.toString(boundariesOne[2]-1) +")";
				
		assertEquals( expectedCoordinates, drone.moveForth());
		
		
	}
	@Test
	public void testInitialMoveBackForBoundriesOne()
	{
		drone = new Drone();
		drone.setX(boundariesOne[0]);
		drone.setY(boundariesOne[1]);
		drone.setZ(boundariesOne[2]);
		
		String expectedCoordinates =  "("+Integer.toString(boundariesOne[0] )+","+Integer.toString(boundariesOne[1]) +","+Integer.toString(boundariesOne[2]) +")";
				
		assertEquals( expectedCoordinates, drone.moveBack());
		
		
	}
	
	@Test
	public void testInitialMoveUpForBoundriesTwo()
	{
		drone = new Drone();
		drone.setX(boundariesTwo[0]);
		drone.setY(boundariesTwo[1]);
		drone.setZ(boundariesTwo[2]);
		
		String expectedCoordinates =  "("+Integer.toString(boundariesTwo[0] )+","+Integer.toString(boundariesTwo[1]+1) +","+Integer.toString(boundariesTwo[2]) +")";
				
		assertEquals( expectedCoordinates, drone.moveUp());
		
		
	}
	@Test
	public void testInitialMoveDownForBoundriesTwo()
	{
		drone = new Drone();
		drone.setX(boundariesTwo[0]);
		drone.setY(boundariesTwo[1]);
		drone.setZ(boundariesTwo[2]);
		
		String expectedCoordinates =  "("+Integer.toString(boundariesTwo[0] )+","+Integer.toString(boundariesTwo[1]) +","+Integer.toString(boundariesTwo[2]) +")";
				
		assertEquals( expectedCoordinates, drone.moveDown());
		
		
	}
	@Test
	public void testInitialMoveRightForBoundriesTwo()
	{drone = new Drone();
	drone.setX(boundariesTwo[0]);
	drone.setY(boundariesTwo[1]);
	drone.setZ(boundariesTwo[2]);
	
	String expectedCoordinates =  "("+Integer.toString(boundariesTwo[0]+1 )+","+Integer.toString(boundariesTwo[1]) +","+Integer.toString(boundariesTwo[2]) +")";
			
		assertEquals( expectedCoordinates, drone.moveRight());
		
		
	}
	@Test
	public void testInitialMoveLeftForBoundriesTwo()
	{
		drone = new Drone();
		drone.setX(boundariesTwo[0]);
		drone.setY(boundariesTwo[1]);
		drone.setZ(boundariesTwo[2]);
		
		String expectedCoordinates =  "("+Integer.toString(boundariesTwo[0] )+","+Integer.toString(boundariesTwo[1]) +","+Integer.toString(boundariesTwo[2]) +")";
					
		assertEquals( expectedCoordinates, drone.moveLeft());
		
		
	}
	@Test
	public void testInitialMoveForthForBoundriesTwo()
	{
		drone = new Drone();
		drone.setX(boundariesTwo[0]);
		drone.setY(boundariesTwo[1]);
		drone.setZ(boundariesTwo[2]);
		
		String expectedCoordinates =  "("+Integer.toString(boundariesTwo[0] )+","+Integer.toString(boundariesTwo[1]) +","+Integer.toString(boundariesTwo[2]) +")";
				
		assertEquals( expectedCoordinates, drone.moveForth());
		
		
	}
	@Test
	public void testInitialMoveBackForBoundriesTwo()
	{
		drone = new Drone();
		drone.setX(boundariesTwo[0]);
		drone.setY(boundariesTwo[1]);
		drone.setZ(boundariesTwo[2]);
		
		String expectedCoordinates =  "("+Integer.toString(boundariesTwo[0] )+","+Integer.toString(boundariesTwo[1]) +","+Integer.toString(boundariesTwo[2]+1) +")";
				
		assertEquals( expectedCoordinates, drone.moveBack());
		
		
	}
	
	@Test
	public void testInitialMoveUpForBoundriesThree()
	{
		drone = new Drone();
		drone.setX(boundariesThree[0]);
		drone.setY(boundariesThree[1]);
		drone.setZ(boundariesThree[2]);
		
		String expectedCoordinates =  "("+Integer.toString(boundariesThree[0] )+","+Integer.toString(boundariesThree[1]) +","+Integer.toString(boundariesThree[2]) +")";
				
		assertEquals( expectedCoordinates, drone.moveUp());
		
		
	}
	@Test
	public void testInitialMoveDownForBoundriesThree()
	{
		drone = new Drone();
		drone.setX(boundariesThree[0]);
		drone.setY(boundariesThree[1]);
		drone.setZ(boundariesThree[2]);
		
		String expectedCoordinates =  "("+Integer.toString(boundariesThree[0] )+","+Integer.toString(boundariesThree[1]-1) +","+Integer.toString(boundariesThree[2]) +")";
				
		assertEquals( expectedCoordinates, drone.moveDown());
		
		
	}
	@Test
	public void testInitialMoveRightForBoundriesThree()
	{drone = new Drone();
	drone.setX(boundariesThree[0]);
	drone.setY(boundariesThree[1]);
	drone.setZ(boundariesThree[2]);
	
	String expectedCoordinates =  "("+Integer.toString(boundariesThree[0]+1 )+","+Integer.toString(boundariesThree[1]) +","+Integer.toString(boundariesThree[2]) +")";
			
		assertEquals( expectedCoordinates, drone.moveRight());
		
		
	}
	@Test
	public void testInitialMoveLeftForBoundriesThree()
	{
		drone = new Drone();
		drone.setX(boundariesThree[0]);
		drone.setY(boundariesThree[1]);
		drone.setZ(boundariesThree[2]);
		
		String expectedCoordinates =  "("+Integer.toString(boundariesThree[0]-1 )+","+Integer.toString(boundariesThree[1]) +","+Integer.toString(boundariesThree[2]) +")";
					
		assertEquals( expectedCoordinates, drone.moveLeft());
		
		
	}
	@Test
	public void testInitialMoveForthForBoundriesThree()
	{
		drone = new Drone();
		drone.setX(boundariesThree[0]);
		drone.setY(boundariesThree[1]);
		drone.setZ(boundariesThree[2]);
		
		String expectedCoordinates =  "("+Integer.toString(boundariesThree[0] )+","+Integer.toString(boundariesThree[1]) +","+Integer.toString(boundariesThree[2]-1) +")";
				
		assertEquals( expectedCoordinates, drone.moveForth());
		
		
	}
	@Test
	public void testInitialMoveBackForBoundriesThree()
	{
		drone = new Drone();
		drone.setX(boundariesThree[0]);
		drone.setY(boundariesThree[1]);
		drone.setZ(boundariesThree[2]);
		
		String expectedCoordinates =  "("+Integer.toString(boundariesThree[0] )+","+Integer.toString(boundariesThree[1]) +","+Integer.toString(boundariesThree[2]+1) +")";
				
		assertEquals( expectedCoordinates, drone.moveBack());
		
		
	}
	
	
	
	
	
}
