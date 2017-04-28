package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import drone.Drone;
import space.DoubleCubeDrone;

public class DoubleCubeTests {

	private DoubleCubeDrone drone;
	@Test
	public void firstMoveUp(){
		int[] niz={9,7,35};
		drone = new DoubleCubeDrone(niz);
		String expectedCoordinates="("
				+Integer.toString(niz[0])+","
		+Integer.toString(niz[1]+1)+","
		+Integer.toString(niz[2]) + ")";
		assertEquals(expectedCoordinates,drone.moveUp());
		
	}
	
	@Test
	public void secondMoveUp(){
		int[] niz={39,8,39};
		drone = new DoubleCubeDrone(niz);
		String expectedCoordinates="("
				+Integer.toString(niz[0])+","
		+Integer.toString(niz[1]+1)+","
		+Integer.toString(niz[2]) + ")";
		assertEquals(expectedCoordinates,drone.moveUp());
		
	}
}
