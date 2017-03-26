package tests;

import org.junit.Test;
import static org.junit.Assert.*;

import drone.Drone;

public class DroneBasicTest {
	
	//private int[] boundaries = {50,50,50};
	//private int[] startCoordinates = {30,0,30};
	Drone drone;
	
	@Test
	public void testInitialMoveUp(){
		drone= new Drone();
		String expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY()+1)+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveUp());
		
		
	}
	@Test
	public void testInitalMoveDown(){
		drone= new Drone();
		drone.setY(10);
		String expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY()-1)+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveDown());
		
		
	}
	
	
	@Test
	public void testInitialMoveRight(){
		drone= new Drone();
		String expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX()+1)+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveRight());
		
		
	}
	@Test
	public void testInitialMoveLeft(){
		drone= new Drone();
		String expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX()-1)+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveLeft());
		
		
	}
	@Test
	public void testInitialMoveForth(){
		drone= new Drone();
		String expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ()+1)+")";
		
		assertEquals(expectedCoordinates, drone.moveForth());
		
		
	}
	@Test
	public void testInitialMoveBack(){
		drone= new Drone();
		String expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ()-1)+")";
		
		assertEquals(expectedCoordinates, drone.moveBack());
		
		
	}
	@Test
	public void testBorderlineMoveDown(){
		drone= new Drone();
		String expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveDown());
		drone.setY(40);
		expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveDown());
		
		
	}
	@Test
	public void testBorderlineMoveUp(){
		drone= new Drone();
		drone.setY(10);
		String expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveUp());
		drone.setY(50);
		expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveUp());
		
		
	}
	@Test
	public void testBorderlineMoveLeft(){
		drone= new Drone();
		drone.setX(0);
		String expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveLeft());
		drone.setX(40);
		drone.setY(30);

		 expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveLeft());
		
		
	}
	@Test
	public void testBorderlineMoveRight(){
		drone= new Drone();
		drone.setX(50);
		String expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveRight());
		drone.setX(10);
		drone.setY(30);

		 expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveRight());
		
		
	}
	@Test
	public void testBorderlineMoveBack(){
		drone= new Drone();
		drone.setZ(0);
		String expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveBack());
		drone.setZ(40);
		drone.setY(30);

		 expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveBack());
		
		
	}
	@Test
	public void testBorderlineMoveForth(){
		drone= new Drone();
		drone.setZ(50);
		String expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveForth());
		drone.setZ(10);
		drone.setY(30);

		 expectedCoordinates="Drone position: "+"("+Integer.toString(drone.getX())+","+Integer.toString(drone.getY())+","+Integer.toString(drone.getZ())+")";
		
		assertEquals(expectedCoordinates, drone.moveForth());
		
		
	}
	

}
