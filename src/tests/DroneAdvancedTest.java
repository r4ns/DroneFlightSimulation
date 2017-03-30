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
			
			for (int j = 0; j < Integer.parseInt(trenutneKomande[1]); j++) {
				if(trenutneKomande[0] == "moveUp()")
					drone.moveUp();
				else if(trenutneKomande[0] == "moveDown()")
					drone.moveDown();
				else if(trenutneKomande[0] == "moveLeft()")
					drone.moveLeft();
				else if(trenutneKomande[0] == "moveRight()")
					drone.moveRight();
				else if(trenutneKomande[0] == "moveForth()")
					drone.moveForth();
				else if(trenutneKomande[0] == "moveBack()")
					drone.moveBack();
			}
		}
		
		return drone.getFormatedCoordinates();
	}
}
