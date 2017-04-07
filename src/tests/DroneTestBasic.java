package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneTestBasic {
	
	private int[] boundries = { 50,50,50};
	private int [] startCoordinates = {30,0,30};
	Drone drone;
	
	@Test
	public void testInitialMoveUp()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1]);
		drone.setZ(startCoordinates[2]);
		drone.setBoundaries(boundries);
		
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
		drone.setBoundaries(boundries);
		
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
		drone.setBoundaries(boundries);
		
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
		drone.setBoundaries(boundries);
		
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
		drone.setBoundaries(boundries);
		
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
		drone.setBoundaries(boundries);
		
		String expectedCoordinates =  "("+Integer.toString(startCoordinates[0] )+","+Integer.toString(startCoordinates[1]) +","+Integer.toString(startCoordinates[2]+1) +")";
				
		assertEquals( expectedCoordinates, drone.moveBack());
		
		
	}
	
	@Test
	public void testInitialMoveUpForBoundriesOne()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]=50);
		drone.setY(startCoordinates[1]=50);
		drone.setZ(startCoordinates[2]=50);
		drone.setBoundaries(boundries);
		
		String expectedCoordinates =  "("+Integer.toString(startCoordinates[0] )+","+Integer.toString(startCoordinates[1]) +","+Integer.toString(startCoordinates[2]) +")";
				
		assertEquals( expectedCoordinates, drone.moveUp());
		
		
	}
	@Test
	public void testInitialMoveDownForBoundriesOne()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]=50);
		drone.setY(startCoordinates[1]=50);
		drone.setZ(startCoordinates[2]=50);
		drone.setBoundaries(boundries);
		
		String expectedCoordinates =  "("+Integer.toString(startCoordinates[0])+","+Integer.toString(startCoordinates[1]-1) +","+Integer.toString(startCoordinates[2]) +")";
				
		assertEquals( expectedCoordinates, drone.moveDown());
		
		
	}
	@Test
	public void testInitialMoveRightForBoundriesOne()
	{drone = new Drone();
	drone.setX(startCoordinates[0]=50);
	drone.setY(startCoordinates[1]=50);
	drone.setZ(startCoordinates[2]=50);
	drone.setBoundaries(boundries);
	
	String expectedCoordinates =  "("+Integer.toString(startCoordinates[0] )+","+Integer.toString(startCoordinates[1]) +","+Integer.toString(startCoordinates[2]) +")";
			
		assertEquals( expectedCoordinates, drone.moveRight());
		
		
	}
	@Test
	public void testInitialMoveLeftForBoundriesOne()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]=50);
		drone.setY(startCoordinates[1]=50);
		drone.setZ(startCoordinates[2]=50);
		drone.setBoundaries(boundries);
		
		String expectedCoordinates =  "("+Integer.toString(startCoordinates[0]-1 )+","+Integer.toString(startCoordinates[1]) +","+Integer.toString(startCoordinates[2]) +")";
					
		assertEquals( expectedCoordinates, drone.moveLeft());
		
		
	}
	@Test
	public void testInitialMoveForthForBoundriesOne()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]=50);
		drone.setY(startCoordinates[1]=50);
		drone.setZ(startCoordinates[2]=50);
		drone.setBoundaries(boundries);
		
		String expectedCoordinates =  "("+Integer.toString(startCoordinates[0] )+","+Integer.toString(startCoordinates[1]) +","+Integer.toString(startCoordinates[2]-1) +")";
				
		assertEquals( expectedCoordinates, drone.moveForth());
		
		
	}
	@Test
	public void testInitialMoveBackForBoundriesOne()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]=50);
		drone.setY(startCoordinates[1]=50);
		drone.setZ(startCoordinates[2]=50);
		drone.setBoundaries(boundries);
		
		String expectedCoordinates =  "("+Integer.toString(startCoordinates[0] )+","+Integer.toString(startCoordinates[1]) +","+Integer.toString(startCoordinates[2]) +")";
				
		assertEquals( expectedCoordinates, drone.moveBack());
		
		
	}
	
	@Test
	public void testInitialMoveUpForBoundriesTwo()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]=0);
		drone.setY(startCoordinates[1]=0);
		drone.setZ(startCoordinates[2]=0);
		drone.setBoundaries(boundries);
		
		String expectedCoordinates =  "("+Integer.toString(startCoordinates[0] )+","+Integer.toString(startCoordinates[1]+1) +","+Integer.toString(startCoordinates[2]) +")";
				
		assertEquals( expectedCoordinates, drone.moveUp());
		
		
	}
	@Test
	public void testInitialMoveDownForBoundriesTwo()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]=0);
		drone.setY(startCoordinates[1]=0);
		drone.setZ(startCoordinates[2]=0);
		drone.setBoundaries(boundries);
		
		String expectedCoordinates =  "("+Integer.toString(startCoordinates[0] )+","+Integer.toString(startCoordinates[1]) +","+Integer.toString(startCoordinates[2]) +")";
				
		assertEquals( expectedCoordinates, drone.moveDown());
		
		
	}
	@Test
	public void testInitialMoveRightForBoundriesTwo()
	{drone = new Drone();
	drone.setX(startCoordinates[0]=0);
	drone.setY(startCoordinates[1]=0);
	drone.setZ(startCoordinates[2]=0);
	drone.setBoundaries(boundries);
	
	String expectedCoordinates =  "("+Integer.toString(startCoordinates[0]+1 )+","+Integer.toString(startCoordinates[1]) +","+Integer.toString(startCoordinates[2]) +")";
			
		assertEquals( expectedCoordinates, drone.moveRight());
		
		
	}
	@Test
	public void testInitialMoveLeftForBoundriesTwo()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]=0);
		drone.setY(startCoordinates[1]=0);
		drone.setZ(startCoordinates[2]=0);
		drone.setBoundaries(boundries);
		
		String expectedCoordinates =  "("+Integer.toString(startCoordinates[0] )+","+Integer.toString(startCoordinates[1]) +","+Integer.toString(startCoordinates[2]) +")";
					
		assertEquals( expectedCoordinates, drone.moveLeft());
		
		
	}
	@Test
	public void testInitialMoveForthForBoundriesTwo()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]=0);
		drone.setY(startCoordinates[1]=0);
		drone.setZ(startCoordinates[2]=0);
		drone.setBoundaries(boundries);
		
		String expectedCoordinates =  "("+Integer.toString(startCoordinates[0] )+","+Integer.toString(startCoordinates[1]) +","+Integer.toString(startCoordinates[2]) +")";
				
		assertEquals( expectedCoordinates, drone.moveForth());
		
		
	}
	@Test
	public void testInitialMoveBackForBoundriesTwo()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]=0);
		drone.setY(startCoordinates[1]=0);
		drone.setZ(startCoordinates[2]=0);
		drone.setBoundaries(boundries);
		
		String expectedCoordinates =  "("+Integer.toString(startCoordinates[0] )+","+Integer.toString(startCoordinates[1]) +","+Integer.toString(startCoordinates[2]+1) +")";
				
		assertEquals( expectedCoordinates, drone.moveBack());
		
		
	}
	
	@Test
	public void testInitialMoveUpForBoundriesThree()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]=20);
		drone.setY(startCoordinates[1]=10);
		drone.setZ(startCoordinates[2]=20);
		drone.setBoundaries(boundries);
		
		String expectedCoordinates =  "("+Integer.toString(startCoordinates[0] )+","+Integer.toString(startCoordinates[1]) +","+Integer.toString(startCoordinates[2]) +")";
				
		assertEquals( expectedCoordinates, drone.moveUp());
		
		
	}
	@Test
	public void testInitialMoveDownForBoundriesThree()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]=20);
		drone.setY(startCoordinates[1]=10);
		drone.setZ(startCoordinates[2]=20);
		drone.setBoundaries(boundries);
		
		String expectedCoordinates =  "("+Integer.toString(startCoordinates[0] )+","+Integer.toString(startCoordinates[1]-1) +","+Integer.toString(startCoordinates[2]) +")";
				
		assertEquals( expectedCoordinates, drone.moveDown());
		
		
	}
	@Test
	public void testInitialMoveRightForBoundriesThree()
	{drone = new Drone();
	drone.setX(startCoordinates[0]=20);
	drone.setY(startCoordinates[1]=10);
	drone.setZ(startCoordinates[2]=20);
	drone.setBoundaries(boundries);
	
	String expectedCoordinates =  "("+Integer.toString(startCoordinates[0]+1 )+","+Integer.toString(startCoordinates[1]) +","+Integer.toString(startCoordinates[2]) +")";
			
		assertEquals( expectedCoordinates, drone.moveRight());
		
		
	}
	@Test
	public void testInitialMoveLeftForBoundriesThree()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]=20);
		drone.setY(startCoordinates[1]=10);
		drone.setZ(startCoordinates[2]=20);
		drone.setBoundaries(boundries);
		
		String expectedCoordinates =  "("+Integer.toString(startCoordinates[0]-1 )+","+Integer.toString(startCoordinates[1]) +","+Integer.toString(startCoordinates[2]) +")";
					
		assertEquals( expectedCoordinates, drone.moveLeft());
		
		
	}
	@Test
	public void testInitialMoveForthForBoundriesThree()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]=20);
		drone.setY(startCoordinates[1]=10);
		drone.setZ(startCoordinates[2]=20);
		drone.setBoundaries(boundries);
		
		String expectedCoordinates =  "("+Integer.toString(startCoordinates[0])+","+Integer.toString(startCoordinates[1]) +","+Integer.toString(startCoordinates[2]-1) +")";
				
		assertEquals( expectedCoordinates, drone.moveForth());
		
		
	}
	
	@Test
	public void testInitialMoveBackForBoundriesThree()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]=20);
		drone.setY(startCoordinates[1]=10);
		drone.setZ(startCoordinates[2]=20);
		drone.setBoundaries(boundries);
		
		String expectedCoordinates =  "("+Integer.toString(startCoordinates[0])+","+Integer.toString(startCoordinates[1]) +","+Integer.toString(startCoordinates[2]+1) +")";
				
		assertEquals( expectedCoordinates, drone.moveBack());
		
		
	}
	
	
	
	
	
}
