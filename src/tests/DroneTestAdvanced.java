package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import drone.Drone;

public class DroneTestAdvanced {
	
	 
	private int[] coordinates = {30,0,30};
	private int[] boundaries = {50,50,50};
	private int[] endCoordinates = {0,30,30};
	Drone drone =new Drone(coordinates, boundaries);

	
	
	@Test
	public void finalTest()
	{
		String[] path = {"moveUp();12",
							"moveRight();21",
							"moveUp();23",
							"moveForth();16",
							"moveLeft();12",
							"moveForth();5",
							"moveLeft();18",
							"moveUp();17",
							"moveBack();21",
							"moveLeft();22",
							"moveDown();20"};
		
		
		
		String expectedCoordinates = "Position: ( " + Integer.toString(endCoordinates[0]) + ", "
										 + Integer.toString(endCoordinates[1]) + ", "
										 + Integer.toString(endCoordinates[2]) + " )";
		
		assertEquals(expectedCoordinates, helperMove(path, drone));
							
		}
	public String helperMove(String[] path, Drone drone)
	{

		
		int d = path.length;
		for (int i =0; i<d;i++)
		{
			String [] t = path[i].split(";");
			
			int repeat = 0;
			try {
				repeat = Integer.parseInt(t[1]);
				
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			
			for(int j=0; j<repeat;j++)
			{
				if (t[0].equals("moveUp()") )
					drone.moveUp();
				else if (t[0].equals("moveDown()"))
					drone.moveDown();
				else if (t[0].equals("moveLeft()"))
					drone.moveLeft();
				else if (t[0].equals("moveRight()"))
					drone.moveRight();
				else if (t[0].equals("moveBack()"))
					drone.moveBack();
				else if (t[0].equals("moveForth()"))
					drone.moveForth();
			}
		}
		
		return drone.getFormatedCoordinates();
	}
	


}
