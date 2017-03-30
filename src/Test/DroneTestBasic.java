package Test;

import static org.junit.Assert.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.junit.Test;

import drone.Drone;

public class DroneTestBasic {

	private int[] boundaries = { 50, 50, 50 };
	private int[] coordinates = { 30, 0, 30 };
	private Drone mojDron = new Drone(30, 0, 30);

	@Test(timeout = 1000)
	public void testInitialMoveUp() {
		String expectedCoordinates = "Drone position: (" + Integer.toString(coordinates[0]) + ","
				+ Integer.toString(coordinates[1] + 1) + "," + Integer.toString(coordinates[2]) + ")";
		assertEquals(expectedCoordinates, mojDron.moveUp(1));

	}

	@Test
	public void testInitalMoveDown() {
		String expectedCoordinates = "Drone position: (" + Integer.toString(coordinates[0]) + ","
				+ Integer.toString(coordinates[1]) + "," + Integer.toString(coordinates[2]) + ")";
		assertEquals(expectedCoordinates, mojDron.moveDown(1));
	}

	@Test
	public void testInitalMoveRight() {
		String expectedCoordinates = "Drone position: (" + Integer.toString(coordinates[0] + 1) + ","
				+ Integer.toString(coordinates[1]) + "," + Integer.toString(coordinates[2]) + ")";
		assertEquals(expectedCoordinates, mojDron.moveRight(1));
	}

	@Test
	public void testInitalMoveLeft() {
		String expectedCoordinates = "Drone position: (" + Integer.toString(coordinates[0] -1) + ","
				+ Integer.toString(coordinates[1]) + "," + Integer.toString(coordinates[2]) + ")";
		assertEquals(expectedCoordinates, mojDron.moveLeft(1));
	}

	@Test
	public void testInitalMoveBack() {
		String expectedCoordinates = "Drone position: (" + Integer.toString(coordinates[0]) + ","
				+ Integer.toString(coordinates[1]) + "," + Integer.toString(coordinates[2] + 1) + ")";
		assertEquals(expectedCoordinates, mojDron.moveBack(1));

	}
	@Test
	public void testInitalMoveForth() {
		String expectedCoordinates = "Drone position: (" + Integer.toString(coordinates[0]) + ","
				+ Integer.toString(coordinates[1]) + "," + Integer.toString(coordinates[2] - 1) + ")";
		assertEquals(expectedCoordinates, mojDron.moveForth(1));
	}
}
