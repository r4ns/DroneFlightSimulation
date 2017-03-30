package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;
public class DroneBasicTest {

	private int [] boundaries = {50,50,50};
	private int [] startCoordinates = {30,0,30};
	Drone drone;
	
	//anotacija iznad metode
	@Test
	public void testInitialMoveUp()
	{
		drone = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		drone.setBoundaries(boundaries);
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(startCoordinates[0])+","
				+ Integer.toString(startCoordinates[1]+1)+","
				+ Integer.toString(startCoordinates[2])+")";

		assertEquals(expectedCoordinates, drone.moveUp());
		
		
	}
	@Test
	public void testInitialMoveDown()
	{
		drone = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		drone.setBoundaries(boundaries);
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(startCoordinates[0])+","
				+ Integer.toString(startCoordinates[1])+","
				+ Integer.toString(startCoordinates[2])+")";

		drone.moveUp();
		assertEquals(expectedCoordinates, drone.moveDown());
		
	}
	
	@Test
	public void testInitialMoveRight()
	{
		drone = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		drone.setBoundaries(boundaries);
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(startCoordinates[0]+1)+ ","
				+ Integer.toString(startCoordinates[1])+","
				+ Integer.toString(startCoordinates[2])+")";

		
		assertEquals(expectedCoordinates, drone.moveRight());
		
	}
	
	@Test
	public void testInitialMoveLeft()
	{
		drone = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		drone.setBoundaries(boundaries);
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(startCoordinates[0]-1)+ ","
				+ Integer.toString(startCoordinates[1])+","
				+ Integer.toString(startCoordinates[2])+")";

		
		assertEquals(expectedCoordinates, drone.moveLeft());
		
	}
	@Test
	public void testInitialMoveForth()
	{
		drone = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		drone.setBoundaries(boundaries);
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(startCoordinates[0])+ ","
				+ Integer.toString(startCoordinates[1])+","
				+ Integer.toString(startCoordinates[2]-1)+")";

		
		assertEquals(expectedCoordinates, drone.moveForth());
		
	}
	
	@Test
	public void testInitialMoveBack()
	{
		drone = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		drone.setBoundaries(boundaries);
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(startCoordinates[0])+ ","
				+ Integer.toString(startCoordinates[1])+","
				+ Integer.toString(startCoordinates[2]+1)+")";

		
		assertEquals(expectedCoordinates, drone.moveBack());
		
	}
	
	//test za prelaz granica
	
	@Test
	public void testLimitOfMoveUp()
	{
		drone = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		drone.setBoundaries(boundaries);
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(startCoordinates[0])+ ","
				+ Integer.toString(startCoordinates[1]+10)+","
				+ Integer.toString(startCoordinates[2])+")";

		
		assertEquals(expectedCoordinates,helper(drone,20,"moveUp"));
		
	}
	
	@Test
	public void testLimitOfMoveDown()
	{
		drone = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		drone.setBoundaries(boundaries);
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(startCoordinates[0])+ ","
				+ Integer.toString(startCoordinates[1])+","
				+ Integer.toString(startCoordinates[2])+")";

		
		assertEquals(expectedCoordinates,helper(drone,20,"moveDown"));
		
	}
	
	@Test
	public void testLimitOfMoveRight()
	{
		drone = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		drone.setBoundaries(boundaries);
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(startCoordinates[0]+20)+ ","
				+ Integer.toString(startCoordinates[1])+","
				+ Integer.toString(startCoordinates[2])+")";

		
		assertEquals(expectedCoordinates,helper(drone,20,"moveRight"));
		
	}
	@Test
	public void testLimitOfMoveLeft()
	{
		drone = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		drone.setBoundaries(boundaries);
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(startCoordinates[0]-31)+ ","
				+ Integer.toString(startCoordinates[1])+","
				+ Integer.toString(startCoordinates[2])+")";

		
		assertEquals(expectedCoordinates,helper(drone,40,"moveLeft"));
		
	}
	@Test
	public void testLimitOfMoveForth()
	{
		drone = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		drone.setBoundaries(boundaries);
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(startCoordinates[0])+ ","
				+ Integer.toString(startCoordinates[1])+","
				+ Integer.toString(startCoordinates[2]-20)+")";

		
		assertEquals(expectedCoordinates,helper(drone,20,"moveForth"));
		
	}
	@Test
	public void testLimitOfMoveBack()
	{
		drone = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		drone.setBoundaries(boundaries);
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(startCoordinates[0])+ ","
				+ Integer.toString(startCoordinates[1])+","
				+ Integer.toString(startCoordinates[2]+20)+")";

		
		assertEquals(expectedCoordinates,helper(drone,20,"moveBack"));
		
	}
	
	public String helper (Drone drone, int move, String direction)
	{
		if(direction.equals("moveUp"))
		{
			for(int i=0; i<move; i++)
				drone.moveUp();
		}
		else if (direction.equals("moveDown"))
		{
			for(int i=0; i<move; i++)
				drone.moveDown();
		}
		else if (direction.equals("moveRight"))
		{
			for(int i=0; i<move; i++)
				drone.moveRight();
		}
		else if (direction.equals("moveLeft"))
		{
			for(int i=0; i<move; i++)
				drone.moveLeft();
		}
		else if (direction.equals("moveForth"))
		{
			for(int i=0; i<move; i++)
				drone.moveForth();
		}
		else if (direction.equals("moveBack"))
		{
			for(int i=0; i<move; i++)
				drone.moveBack();
		}
		System.out.println("Final drone position: "+ drone.getFormatedCoordinates());
		return drone.getFormatedCoordinates();
	}
	
}
