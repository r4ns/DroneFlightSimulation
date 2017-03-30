package tests;

import org.junit.Test;
import static org.junit.Assert.*;
import drone.Drone;

public class DroneBasicTest {
	
	private int[] boundaries = {50,50,50};
	private int[] startCoordinates = {30,0,30};
	Drone drone;
	
	@Test
	public void testInitialMoveUp()
	{
		drone= new Drone();
		
		String expectedCoordinates = "Drone position: (" 
							+ Integer.toString(startCoordinates[0]) + ","
							+ Integer.toString(startCoordinates[1]  + 1) + ","
							+ Integer.toString(startCoordinates[2]) + ")";		
		assertEquals(expectedCoordinates, drone.moveUp());
	}	
	@Test
	public void testInitialMoveDown()
	{
		drone = new Drone();
		
		String expectedCoordinates = "Drone position: (" 
							+ Integer.toString(startCoordinates[0]) + ","
							+ Integer.toString(startCoordinates[1]  - 1) + ","
							+ Integer.toString(startCoordinates[2]) + ")";	
		assertEquals(expectedCoordinates, drone.moveDown());
	}	
	@Test
	public void testInitialMoveLeft()
	{
		drone = new Drone();
		
		String expectedCoordinates = "Drone position: (" 
							+ Integer.toString(startCoordinates[0] - 1) + ","
							+ Integer.toString(startCoordinates[1]) + ","
							+ Integer.toString(startCoordinates[2]) + ")";	
		assertEquals(expectedCoordinates, drone.moveLeft());
	}	
	@Test
	public void testInitialMoveRight()
	{
		drone = new Drone();
		
		String expectedCoordinates = "Drone position: (" 
							+ Integer.toString(startCoordinates[0] + 1) + ","
							+ Integer.toString(startCoordinates[1]) + ","
							+ Integer.toString(startCoordinates[2]) + ")";		
		assertEquals(expectedCoordinates, drone.moveRight());
	}	
	@Test
	public void testInitialMoveForth()
	{
		drone = new Drone();
		
		String expectedCoordinates = "Drone position: (" 
							+ Integer.toString(startCoordinates[0]) + ","
							+ Integer.toString(startCoordinates[1]) + ","
							+ Integer.toString(startCoordinates[2] - 1) + ")";	
		assertEquals(expectedCoordinates, drone.moveForth());
	}	
	@Test
	public void testInitialMoveBack()
	{
		drone = new Drone();
		
		String expectedCoordinates = "Drone position: (" 
							+ Integer.toString(startCoordinates[0]) + ","
							+ Integer.toString(startCoordinates[1]) + ","
							+ Integer.toString(startCoordinates[2] + 1) + ")";	
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	public boolean helperDroneMoveUp(String command) {
		if(command == "moveUp"){
			int i=0;
			while(i<=50){
				String s = drone.moveUp();
				i++;				
					return true;								
			}
		}
		return false;
	}
	public boolean helperDroneMoveDown(String command) {
		 if(command == "moveDown") {
					 int i = 0;
					while(i<=50){
						 String s = drone.moveDown();
						i++;					
							return true;					
					}
				}
		 		return false;
			}
	public boolean helperDroneMoveLeft(String command) {
		 if(command == "moveLeft") {
					int i=0;
					while(i<=50){
						String s = drone.moveLeft();
						i++;						
							return true;						
					}
				}
		 		return false;
			}
	public boolean helperDroneMoveRight(String command) {
		if(command == "moveRight") {
					int i=0;
					while(i<=50){
						String s = drone.moveRight();
						i++;					
							return true;					
					}
				} 
				return false;
			}
	public boolean helperDroneMoveBack(String command) {
		if(command == "moveBack") {
					int i=0;
					while(i<=50){
						String s = drone.moveBack();
						i++;						
							return true;					
					}
				} 
				return false;
			}
	public boolean helperDroneMoveForth(String command) {
		 if(command == "moveForth") {
					int i=0;
					while(i<=50){
						 String s = drone.moveForth();
						i++;						
							return true;									
					}
				}
				return false;
			}
	@Test
	public void testInitialBorderMoveUp()
	{
		drone = new Drone();
		assertEquals(true, helperDroneMoveUp("moveUp"));
	}
	
	@Test
	public void testInitialBorderMoveDown()
	{
		drone = new Drone();
		assertEquals(true, helperDroneMoveDown("moveDown"));
	}
	
	@Test
	public void testInitialBorderMoveLeft()
	{
		drone = new Drone();
		assertEquals(true, helperDroneMoveLeft("moveLeft"));
	}
	
	@Test
	public void testInitialBorderMoveRight()
	{
		drone = new Drone();
		assertEquals(true, helperDroneMoveRight("moveRight"));
	}
	
	@Test
	public void testInitialBorderMoveForth()
	{
		drone = new Drone();	
		assertEquals(true, helperDroneMoveForth("moveForth"));
	}
	
	@Test
	public void testInitialBorderMoveBack()
	{
		drone = new Drone();	
		assertEquals(true, helperDroneMoveBack("moveBack"));
	}
}