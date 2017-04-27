package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneAdvancedTest {
	Drone drone;

	public void helperDroneMovement(String[] commands) {
		for (int i = 0; i < commands.length; i++) {
			String[] command = commands[i].split(" ");

			if (command[0].equals("Up")) {
				for (int j = 0; j < Integer.parseInt(command[1]); j++) {
					System.out.println(drone.moveUp());
				}
			}

			else if (command[0].equals("Down")) {
				for (int j = 0; j < Integer.parseInt(command[1]); j++) {
					System.out.println(drone.moveDown());
				}
			}

			else if (command[0].equals("Forth")) {
				for (int j = 0; j < Integer.parseInt(command[1]); j++) {
					System.out.println(drone.moveForth());
				}
			}

			else if (command[0].equals("Back")) {
				for (int j = 0; j < Integer.parseInt(command[1]); j++) {
					System.out.println(drone.moveBack());
				}
			}

			else if (command[0].equals("Left")) {
				for (int j = 0; j < Integer.parseInt(command[1]); j++) {
					System.out.println(drone.moveLeft());
				}
			}

			else if (command[0].equals("Right")) {
				for (int j = 0; j < Integer.parseInt(command[1]); j++) {
					System.out.println(drone.moveRight());
				}
			}
		}
	}

	@Test
	public void testDroneMovementToFinalPosition() {
		drone = new Drone();

		String expectedCoordinates = "Drone position: (" + Integer.toString(0) + "," + Integer.toString(30) + ","
				+ Integer.toString(30) + ")";

		String[] commands = { "Up 12", "Right 21", "Up 23", "Forth 16", "Left 12", "Forth 5", "Left 18", "Up 17",
				"Back 21", "Left 22", "Down 20" };

		helperDroneMovement(commands);

		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
	}
}