package tests;

import static org.junit.Assert.*;

import java.awt.List;

import org.junit.Test;
import drone.Drone;

public class DroneAdvancedTest {

	private int[] finalCoordinates = {0,30,30};
	Drone drone;
	List listaZahteva;
	
	@Test
	public void testCertainPath()
	{
		drone = new Drone();
		listaZahteva = new List();
		
		String expectedCoordinates = "Trenutna pozicija je (" + Integer.toString(finalCoordinates[0]) + "," + Integer.toString(finalCoordinates[1]) + "," + Integer.toString(finalCoordinates[2]) + ").";
		
		helperCertainPath();
	}
	
	public String helperCertainPath()
	{
		return null;
		
	}
}
