package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneBasicTest {
	Drone drone;
	private int[] boundaries={50,50,50};
	private int[] coordinates={30,0,30};
	
	@Test
	public void testInitialMoveUp(){
		
		drone= new Drone(boundaries, coordinates);
		String expectedCoordinates="Drone position: ("
				+Integer.toString(coordinates[0])+","
		+Integer.toString(coordinates[1]+1)+","
		+Integer.toString(coordinates[2]) + ")";
		assertEquals(expectedCoordinates,drone.moveUp());
		
	}
	
	@Test
	public void testInitialElevenMoveUp(){
		coordinates[1] = 10;
		drone= new Drone(boundaries, coordinates);
		String expectedCoordinates="Drone position: ("
				+Integer.toString(coordinates[0])+","
		+Integer.toString(coordinates[1])+","
		+Integer.toString(coordinates[2]) + ")";
		assertEquals(expectedCoordinates,drone.moveUp());
		
		
		coordinates[1] = 50;
		drone= new Drone(boundaries, coordinates);
		expectedCoordinates="Drone position: ("
				+Integer.toString(coordinates[0])+","
		+Integer.toString(coordinates[1])+","
		+Integer.toString(coordinates[2]) + ")";
		assertEquals(expectedCoordinates,drone.moveUp());
		
	}
	
	@Test
	public void testInitialMoveDown(){
		coordinates[1]=40;
		drone= new Drone(boundaries, coordinates);
		String expectedCoordinates="Drone position: ("
				+Integer.toString(coordinates[0])+","
		+Integer.toString(coordinates[1])+","
		+Integer.toString(coordinates[2]) + ")";
		assertEquals(expectedCoordinates,drone.moveDown());
		
		coordinates[1]=0;
		drone= new Drone(boundaries, coordinates);
		 expectedCoordinates="("
				+Integer.toString(coordinates[0])+","
		+Integer.toString(coordinates[1])+","
		+Integer.toString(coordinates[2]) + ")";
		assertEquals(expectedCoordinates,drone.moveDown());
	}
	
	@Test
	public void testInitialMoveLeft(){
		coordinates[0]=40;
		coordinates[1]=30;
		drone= new Drone(boundaries, coordinates);
		String expectedCoordinates="Drone position: ("
				+Integer.toString(coordinates[0])+","
		+Integer.toString(coordinates[1])+","
		+Integer.toString(coordinates[2]) + ")";
		assertEquals(expectedCoordinates,drone.moveLeft());
		
		coordinates[0]=0;
		coordinates[1]=30;
		drone= new Drone(boundaries, coordinates);
		 expectedCoordinates="Drone position: ("
				+Integer.toString(coordinates[0])+","
		+Integer.toString(coordinates[1])+","
		+Integer.toString(coordinates[2]) + ")";
		assertEquals(expectedCoordinates,drone.moveLeft());
		
	}
	
	@Test
	public void testInitialMoveRight(){
		coordinates[0]=10;
		coordinates[1]=30;
		drone= new Drone(boundaries, coordinates);
		String expectedCoordinates="Drone position: ("
				+Integer.toString(coordinates[0])+","
		+Integer.toString(coordinates[1])+","
		+Integer.toString(coordinates[2]) + ")";
		assertEquals(expectedCoordinates,drone.moveRight());
		
		coordinates[0]=50;
		coordinates[1]=30;
		drone= new Drone(boundaries, coordinates);
		 expectedCoordinates="("
				+Integer.toString(coordinates[0])+","
		+Integer.toString(coordinates[1])+","
		+Integer.toString(coordinates[2]) + ")";
		assertEquals(expectedCoordinates,drone.moveRight());
	}
	
	@Test
	public void testInitialMoveForth(){
		coordinates[0]=30;
		coordinates[1]=30;
		coordinates[2]=40;
		drone= new Drone(boundaries, coordinates);
		String expectedCoordinates="Drone position: ("
				+Integer.toString(coordinates[0])+","
		+Integer.toString(coordinates[1])+","
		+Integer.toString(coordinates[2]) + ")";
		assertEquals(expectedCoordinates,drone.moveForth());
		
		coordinates[0]=30;
		coordinates[1]=30;
		coordinates[2]=0;
		drone= new Drone(boundaries, coordinates);
		 expectedCoordinates="Drone position: ("
				+Integer.toString(coordinates[0])+","
		+Integer.toString(coordinates[1])+","
		+Integer.toString(coordinates[2]) + ")";
		assertEquals(expectedCoordinates,drone.moveForth());
		
	}
	
	@Test
	public void testInitialMoveBack(){
		coordinates[0]=30;
		coordinates[1]=30;
		coordinates[2]=10;
		drone= new Drone(boundaries, coordinates);
		String expectedCoordinates="Drone position: ("
				+Integer.toString(coordinates[0])+","
		+Integer.toString(coordinates[1])+","
		+Integer.toString(coordinates[2]) + ")";
		assertEquals(expectedCoordinates,drone.moveBack());
		
		coordinates[0]=30;
		coordinates[1]=30;
		coordinates[2]=50;
		drone= new Drone(boundaries, coordinates);
		expectedCoordinates="Drone position: ("
				+Integer.toString(coordinates[0])+","
		+Integer.toString(coordinates[1])+","
		+Integer.toString(coordinates[2]) + ")";
		assertEquals(expectedCoordinates,drone.moveBack());
		
	}

}