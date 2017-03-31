package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import java.awt.List;
import java.util.Arrays;

import drone.Drone;

public class DroneAdvancedTest {
	
	private int[] startCoordinates = {30, 0, 30};
	Drone drone = new Drone(startCoordinates[0], startCoordinates[1], startCoordinates[2]);
	
	@Test
	public void testTravelingDroneToFinalPosition()
	{
		
		
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(0) + ","
				+ Integer.toString(30) + ","
				+ Integer.toString(30) + ")";
		
		String [] komande = {"moveUp() 12", 
							 "moveRight() 21", 
						   	 "moveUp() 23", 
							 "moveForth() 16", 
							 "moveLeft() 12", 
						 	 "moveForth() 5", 
							 "moveLeft() 18",  
							 "moveUp() 17", 
						 	 "moveBack() 21", 
							 "moveLeft() 22",
							 "moveDown() 20"
								};
		
		assertEquals(expectedCoordinates, helperTravelingDroneToFinalPosition(komande));
	}
	
	public String helperTravelingDroneToFinalPosition(String[] komande)
	{
		for (int i = 0; i < komande.length; i++) {
			String[] trenutneKomande = komande[i].split(" ");
				
			if(trenutneKomande[0].equals("moveUp()"))
			{
				int j = Integer.parseInt(trenutneKomande[1]);
				while(j > 0)
				{
					drone.moveUp();
					j--;
				}
			}
			else if(trenutneKomande[0].equals("moveDown()"))
			{
				int j = Integer.parseInt(trenutneKomande[1]);
				while(j > 0)
				{
					drone.moveDown();
					j--;
				}
			}
			else if(trenutneKomande[0].equals("moveLeft()"))
			{
				int j = Integer.parseInt(trenutneKomande[1]);
				while(j > 0)
				{
					drone.moveLeft();
					j--;
				}
			}
			else if(trenutneKomande[0].equals("moveRight()"))
			{
				int j = Integer.parseInt(trenutneKomande[1]);
				while(j > 0)
				{
					drone.moveRight();
					j--;
				}
			}
			else if(trenutneKomande[0].equals("moveForth()"))
			{
				int j = Integer.parseInt(trenutneKomande[1]);
				while(j > 0)
				{
					drone.moveForth();
					j--;
				}
			}
			else if(trenutneKomande[0].equals("moveBack()"))
			{
				int j = Integer.parseInt(trenutneKomande[1]);
				while(j > 0)
				{
					drone.moveBack();
					j--;
				}
			}
		}
		
		return drone.getFormatedCoordinates();
	}
}
