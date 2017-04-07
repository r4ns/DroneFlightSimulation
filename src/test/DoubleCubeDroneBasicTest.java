package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import drone.Drone;
import space.DoubleCubeDrone;

public class DoubleCubeDroneBasicTest {

	DoubleCubeDrone drone;
	@Test 
	public void testBoundaryForMoveUp1(){
		drone = new DoubleCubeDrone(new int[]{39, 8, 39});
		
		String expectedCoordinates = "Drone can't perform this move.";
		
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	@Test 
	public void testBoundaryForMoveUp2(){
		drone = new DoubleCubeDrone(new int[]{9, 8, 35});
		
		String expectedCoordinates = "Drone can't perform this move.";
		
		assertEquals(expectedCoordinates, drone.moveUp());
	}
}
