package tests;


import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;

public class CubeTest {
	
Cube cube;

@Test
public void testIfCoordinatesAreInCube()
{
	cube = new Cube(new int[] {0, 0, 0}, 10);
	assertTrue(cube.checkCoordinates(new int[] {3, 3, 3}));
}
@Test
public void testIfCubeIsInSomePartContainedInOtherCube()
{
	cube = new Cube(new int[] {0, 0, 0}, 10);
	assertTrue(cube.checkCubeIntersection(new Cube(new int[] {9, 9, 9}, 2)));
}
@Test
public void testIfCubesAreTouchingFromInsideInOnePoint()
{
	cube = new Cube(new int[] {0, 0, 0}, 50);
	assertTrue(cube.checkIfCubesAreTouchingFromInside(new Cube(new int[] {0, 0, 0}, 10)));
}
@Test
public void testIfCubesAreTouchingFromInsideAlongOneCubeSide()
{
	cube = new Cube(new int[] {0, 0, 0}, 50);
	assertTrue(cube.checkIfCubesAreTouchingFromInside(new Cube(new int[] {0, 10, 10}, 10)));
}
@Test
public void testIfCubesAreTouchingFromOutsideInOnePoint()
{
	cube = new Cube(new int[] {0, 0, 0}, 50);
	assertTrue(cube.checkIfCubesAreTouchingFromOutside(new Cube(new int[] {60, 60, 60}, 10)));
}

@Test
public void testIfCubesAreTouchingFromOutsideAlongOneCubeSide()
{
	cube = new Cube(new int[] {0, 0, 0}, 50);
	assertTrue(cube.checkIfCubesAreTouchingFromOutside(new Cube(new int[] {60, 60, 60}, 10)));
}
@Test
public void testIfCubesAreTouchingFromOutside()
{
	cube = new Cube(new int[] {0, 0, 0}, 50);
	assertTrue(cube.checkIfCubesAreTouchingFromOutside(new Cube(new int[] {60, 60, 60}, 10)));
}
@Test
public void testIfCubesAreTouchingFromInside()
{
	cube = new Cube(new int[] {0, 0, 0}, 50);
	assertTrue(cube.checkIfCubesAreTouchingFromInside(new Cube(new int[] {40, 40, 40}, 10)));
}
}
