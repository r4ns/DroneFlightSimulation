package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneAdvancedTest {
	
	private int[] startCoordinates = {30,0,30};
	private int [] finishedCoordinates = {0,30,30};
	
	private String[] array = {"moveUp 12", "moveRight 21","moveUp 23","moveForth 16","moveLeft 12","moveForth 5",
			"moveLeft 18","moveUp 17","moveBack 21","moveLeft 22","moveDown 20"};
	Drone drone;

	@Test
	public void testDronePathToFinish() {
		
		drone = new Drone();
		
		String expectedCoordinates = "Drone position: ("+
									  Integer.toString(finishedCoordinates[0])+ ","+
									  Integer.toString(finishedCoordinates[1]) + ","+
									  Integer.toString(finishedCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, testDronePathHelper(array));
	}	
	
	
	public String testDronePathHelper(String[] array){
		
		drone = new Drone (startCoordinates[0],startCoordinates[1],startCoordinates[2]);
		
		for(int i=0; i<array.length; i++)
		{
			String[] pom = array[i].split(" ");
			
			for(int j=0; j<Integer.parseInt(pom[1]); j++)
			{
				if(pom[0].equals("moveUp"))
				{
					drone.moveUp();
				}
				else if(pom[0].equals("moveDown"))
				{
					drone.moveDown();
				}
				else if(pom[0].equals("moveRight"))
				{
					drone.moveRight();
				}
				else if(pom[0].equals("moveLeft"))
				{
					drone.moveLeft();
				}
				else if(pom[0].equals("moveForth"))
				{
					drone.moveForth();
				}
				else
				{
					drone.moveBack();
				}
			}
					
		}
		return drone.getFormatedCoordinates();
		
		
		
		
	}

}
