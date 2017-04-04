package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.DoubleCubeDrone;
import drone.Drone;

public class DroneDoubleCubeTest {
	
	private int[] startCoordinates = {30, 0, 30};
	
	Drone a = new Drone(startCoordinates);
	
	DoubleCubeDrone dron = new DoubleCubeDrone(a);
	
	@Test
	public void testGranicaDonjaMoveUp1() {
		int[] startCoordinates = {9, 7, 35};
		
		a = new Drone(startCoordinates);
		
		dron = new DoubleCubeDrone(a);
		
		dron.moveUp();
		
		String expectedCoordinates = "(9,8,35) ";

		assertEquals(expectedCoordinates, dron.getCoordinates());
		
	}
	
	@Test
	public void testGranicaDonjaMoveUp2() {
		int[] startCoordinates = {39,8,39};
		
		a = new Drone(startCoordinates);
		
		dron = new DoubleCubeDrone(a);
		
		dron.moveUp();
		
		String expectedCoordinates = "(39,8,39) ";

		assertEquals(expectedCoordinates, dron.getCoordinates());
	}
	
	
}
