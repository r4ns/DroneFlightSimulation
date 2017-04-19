package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import space.Cube;

public class CubeTest {
	Cube cube;    
	
	@Test  
	public void testIfCoordinatesAreInCube()  
	{  
		int x = 20;
		cube = new Cube( new int[] {10,10,10},x );
		boolean expected = true;
		assertEquals(expected, cube.pointWithinCube(new int[] {20,20,20}));
	}

}
