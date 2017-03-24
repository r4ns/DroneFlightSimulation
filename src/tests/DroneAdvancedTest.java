package tests;

import org.junit.Test;

import drone.Drone;

public class DroneAdvancedTest {
	private int[] boundaries = {50, 50, 50};
	private int[] startCoordinates = {30, 0, 30};
	private int[] finishCoordinates = {0, 30, 30};
	Drone drone;
	
	private String[] strings = {"up", "right", "up", "forth", "left", "forth", "left", "up", "back", "left", "down"};
	
	private int[] freq = {12, 21, 23, 16, 12, 5, 18, 17, 21, 22, 20};
	
	/*@Test
	public void testFinishPosition() {
		drone = new Drone(30, 0, 30);
		
		String expectedCoordinates = "(" + Integer.toString(finishCoordinates[0]) + 
				", " + Integer.toString(finishCoordinates[1]) +
				", " + Integer.toString(finishCoordinates[2]) + ")";
		
		public String helperTestFinishPosition() {
			for (int i = 0; i < 11; i++)
			{
			}
		}
	
	}*/
}
