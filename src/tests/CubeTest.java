package tests;

import org.junit.Test;
import static org.junit.Assert.*;

import drone.Cube;


public class CubeTest {

		Cube cube; 
		
		@Test
		public void testIfCoordinatesAreInCube()
		{
			cube = new Cube(new int[]{0,0,0},5);
			assertTrue(cube.checkCoordinates(new int[]{1,1,1}));
		
		}
		
		@Test
		public void testIfCubeIsInSomePartContainedInOtherCube()
		{
			cube = new Cube(new int[]{0,0,0},5);
			assertTrue(cube.checkCubeIntersection(new Cube(new int[]{1,1,1}, 7)));
		}
		@Test
		public void testIfCubesAreTouchingFromInsideInOnePoint()
		{
			cube = new Cube(new int[]{0,0,0},50);
			Cube cubeForTesting = new Cube(new int[]{40,0,40},10);
			assertTrue(cube.checkIfCubesAreTouchingFromInside(cubeForTesting));
		}
		@Test
		public void testIfCubesAreTouchingFromInsideAlongOneCubeSide()
		{
			cube = new Cube(new int[]{0,0,0},50);
			Cube cubeForTesting = new Cube(new int[]{0,10,10},2);
			assertTrue(cube.checkIfCubesAreTouchingFromInside(cubeForTesting));
		}
		@Test
		public void testIfCubesAreTouchingFromOutsideInOnePoint()
		{
			cube = new Cube(new int[]{10,10,10},50);
			Cube cubeForTesting = new Cube(new int[]{60,0,0},10);
			assertTrue(cube.checkIfCubesAreTouchingFromOutside(cubeForTesting));
		}
		
		@Test
		public void testIfCubesAreTouchingFromOutsideAlongOneCubeSide()
		{
			cube = new Cube(new int[]{0,0,0},50);
			Cube cubeForTesting = new Cube(new int[]{30,50,30},10);
			assertTrue(cube.checkIfCubesAreTouchingFromOutside(cubeForTesting));
		}
		@Test
		public void testIfCubesAreTouchingFromOutside()
		{
			cube = new Cube(new int[]{50,50,50},100);
			Cube cubeForTesting = new Cube(new int[]{51,20,150},40);
			assertTrue(cube.checkIfCubesAreTouchingFromOutside(cubeForTesting));
		}
		@Test
		public void testIfCubesAreTouchingFromInside()
		{
			cube = new Cube(new int[]{0,0,0},50);
			Cube cubeForTesting = new Cube(new int[]{0,30,30},5);
			assertTrue(cube.checkIfCubesAreTouchingFromInside(cubeForTesting));
		}

	}


