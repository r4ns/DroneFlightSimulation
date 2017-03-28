package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;


public class DroneBasicTest {
	
	Drone drone;
	private int[]  boundaries = {50,50,50};
	private int[] startCoordinates = {30,0,30};
	
	@Test
	public void  testInitialMoveUp() {
		
		drone = new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates = "(" 
					+ Integer.toString(startCoordinates[0]) + ", "
					+ Integer.toString(startCoordinates[1] + 1) + ", "
					+ Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveUp());
		
	}
	
	@Test
	public void testMoveUpHitBottomInnerSquareBorder() {
		
		startCoordinates[1]=10;
		drone = new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates = "("
					+ Integer.toString(startCoordinates[0]) + ", "
					+ Integer.toString(startCoordinates[1]) + ", " 
					+ Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveUp());

	}
	
	@Test
	public void testMoveUpHitBottomOuterSquareBorder() {
		
		startCoordinates[1]=50;
		drone = new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates = "("
					+ Integer.toString(startCoordinates[0]) + ", "
					+ Integer.toString(startCoordinates[1]) + ", " 
					+ Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveUp());

	}
	
	
	@Test
	public void testInitialMoveDown() {
	
		startCoordinates[1]=10;
		drone = new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates = "(" 
					+ Integer.toString(startCoordinates[0]) + ", "
						+ Integer.toString(startCoordinates[1] - 1) + ", "
							+ Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveDown());
		
	}
	
	@Test
	public void testMoveDownHitBottomInnerSquareBorder() {
		
		startCoordinates[1]=40;
		drone = new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates = "("
					+ Integer.toString(startCoordinates[0]) + ", "
					+ Integer.toString(startCoordinates[1]) + ", " 
					+ Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveDown());
		
	}
	
	@Test
	public void testMoveDownHitBottomOuterSquareBorder() {
		
		startCoordinates[1]=0;
		drone = new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates = "("
					+ Integer.toString(startCoordinates[0]) + ", "
					+ Integer.toString(startCoordinates[1]) + ", " 
					+ Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, drone.moveDown());
		
	}
	
	
	@Test
	public void testInitialMoveLeft() {
		
		startCoordinates[0]=10;
		drone = new Drone(boundaries, startCoordinates);
			
		String expectedCoordinates = "(" 
					+ Integer.toString(startCoordinates[0] - 1) + ", "
					+ Integer.toString(startCoordinates[1]) + ", "
					+ Integer.toString(startCoordinates[2]) + ")";
			
		assertEquals(expectedCoordinates, drone.moveLeft());
		
	}
	
	@Test
	public void testMoveLeftHitBottomInnerSquareBorder() {
		
		startCoordinates[0]=40;
		startCoordinates[1]=30;
		drone = new Drone(boundaries, startCoordinates);
			
		String expectedCoordinates = "(" 
					+ Integer.toString(startCoordinates[0]) + ", "
					+ Integer.toString(startCoordinates[1]) + ", "
					+ Integer.toString(startCoordinates[2]) + ")";
			
		assertEquals(expectedCoordinates, drone.moveLeft());
		
	}
	
	@Test
	public void testMoveLeftHitBottomOuterSquareBorder() {
		
		startCoordinates[0]=0;
		drone = new Drone(boundaries, startCoordinates);
			
			String expectedCoordinates = "(" 
						+ Integer.toString(startCoordinates[0]) + ", "
						+ Integer.toString(startCoordinates[1]) + ", "
						+ Integer.toString(startCoordinates[2]) + ")";
			
			assertEquals(expectedCoordinates, drone.moveLeft());
		
	}
	
	
	@Test
	public void testInitalMoveRight() {
		
		startCoordinates[0]=0;
		drone = new Drone(boundaries, startCoordinates);
			
		String expectedCoordinates = "(" 
					+ Integer.toString(startCoordinates[0] + 1) + ", "
					+ Integer.toString(startCoordinates[1]) + ", "
					+ Integer.toString(startCoordinates[2]) + ")";
			
		assertEquals(expectedCoordinates, drone.moveRight());
		
	}
	
	@Test
	public void testMoveRighttHitBottomInnerSquareBorder() {
		
		startCoordinates[0]=10;
		startCoordinates[1]=30;
		drone = new Drone(boundaries, startCoordinates);
			
		String expectedCoordinates = "(" 
					+ Integer.toString(startCoordinates[0]) + ", "
					+ Integer.toString(startCoordinates[1]) + ", "
					+ Integer.toString(startCoordinates[2]) + ")";
			
		assertEquals(expectedCoordinates, drone.moveRight());
		
	}
	
	@Test
	public void testMoveRighttHitBottomOuterSquareBorder() {
		
		startCoordinates[0]=50;
		drone = new Drone(boundaries, startCoordinates);
			
		String expectedCoordinates = "(" 
					+ Integer.toString(startCoordinates[0]) + ", "
					+ Integer.toString(startCoordinates[1]) + ", "
					+ Integer.toString(startCoordinates[2]) + ")";
			
		assertEquals(expectedCoordinates, drone.moveRight());
		
	}
	
	@Test
	public void testInitialMoveBack() {
		
		startCoordinates[2]=0;
		drone = new Drone(boundaries, startCoordinates);
			
		String expectedCoordinates = "(" 
					+ Integer.toString(startCoordinates[0]) + ", "
					+ Integer.toString(startCoordinates[1]) + ", "
					+ Integer.toString(startCoordinates[2] + 1) + ")";
			
		assertEquals(expectedCoordinates, drone.moveBack());
		
	}
	
	@Test
	public void testMoveBackHitBottomInnerSquareBorder() {
		
		startCoordinates[2]=10;
		startCoordinates[1]=30;
		drone = new Drone(boundaries, startCoordinates);
			
		String expectedCoordinates = "(" 
					+ Integer.toString(startCoordinates[0]) + ", "
					+ Integer.toString(startCoordinates[1]) + ", "
					+ Integer.toString(startCoordinates[2]) + ")";
			
		assertEquals(expectedCoordinates, drone.moveBack());
		
	}
	
	@Test 
	public void testMoveBackHitBottomOuterSquareBorder() {
		
		startCoordinates[2]=50;
		drone = new Drone(boundaries, startCoordinates);
			
		String expectedCoordinates = "(" 
					+ Integer.toString(startCoordinates[0]) + ", "
					+ Integer.toString(startCoordinates[1]) + ", "
					+ Integer.toString(startCoordinates[2]) + ")";
			
		assertEquals(expectedCoordinates, drone.moveBack());
		
	}
	
	
	@Test
	public void testInitialMoveForth() {
	
		startCoordinates[2]=10;
		drone = new Drone(boundaries, startCoordinates);
			
		String expectedCoordinates = "(" 
					+ Integer.toString(startCoordinates[0]) + ", "
					+ Integer.toString(startCoordinates[1]) + ", "
					+ Integer.toString(startCoordinates[2] - 1) + ")";
			
		assertEquals(expectedCoordinates, drone.moveForth());
		
	}
	
	@Test
	public void testMoveForthHitBottomInnerSquareBorder() {
		
		startCoordinates[2]=40;
		startCoordinates[1]=30;
		drone = new Drone(boundaries, startCoordinates);
			
		String expectedCoordinates = "(" 
					+ Integer.toString(startCoordinates[0]) + ", "
					+ Integer.toString(startCoordinates[1]) + ", "
					+ Integer.toString(startCoordinates[2]) + ")";
			
		assertEquals(expectedCoordinates, drone.moveForth());
		
	}
	
	@Test 
	public void testMoveForthHitBottomOuterSquareBorder() {
		
		startCoordinates[2]=0;
		drone = new Drone(boundaries, startCoordinates);
			
		String expectedCoordinates = "(" 
					+ Integer.toString(startCoordinates[0]) + ", "
					+ Integer.toString(startCoordinates[1]) + ", "
					+ Integer.toString(startCoordinates[2]) + ")";
			
		assertEquals(expectedCoordinates, drone.moveForth());
		
	}
	
		
}
	
	
	

