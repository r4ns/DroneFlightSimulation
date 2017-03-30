package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import drone.Drone;

public class DroneAdvancedTest {
	
	 
	private int[] coordinates = {30,0,30};
	private int[] endCoordinates = {0,30,30};
	Drone drone =new Drone(coordinates);
	
	@Test
	public void finalTest()
	{
		String[] path = {"moveUp()-12",
							"moveRight()-21",
							"moveUp()-23",
							"moveForth()-16",
							"moveLeft()-12",
							"moveForth()-5",
							"moveLeft()-18",
							"moveUp()-17",
							"moveBack()-21",
							"moveLeft()-22",
							"moveDown()-20"};
		
		
		
		String expectedCoordinates = "(" + Integer.toString(endCoordinates[0]) + ","
										 + Integer.toString(endCoordinates[1]) + ","
										 + Integer.toString(endCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, helperMoving(path, drone));
							
		}
	public String helperMoving(String[] path, Drone drone)
	{
		int n= path.length;
		for (int i =0; i<n;i++)
		{
			String [] parts = path[i].split("-");
			int pom = Integer.parseInt(parts[1]);
			
			for(int j=0; j<pom;j++)
			{
				if (parts[0].equals("moveUp()"))
					drone.moveUp();
				if (parts[0].equals("moveDown()"))
					drone.moveDown();
				if (parts[0].equals("moveLeft()"))
					drone.moveLeft();
				if (parts[0].equals("moveRight()"))
					drone.moveRight();
				if (parts[0].equals("moveBack()"))
					drone.moveBack();
				if (parts[0].equals("moveForth()"))
					drone.moveForth();
			}
		}
		
		return "(" + Integer.toString(coordinates[0]) + ","
				+ Integer.toString(coordinates[1] ) + ","
				+ Integer.toString(coordinates[2]) + ")";
		
	}
	


}
