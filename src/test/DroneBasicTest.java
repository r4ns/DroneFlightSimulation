package test;

import org.junit.Test;

import drone.Drone;

import static org.junit.Assert.*;

public class DroneBasicTest {
	//private int[]boundaries = {50,50,50};
	private int[] startCoordinates = {30, 0, 30};
	Drone dron;
	
	@Test
	public void testInitialMoveUp(){
		dron = new Drone();
		//drone.setBoundries(boundries);
		String expectedCoordinates = "Drone position: ("
				+ Integer.toString(startCoordinates[0]) + ", "
				+ Integer.toString(startCoordinates[1] + 1) + ", "
				+ Integer.toString(startCoordinates[2]) + ")";
		
		assertEquals(expectedCoordinates, dron.moveUp()); 
	
	}
	@Test
	public void testInitialMoveUpOuterSquare(){
		dron = new Drone();
		dron.setKoordinataY(50);
		String expectedCoordinates="Drone position: ("
			+Integer.toString(startCoordinates[0])+", "
			+ 50 +", "
			+Integer.toString(startCoordinates[2]) + ")";
		assertEquals(expectedCoordinates,dron.moveUp());
	}
	@Test
	public void testInitialMoveUpInnerSquare(){
		dron = new Drone();
		dron.setKoordinataY(10);
		String expectedCoordinates="Drone position: ("
			+Integer.toString(startCoordinates[0])+", "
			+ 10 +", "
			+Integer.toString(startCoordinates[2]) + ")";
		assertEquals(expectedCoordinates,dron.moveUp());
	}
	
	
	
	
	@Test
	public void testInitialMoveDown(){
		dron = new Drone();
		
		String expectedCoordinatesD = "Drone position: ("
				+ Integer.toString(startCoordinates[0]) + ", "
				+ Integer.toString(startCoordinates[1]) + ", "
				+ Integer.toString(startCoordinates[2]) + ")";
		assertEquals(expectedCoordinatesD, dron.moveDown());
	}
	@Test
	public void testInitialMoveDownOuterSquare(){
		dron = new Drone();
		dron.setKoordinataY(0);
		String expectedCoordinates="Drone position: ("
			+Integer.toString(startCoordinates[0])+", "
			+ 0 +", "
			+Integer.toString(startCoordinates[2]) + ")";
		assertEquals(expectedCoordinates,dron.moveDown());
	}
	@Test
	public void testInitialMoveDownInnerSquare(){
		dron = new Drone();
		dron.setKoordinataY(40);
		String expectedCoordinates="Drone position: ("
			+Integer.toString(startCoordinates[0])+", "
			+ 40 +", "
			+Integer.toString(startCoordinates[2]) + ")";
		assertEquals(expectedCoordinates,dron.moveDown());
	}
	
	
	
	
	@Test
	public void testInitialMoveRight(){
		dron = new Drone();
		
		String expectedCoordinatesR = "Drone position: ("
				+ Integer.toString(startCoordinates[0] + 1) + ", "
				+ Integer.toString(startCoordinates[1]) + ", "
				+ Integer.toString(startCoordinates[2]) + ")";
		assertEquals(expectedCoordinatesR, dron.moveRight());
	}
	@Test
	public void testInitialMoveRightOuterSquare(){
		dron = new Drone();
		dron.setKoordinataX(50);
		String expectedCoordinates="Drone position: ("
			+Integer.toString(50)+", "
			+Integer.toString(startCoordinates[1]) +", "
			+Integer.toString(startCoordinates[2]) + ")";
		assertEquals(expectedCoordinates,dron.moveRight());
	}
	@Test
	public void testInitialMoveRightInnerSquare(){
		dron = new Drone();
		dron.setKoordinataY(30);
		dron.setKoordinataX(10);
		String expectedCoordinates="Drone position: ("
			+Integer.toString(10)+", "
			+Integer.toString(30) +", "
			+Integer.toString(startCoordinates[2]) + ")";
		assertEquals(expectedCoordinates,dron.moveRight());
	}
	
	
	
	
	public void testInitialMoveLeft(){
		dron = new Drone();
		
		String expectedCoordinatesL = "Drone position: ("
				+ Integer.toString(startCoordinates[0] - 1) + ", "
				+ Integer.toString(startCoordinates[1]) + ", "
				+ Integer.toString(startCoordinates[2]) + ")";
		assertEquals(expectedCoordinatesL, dron.moveLeft());
	}
	@Test
	public void testInitialMoveLeftOuterSquare(){
		dron = new Drone();
		dron.setKoordinataX(0);
		String expectedCoordinates="Drone position: ("
			+Integer.toString(0)+", "
			+Integer.toString(startCoordinates[1]) +", "
			+Integer.toString(startCoordinates[2]) + ")";
		assertEquals(expectedCoordinates,dron.moveLeft());
	}
	@Test
	public void testInitialMoveLeftInnerSquare(){
		dron = new Drone();
		dron.setKoordinataY(30);
		dron.setKoordinataX(40);
		String expectedCoordinates="Drone position: ("
			+Integer.toString(40)+", "
			+Integer.toString(30) +", "
			+Integer.toString(startCoordinates[2]) + ")";
		assertEquals(expectedCoordinates,dron.moveLeft());
	}
	
	
	
	
	public void testInitialMoveForth(){
		dron = new Drone();
		
		String expectedCoordinatesF = "Drone position: ("
				+ Integer.toString(startCoordinates[0]) + ", "
				+ Integer.toString(startCoordinates[1]) + ", "
				+ Integer.toString(startCoordinates[2] - 1) + ")";
		assertEquals(expectedCoordinatesF, dron.moveForth());
	}
	@Test
	public void testInitialMoveForthOuterSquare(){
		dron = new Drone();
		dron.setKoordinataZ(0);
		String expectedCoordinates="Drone position: ("
			+Integer.toString(startCoordinates[2])+", "
			+Integer.toString(startCoordinates[1]) +", "
			+Integer.toString(0) + ")";
		assertEquals(expectedCoordinates,dron.moveForth());
	}
	@Test
	public void testInitialMoveForthInnererSquare(){
		dron = new Drone();
		dron.setKoordinataZ(40);
		dron.setKoordinataY(30);
		String expectedCoordinates="Drone position: ("
			+Integer.toString(startCoordinates[2])+", "
			+Integer.toString(30) +", "
			+Integer.toString(40) + ")";
		assertEquals(expectedCoordinates,dron.moveForth());
	}
	
	
	
	public void testInitialMoveBack(){
		dron = new Drone();
		
		String expectedCoordinatesB = "Drone position: ("
				+ Integer.toString(startCoordinates[0]) + ", "
				+ Integer.toString(startCoordinates[1]) + ", "
				+ Integer.toString(startCoordinates[2] + 1) + ")";
		assertEquals(expectedCoordinatesB, dron.moveBack());
	}
	@Test
	public void testInitialMoveBackOuterSquare(){
		dron = new Drone();
		dron.setKoordinataZ(50);
		String expectedCoordinates="Drone position: ("
			+Integer.toString(startCoordinates[2])+", "
			+Integer.toString(startCoordinates[1]) +", "
			+Integer.toString(50) + ")";
		assertEquals(expectedCoordinates,dron.moveBack());
	}
	@Test
	public void testInitialMoveBackInnerSquare(){
		dron = new Drone();
		dron.setKoordinataZ(10);
		dron.setKoordinataY(30);
		String expectedCoordinates="Drone position: ("
			+Integer.toString(startCoordinates[2])+", "
			+Integer.toString(30) +", "
			+Integer.toString(10) + ")";
		assertEquals(expectedCoordinates,dron.moveBack());
	}
}
