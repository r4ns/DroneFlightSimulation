package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.DoubleCubeDrone;

public class DoubleCubeDroneTest {
	Exception ex = null;
	
	@Test
	public void checkIfNullBoundariesAreHandled(){
		  try {
	            DoubleCubeDrone drone = new DoubleCubeDrone(new int[]{0,0,0,0}, 1, null, 1);
	        } catch (Exception e) {
	            ex = e;
	        }
	        assertEquals(null,ex);
	}
	
	@Test
	public void checkIfNullCoordinatesAreHandled(){
		  try {
	            DoubleCubeDrone drone = new DoubleCubeDrone(null, 1, new int[]{0,0,0,0}, 1);
	        } catch (Exception e) {
	            ex = e;
	        }
	        assertEquals(null,ex);
	}
}
