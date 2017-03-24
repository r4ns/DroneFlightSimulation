package tests;
import static org.junit.Assert.*;
import org.junit.Test;

import drone.Drone;


public class DroneBasicTest {

	
	private int[] granice = {50,50,50};
	private int[] pocetneKordinate = {30,0,30};
	
	Drone drone;
	
	
	@Test(timeout=1000)
	public void testInitialMoveUp()
	{
		drone = new Drone(granice,pocetneKordinate);
		
		String expectedCoordinates = "Drone position: ("+Integer.toString(pocetneKordinate[0])+","
				+Integer.toString(pocetneKordinate[1]+1)+","
				+Integer.toString(pocetneKordinate[2])+")";
		
		assertEquals(expectedCoordinates, drone.moveUp());
		
		
	}
	
				
	
	
}
