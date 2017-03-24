package tests;

import org.junit.Test;
import static org.junit.Assert.*;

import drone.Drone;

public class DroneBasicTest {
	
	//private int[] boundaries = {50,50,50};
	//private int[] startCoordinates = {30,0,30};
	Drone drone;
	
	@Test
	public void testInitialMoveUp(){
		drone= new Drone();
		String expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY()+1)+","+Integer.toString(drone.getX())+")";
		
		assertEquals(expectedCoordinates, drone.moveUp());
		
		
	}
	

}
