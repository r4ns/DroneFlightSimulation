package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import space.Cube;
import space.DoubleCubeDrone;
import space.FlySpace;

public class DoubleCubeDroneBasicTest {

	DoubleCubeDrone drone;
	@Test 
	public void testBoundaryForMoveUp1(){
		drone = new DoubleCubeDrone(new Cube(new int[]{45,46,45}, 2), new Cube(new int[]{48,48,45}, 1), new FlySpace(50, 40));
		
		String expectedCoordinates = "Drone moved up to " + 47 + " height.";
		
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	@Test 
	public void testBoundaryForMoveUp2(){
		drone = new DoubleCubeDrone(new Cube(new int[]{5, 1, 5}, 1), new Cube(new int[]{6, 2, 5}, 2), new FlySpace(50, 30));
		
		String expectedCoordinates = "Drone moved up to " + 2 + " height.";
		
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	@Test 
	public void testBoundaryForMoveDown(){
		drone = new DoubleCubeDrone(new Cube(new int[]{10, 46, 10}, 1), new Cube(new int[]{10, 47, 10}, 1), new FlySpace(50, 40));
		
		String expectedCoordinates = "Drone moved down to " + 45 + " height.";
		
		assertEquals(expectedCoordinates, drone.moveDown());
	}
	
	@Test
	public void testBoundaryForMoveDown2(){
	drone = new DoubleCubeDrone(new Cube(new int[]{4, 1, 4}, 1), new Cube(new int[]{5, 2, 4}, 1), new FlySpace(50, 40));
		
		String expectedCoordinates = "Drone moved down to " + 0 + " height.";
		
		assertEquals(expectedCoordinates, drone.moveDown());
	}
	
	@Test
	public void testBoundaryForMoveLeft(){
		drone = new DoubleCubeDrone(new Cube(new int[]{1, 1, 4}, 1), new Cube(new int[]{2, 2, 4}, 1), new FlySpace(50, 40));
		
		String expectedCoordinates = "Drone moved left to " + 0 + " x coordinate.";
		
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	
	@Test 
	public void testBoundaryForMoveLeft2(){
		drone = new DoubleCubeDrone(new Cube(new int[]{45, 4, 20}, 1), new Cube(new int[]{46, 5, 20}, 1), new FlySpace(50, 40));
		
		String expectedCoordinates = "Drone moved left to " + 44 + " x coordinate.";
		
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	
	@Test 
	public void testBoundaryForMoveRight(){
		drone = new DoubleCubeDrone(new Cube(new int[]{46, 4, 20}, 1), new Cube(new int[]{47, 5, 20}, 1), new FlySpace(50, 40));
		
		String expectedCoordinates = "Drone moved right to " + 47 + " x coordinate.";
		
		assertEquals(expectedCoordinates, drone.moveRight());
	}
	@Test 
	public void testBoundaryForMoveRight2(){
		drone = new DoubleCubeDrone(new Cube(new int[]{2, 15, 20}, 1), new Cube(new int[]{3, 16, 20}, 1), new FlySpace(50, 40));
		
		String expectedCoordinates = "Drone moved right to " + 3 + " x coordinate.";
		
		assertEquals(expectedCoordinates, drone.moveRight());
	}
	
	@Test 
	public void testBoundaryForMoveForth(){
		drone = new DoubleCubeDrone(new Cube(new int[]{2, 15, 1}, 1), new Cube(new int[]{3, 16, 1}, 1), new FlySpace(50, 40));
		
		String expectedCoordinates = "Drone moved forth to " + 0 + " z coordinate.";
		
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	
	@Test 
	public void testBoundaryForMoveForth2(){
		drone = new DoubleCubeDrone(new Cube(new int[]{25, 25, 46}, 1), new Cube(new int[]{26, 26, 47}, 1), new FlySpace(50, 40));
		
		String expectedCoordinates = "Drone moved forth to " + 45 + " z coordinate.";
		
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	
	@Test 
	public void testBoundaryForMoveBack(){
		drone = new DoubleCubeDrone(new Cube(new int[]{25, 25, 48}, 1), new Cube(new int[]{26, 26, 48}, 1), new FlySpace(50, 40));
		
		String expectedCoordinates = "Drone moved back to " + 49 + " z coordinate.";
		
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	@Test 
	public void testBoundaryForMoveBack2(){
		drone = new DoubleCubeDrone(new Cube(new int[]{25, 25, 3}, 1), new Cube(new int[]{26, 26, 3}, 1), new FlySpace(50, 40));
		
		String expectedCoordinates = "Drone moved back to " + 4 + " z coordinate.";
		
		assertEquals(expectedCoordinates, drone.moveBack());
	}
}
