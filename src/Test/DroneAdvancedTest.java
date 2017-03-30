package Test;

import static org.junit.Assert.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.junit.Test;

import drone.Drone;

public class DroneAdvancedTest {
	private int[] coordinates = { 0, 30, 30 };
	Drone mojDron = new Drone(30, 0, 30);
	@Test
	public void testInitalMoveToFinish() {
		String expectedCoordinates = "Drone position: (" + Integer.toString(coordinates[0]) + ","
				+ Integer.toString(coordinates[1]) + "," + Integer.toString(coordinates[2]) + ")";
		System.out.println(expectedCoordinates);
		mojDron.moveUp(12);
		mojDron.moveRight(21);
		mojDron.moveUp(23);
		mojDron.moveForth(16);
		mojDron.moveLeft(12);
		mojDron.moveForth(5);
		mojDron.moveLeft(18);
		mojDron.moveUp(17);
		mojDron.moveBack(21);
		mojDron.moveLeft(22);
		mojDron.moveDown(20);
		assertEquals(expectedCoordinates, mojDron.getFormatedCoordinates());

	}

}
