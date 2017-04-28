package test;

import static org.junit.Assert.*;

import org.junit.Test;

import space.Cube;

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
		cube = new Cube(new int[]{3,3,3}, 5);
		
		Cube testCube = new Cube(new int[]{2,2,2}, 5);
		assertEquals(cube.checkCubeIntersection(testCube), true);
	}
	@Test
	public void testIfCubesAreTouchingFromInsideInOnePoint()
	{
		//implementacija
		cube = new Cube(new int[]{2, 2, 2}, 10);
		
		Cube testCube = new Cube(new int[]{1, 1, 1}, 10);
		assertEquals(cube.checkIfCubesAreTouching(testCube), false);
	}
	@Test
	public void testIfCubesAreTouchingFromInsideAlongOneCubeSide()
	{
		cube = new Cube(new int[] {0,0,0}, 10);
		Cube testCube = new Cube(new int[]{5,0,0}, 5);
		
		assertEquals(cube.checkIfCubesAreTouchingFromInside(testCube), true);
	}
	@Test
	public void testIfCubesAreTouchingFromOutsideInOnePoint()
	{
	
		cube = new Cube(new int[]{0,0,0}, 5);
		
		Cube testCube = new Cube(new int[]{5,5,5}, 10);
		assertEquals(cube.checkIfCubesAreTouchingFromOutside(testCube), true);
	}
	
	@Test
	public void testIfCubesAreTouchingFromOutsideAlongOneCubeSide()
	{
		cube = new Cube(new int[]{0,0,0}, 5);
		
		Cube testCube = new Cube(new int[]{5,0,0}, 5);
		assertEquals(cube.checkIfCubesAreTouchingFromOutside(testCube), true);
	}
	@Test
	public void testIfCubesAreTouchingFromOutside()
	{
		cube = new Cube(new int[] {0,0,0}, 5);
		
		Cube testCube = new Cube(new int[] {5,5,1}, 3);
		assertEquals(cube.checkIfCubesAreTouchingFromOutside(testCube), true);
	}
	@Test
	public void testIfCubesAreTouchingFromInside()
	{
		cube = new Cube(new int[]{0,0,0}, 15);
		Cube testCube = new Cube(new int[]{10,10,10}, 5);
		
		assertEquals(cube.checkIfCubesAreTouchingFromInside(testCube), true);
	}
}
