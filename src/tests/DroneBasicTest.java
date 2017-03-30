package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneBasicTest {
	
	Drone drone;
	private int[] startCoordinates = { 30, 0, 30 };

	
	
	@Test
	public void testInitialMoveUp(){
		drone = new Drone();
		String expectedCoordinates = "Drone position: x:" +Integer.toString(drone.getX()) + " y:" + Integer.toString(drone.getY()+1) + " z:" + Integer.toString(drone.getZ());
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	@Test
	public void testInitialMoveDown(){
		drone = new Drone();
		String expectedCoordinates = "Drone position: x:" +Integer.toString(drone.getX()) + " y:" + Integer.toString(drone.getY()) + " z:" + Integer.toString(drone.getZ());
		assertEquals(expectedCoordinates, drone.moveDown());
	}
	@Test
	public void testInitialMoveLeft(){
		drone = new Drone();
		String expectedCoordinates = "Drone position: x:" +Integer.toString(drone.getX()-1) + " y:" + Integer.toString(drone.getY()) + " z:" + Integer.toString(drone.getZ());
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	@Test 
	public void testInitialMoveRight(){
		drone = new Drone();
		String expectedCoordinates = "Drone position: x:" +Integer.toString(drone.getX()+1) + " y:" + Integer.toString(drone.getY()) + " z:" + Integer.toString(drone.getZ());
		assertEquals(expectedCoordinates, drone.moveRight());
	}
	@Test 
	public void testInitialMoveForth(){
		drone = new Drone();
		String expectedCoordinates = "Drone position: x:" +Integer.toString(drone.getX()	) + " y:" + Integer.toString(drone.getY()) + " z:" + Integer.toString(drone.getZ()-1);
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	@Test 
	public void testInitialMoveBack(){
		drone = new Drone();
		String expectedCoordinates = "Drone position: x:" +Integer.toString(drone.getX()	) + " y:" + Integer.toString(drone.getY()) + " z:" + Integer.toString(drone.getZ()+1);
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	@Test
	public void testBoundariesMoveRight() {
		drone = new Drone();
		String expectedCoordinates = "Drone position: x:" +Integer.toString(50) + " y:" + Integer.toString(drone.getY()) + " z:" + Integer.toString(drone.getZ());
		assertEquals(expectedCoordinates, helperMoveToBoundaries("moveright", 63, drone));
	}
	
	@Test
	public void testBoundariesMoveLeft() {
		drone = new Drone();
		String expectedCoordinates = "Drone position: x:" +Integer.toString(0) + " y:" + Integer.toString(startCoordinates[1]) + " z:" + Integer.toString(startCoordinates[2]);
		assertEquals(expectedCoordinates, helperMoveToBoundaries("moveleft", 63, drone));
	}
	
	@Test
	public void testBoundariesMoveForth() {
		drone = new Drone();
		String expectedCoordinates = "Drone position: x:" +Integer.toString(startCoordinates[0])+ " y:" + Integer.toString(startCoordinates[1]) + " z:" + Integer.toString(0);
		assertEquals(expectedCoordinates, helperMoveToBoundaries("moveforth",63,drone));
	}
	
	@Test
	public void testBoundariesMoveBack(){
		drone = new Drone();
		String expectedCoordinates = "Drone position: x:" +Integer.toString(startCoordinates[0])+ " y:" + Integer.toString(startCoordinates[1]) + " z:" + Integer.toString(50);
		assertEquals(expectedCoordinates, helperMoveToBoundaries("moveback",63,drone));
	}
	
	private String helperMoveToBoundaries(String direction, int moves, Drone targetDrone) {
		switch (direction.toLowerCase()) {
		case "moveup":
			for (int i = 0; i < moves; i++)
				targetDrone.moveUp();
			break;
		case "movedown":
			for (int i = 0; i < moves; i++)
				targetDrone.moveDown();
			break;
		case "moveleft":
			for (int i = 0; i < moves; i++)
				targetDrone.moveLeft();
			break;
		case "moveright":
			for (int i = 0; i < moves; i++)
				targetDrone.moveRight();
			break;
		case "moveforth":
			for (int i = 0; i < moves; i++)
				targetDrone.moveForth();
			break;
		case "moveback":
			for (int i = 0; i < moves; i++)
				targetDrone.moveBack();
			break;
		}
		return targetDrone.getFormatedCoordinates();
	}
}	
