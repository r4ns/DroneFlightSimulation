package tests;

import org.junit.Test;
import static org.junit.Assert.*;

import drone.Drone;

public class DroneBasicTest {
	//private int[] boundaries = {50, 50, 50};
	private int[] startCoordinates = {30, 0, 30};
	Drone drone;
	
	@Test
	public void testInitialMoveUp(){
		drone = new Drone();
		//drone.setBoundaries(boundaries);
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(startCoordinates[0]) + ", "
				+ Integer.toString(startCoordinates[1] + 1) + ", "
				+ Integer.toString(startCoordinates[2]) + ")";
				
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	@Test
	public void testInitialMoveDown(){
		drone = new Drone();
		//drone.setBoundaries(boundaries);
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(startCoordinates[0]) + ", "
				+ Integer.toString(startCoordinates[1]) + ", "
				+ Integer.toString(startCoordinates[2]) + ")";
				
		assertEquals(expectedCoordinates, drone.moveDown());
	}
	
	@Test
	public void testInitialMoveRight(){
		drone = new Drone();
		//drone.setBoundaries(boundaries);
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(startCoordinates[0] + 1) + ", "
				+ Integer.toString(startCoordinates[1]) + ", "
				+ Integer.toString(startCoordinates[2]) + ")";
				
		assertEquals(expectedCoordinates, drone.moveRight());
	}
	
	@Test
	public void testInitialMoveLeft(){
		drone = new Drone();
		//drone.setBoundaries(boundaries);
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(startCoordinates[0] - 1) + ", "
				+ Integer.toString(startCoordinates[1]) + ", "
				+ Integer.toString(startCoordinates[2]) + ")";
				
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	
	@Test
	public void testInitialMoveForth(){
		drone = new Drone();
		//drone.setBoundaries(boundaries);
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(startCoordinates[0]) + ", "
				+ Integer.toString(startCoordinates[1]) + ", "
				+ Integer.toString(startCoordinates[2] - 1) + ")";
				
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	
	@Test
	public void testInitialMoveBack(){
		drone = new Drone();
		//drone.setBoundaries(boundaries);
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(startCoordinates[0]) + ", "
				+ Integer.toString(startCoordinates[1]) + ", "
				+ Integer.toString(startCoordinates[2] + 1) + ")";
				
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	@Test
	public void testUpperBoundaries(){
		drone = new Drone();
		//drone.setBoundaries(boundaries);
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(startCoordinates[0]) + ", "
				+ Integer.toString(startCoordinates[1] + 10) + ", "
				+ Integer.toString(startCoordinates[2]) + ")";
		for (int i = 0; i < 12; i++){
			drone.moveUp();
		}
		
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
	}
	
	@Test
	public void testBottomBoundaries(){
		drone = new Drone();
		//drone.setBoundaries(boundaries);
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(startCoordinates[0]) + ", "
				+ Integer.toString(startCoordinates[1]) + ", "
				+ Integer.toString(startCoordinates[2]) + ")";
		for (int i = 0; i < 5; i++){
			drone.moveDown();
		}
		
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
	}
	
	@Test
	public void testRightBoundaries(){
		drone = new Drone();
		//drone.setBoundaries(boundaries);
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(startCoordinates[0] + 20) + ", "
				+ Integer.toString(startCoordinates[1]) + ", "
				+ Integer.toString(startCoordinates[2]) + ")";
		for (int i = 0; i < 22; i++){
			drone.moveRight();
		}
		
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
	}
	
	@Test
	public void testLeftBoundaries(){
		drone = new Drone();
		//drone.setBoundaries(boundaries);
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(startCoordinates[0] - 30) + ", "
				+ Integer.toString(startCoordinates[1]) + ", "
				+ Integer.toString(startCoordinates[2]) + ")";
		for (int i = 0; i < 32; i++){
			drone.moveLeft();
		}
		
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
	}
	
	@Test
	public void testForthBoundaries(){
		drone = new Drone();
		//drone.setBoundaries(boundaries);
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(startCoordinates[0]) + ", "
				+ Integer.toString(startCoordinates[1]) + ", "
				+ Integer.toString(startCoordinates[2] - 30) + ")";
		for (int i = 0; i < 32; i++){
			drone.moveForth();
		}
		
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
	}
	
	@Test
	public void testBackBoundaries(){
		drone = new Drone();
		//drone.setBoundaries(boundaries);
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(startCoordinates[0]) + ", "
				+ Integer.toString(startCoordinates[1]) + ", "
				+ Integer.toString(startCoordinates[2] + 20) + ")";
		for (int i = 0; i < 22; i++){
			drone.moveBack();
		}
		
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
	}
}