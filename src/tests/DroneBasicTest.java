package tests;

import org.junit.Test;

import drone.Drone;
import static org.junit.Assert.*;

public class DroneBasicTest {

	private int[] boundaries={50,50,50};
	private int[] startCoordinates={30,0,30};
	Drone drone;
	
	@Test(timeout=1000)
	public void testInitialMoveUp()
	{
		drone=new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		
		String expectedCoordinates="Drone position: (" + Integer.toString(startCoordinates[0])+","+ Integer.toString(startCoordinates[1]+1) +","+ Integer.toString(startCoordinates[2])+")";
		
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	@Test(timeout=1000)
	public void testInitialMoveDown()
	{
		drone=new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		
		String expectedCoordinates="Drone position: (" + Integer.toString(startCoordinates[0])+","+ Integer.toString(startCoordinates[1]) +","+ Integer.toString(startCoordinates[2])+")";
		
		assertEquals(expectedCoordinates, drone.moveDown());
	}
	
	@Test(timeout=1000)
	public void testInitialMoveLeft()
	{
		drone=new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		
		String expectedCoordinates="Drone position: (" + Integer.toString(startCoordinates[0]-1)+","+ Integer.toString(startCoordinates[1]) +","+ Integer.toString(startCoordinates[2])+")";
		
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	
	@Test(timeout=1000)
	public void testInitialMoveRight()
	{
		drone=new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		
		String expectedCoordinates="Drone position: (" + Integer.toString(startCoordinates[0]+1)+","+ Integer.toString(startCoordinates[1]) +","+ Integer.toString(startCoordinates[2])+")";
		
		assertEquals(expectedCoordinates, drone.moveRight());
	}
	
	@Test(timeout=1000)
	public void testInitialMoveForth()
	{
		drone=new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		
		String expectedCoordinates="Drone position: (" + Integer.toString(startCoordinates[0])+","+ Integer.toString(startCoordinates[1]) +","+ Integer.toString(startCoordinates[2]-1)+")";
		
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	
	@Test(timeout=1000)
	public void testInitialMoveBack()
	{
		drone=new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		
		String expectedCoordinates="Drone position: (" + Integer.toString(startCoordinates[0])+","+ Integer.toString(startCoordinates[1]) +","+ Integer.toString(startCoordinates[2]+1)+")";
		
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	
	//TESTOVI ZA PRELAZAK GRANICA
	@Test(timeout=1000)
	public void testMoveUpBoundaries()
	{
		drone=new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		
		String expectedCoordinates="Drone position: (" + Integer.toString(startCoordinates[0])+","+ Integer.toString(startCoordinates[1]+10) +","+ Integer.toString(startCoordinates[2])+")";
		
		for(int i=0;i<15;i++)
		{
			drone.moveUp();
		}
		
		String moveUpCoordinates="Drone position: (" + Integer.toString(drone.getX())+","+ Integer.toString(drone.getY()) +","+ Integer.toString(drone.getZ())+")";
		assertEquals(expectedCoordinates, moveUpCoordinates);
	}
	
	@Test(timeout=1000)
	public void testMoveDownBoundaries()
	{
		drone=new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		
		String expectedCoordinates="Drone position: (" + Integer.toString(startCoordinates[0])+","+ Integer.toString(startCoordinates[1]) +","+ Integer.toString(startCoordinates[2])+")";
		
		for(int i=0;i<5;i++)
		{
			drone.moveDown();
		}
		
		String moveDownCoordinates="Drone position: (" + Integer.toString(drone.getX())+","+ Integer.toString(drone.getY()) +","+ Integer.toString(drone.getZ())+")";
		assertEquals(expectedCoordinates, moveDownCoordinates);
	}
	
	@Test(timeout=1000)
	public void testMoveLeftBoundaries()
	{
		drone=new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		
		String expectedCoordinates="Drone position: (" + Integer.toString(startCoordinates[0]-30)+","+ Integer.toString(startCoordinates[1]) +","+ Integer.toString(startCoordinates[2])+")";
		
		for(int i=0;i<40;i++)
		{
			drone.moveLeft();
		}
		
		String moveLeftCoordinates="Drone position: (" + Integer.toString(drone.getX())+","+ Integer.toString(drone.getY()) +","+ Integer.toString(drone.getZ())+")";
		assertEquals(expectedCoordinates, moveLeftCoordinates);
	}
	
	@Test(timeout=1000)
	public void testMoveRightBoundaries()
	{
		drone=new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		
		String expectedCoordinates="Drone position: (" + Integer.toString(startCoordinates[0]+20)+","+ Integer.toString(startCoordinates[1]) +","+ Integer.toString(startCoordinates[2])+")";
		
		for(int i=0;i<30;i++)
		{
			drone.moveRight();
		}
		
		String moveRightCoordinates="Drone position: (" + Integer.toString(drone.getX())+","+ Integer.toString(drone.getY()) +","+ Integer.toString(drone.getZ())+")";
		assertEquals(expectedCoordinates, moveRightCoordinates);
	}
	
	@Test(timeout=1000)
	public void testMoveForthBoundaries()
	{
		drone=new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		
		String expectedCoordinates="Drone position: (" + Integer.toString(startCoordinates[0])+","+ Integer.toString(startCoordinates[1]) +","+ Integer.toString(startCoordinates[2]-30)+")";
		
		for(int i=0;i<40;i++)
		{
			drone.moveForth();
		}
		
		String moveForthCoordinates="Drone position: (" + Integer.toString(drone.getX())+","+ Integer.toString(drone.getY()) +","+ Integer.toString(drone.getZ())+")";
		assertEquals(expectedCoordinates, moveForthCoordinates);
	}
	
	@Test(timeout=1000)
	public void testMoveBackBoundaries()
	{
		drone=new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		
		String expectedCoordinates="Drone position: (" + Integer.toString(startCoordinates[0])+","+ Integer.toString(startCoordinates[1]) +","+ Integer.toString(startCoordinates[2]+20)+")";
		
		for(int i=0;i<30;i++)
		{
			drone.moveBack();
		}
		
		String moveBackCoordinates="Drone position: (" + Integer.toString(drone.getX())+","+ Integer.toString(drone.getY()) +","+ Integer.toString(drone.getZ())+")";
		assertEquals(expectedCoordinates, moveBackCoordinates);
	}
	
}
