package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneBasicTest {

	Drone drone;
	//private int[] boundariers = {50,50,50};
	private int[] startCoordinates = {30,0,30};

	// Inicijalni testovi
	@Test
	public void testInitialMoveDown(){

		int[] startCoordinates = this.startCoordinates;
		startCoordinates[1] = 10;

		drone = new Drone(startCoordinates);

		String expectedCoordinates = "My position is: (" + Integer.toString(startCoordinates[0]) + ","
				+ Integer.toString(startCoordinates[1] - 1) + ","  
				+ Integer.toString(startCoordinates[2]) + ") ";

		assertEquals(expectedCoordinates, drone.moveDown());
	}

	@Test
	public void testInitialMoveUp(){


		drone = new Drone(startCoordinates);

		String expectedCoordinates = "My position is: (" + Integer.toString(startCoordinates[0]) + ","
				+ Integer.toString(startCoordinates[1] + 1) + ","  
				+ Integer.toString(startCoordinates[2]) + ") ";

		assertEquals(expectedCoordinates, drone.moveUp());
	}

	@Test
	public void testInitialMoveRight(){


		drone = new Drone(startCoordinates);

		String expectedCoordinates = "My position is: (" + Integer.toString(startCoordinates[0] + 1) + ","
				+ Integer.toString(startCoordinates[1]) + ","  
				+ Integer.toString(startCoordinates[2]) + ") ";

		assertEquals(expectedCoordinates, drone.moveRight());
	}

	@Test
	public void testInitialMoveLeft(){


		drone = new Drone(startCoordinates);

		String expectedCoordinates = "My position is: (" + Integer.toString(startCoordinates[0] - 1) + ","
				+ Integer.toString(startCoordinates[1]) + ","  
				+ Integer.toString(startCoordinates[2]) + ") ";

		assertEquals(expectedCoordinates, drone.moveLeft());
	}

	@Test
	public void testInitialMoveForth(){


		drone = new Drone(startCoordinates);

		String expectedCoordinates = "My position is: (" + Integer.toString(startCoordinates[0]) + ","
				+ Integer.toString(startCoordinates[1]) + ","  
				+ Integer.toString(startCoordinates[2] - 1) + ") ";

		assertEquals(expectedCoordinates, drone.moveForth());
	}

	@Test
	public void testInitialMoveBack(){


		drone = new Drone(startCoordinates);

		String expectedCoordinates = "My position is: (" + Integer.toString(startCoordinates[0]) + ","
				+ Integer.toString(startCoordinates[1]) + ","  
				+ Integer.toString(startCoordinates[2] + 1) + ") ";

		assertEquals(expectedCoordinates, drone.moveBack());
	}


	// Granice testovi X
	@Test
	public void testUnutrasnjaDonjaGranicaX(){

		int[] startCoordinates = {10,30,30};


		drone = new Drone(startCoordinates);

		String expectedCoordinates = "My position is: (" + Integer.toString(startCoordinates[0]) + ","
				+ Integer.toString(startCoordinates[1]) + ","  
				+ Integer.toString(startCoordinates[2]) + ") ";

		assertEquals(expectedCoordinates, drone.moveRight());
	}

	@Test
	public void testSpoljasnjaGornjaGranicaX(){

		int[] startCoordinates = {50,30,30};

		drone = new Drone(startCoordinates);

		String expectedCoordinates = "My position is: (" + Integer.toString(startCoordinates[0]) + ","
				+ Integer.toString(startCoordinates[1]) + ","  
				+ Integer.toString(startCoordinates[2]) + ") ";

		assertEquals(expectedCoordinates, drone.moveRight());
	}

	@Test
	public void testUnutrasnjaGornjaGranicaX(){

		int[] startCoordinates = {40,30,30};

		drone = new Drone(startCoordinates);

		String expectedCoordinates = "My position is: (" + Integer.toString(startCoordinates[0]) + ","
				+ Integer.toString(startCoordinates[1]) + ","  
				+ Integer.toString(startCoordinates[2]) + ") ";

		assertEquals(expectedCoordinates, drone.moveLeft());
	}

	@Test
	public void testSpoljasnjaDonjaGranicaX(){

		int[] startCoordinates = {0,25,30};

		drone = new Drone(startCoordinates);

		String expectedCoordinates = "My position is: (" + Integer.toString(startCoordinates[0]) + ","
				+ Integer.toString(startCoordinates[1]) + ","  
				+ Integer.toString(startCoordinates[2]) + ") ";

		assertEquals(expectedCoordinates, drone.moveLeft());
	}


	// Granice testovi Y
	@Test
	public void testUnutrasnjaDonjaGranicaY(){

		int[] startCoordinates = this.startCoordinates;
		startCoordinates[1] = 10;

		drone = new Drone(startCoordinates);

		String expectedCoordinates = "My position is: (" + Integer.toString(startCoordinates[0]) + ","
				+ Integer.toString(startCoordinates[1]) + ","  
				+ Integer.toString(startCoordinates[2]) + ") ";

		assertEquals(expectedCoordinates, drone.moveUp());
	}

	@Test
	public void testSpoljasnjaGornjaGranicaY(){

		int[] startCoordinates = this.startCoordinates;
		startCoordinates[1] = 50;

		drone = new Drone(startCoordinates);

		String expectedCoordinates = "My position is: (" + Integer.toString(startCoordinates[0]) + ","
				+ Integer.toString(startCoordinates[1]) + ","  
				+ Integer.toString(startCoordinates[2]) + ") ";

		assertEquals(expectedCoordinates, drone.moveUp());
	}

	@Test
	public void testUnutrasnjaGornjaGranicaY(){

		int[] startCoordinates = this.startCoordinates;
		startCoordinates[1] = 40;

		drone = new Drone(startCoordinates);

		String expectedCoordinates = "My position is: (" + Integer.toString(startCoordinates[0]) + ","
				+ Integer.toString(startCoordinates[1]) + ","  
				+ Integer.toString(startCoordinates[2]) + ") ";

		assertEquals(expectedCoordinates, drone.moveDown());
	}

	@Test
	public void testSpoljasnjaDonjaGranicaY(){

		int[] startCoordinates = this.startCoordinates;
		startCoordinates[1] = 0;

		drone = new Drone(startCoordinates);

		String expectedCoordinates = "My position is: (" + Integer.toString(startCoordinates[0]) + ","
				+ Integer.toString(startCoordinates[1]) + ","  
				+ Integer.toString(startCoordinates[2]) + ") ";

		assertEquals(expectedCoordinates, drone.moveDown());
	}

	// Granice testovi Z
	@Test
	public void testUnutrasnjaDonjaGranicaZ(){

		int[] startCoordinates = {30,30,10};


		drone = new Drone(startCoordinates);

		String expectedCoordinates = "My position is: (" + Integer.toString(startCoordinates[0]) + ","
				+ Integer.toString(startCoordinates[1]) + ","  
				+ Integer.toString(startCoordinates[2]) + ") ";

		assertEquals(expectedCoordinates, drone.moveBack());
	}

	@Test
	public void testSpoljasnjaGornjaGranicaZ(){

		int[] startCoordinates = {30,30,50};

		drone = new Drone(startCoordinates);

		String expectedCoordinates = "My position is: (" + Integer.toString(startCoordinates[0]) + ","
				+ Integer.toString(startCoordinates[1]) + ","  
				+ Integer.toString(startCoordinates[2]) + ") ";

		assertEquals(expectedCoordinates, drone.moveBack());
	}

	@Test
	public void testUnutrasnjaGornjaGranicaZ(){

		int[] startCoordinates = {30,30,40};

		drone = new Drone(startCoordinates);

		String expectedCoordinates = "My position is: (" + Integer.toString(startCoordinates[0]) + ","
				+ Integer.toString(startCoordinates[1]) + ","  
				+ Integer.toString(startCoordinates[2]) + ") ";

		assertEquals(expectedCoordinates, drone.moveForth());
	}

	@Test
	public void testSpoljasnjaDonjaGranicaZ(){

		int[] startCoordinates = {30,30,0};

		drone = new Drone(startCoordinates);

		String expectedCoordinates = "My position is: (" + Integer.toString(startCoordinates[0]) + ","
				+ Integer.toString(startCoordinates[1]) + ","  
				+ Integer.toString(startCoordinates[2]) + ") ";

		assertEquals(expectedCoordinates, drone.moveForth());
	}


}
