package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import drone.Drone;

public class DroneAdvancedTest {
	private int[] endCoordinates = {0,30,30};
	
	
	@Test
	public void testPath(){	
		
		String expectedCoordinates = "Pozicija ("+Integer.toString(endCoordinates[0]) + "," + Integer.toString(endCoordinates[1] +1) + "," + Integer.toString(endCoordinates[2]) + ")";
		//assertEquals(expectedCoordinates, pomocna());
		
	}
	/*public String pomocna(){
		Drone dr = new Drone(30,0,30);
		System.out.println(dr.getFormatedCoordinates());
		System.out.println("Moving up");
		for (int i = 0; i < 12; i++){
			 System.out.println(dr.moveUp());
		}
		System.out.println("Moving right:");
		for (int i = 0; i < 21; i++){
			System.out.println(dr.moveRight());
		}
		System.out.println("Moving up:");
		for (int i = 0; i < 23; i++){
			System.out.println(dr.moveUp());
		}
		System.out.println("Moving forth:");
		for (int i = 0; i < 16; i++){
			System.out.println(dr.moveForth());
		}
		System.out.println("Moving left:");
		for (int i = 0; i < 12; i++){
			System.out.println(dr.moveLeft());
		}
		System.out.println("Moving forth:");
		for (int i = 0; i < 5; i++){
			System.out.println(dr.moveForth());
		}
		System.out.println("Moving left:");
		for (int i = 0; i < 18; i++){
			System.out.println(dr.moveLeft());
		}
		System.out.println("Moving up:");
		for (int i = 0; i < 17; i++){
			System.out.println(dr.moveUp());
		}
		System.out.println("Moving back:");
		for (int i = 0; i < 21; i++){
			System.out.println(dr.moveBack());
		}
		System.out.println("Moving left:");
		for (int i = 0; i < 22; i++){
			System.out.println(dr.moveLeft());
		}
		System.out.println("Moving down:");
		for (int i = 0; i < 20; i++){
			System.out.println(dr.moveDown());
		}*/
	}

