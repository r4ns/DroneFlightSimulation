package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import java.awt.List;
import java.util.Arrays;

import drone.Drone;

public class DroneAdvancedTest {
	
	private int[] boundaries = {50, 50 ,50};
	private int[] startCoordinates = {30, 0, 30};
	Drone drone;
	
	@Test
	public void testTravelingDroneToFinalPosition()
	{
		drone = new Drone();
		
		String expectedCoordinates = "Drone position: (" 
				+ Integer.toString(30) + ","
				+ Integer.toString(0) + ","
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
								"moveDown() 20"};
		helperTravelingDroneToFinalPosition(komande);
	}
	
	
	public String helperTravelingDroneToFinalPosition(String[] komande)
	{
		for (int i = 0; i < komande.length; i++) {
			String pomocni = komande[i];
			String[] trenutneKomande = pomocni.split(" ");
			
			for (int j = 0; j < Integer.parseInt(trenutneKomande[1]); j++) {
				
			}
		}
		
		return "  ";
	}
}
