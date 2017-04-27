/*package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.*;

public class DroneBasicTest {
	
	private int[] startCoordinates = {30,0,30};
	Drone drone;
	
	@Test
	public void testInitialMoveUp(){
		drone=new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1]);
		drone.setZ(startCoordinates[2]);
		
		String expectedCoordinates = "Drone position: ("+ Integer.toString(startCoordinates[0])+","+
		Integer.toString(startCoordinates[1]+1)+","+ Integer.toString(startCoordinates[2])+")";
		
		assertEquals(expectedCoordinates, drone.moveUp());
		
	}

	@Test
	public void testInitialMoveDown(){  ovo je granicni test a ne kretnja initial 
		drone=new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1]);
		drone.setZ(startCoordinates[2]);
		
		String expectedCoordinates = "Drone position: ("+ Integer.toString(startCoordinates[0])+","+
		Integer.toString(startCoordinates[1])+","+ Integer.toString(startCoordinates[2])+")//dron hits edge !!!";
		
		assertEquals(expectedCoordinates, drone.moveDown());
		
	}
	
	@Test
	public void testInitialMoveRight(){
		drone=new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1]);
		drone.setZ(startCoordinates[2]);
		
		String expectedCoordinates = "Drone position: ("+ Integer.toString(startCoordinates[0]+1)+","+
		Integer.toString(startCoordinates[1])+","+ Integer.toString(startCoordinates[2])+")";
		
		assertEquals(expectedCoordinates, drone.moveRight());
		
	}
	
	@Test
	public void testInitialMoveLeft(){
		drone=new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1]);
		drone.setZ(startCoordinates[2]);
		
		String expectedCoordinates = "Drone position: ("+ Integer.toString(startCoordinates[0]-1)+","+
		Integer.toString(startCoordinates[1])+","+ Integer.toString(startCoordinates[2])+")";
		
		assertEquals(expectedCoordinates, drone.moveLeft());
		
	}
	
	@Test
	public void testInitialMoveBack(){
		drone=new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1]);
		drone.setZ(startCoordinates[2]);
		
		String expectedCoordinates = "Drone position: ("+ Integer.toString(startCoordinates[0])+","+
		Integer.toString(startCoordinates[1])+","+ Integer.toString(startCoordinates[2]+1)+")";
		
		assertEquals(expectedCoordinates, drone.moveBack());
		
	}
	
	@Test
	public void testInitialMoveForth(){
		drone=new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1]);
		drone.setZ(startCoordinates[2]);
		
		String expectedCoordinates = "Drone position: ("+ Integer.toString(startCoordinates[0])+","+
		Integer.toString(startCoordinates[1])+","+ Integer.toString(startCoordinates[2]-1)+")";
		
		assertEquals(expectedCoordinates, drone.moveForth());
		
	}
}
*/