package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import drone.Drone;
import drone.DroneOne;

public class DroneAdvancedTest {
	private int[] boundaries = {50, 50, 50};
	private int[] startCoordinates = {30, 0, 30};
	private int[] finishCoordinates = {0, 30, 30};
	DroneOne drone;
	
	private String[] strings = {"up", "right", "up", "forth", "left", "forth", "left", "up", "back", "left", "down"};
	
	private int[] freq = {12, 21, 23, 16, 12, 5, 18, 17, 21, 22, 20};
	
	
	public String helperTestFinishPosition() 
	{
		for (int i = 0; i < freq.length; i++)
		{
			int j = freq[i];
			for (int k = 0; k < j; k++)
			{
				if (strings[i] == "up")
					drone.moveUp();
				else if (strings[i] == "down")
					drone.moveDown();
				else if (strings[i] == "left")
					drone.moveLeft();
				else if (strings[i] == "forth")
					drone.moveForth();
				else if (strings[i] == "back")
					drone.moveBack();
				else
					drone.moveRight();
			}
		}
		String finishPosition = drone.getFormatedCoordinates();
		return finishPosition;
	}
	
	@Test
	public void testFinishPosition() {
		drone = new DroneOne(30, 0, 30);
		
		String expectedCoordinates = "(" + Integer.toString(finishCoordinates[0]) + 
				", " + Integer.toString(finishCoordinates[1]) +
				", " + Integer.toString(finishCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, helperTestFinishPosition());
	
	}
}
