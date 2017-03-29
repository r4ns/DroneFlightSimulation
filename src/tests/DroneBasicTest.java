package tests;

import org.junit.Test;
import static org.junit.Assert.*;

import drone.Drone;

public class DroneBasicTest {
	//osnovno gore dole levo desno
	private int[] boundaries = {50,50,50};
	private int[] startCoordinates = {30,0,30};
	Drone drone;
	
	//testiranje kretanja drona na gore
	@Test
	public void testInitialMoveUp(){
		drone = new Drone();
		
		String expectedCoordinates = "Drone position: (" 
				+Integer.toString(startCoordinates[0])+ ", "
				+Integer.toString(startCoordinates[1]+1)+ ", "
				+Integer.toString(startCoordinates[2]) + ")";
		
		
		assertEquals(expectedCoordinates, drone.moveUp());
		
		
	}
	
	public void testInitialMoveDown(){
		drone = new Drone();
		
		String expectedCoordinates = "Drone position: (" 
				+Integer.toString(startCoordinates[0])+ ", "
				+Integer.toString(startCoordinates[1]-1)+ ", "
				+Integer.toString(startCoordinates[2]) + ")";
		
		
		assertEquals(expectedCoordinates, drone.moveDown());
		
		
	}
	
	public void testInitialMoveLeft(){
		drone = new Drone();
		
		String expectedCoordinates = "Drone position: (" 
				+Integer.toString(startCoordinates[0]-1)+ ", "
				+Integer.toString(startCoordinates[1])+ ", "
				+Integer.toString(startCoordinates[2]) + ")";
		
		
		assertEquals(expectedCoordinates, drone.moveLeft());
		
		
	}
	
	public void testInitialMoveRight(){
		drone = new Drone();
		
		String expectedCoordinates = "Drone position: (" 
				+Integer.toString(startCoordinates[0]+1)+ ", "
				+Integer.toString(startCoordinates[1])+ ", "
				+Integer.toString(startCoordinates[2]) + ")";
		
		
		assertEquals(expectedCoordinates, drone.moveRight());
		
		
	}
	
	public void testInitialMoveForth(){
		drone = new Drone();
		
		String expectedCoordinates = "Drone position: (" 
				+Integer.toString(startCoordinates[0])+ ", "
				+Integer.toString(startCoordinates[1])+ ", "
				+Integer.toString(startCoordinates[2]-1) + ")";
		
		
		assertEquals(expectedCoordinates, drone.moveForth());
		
		
	}
	
	public void testInitialMoveBack(){
		drone = new Drone();
		
		String expectedCoordinates = "Drone position: (" 
				+Integer.toString(startCoordinates[0])+ ", "
				+Integer.toString(startCoordinates[1])+ ", "
				+Integer.toString(startCoordinates[2]+1) + ")";
		
		
		assertEquals(expectedCoordinates, drone.moveBack());
		
		
	}
}
