package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import drone.Drone;

public class DroneAdvancedTest {
	
	Drone drone;
	 
	private int[] coordinates = {30,0,30};
	
	
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
		
		String expectedCoordinates = "(" + Integer.toString(0) + ","
				+ Integer.toString(30) + ","
				+ Integer.toString(30) + ")";
		
		helperMoving(path);
							
		}
	public String helperMoving(String[] path)
	{
		int n= path.length;
		for (int i =0; i<n;i++)
		{
			String [] parts = path[i].split("-");
			int pom = Integer.parseInt(parts[1]);
			
			for(int j=0; j<pom;j++)
			{
				if (parts[0] == "moveUp()")
					drone.moveUp();
				if (parts[0] == "moveDown()")
					drone.moveDown();
				if (parts[0] == "moveLeft()")
					drone.moveLeft();
				if (parts[0] == "moveRight()")
					drone.moveRight();
				if (parts[0] == "moveBack()")
					drone.moveBack();
				if (parts[0] == "moveForth()")
					drone.moveForth();
			}
		}
		
		return "(" + Integer.toString(coordinates[0]) + ","
				+ Integer.toString(coordinates[1] ) + ","
				+ Integer.toString(coordinates[2]) + ")";
	}
	


}
