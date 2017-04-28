package space;

import static org.junit.Assert.*;

import org.junit.Test;


public class CubeTest {
	
	Cube cube;
	
	@Test
	public void testIfCoordinatesAreInCube()
	{
		cube = new Cube(new int[]{0,0,0}, 5);		
		assertEquals(cube.checkCoordinates(new int[]{0,5,0}), true);
	}
	
	@Test
	public void testIfCubeIsInSomePartContainedInOtherCube()
	{
		cube = new Cube(new int[]{0,0,0}, 10);		
		Cube cube2 = new Cube(new int[]{1,1,1}, 10);
		assertEquals(cube.checkCubeIntersection(cube2), true); 
	}
	
	@Test
	public void testIfCubesAreTouchingFromInsideInOnePoint()
	{
		cube = new Cube(new int[]{0,5,0}, 10);		
		Cube cube2 = new Cube(new int[]{0,5,0}, 5);
		assertEquals(cube.checkIfCubesAreTouchingFromInside(cube2), true); 
	}
	
	@Test
	public void testIfCubesAreTouchingFromInsideAlongOneCubeSide()
	{
		cube = new Cube(new int[]{0,0,0}, 10);		
		Cube cube2 = new Cube(new int[]{5,0,0}, 5);
		assertEquals(cube.checkIfCubesAreTouchingFromInside(cube2), true); 
	}
	
	@Test
	public void testIfCubesAreTouchingFromOutsideInOnePoint()
	{
		cube = new Cube(new int[]{20,10,10}, 10);		
		Cube cube2 = new Cube(new int[]{20,20,20}, 5);
		assertEquals(cube.checkIfCubesAreTouchingFromOutside(cube2), true); 
	}
	
	@Test
	public void testIfCubesAreTouchingFromOutsideAlongOneCubeSide()
	{
		cube = new Cube(new int[]{10,10,10}, 10);		
		Cube cube2 = new Cube(new int[]{5,10,10}, 5);
		assertEquals(cube.checkIfCubesAreTouchingFromOutside(cube2), true); 
	}
	
	@Test
	public void testIfCubesAreTouchingFromOutside()
	{
		cube = new Cube(new int[]{30,30,30}, 10);		
		Cube cube2 = new Cube(new int[]{40,40,40}, 5);
		assertEquals(cube.checkIfCubesAreTouchingFromOutside(cube2), true); 
	}
	
	@Test
	public void testIfCubesAreTouchingFromInside()
	{
		cube = new Cube(new int[]{0,0,0}, 10);		
		Cube cube2 = new Cube(new int[]{5,5,5}, 5);
		assertEquals(cube.checkIfCubesAreTouchingFromInside(cube2), true); 
	}
}
