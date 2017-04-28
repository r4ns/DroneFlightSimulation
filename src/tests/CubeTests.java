package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import space.Cube;

public class CubeTests {
	Cube cube;
	@Test
	public void testIfCoordinatesAreInCube()
	{
		cube = new Cube(new int[] {10,20,30}, 10);
		assertTrue(cube.checkCoordinates(new int[] {15,25,35}));
	}
	@Test
	public void testIfCubeIsInSomePartContainedInOtherCube()
	{
		cube = new Cube(new int[] {10,20,30}, 10);
		assertTrue(cube.checkCubeIntersection(new Cube(new int[] {15,25,35}, 10)));
	}
	@Test
	public void testIfCubesAreTouchingFromInsideInOnePoint()
	{
		cube = new Cube(new int[] {0,0,0}, 50);
		assertTrue(cube.checkIfCubesAreTouchingFromInside(new Cube(new int[] {40,0,40},10)));
	}
	@Test
	public void testIfCubesAreTouchingFromInsideAlongOneCubeSide()
	{
		cube = new Cube(new int[] {10,20,30}, 10);
		assertTrue(cube.checkIfCubesAreTouchingFromInside(new Cube(new int[] {15,20,30}, 5)));
	}
	@Test
	public void testIfCubesAreTouchingFromOutsideInOnePoint()
	{
		cube = new Cube(new int[]{10,10,10},50);
		assertTrue(cube.checkIfCubesAreTouchingFromOutside(new Cube(new int[] {60,0,0},10)));
	}
	@Test
	public void testIfCubesAreTouchingFromOutsideAlongOneCubeSide()
	{
		cube = new Cube(new int[]{0,0,0},50);
		assertTrue(cube.checkIfCubesAreTouchingFromOutside(new Cube(new int[] {30,50,50},20)));
	}
	@Test
	public void testIfCubesAreTouchingFromOutside()
	{
		cube = new Cube(new int[]{50,50,50},100);
		assertTrue(cube.checkIfCubesAreTouchingFromOutside(new Cube(new int[]{51,20,150},40)));
	}
	@Test
	public void testIfCubesAreTouchingFromInside()
	{
		cube = new Cube(new int[]{0,0,0},50);
		assertTrue(cube.checkIfCubesAreTouchingFromInside(new Cube(new int[]{0,30,30},5)));
	}
}