package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneAdvancedTest {
	
	Drone drone;
	private int[]  boundaries = {50,50,50};
	private int[] startCoordinates = {30,0,30};
	
	@Test
	public void testPutanjaZaKretanje() {
		
		String[] putanja = { "moveUp() - 12",
							 "moveRight() - 21",
							 "moveUp() - 23",
							 "moveForth() - 16",
							 "moveLeft() - 12",
							 "moveForth() - 5",
							 "moveLeft() - 18",
							 "moveUp() - 17",
							 "moveBack() - 21",
							 "moveLeft() - 22",
							 "moveDown() - 20" };
		
		String expectedCoordinates = "(" 
				+ Integer.toString(startCoordinates[0]) + ", "
				+ Integer.toString(startCoordinates[1]) + ", "
				+ Integer.toString(startCoordinates[2]) + ")";
		
		helperMove(putanja);
		
	}				
		
	public String helperMove(String[] putanja) {
		
		String rez = null;
		for(int i=0; i < putanja.length; i++) {
			
			String pom = putanja[i];
			String[] komanda = pom.split(" - ");
			
			for(int j=0; j < Integer.parseInt(komanda[1]); j++) {
				
				if (komanda[0] == "moveUp()") {
									
					rez = drone.moveUp();					
										
				} else if (komanda[0] == "moveDown()") {
					
					rez = drone.moveDown();					
										
				} else if (komanda[0] == "moveLeft()") {
					
					rez = drone.moveLeft();					
										
				} else if (komanda[0] == "moveRight()") {
					
					rez = drone.moveRight();					
										
				} else if (komanda[0] == "moveBack()") {
					
					rez = drone.moveBack();						
					
				} else if (komanda[0] == "moveForth()") {
					
					rez = drone.moveForth();					
							
				}
				
			}
			
		}
		
		return rez;
		
	}
	
}
