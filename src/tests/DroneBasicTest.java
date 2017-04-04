package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneBasicTest  {


	
	Drone drone;
	

	@Test
	public void testInitialMoveUp(){

		drone = new Drone(30,0,30, new int[]{50,50,50},10);

		String expectedCoordinates = "Drone position: ("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY()+1)+","+Integer.toString(drone.getZ())+")";

		assertEquals(expectedCoordinates, drone.moveUp());												

	}
	
	@Test
	public void test10MoveUp(){

		drone = new Drone(30,10,30, new int[]{50,50,50},10);

		String expectedCoordinates = "Drone position: ("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";

		assertEquals(expectedCoordinates, drone.moveUp());												

	}
	
	@Test
	public void test40MoveUp(){

		drone = new Drone(30,40,30, new int[]{50,50,50},10);

		String expectedCoordinates = "Drone position: ("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY()+1)+","+Integer.toString(drone.getZ())+")";

		assertEquals(expectedCoordinates, drone.moveUp());												

	}
	
	@Test
	public void test50MoveUp(){

		drone = new Drone(30,50,30, new int[]{50,50,50},10);

		String expectedCoordinates = "Drone position: ("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";

		assertEquals(expectedCoordinates, drone.moveUp());												

	}
	
	
	

	@Test
	public void testInitalMoveDown(){

		drone = new Drone(30,0,30, new int[]{50,50,50},10);

		String expectedCoordinates = "Drone position: ("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";

		assertEquals(expectedCoordinates, drone.moveDown());		


	}
	
	@Test
	public void test10MoveDown(){

		drone = new Drone(30,10,30, new int[]{50,50,50},10);

		String expectedCoordinates = "Drone position: ("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY()-1)+","+Integer.toString(drone.getZ())+")";

		assertEquals(expectedCoordinates, drone.moveDown());		


	}
	
	@Test
	public void test40MoveDown(){

		drone = new Drone(30,40,30, new int[]{50,50,50},10);

		String expectedCoordinates = "Drone position: ("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";

		assertEquals(expectedCoordinates, drone.moveDown());		


	}
	
	@Test
	public void test50MoveDown(){

		drone = new Drone(30,50,30, new int[]{50,50,50},10);

		String expectedCoordinates = "Drone position: ("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY()-1)+","+Integer.toString(drone.getZ())+")";

		assertEquals(expectedCoordinates, drone.moveDown());		


	};
	
	

	@Test
	public void testInitalMoveLeft(){

		drone = new Drone(0,30,30, new int[]{50,50,50},10);

		String expectedCoordinates = "Drone position: ("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		assertEquals(expectedCoordinates, drone.moveLeft());		


	}
	
	@Test
	public void test10MoveLeft(){

		drone = new Drone(10,30,30, new int[]{50,50,50},10);

		String expectedCoordinates = "Drone position: ("+Integer.toString(drone.getX()-1)+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		assertEquals(expectedCoordinates, drone.moveLeft());		


	}
	
	@Test
	public void test40MoveLeft(){

		drone = new Drone(40,30,30, new int[]{50,50,50},10);

		String expectedCoordinates = "Drone position: ("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		assertEquals(expectedCoordinates, drone.moveLeft());		


	}
	
	@Test
	public void test50MoveLeft(){

		drone = new Drone(50,30,30, new int[]{50,50,50},10);

		String expectedCoordinates = "Drone position: ("+Integer.toString(drone.getX()-1)+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		assertEquals(expectedCoordinates, drone.moveLeft());		


	}
	

	@Test
	public void testInitalMoveRight(){

		drone = new Drone(0,30,30, new int[]{50,50,50},10);

		String expectedCoordinates = "Drone position: ("+Integer.toString(drone.getX()+1)+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		assertEquals(expectedCoordinates, drone.moveRight());		


	}
	
	@Test
	public void test10MoveRight(){

		drone = new Drone(10,30,30, new int[]{50,50,50},10);

		String expectedCoordinates = "Drone position: ("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		assertEquals(expectedCoordinates, drone.moveRight());		


	}
	
	
	
	@Test
	public void test40MoveRight(){

		drone = new Drone(40,30,30, new int[]{50,50,50},10);

		String expectedCoordinates = "Drone position: ("+Integer.toString(drone.getX()+1)+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		assertEquals(expectedCoordinates, drone.moveRight());		


	}
	
	@Test
	public void test50MoveRight(){

		drone = new Drone(50,0,30, new int[]{50,50,50},10);

		String expectedCoordinates = "Drone position: ("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		assertEquals(expectedCoordinates, drone.moveRight());		


	}
	
	
	

	@Test
	public void testInitalMoveBack(){

		drone = new Drone(30,0,0, new int[]{50,50,50},10);

		String expectedCoordinates = "Drone position: ("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ()+1)+")";
		assertEquals(expectedCoordinates, drone.moveBack());		


	}
	
	@Test
	public void test10MoveBack(){

		drone = new Drone(30,30,10, new int[]{50,50,50},10);

		String expectedCoordinates = "Drone position: ("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		assertEquals(expectedCoordinates, drone.moveBack());		


	}
	
	@Test
	public void test40MoveBack(){

		drone = new Drone(30,20,40, new int[]{50,50,50},10);

		String expectedCoordinates = "Drone position: ("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ()+1)+")";
		assertEquals(expectedCoordinates, drone.moveBack());		


	}
	
	@Test
	public void test50MoveBack(){

		drone = new Drone(30,11,50, new int[]{50,50,50},10);

		String expectedCoordinates = "Drone position: ("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		assertEquals(expectedCoordinates, drone.moveBack());		


	}
	
	

	@Test
	public void testInitalMoveForth(){

		drone = new Drone(30,0,0, new int[]{50,50,50},10);

		String expectedCoordinates = "Drone position: ("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		assertEquals(expectedCoordinates, drone.moveForth());		


	}
	
	@Test
	public void test10MoveForth(){

		drone = new Drone(30,30,10, new int[]{50,50,50},10);

		String expectedCoordinates = "Drone position: ("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ()-1)+")";
		assertEquals(expectedCoordinates, drone.moveForth());		


	}
	
	@Test
	public void test40MoveForth(){

		drone = new Drone(30,11,40, new int[]{50,50,50},10);

		String expectedCoordinates = "Drone position: ("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		assertEquals(expectedCoordinates, drone.moveForth());		


	}
	
	@Test
	public void test50MoveForth(){

		drone = new Drone(30,11,10, new int[]{50,50,50},10);

		String expectedCoordinates = "Drone position: ("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ()-1)+")";
		assertEquals(expectedCoordinates, drone.moveForth());		


	}
	
	
	
	
	
	

	
	
	
	
	
	
















}
