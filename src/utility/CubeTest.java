package utility;

import static org.junit.Assert.*;

import org.junit.Test;

public class CubeTest {

	Cube cube;
	
	@Test  
	public void testIfCoordinatesAreInCube()  { 
		
		cube = new Cube(new int[]{0,0,0}, 5);		
		assertEquals(cube.checkCoordinates(new int[]{0,5,0}), true);		
	}
	
	@Test  
	public void testIfCubeIsInSomePartContainedInOtherCube()  { 
		
		cube = new Cube(new int[]{5,5,5}, 5);		
		Cube testCube = new Cube(new int[]{2,2,2}, 5);
		assertEquals(cube.checkCubeIntersection(testCube), true);  
	}
	
	@Test  
	public void testIfCubesAreTouchingFromInsideInOnePoint()  { 

		cube = new Cube(new int[]{5, 5, 5}, 10);		
		Cube testCube = new Cube(new int[]{4, 4, 4}, 10);
		assertEquals(cube.checkIfCubesAreTouching(testCube), false);
	}
	
	@Test  
	public void testIfCubesAreTouchingFromInsideAlongOneCubeSide()  {
		
		cube = new Cube(new int[] {0,0,0}, 10);
		Cube testCube = new Cube(new int[]{5,0,0}, 5);		
		assertEquals(cube.checkIfCubesAreTouchingFromInside(testCube), true);
	}
	
	@Test  
	public void testIfCubesAreTouchingFromOutsideInOnePoint()  {
		
		cube = new Cube(new int[]{0,0,0}, 5);		
		Cube testCube = new Cube(new int[]{5,5,0}, 10);
		assertEquals(cube.checkIfCubesAreTouchingFromOutside(testCube), true);
	}
	
	@Test 
	public void testIfCubesAreTouchingFromOutsideAlongOneCubeSide()  {
		
		cube = new Cube(new int[]{0,0,0}, 5);		
		Cube testCube = new Cube(new int[]{5,0,0}, 5);
		assertEquals(cube.checkIfCubesAreTouchingFromOutside(testCube), true);
	}
	
	@Test  
	public void testIfCubesAreTouchingFromOutside()  {   
		
		cube = new Cube(new int[] {15,10,10}, 10);		
		Cube testCube = new Cube(new int[] {25,10,10}, 5);
		assertEquals(cube.checkIfCubesAreTouchingFromOutside(testCube), true);
	}
	
	@Test  
	public void testIfCubesAreTouchingFromInside()  {
		
		cube = new Cube(new int[]{0,0,0}, 10);
		Cube testCube = new Cube(new int[]{5,5,5}, 5);		
		assertEquals(cube.checkIfCubesAreTouchingFromInside(testCube), true);
	}
	
	
}
