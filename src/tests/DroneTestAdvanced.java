package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import drone.Drone;

public class DroneTestAdvanced {
	
	private int[] boundaries = {50,50,50,50};
	private int[] destinationCoordinates = {0,30,30};
	Drone drone;
	
	@Test
	public void testMoveToDestination(){
		drone = new Drone();
		
		String expectedOutput = "Destination reached! Coordinates : (" + Integer.toString(destinationCoordinates[0]) + ","
		+ Integer.toString(destinationCoordinates[1]) + "," 
		+ Integer.toString(destinationCoordinates[2]) + ")";
		
		String[] methodList = {"MoveUp-12","MoveRight-21","MoveUp-23","moveForth-16","moveLeft-12"};
		
		//assertEquals(expectedOutput, actual);
		
		
	}
	
	private String helperDrone(String[] methodList){
		
		
		return "";
	}
}
