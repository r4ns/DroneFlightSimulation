package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import space.Cube;

public class CubeTest {
	
	Cube cube;
	@Test
	public void testIfCoordinatesAreInCube(){
		cube = new Cube(new int[] {0, 0, 0}, 10);
		assertTrue(cube.checkCoordinates(new int[] {6, 6, 6}));
	}
	@Test
	public void testIfCubeIsInSomePartContainedInOtherCube(){
		cube = new Cube(new int[] {0, 0, 0}, 10);
		assertTrue(cube.checkCubeIntersection(new Cube(new int[] {6, 6, 6}, 2)));
	}
	@Test
	public void testIfCubesAreTouchingFromInsideInOnePoint(){
		cube = new Cube(new int[] {0, 0, 0}, 20);
		assertTrue(cube.checkIfCubesAreTouchingFromInside(new Cube(new int[] {0, 0, 0},10)));
	}
	@Test
	public void testIfCubesAreTouchingFromInsideAlongOneCubeSide(){
		cube = new Cube(new int[] {0, 0, 0}, 20);
		assertTrue(cube.checkIfCubesAreTouchingFromInside(new Cube(new int[] {10, 10, 0},10)));
	}
	@Test
	public void testIfCubesAreTouchingFromOutsideInOnePoint(){
		cube=new Cube(new int[] {0, 0, 0},10);
		assertTrue(cube.checkIfCubesAreTouchingFromOutside(new Cube(new int[] {20, 20, 0},10)));
	}
	@Test
	public void testIfCubesAreTouchingFromOutsideAlongOneCubeSide(){
		cube=new Cube(new int[] {0, 0, 0},10);
		assertTrue(cube.checkIfCubesAreTouchingFromOutside(new Cube(new int[] {20, 0, 0},10)));
	}
	@Test
	public void testIfCubesAreTouchingFromOutside(){
		cube = new Cube(new int[] {0, 0, 0}, 10);
		assertTrue(cube.checkIfCubesAreTouchingFromOutside(new Cube(new int[] {20, 20, 20}, 10)));
	}
	@Test
	public void testIfCubesAreTouchingFromInside(){
		cube = new Cube(new int[] {0, 0, 0}, 10);
		assertTrue(cube.checkIfCubesAreTouchingFromInside(new Cube(new int[] {5, 5, 5}, 10)));

	}

}
