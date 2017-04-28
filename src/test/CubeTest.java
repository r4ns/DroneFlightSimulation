package test;
import org.junit.Test;
import space.Cube;
import static org.junit.Assert.*;

public class CubeTest {
	Cube cube;

	@Test
	public void testIfCoordinatesAreInCube() {
		cube=new Cube(new int[] {10, 20, 30}, 10);
		assertTrue(cube.checkCoordinates(new int[] {15, 25,35}));
	}

	@Test
	public void testIfCubeIsInSomePartContainedInOtherCube() {
		cube = new Cube(new int[] {10, 20, 30}, 10);
		Cube comparateCube = new Cube (new int[] {0,0,0}, 10);
		assertTrue(cube.checkCubeIntersection(comparateCube));

	}

	@Test
	public void testIfCubesAreTouchingFromInsideInOnePoint() {
		cube = new Cube(new int[] {0,0,0}, 50);
		Cube comparateCube = new Cube (new int[] {40,0,40},10);
		assertTrue(cube.checkIfCubesAreTouchingFromInside(comparateCube));
	}

	@Test
	public void testIfCubesAreTouchingFromInsideAlongOneCubeSide() {
		cube = new Cube(new int[] {10,20,30}, 10);
		Cube comparateCube = new Cube (new int[] {15,20,30},5);
		assertTrue(cube.checkIfCubesAreTouchingFromInside(comparateCube)); 
	}

	@Test
	public void testIfCubesAreTouchingFromOutsideInOnePoint()
	{
		cube = new Cube(new int[]{10,10,10},50);
		Cube comparateCube = new Cube (new int[] {60,0,0},10);
		assertTrue(cube.checkIfCubesAreTouchingFromOutside(comparateCube));
	}

	@Test
	public void testIfCubesAreTouchingFromOutsideAlongOneCubeSide() {
		cube = new Cube(new int[]{0,0,0},50);
		Cube comparateCube = new Cube (new int[] {30,50,50},20);
		assertTrue(cube.checkIfCubesAreTouchingFromOutside(comparateCube));
	}

	@Test
	public void testIfCubesAreTouchingFromOutside() {
		cube = new Cube(new int[]{50,50,50},100);
		Cube comparateCube = new Cube(new int[]{51,20,150},40);
		assertTrue(cube.checkIfCubesAreTouchingFromOutside(comparateCube));
	}

	@Test
	public void testIfCubesAreTouchingFromInside() {
		cube = new Cube(new int[]{0,0,0},50);
		Cube comparateCube = new Cube(new int[]{0,30,30},5);
		assertTrue(cube.checkIfCubesAreTouchingFromInside(comparateCube));
	}
}
