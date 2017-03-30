package tests;
import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneAdvancedTest {
	
	private int[] startCoordinates={30,0,30};
	//private int [] boundaries = {50,50,50};
	private int [] finalCoordinates = {0,30,30};
	Drone drone;
	
	@Test
	
	public void testDronePath()
	{
		drone = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
		//drone.setBoundaries(boundaries);
		String expectedCoordinates = "Drone position:(" 
 				+ Integer.toString(finalCoordinates[0])+ ", " 
				+ Integer.toString(finalCoordinates[1]) + ", " 
 				+ Integer.toString(finalCoordinates[2]) + ")";
		
	
		String [] path= {"moveUp()-12",
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
		
		assertEquals(expectedCoordinates, helper(path, drone));
	}
	
	public String helper(String[] path , Drone drone)
	{
		for (String move:path)
		{
			String[] temp = move.split("-");
			 	if (temp[0].equals("moveup"))
			 	{
			 		for (int i = 0; i < Integer.parseInt(temp[1]); i++)
								drone.moveUp();
			 	}
			 	else if (temp[0].equals("movedown"))
			 	{
			 		for (int i = 0; i < Integer.parseInt(temp[1]); i++)
						drone.moveDown();
			 	}
			 	else if(temp[0].equals("moveright"))
			 	{
			 		for (int i = 0; i < Integer.parseInt(temp[1]); i++)
						drone.moveDown();
			 	}
			 	else if(temp[0].equals("moveleft"))
			 	{
			 		for (int i = 0; i < Integer.parseInt(temp[1]); i++)
						drone.moveLeft();
			 	}
			 	else if(temp[0].equals("moveforth"))
			 	{
			 		for (int i = 0; i < Integer.parseInt(temp[1]); i++)
						drone.moveForth();
			 	}
			 	else if(temp[0].equals("moveback"))
			 	{
			 		for (int i = 0; i < Integer.parseInt(temp[1]); i++)
						drone.moveBack();
			 	}
		}
		System.out.println("Final drone position: "+ drone.getFormatedCoordinates());
		return drone.getFormatedCoordinates();
	}
	
	
	
	
}
