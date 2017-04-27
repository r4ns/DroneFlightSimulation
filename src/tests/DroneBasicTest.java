package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneBasicTest {
	Drone drone;
	private int[] startCoordinates = {30, 0, 30};
	
	@Test
	public void testInitialMoveUp()
	{
		drone = new Drone();
		
		String expectedCoordinates = "Drone position: (" 
							+ Integer.toString(startCoordinates[0]) + ","
							+ Integer.toString(startCoordinates[1]  + 1) + ","
							+ Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	@Test
	public void testInitialMoveDown()
	{
		drone = new Drone();
		
		String expectedCoordinates = "Drone position: (" 
							+ Integer.toString(startCoordinates[0]) + ","
							+ Integer.toString(startCoordinates[1]  - 1) + ","
							+ Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveDown());
	}
	
	@Test
	public void testInitialMoveLeft()
	{
		drone = new Drone();
		
		String expectedCoordinates = "Drone position: (" 
							+ Integer.toString(startCoordinates[0] - 1) + ","
							+ Integer.toString(startCoordinates[1]) + ","
							+ Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	
	@Test
	public void testInitialMoveRight()
	{
		drone = new Drone();
		
		String expectedCoordinates = "Drone position: (" 
							+ Integer.toString(startCoordinates[0] + 1) + ","
							+ Integer.toString(startCoordinates[1]) + ","
							+ Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveRight());
	}
	
	@Test
	public void testInitialMoveForth()
	{
		drone = new Drone();
		
		String expectedCoordinates = "Drone position: (" 
							+ Integer.toString(startCoordinates[0]) + ","
							+ Integer.toString(startCoordinates[1]) + ","
							+ Integer.toString(startCoordinates[2] + 1) + ")";
		
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	
	@Test
	public void testInitialMoveBack()
	{
		drone = new Drone();
		
		String expectedCoordinates = "Drone position: (" 
							+ Integer.toString(startCoordinates[0]) + ","
							+ Integer.toString(startCoordinates[1]) + ","
							+ Integer.toString(startCoordinates[2] - 1) + ")";
		
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	@Test
	public void testMovingUpOneStepWhenItsBoundary(){
		
		Drone drone = new Drone();
		
		drone.setY(10);
		String expectedCoordinates="("+Integer.toString(drone.getX())
			+","+Integer.toString(drone.getY())
			+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " + expectedCoordinates, drone.moveUp().replace("//dron hits edge !!!", ""));
		
		drone.setY(50);
		expectedCoordinates="("+Integer.toString(drone.getX())
			+","+Integer.toString(drone.getY())
			+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " + expectedCoordinates, drone.moveUp().replace("//dron hits edge !!!", ""));
	}
	
	@Test
	public void testMovingDownOneStepWhenItsBoundary(){
		
		Drone drone = new Drone();
		
		String expectedCoordinates="("+Integer.toString(drone.getX())
			+","+Integer.toString(drone.getY())
			+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " + expectedCoordinates, drone.moveDown().replace("//dron hits edge !!!", ""));
		
		drone.setY(40);
		expectedCoordinates="("+Integer.toString(drone.getX())
			+","+Integer.toString(drone.getY())
			+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " + expectedCoordinates, drone.moveDown().replace("//dron hits edge !!!", ""));
	}
	
	@Test
	public void testMovingRightOneStepWhenItsBoundary(){
		
		Drone drone = new Drone();
		
		drone.setX(50);
		String expectedCoordinates="("+Integer.toString(drone.getX())
			+","+Integer.toString(drone.getY())
			+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveRight().replace("//dron hits edge !!!", ""));
		
		drone.setX(10);
		drone.setY(30);
		expectedCoordinates="("+Integer.toString(drone.getX())
			+","+Integer.toString(drone.getY())
			+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveRight().replace("//dron hits edge !!!", ""));
	}
	
	@Test
	public void testMovingLeftOneStepWhenItsBoundary(){
		Drone drone = new Drone();
		
		drone.setX(0);
		String expectedCoordinates="("+Integer.toString(drone.getX())
		+","+Integer.toString(drone.getY())
		+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveLeft().replace("//dron hits edge !!!", ""));
		
		drone.setX(40);
		drone.setY(30);
		expectedCoordinates="("+Integer.toString(drone.getX())
		+","+Integer.toString(drone.getY())
		+","+Integer.toString(drone.getZ())+")";
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveLeft().replace("//dron hits edge !!!", ""));
	}
	
	@Test
	public void testMovingForthOneStepWhenItsBoundary(){
		Drone drone = new Drone();
		
		drone.setZ(0);
		String expectedCoordinates="("+Integer.toString(drone.getX())
		+","+Integer.toString(drone.getY())
		+","+Integer.toString(drone.getZ())+")";
		
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveForth().replace("//dron hits edge !!!", ""));
		
		drone.setZ(40);
		drone.setY(30);
		expectedCoordinates="("+Integer.toString(drone.getX())
		+","+Integer.toString(drone.getY())
		+","+Integer.toString(drone.getZ())+")";
		
		
		assertEquals("Drone position: " +expectedCoordinates, drone.moveForth().replace("//dron hits edge !!!", ""));
	}
	
	@Test
	public void testMovingBackOneStepWhenItsBoundary(){
		Drone drone = new Drone();
		
		drone.setZ(0);
		String expectedCoordinates="("+Integer.toString(drone.getX())
		+","+Integer.toString(drone.getY())
		+","+Integer.toString(drone.getZ())+")";
		
		
		assertEquals("Drone position: " + expectedCoordinates, drone.moveBack().replace("//dron hits edge !!!", ""));
		
		drone.setZ(40);
		drone.setY(30);
		expectedCoordinates="("+Integer.toString(drone.getX())
		+","+Integer.toString(drone.getY())
		+","+Integer.toString(drone.getZ())+")";
		
		
		assertEquals("Drone position: " + expectedCoordinates, drone.moveBack().replace("//dron hits edge !!!", ""));
	}
}
