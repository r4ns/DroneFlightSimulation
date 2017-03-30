package tests;

import static org.junit.Assert.*;

import java.awt.List;

import org.junit.Test;
import drone.Drone;

public class DroneAdvancedTest {

	private int[] initialCoordinates = { 30, 0, 30 };
	private int[] finalCoordinates = { 0, 30, 30 };
	Drone drone;

	@Test
	public void testCertainPath() {
		drone = new Drone();
		int[] steps = { 12, 21, 23, 16, 12, 5, 18, 17, 21, 22, 20 };
		String[] direction = { "Up", "Right", "Up", "Forth", "Left", "Forth", "Left", "Up", "Back", "Left", "Down" };

		/*String[] action = new String[11];

		for (int i = 0; i < 11; i++) {
			action[i] = direction[i] + ":" + steps[i];
		}*/

		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(finalCoordinates[0]) + ","
				+ Integer.toString(finalCoordinates[1]) + "," + Integer.toString(finalCoordinates[2]) + ").";

		assertEquals(expectedCoordinates, helperCertainPath(direction, steps));

	}

	public String helperCertainPath(String[] direction, int[] steps) {
		drone = new Drone(initialCoordinates);

		int j = direction.length;

		for (int i = 0; i < j; i++) {
			switch (direction[i]) {
			case "Up":
				for (int k = 0; k < steps[i]; k++)
					drone.moveUp();
				break;
			case "Down":
				for (int k = 0; k < steps[i]; k++)
					drone.moveDown();
				break;
			case "Left":
				for (int k = 0; k < steps[i]; k++)
					drone.moveLeft();
				break;
			case "Right":
				for (int k = 0; k < steps[i]; k++)
					drone.moveRight();
				break;
			case "Forth":
				for (int k = 0; k < steps[i]; k++)
					drone.moveForth();
				break;
			case "Back":
				for (int k = 0; k < steps[i]; k++)
					drone.moveBack();
			}
		}

		return drone.getFormatedCoordinates();

	}
}
