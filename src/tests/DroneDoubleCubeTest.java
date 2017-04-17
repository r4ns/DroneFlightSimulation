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
	public void testGranicaDonjaMoveUpUdaraGranicu() {
		int[] startCoordinates = {9, 7, 35};
		
		a = new Drone(startCoordinates);
		
		dron = new DoubleCubeDrone(a);
		
		dron.moveUp();
		
		String expectedCoordinates = "(9,8,35) ";

		assertEquals(expectedCoordinates, dron.getCoordinates());
		
	}
	
	@Test
	public void testGranicaGornjaMoveDownUdaraGranicu() {
		int[] startCoordinates = {30, 40, 30};
		
		a = new Drone(startCoordinates);
		
		dron = new DoubleCubeDrone(a);
		
		dron.moveDown();
		
		String expectedCoordinates = "(30,40,30) ";

		assertEquals(expectedCoordinates, dron.getCoordinates());
		
	}
	
	@Test
	public void testGranicaDonjaMoveRightUdaraGranicu() {
		int[] startCoordinates = {8, 30, 35};
		
		a = new Drone(startCoordinates);
		
		dron = new DoubleCubeDrone(a);
		
		dron.moveRight();
		
		String expectedCoordinates = "(8,30,35) ";

		assertEquals(expectedCoordinates, dron.getCoordinates());
		
	}
	
	@Test
	public void testGranicaDonjaMoveForthUdaraGranicu() {
		int[] startCoordinates = {30, 30, 40};
		
		a = new Drone(startCoordinates);
		
		dron = new DoubleCubeDrone(a);
		
		dron.moveForth();
		
		String expectedCoordinates = "(30,30,40) ";

		assertEquals(expectedCoordinates, dron.getCoordinates());
		
	}
	
	@Test
	public void testGranicaDonjaMoveBackUdaraGranicu() {
		int[] startCoordinates = {30, 30, 9};
		
		a = new Drone(startCoordinates);
		
		dron = new DoubleCubeDrone(a);
		
		dron.moveBack();
		
		String expectedCoordinates = "(30,30,9) ";

		assertEquals(expectedCoordinates, dron.getCoordinates());
		
	}
	
	@Test
	public void testGranicaGornjaMoveLeftUdaraGranicu() {
		int[] startCoordinates = {40, 30, 30};
		
		a = new Drone(startCoordinates);
		
		dron = new DoubleCubeDrone(a);
		
		dron.moveLeft();
		
		String expectedCoordinates = "(40,30,30) ";

		assertEquals(expectedCoordinates, dron.getCoordinates());
		
	}
	
	@Test
	public void testGranicaDonjaMoveUpIvicaProlazi() {
		int[] startCoordinates = {39,8,39};
		
		a = new Drone(startCoordinates);
		
		dron = new DoubleCubeDrone(a);
		
		dron.moveUp();
		
		String expectedCoordinates = "(39,9,39) ";

		assertEquals(expectedCoordinates, dron.getCoordinates());
	}
	
	
}
