package tests;

import org.junit.Test;
import drone.Drone;
import static org.junit.Assert.*;
public class DroneBasicTest {

	
	private int[] boundaries={50,50,50};
	private int[] startCoordinates={30,0,30};
	Drone drone;
	
	
	@Test(timeout=1000)
	public void testInitialMoveUp() {
		
		drone=new Drone(boundaries,startCoordinates);

   String expectedCoordinates= "Drone position (" + 
		   						Integer.toString(startCoordinates[0]) + ", " +Integer.toString(startCoordinates[1]+1) + ", " + Integer.toString(startCoordinates[2]) + ")";
   
   assertEquals(expectedCoordinates, drone.moveUp());
	} 
	
	@Test(timeout=1000)
	public void testInitialMoveDown() {
		drone=new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates= "Drone position (" 
								+Integer.toString(startCoordinates[0]) + ", "
								+Integer.toString(startCoordinates[1]) + ", "
								+Integer.toString(startCoordinates[2]) + ")";
		
		 assertEquals(expectedCoordinates, drone.moveDown());
		
	}
	
	@Test(timeout=1000)
	public void testInitialMoveLeft() {
		drone=new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates= "Drone position (" 
								+Integer.toString(startCoordinates[0]-1) + ", "
								+Integer.toString(startCoordinates[1]) + ", "
								+Integer.toString(startCoordinates[2]) + ")";
		
		 assertEquals(expectedCoordinates, drone.moveLeft());
		
	}
	
	@Test(timeout=1000)
	public void testInitialMoveRight() {
		drone=new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates= "Drone position (" 
								+Integer.toString(startCoordinates[0]+1) + ", "
								+Integer.toString(startCoordinates[1]) + ", "
								+Integer.toString(startCoordinates[2]) + ")";
		
		 assertEquals(expectedCoordinates, drone.moveRight());
		
	}
	
	
	@Test(timeout=1000)
	public void testInitialMoveForth() {
		drone=new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates= "Drone position (" 
								+Integer.toString(startCoordinates[0]) + ", "
								+Integer.toString(startCoordinates[1]) + ", "
								+Integer.toString(startCoordinates[2]-1) + ")";
		
		 assertEquals(expectedCoordinates, drone.moveForth());
		
	}
	
	
	@Test(timeout=1000)
	public void testInitialMoveBack() {
		drone=new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates= "Drone position (" 
								+Integer.toString(startCoordinates[0]) + ", "
								+Integer.toString(startCoordinates[1]) + ", "
								+Integer.toString(startCoordinates[2]+1) + ")";
		
		 assertEquals(expectedCoordinates, drone.moveBack());
		
	}
	
	}
	
