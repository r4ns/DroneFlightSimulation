package test;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneBasicTest {

	private int[] boundaries = {50,50,50};
	private int[] startCoordinates = {30, 0, 30};
	
	Drone drone;
	
	@Test
	public void testInitialMoveUp(){
		drone = new Drone();
		
		String expectedCoordinates = "Drone went up to " + (drone.getY() + 1) + " height.";
		
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	@Test 
	public void testInitialMoveLeft(){
		drone = new Drone();
		
		String expectedCoordinates = "Drone went left to " + (drone.getX() - 1) + " x coordinate.";
		
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	
	@Test
	public void testInitialMoveRight(){
		drone = new Drone();
		
		String expectedCoordinates = "Drone went right to " + (drone.getX() + 1) + " x coordinate.";
		
		assertEquals(expectedCoordinates, drone.moveRight());
	}
	
	@Test
	public void testInitialMoveForth(){
		drone = new Drone();
		
		String expectedCoordinates = "Drone moved forward to " + (drone.getZ() - 1) + " z coordinate.";
		
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	
	@Test
	public void testInitialMoveBack(){
		drone = new Drone();
		
		String expectedCoordinates = "Drone moved backwards to " + (drone.getZ() + 1) + " z coordinate.";
		
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	@Test
	public void testInitialMoveDown(){
		drone = new Drone(new int[]{30, 1, 30});
		
		String expectedCoordinates = "Drone went down to " + 0 + " height.";
		
		assertEquals(expectedCoordinates, drone.moveDown());
	}
	
	@Test 
	public void testBoundaryForMoveDown1(){
		drone = new Drone();
		
		String expectedCoordinates = "Drone can't perform this move.";
		
		assertEquals(expectedCoordinates, drone.moveDown());
	}
	
	@Test 
	public void testBoundaryForMoveDown2(){
		drone = new Drone(new int[]{30, 40, 30});
		
		String expectedCoordinates = "Drone can't perform this move.";
		
		assertEquals(expectedCoordinates, drone.moveDown());
	}
	
	@Test 
	public void testBoundaryForMoveBack1(){
		drone = new Drone(new int[]{0, 0, 50});
		
		String expectedCoordinates = "Drone can't perform this move.";
		
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	@Test 
	public void testBoundaryForMoveBack2(){
		drone = new Drone(new int[]{11, 11, 10});
		
		String expectedCoordinates = "Drone can't perform this move.";
		
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	@Test 
	public void testBoundaryForMoveForth1(){
		drone = new Drone(new int[]{0 ,0 , 0});
		
		String expectedCoordinates = "Drone can't perform this move.";
		
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	
	@Test 
	public void testBoundaryForMoveForth2(){
		drone = new Drone(new int[]{11 , 11, 40});
		
		String expectedCoordinates = "Drone can't perform this move.";
		
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	
	@Test 
	public void testBoundaryForMoveUp1(){
		drone = new Drone(new int[]{25 , 10, 25});
		
		String expectedCoordinates = "Drone can't perform this move.";
		
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	@Test 
	public void testBoundaryForMoveUp2(){
		drone = new Drone(new int[]{25 , 50, 25});
		
		String expectedCoordinates = "Drone can't perform this move.";
		
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	@Test 
	public void testBoundaryForMoveLeft1(){
		drone = new Drone(new int[]{0 , 50, 25});
		
		String expectedCoordinates = "Drone can't perform this move.";
		
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	
	@Test 
	public void testBoundaryForMoveLeft2(){
		drone = new Drone(new int[]{40 , 25, 25});
		
		String expectedCoordinates = "Drone can't perform this move.";
		
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	
	@Test 
	public void testBoundaryForMoveRight1(){
		drone = new Drone(new int[]{10 , 25, 25});
		
		String expectedCoordinates = "Drone can't perform this move.";
		
		assertEquals(expectedCoordinates, drone.moveRight());
	}
	
	@Test 
	public void testBoundaryForMoveRight2(){
		drone = new Drone(new int[]{50 , 25, 25});
		
		String expectedCoordinates = "Drone can't perform this move.";
		
		assertEquals(expectedCoordinates, drone.moveRight());
	}
}
