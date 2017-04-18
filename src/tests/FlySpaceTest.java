package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import space.DoubleCubeDrone;
import space.FlySpace;

public class FlySpaceTest {
	FlySpace flyspace;
	@Test
	public void testOuterDimIsNull()
	{
		flyspace= new FlySpace(null,null);
		String expectedBoundaries = "Cube dimensions: ( 1, 1, 1 )";
		assertEquals(expectedBoundaries, flyspace.getOuterDim());
	}

}
