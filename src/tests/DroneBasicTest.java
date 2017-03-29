package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneBasicTest {
	
	private int[] boundaries = {50, 50 ,50};
	private int[] startCoordinates = {30, 0, 30};
	Drone drone;
	
	@Test
	public void testInitialMoveUp()
	{
		drone = new Drone();
		
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
							+ Integer.toString(startCoordinates[2] + 1) + ")";
		
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	
	@Test
	public void testInitialMoveBack()
	{
		drone = new Drone();
		
		String expectedCoordinates = "Drone position: (" 
							+ Integer.toString(startCoordinates[0]) + ","
							+ Integer.toString(startCoordinates[1]) + ","
							+ Integer.toString(startCoordinates[2] - 1) + ")";
		
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	public boolean helperDroneMove(String command) {
		if(command == "moveUp"){
			for(int i = 0; i < 51; i++){
				String s = drone.moveUp();
				if(s.contains(" // Drone hit inside square border") || s.contains(" // Drone hit outside square border")){
					return true;
				}
			}
		} else if(command == "moveDown") {
			for(int i = 0; i < 51; i++){
				String s = drone.moveDown();
				if(s.contains(" // Drone hit inside square border") || s.contains(" // Drone hit outside square border")){
					return true;
				}
			}
		} else if(command == "moveLeft") {
			for(int i = 0; i < 51; i++){
				String s = drone.moveLeft();
				if(s.contains(" // Drone hit inside square border") || s.contains(" // Drone hit outside square border")){
					return true;
				}
			}
		} else if(command == "moveRight") {
			for(int i = 0; i < 51; i++){
				String s = drone.moveRight();
				if(s.contains(" // Drone hit inside square border") || s.contains(" // Drone hit outside square border")){
					return true;
				}
			}
		} else if(command == "moveBack") {
			for(int i = 0; i < 51; i++){
				String s = drone.moveBack();
				if(s.contains(" // Drone hit inside square border") || s.contains(" // Drone hit outside square border")){
					return true;
				}
			}
		} else if(command == "moveForth") {
			for(int i = 0; i < 51; i++){
				String s = drone.moveForth();
				if(s.contains(" // Drone hit inside square border") || s.contains(" // Drone hit outside square border")){
					return true;
				}
			}
		}
		return false;
	}
	
	@Test
	public void testInitialBorderMoveUp()
	{
		drone = new Drone();
		
		assertEquals(true, helperDroneMove("moveUp"));
	}
	
	@Test
	public void testInitialBorderMoveDown()
	{
		drone = new Drone();
		
		assertEquals(true, helperDroneMove("moveDown"));
	}
	
	@Test
	public void testInitialBorderMoveLeft()
	{
		drone = new Drone();
		
		assertEquals(true, helperDroneMove("moveLeft"));
	}
	
	@Test
	public void testInitialBorderMoveRight()
	{
		drone = new Drone();
		
		assertEquals(true, helperDroneMove("moveRight"));
	}
	
	@Test
	public void testInitialBorderMoveForth()
	{
		drone = new Drone();
		
		assertEquals(true, helperDroneMove("moveForth"));
	}
	
	@Test
	public void testInitialBorderMoveBack()
	{
		drone = new Drone();
		
		assertEquals(true, helperDroneMove("moveBack"));
	}
}