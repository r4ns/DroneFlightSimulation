package tests;

import org.junit.Test;
import static org.junit.Assert.*;


import space.DoubleCubeDrone;

public class doubleCubeDroneBasicValueTest {
	
	
	private int[] firstStartCoordinates = {9,7,35};
	private int[] secondStartCoordinates = {39,8,39};
	
	DoubleCubeDrone drone;
	
	@Test
	public void testDoubleCubeDroneUpBoundary(){

		drone = new DoubleCubeDrone(9, 7, 35);
		
		String expectedCoordinates = "Drone position(Position one:"+ DoubleCubeDrone.tDoleDesno.getX()+1+","+ DoubleCubeDrone.tDoleDesno.getY()+","+ DoubleCubeDrone.tDoleDesno.getZ() +
				" Position two:"+ DoubleCubeDrone.tSrednjaDesno.getX()+1+","+DoubleCubeDrone.tSrednjaDesno.getY()+","+DoubleCubeDrone.tSrednjaDesno.getZ() +
				" Position three:"+ DoubleCubeDrone.tSrednjaLevo.getX()+1+","+DoubleCubeDrone.tSrednjaLevo.getY()+","+DoubleCubeDrone.tSrednjaLevo.getZ() +
				" Position four:"+ DoubleCubeDrone.tGoreLevo.getX()+1+","+DoubleCubeDrone.tGoreLevo.getY()+","+DoubleCubeDrone.tGoreLevo.getZ()+")";
		
		
		assertEquals(expectedCoordinates, drone.moveUp());
	}
}
