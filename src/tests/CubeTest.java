package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import util.Cube;

public class CubeTest {
	
	Cube cube;

	@Test
	public void testIfCoordinatesAreInCube()
	{
		cube = new Cube(new int[] {10,10,10}, 2);
		assertTrue(cube.checkCoordinates(new int[]{11,11,11}));
	}
	@Test
	public void testIfCubeIsInSomePartContainedInOtherCube()
	{
		cube = new Cube(new int[] {10,10,10}, 3);
		Cube cube1 = new Cube(new int[] {11,11,11}, 3);;
		
		assertTrue(cube.checkCubeIntersection(cube1));
	}
	@Test
	public void testIfCubesAreTouchingFromInsideInOnePoint()
	{
		cube = new Cube(new int[] {0,0,1}, 1);
		Cube cube1 = new Cube(new int[] {1,1,2}, 2);
		
		assertTrue(cube.checkIfCubesAreTouching(cube1));
	}
	@Test
	public void testIfCubesAreTouchingFromInsideAlongOneCubeSide()
	{
		cube = new Cube(new int[] {1,1,2}, 1);
		Cube cube1 = new Cube(new int[] {1,1,2}, 2);
		
		assertTrue(cube.checkIfCubesAreTouchingFromInside(cube1));
	
	}
	@Test
	public void testIfCubesAreTouchingFromOutsideInOnePoint()
	{
		cube = new Cube(new int[] {39,9,41}, 1);
		Cube cube1 = new Cube(new int[] {40,10,42}, 1);
		assertTrue(cube.checkCubeIntersection(cube1));
	}

	@Test
	public void testIfCubesAreTouchingFromOutsideAlongOneCubeSide()
	{
		cube = new Cube(new int[] {39,9,42}, 1);
		Cube cube1 = new Cube(new int[] {40,10,42}, 1);
		assertTrue(cube.checkCubeIntersection(cube1));
	}
	@Test
	public void testIfCubesAreTouchingFromOutside()
	{
		cube = new Cube(new int[] {0,0,1}, 1);
		Cube cube1 = new Cube(new int[] {1,1,2}, 2);
		
		assertTrue(cube.checkIfCubesAreTouchingFromOutside(cube1));
	}
	@Test
	public void testIfCubesAreTouchingFromInside()
	{
		cube = new Cube(new int[] {1,1,2}, 1);
		Cube cube1 = new Cube(new int[] {1,1,2}, 2);
		
		assertTrue(cube.checkIfCubesAreTouchingFromInside(cube1));
	}

}
