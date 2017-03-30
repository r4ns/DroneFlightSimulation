package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneBasicTest {
	private int[] boundaries = {50,50,50};
	private int[] startCoordinates = {30,0,30};
	
	Drone drone;
	
	@Test
	public void testInitialMoveUp(){
		drone = new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1]);
		drone.setZ(startCoordinates[2]);
		
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(startCoordinates[0]) + ","
				+ Integer.toString(startCoordinates[1] + 1) + ","
				+ Integer.toString(startCoordinates[2]) + ")";

		assertEquals(expectedCoordinates, drone.moveUp());
		
	}
	
	@Test
	public void testInitialMoveDown(){
		drone = new Drone(30,1,30);
		
		String expectedCoordinates = "Drone position: (30,0,30) --- Dron je udario u donju ivicu";

		assertEquals(expectedCoordinates, drone.moveDown());
		
	}
	
	
	@Test
	public void testInitialMoveLeft(){
		drone = new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1]);
		drone.setZ(startCoordinates[2]);
		
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(startCoordinates[0] - 1) + ","
				+ Integer.toString(startCoordinates[1]) + ","
				+ Integer.toString(startCoordinates[2]) + ")";

		assertEquals(expectedCoordinates, drone.moveLeft());
		
	}
	
	@Test
	public void testInitialMoveRight(){
		drone = new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1]);
		drone.setZ(startCoordinates[2]);
		
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(startCoordinates[0] + 1) + ","
				+ Integer.toString(startCoordinates[1]) + ","
				+ Integer.toString(startCoordinates[2]) + ")";

		assertEquals(expectedCoordinates, drone.moveRight());
		
	}
	
	@Test
	public void testInitialMoveBack(){
		drone = new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1]);
		drone.setZ(startCoordinates[2]);
		
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(startCoordinates[0]) + ","
				+ Integer.toString(startCoordinates[1]) + ","
				+ Integer.toString(startCoordinates[2] + 1) + ")";

		assertEquals(expectedCoordinates, drone.moveBack());
		
	}
	
	@Test
	public void testInitialMoveForth(){
		drone = new Drone();
		drone.setX(startCoordinates[0]);
		drone.setY(startCoordinates[1]);
		drone.setZ(startCoordinates[2]);
		
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(startCoordinates[0]) + ","
				+ Integer.toString(startCoordinates[1]) + ","
				+ Integer.toString(startCoordinates[2] -1) + ")";

		assertEquals(expectedCoordinates, drone.moveForth());
		
	}
	
	//Granicne provere
	@Test
	public void testBoundMoveUp(){
		drone = new Drone(30,50,30);
		
		String expectedCoordinates = "Dron ne moze da izvrsi ovu komandu";

		assertEquals(expectedCoordinates, drone.moveUp());
		
	}
	
	@Test
	public void testInnerBoundMoveUp(){
		drone = new Drone(30,10,30);
		
		String expectedCoordinates = "Dron ne moze da izvrsi ovu komandu";

		assertEquals(expectedCoordinates, drone.moveUp());
		
	}
	
	@Test
	public void testBoundMoveDown(){
		drone = new Drone(30,0,30);
		
		String expectedCoordinates = "Dron ne moze da izvrsi ovu komandu";

		assertEquals(expectedCoordinates, drone.moveDown());
		
	}
	
	@Test
	public void testInnerBoundMoveDown(){
		drone = new Drone(30,40,30);
		
		String expectedCoordinates = "Dron ne moze da izvrsi ovu komandu";

		assertEquals(expectedCoordinates, drone.moveDown());
		
	}
	
	@Test
	public void testBoundMoveRight(){
		drone = new Drone(50,0,30);
		
		String expectedCoordinates = "Dron ne moze da izvrsi ovu komandu";

		assertEquals(expectedCoordinates, drone.moveRight());
		
	}
	
	@Test
	public void testInnerBoundMoveRight(){
		drone = new Drone(10,30,30);
		
		String expectedCoordinates = "Dron ne moze da izvrsi ovu komandu";

		assertEquals(expectedCoordinates, drone.moveRight());
		
	}
	
	@Test
	public void testBoundMoveLeft(){
		drone = new Drone(0,0,30);
		
		String expectedCoordinates = "Dron ne moze da izvrsi ovu komandu";

		assertEquals(expectedCoordinates, drone.moveLeft());
		
	}
	
	@Test
	public void testInnerBoundMoveLeft(){
		drone = new Drone(40,30,30);
		
		String expectedCoordinates = "Dron ne moze da izvrsi ovu komandu";

		assertEquals(expectedCoordinates, drone.moveLeft());
		
	}
	
	@Test
	public void testBoundMoveBack(){
		drone = new Drone(30,0,50);
		
		String expectedCoordinates = "Dron ne moze da izvrsi ovu komandu";

		assertEquals(expectedCoordinates, drone.moveBack());
		
	}
	
	@Test
	public void testInnerBoundMoveBack(){
		drone = new Drone(30,30,10);
		
		String expectedCoordinates = "Dron ne moze da izvrsi ovu komandu";

		assertEquals(expectedCoordinates, drone.moveBack());
		
	}
	
	@Test
	public void testBoundMoveForth(){
		drone = new Drone(30,0,0);
		
		String expectedCoordinates = "Dron ne moze da izvrsi ovu komandu";

		assertEquals(expectedCoordinates, drone.moveForth());
		
	}
	
	@Test
	public void testInnerBoundMoveForth(){
		drone = new Drone(30,30,40);
		
		String expectedCoordinates = "Dron ne moze da izvrsi ovu komandu";

		assertEquals(expectedCoordinates, drone.moveForth());
		
	}
}
