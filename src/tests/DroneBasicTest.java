package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;




public class DroneBasicTest {

	Drone drone;
	
	@Test
	public void MoveUpTest() {
		
		drone = new Drone (0,1,0);
		
		String expected = "Drone position: (" + drone.getX() + "," + (drone.getY()+1) + "," + drone.getZ() + ")";
		
		String actual = drone.moveUp();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void MoveDownTest() {
		
		drone = new Drone (0,1,0);
		
		String expected = "Drone position: (" + drone.getX() + "," + (drone.getY()-1) + "," + drone.getZ() + ")";
		
		String actual = drone.moveDown();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void MoveLeftTest() {
		
		drone = new Drone (1,0,0);
		
		String expected = "Drone position: (" + (drone.getX()-1) + "," + drone.getY() + "," + drone.getZ() + ")";
		
		String actual = drone.moveLeft();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void MoveRightTest() {
		
		drone = new Drone (1,0,0);
		
		String expected = "Drone position: (" + (drone.getX()+1) + "," + drone.getY() + "," + drone.getZ() + ")";
		
		String actual = drone.moveRight();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void MoveForth() {
		
		drone = new Drone (0,0,1);
		
		String expected = "Drone position: (" + drone.getX() + "," + drone.getY() + "," + (drone.getZ()-1) + ")";
		
		String actual = drone.moveForth();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void MoveBack() {
		
		drone = new Drone (0,0,1);
		
		String expected = "Drone position: (" + drone.getX() + "," + drone.getY() + "," + (drone.getZ()+1) + ")";
		
		String actual = drone.moveBack();
		
		assertEquals(expected, actual);
	}
	
	
}
