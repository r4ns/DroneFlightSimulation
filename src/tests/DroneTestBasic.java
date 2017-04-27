package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;
import space.DoubleCubeDrone;

public class DroneTestBasic {
	Drone drone;
	DoubleCubeDrone dg;
	private int[] boundaries={50,50,50};
	private int[] startCoordinates={30,0,30};
	
	@Test
	public void testInitialMoveUp(){
		
		drone= new Drone(boundaries, startCoordinates);
		String expectedCoordinates="("
				+Integer.toString(startCoordinates[0])+","
		+Integer.toString(startCoordinates[1]+1)+","
		+Integer.toString(startCoordinates[2]) + ")";
		assertEquals(expectedCoordinates,drone.moveUp());
		
	}
	
	@Test
	public void testInitialElevenMoveUp(){
		startCoordinates[1] = 10;
		drone= new Drone(boundaries, startCoordinates);
		String expectedCoordinates="("
				+Integer.toString(startCoordinates[0])+","
		+Integer.toString(startCoordinates[1])+","
		+Integer.toString(startCoordinates[2]) + ")";
		assertEquals(expectedCoordinates,drone.moveUp());
		
	}
	
	@Test
	public void testInitialMoveDown(){
		startCoordinates[1]=40;
		drone= new Drone(boundaries, startCoordinates);
		String expectedCoordinates="("
				+Integer.toString(startCoordinates[0])+","
		+Integer.toString(startCoordinates[1])+","
		+Integer.toString(startCoordinates[2]) + ")";
		assertEquals(expectedCoordinates,drone.moveDown());
		
	}
	
	@Test
	public void testInitialMoveLeft(){
		startCoordinates[0]=40;
		startCoordinates[1]=30;
		drone= new Drone(boundaries, startCoordinates);
		String expectedCoordinates="("
				+Integer.toString(startCoordinates[0])+","
		+Integer.toString(startCoordinates[1])+","
		+Integer.toString(startCoordinates[2]) + ")";
		assertEquals(expectedCoordinates,drone.moveLeft());
		
	}
	
	@Test
	public void testInitialMoveRight(){
		startCoordinates[0]=10;
		startCoordinates[1]=30;
		drone= new Drone(boundaries, startCoordinates);
		String expectedCoordinates="("
				+Integer.toString(startCoordinates[0])+","
		+Integer.toString(startCoordinates[1])+","
		+Integer.toString(startCoordinates[2]) + ")";
		assertEquals(expectedCoordinates,drone.moveRight());
		
	}
	
	@Test
	public void testInitialMoveForth(){
		startCoordinates[0]=30;
		startCoordinates[1]=30;
		startCoordinates[2]=40;
		drone= new Drone(boundaries, startCoordinates);
		String expectedCoordinates="("
				+Integer.toString(startCoordinates[0])+","
		+Integer.toString(startCoordinates[1])+","
		+Integer.toString(startCoordinates[2]) + ")";
		assertEquals(expectedCoordinates,drone.moveForth());
		
	}
	
	@Test
	public void testInitialMoveBack(){
		startCoordinates[0]=30;
		startCoordinates[1]=30;
		startCoordinates[2]=10;
		drone= new Drone(boundaries, startCoordinates);
		String expectedCoordinates="("
				+Integer.toString(startCoordinates[0])+","
		+Integer.toString(startCoordinates[1])+","
		+Integer.toString(startCoordinates[2]) + ")";
		assertEquals(expectedCoordinates,drone.moveBack());
		
	}
	
}
