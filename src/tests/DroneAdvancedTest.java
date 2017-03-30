package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import drone.Drone;

public class DroneAdvancedTest {
	
	private int[] startCoordinates={30,0,30};
	Drone drone;

	@Test
	public void testTravellingDrone()
	{
		drone = new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1]);
		drone.setZ(startCoordinates[2]);
		
		String[] komande = {"moveUp()-12", "moveRight()-21", "moveUp()-23", "moveForth()-16",
							"moveLeft()-12", "moveForth()-5", "moveLeft()-18", "moveUp()-17",
							"moveBack()-21", "moveLeft()-22", "moveDown()-20"};
		
		String[] komande2 = new String[11];
		int[] br_komandi = new int[11];
		
		for(int i=0; i < komande.length; i++)
		{
			String[] pomocni = komande[i].split("-");
			komande2[i]=pomocni[0];
			br_komandi[i]=Integer.parseInt(pomocni[1]);
		}
		
		String expectedCoordinates = "Pozicija drona: ("
									+ Integer.toString(0) + ","
									+ Integer.toString(30) + ","
									+ Integer.toString(30) + ")";
		
		assertEquals(expectedCoordinates, helperTravellingDrone(komande2,br_komandi));
		 
	}
	
	public String helperTravellingDrone(String[] komande2, int[] br_komandi)
	{
		for(int i=0; i< br_komandi.length; i++)
		{
			if(komande2[i].equals("moveUp()"))
			{
				
				while(br_komandi[i] > 0)
				{
					System.out.println(drone.moveUp());
					br_komandi[i]--;
				}
			}
			
			if(komande2[i].equals("moveDown()"))
			{
				
				while(br_komandi[i] > 0)
				{
					System.out.println(drone.moveDown());
					br_komandi[i]--;
				}
			}
			
			if(komande2[i].equals("moveLeft()"))
			{
				
				while(br_komandi[i] > 0)
				{
					System.out.println(drone.moveLeft());
					br_komandi[i]--;
				}
			}
			
			else if(komande2[i].equals("moveRight()"))
			{
				
				while(br_komandi[i] > 0)
				{
					System.out.println(drone.moveRight());
					br_komandi[i]--;
				}
			}
			
			else if(komande2[i].equals("moveForth()"))
			{
				
				while(br_komandi[i] > 0)
				{
					System.out.println(drone.moveForth());
					br_komandi[i]--;
				}
			}
			
			else if(komande2[i].equals("moveBack()"))
			{
				
				while(br_komandi[i] > 0)
				{
					System.out.println(drone.moveBack());
					br_komandi[i]--;
				}
			}
		}
		
		return "Pozicija drona: (" + drone.getX() + ","+ drone.getY() + "," + drone.getZ() + ")";
	}
	
}

