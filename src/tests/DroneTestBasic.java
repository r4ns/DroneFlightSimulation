package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneTestBasic {

	private int[] startCoordinates = { 30, 0, 30 };
	Drone drone;

	// Tests below test initial move directions of drone
	@Test
	public void testInitialMoveUp() {
		drone = new Drone();
		String expectedCoordinates = "Drone position : (" + startCoordinates[0] + ","
				+ Integer.toString((startCoordinates[1] + 1)) + "," + startCoordinates[2] + ")";

		assertEquals(expectedCoordinates, drone.moveUp());
	}

	@Test
	public void testInitialMoveDown() {
		drone = new Drone();
		String expectedCoordinates = "Drone position : (" + startCoordinates[0] + ","
				+ Integer.toString((startCoordinates[1])) + "," + startCoordinates[2] + ")";
		drone.moveUp();
		assertEquals(expectedCoordinates, drone.moveDown());
	}

	@Test
	public void testInitialMoveLeft() {
		drone = new Drone();
		String expectedCoordinates = "Drone position : (" + Integer.toString(startCoordinates[0] - 1) + ","
				+ startCoordinates[1] + "," + startCoordinates[2] + ")";
		assertEquals(expectedCoordinates, drone.moveLeft());
	}

	@Test
	public void testInitialMoveRight() {
		drone = new Drone();
		String expectedCoordinates = "Drone position : (" + Integer.toString(startCoordinates[0] + 1) + ","
				+ startCoordinates[1] + "," + startCoordinates[2] + ")";
		assertEquals(expectedCoordinates, drone.moveRight());
	}

	@Test
	public void testInitialMoveForth() {
		drone = new Drone();
		String expectedCoordinates = "Drone position : (" + startCoordinates[0] + "," + startCoordinates[1] + ","
				+ Integer.toString(startCoordinates[2] - 1) + ")";
		assertEquals(expectedCoordinates, drone.moveForth());
	}

	@Test
	public void testInitialMoveBack() {
		drone = new Drone();
		String expectedCoordinates = "Drone position : (" + startCoordinates[0] + "," + startCoordinates[1] + ","
				+ Integer.toString(startCoordinates[2] + 1) + ")";
		assertEquals(expectedCoordinates, drone.moveBack());
	}

	// Tests below test behaviour of drone when it hits boundaries
	@Test
	public void testBoundariesMoveDown() {
		drone = new Drone();
		String expectedCoordinates = "Drone position : (" + startCoordinates[0] + ","
				+ Integer.toString((startCoordinates[1])) + "," + startCoordinates[2] + ")";

		assertEquals(expectedCoordinates, helperMoveToBoundaries("movedown", 70, drone));
	}

	@Test
	public void testBoundariesMoveLeft() {
		drone = new Drone();
		String expectedCoordinates = "Drone position : (" + Integer.toString(0) + "," + startCoordinates[1] + ","
				+ startCoordinates[2] + ")";
		assertEquals(expectedCoordinates, helperMoveToBoundaries("moveleft", 70, drone));
	}

	@Test
	public void testBoundariesMoveRight() {
		drone = new Drone();
		String expectedCoordinates = "Drone position : (" + Integer.toString(50) + "," + startCoordinates[1] + ","
				+ startCoordinates[2] + ")";
		assertEquals(expectedCoordinates, helperMoveToBoundaries("moveright", 70, drone));
	}

	@Test
	public void testBoundariesMoveForth() {
		drone = new Drone();
		String expectedCoordinates = "Drone position : (" + startCoordinates[0] + "," + startCoordinates[1] + ","
				+ Integer.toString(0) + ")";
		assertEquals(expectedCoordinates, helperMoveToBoundaries("moveforth", 70, drone));
	}

	@Test
	public void testBoundariesMoveBack() {
		drone = new Drone();
		String expectedCoordinates = "Drone position : (" + startCoordinates[0] + "," + startCoordinates[1] + ","
				+ Integer.toString(50) + ")";
		assertEquals(expectedCoordinates, helperMoveToBoundaries("moveback", 70, drone));
	}

	private String helperMoveToBoundaries(String direction, int moves, Drone targetDrone) {
		switch (direction.toLowerCase()) {
		case "moveup":
			for (int i = 0; i < moves; i++)
				targetDrone.moveUp();
			break;
		case "movedown":
			for (int i = 0; i < moves; i++)
				targetDrone.moveDown();
			break;
		case "moveleft":
			for (int i = 0; i < moves; i++)
				targetDrone.moveLeft();
			break;
		case "moveright":
			for (int i = 0; i < moves; i++)
				targetDrone.moveRight();
			break;
		case "moveforth":
			for (int i = 0; i < moves; i++)
				targetDrone.moveForth();
			break;
		case "moveback":
			for (int i = 0; i < moves; i++)
				targetDrone.moveBack();
			break;
		}
		return targetDrone.getFormatedCoordinates();
	}

}
